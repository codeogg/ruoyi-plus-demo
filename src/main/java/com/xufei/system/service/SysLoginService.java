package com.xufei.system.service;

import cn.dev33.satoken.secure.BCrypt;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xufei.common.core.domain.entity.SysUser;
import com.xufei.common.core.domain.model.LoginUser;
import com.xufei.common.enums.DeviceType;
import com.xufei.common.exception.UserException;
import com.xufei.common.helper.LoginHelper;
import com.xufei.system.mapper.SysUserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SysLoginService {

    private final SysUserMapper userMapper;

    public String login(String username, String password) {
        SysUser user = loadUserByUsername(username);
        if (!BCrypt.checkpw(password, user.getPassword())) {
            throw new UserException("密码输入错误");
        }
        LoginUser loginUser = buildLoginUser(user);
        LoginHelper.loginByDevice(loginUser, DeviceType.PC);
        return StpUtil.getTokenValue();
    }

    private LoginUser buildLoginUser(SysUser user) {
        LoginUser loginUser = new LoginUser();
        loginUser.setId(user.getId());
        loginUser.setDeptId(user.getDeptId());
        loginUser.setUsername(user.getUsername());
        loginUser.setNickname(user.getNickname());
        loginUser.setDeptName(ObjectUtil.isNull(user.getDept()) ? "" : user.getDept().getDeptName());
        loginUser.setMenuPermission(null);
        loginUser.setRolePermission(null);
        return loginUser;
    }

    private SysUser loadUserByUsername(String username) {
        SysUser user = userMapper.selectOne(new LambdaQueryWrapper<SysUser>()
                .select(SysUser::getUsername, SysUser::getStatus)
                .eq(SysUser::getUsername, username));
        if (ObjectUtil.isNull(user)) {
            log.info("登录用户：{} 不存在.", username);
            throw new UserException("用户名不存在");
        } else if (1 == user.getStatus()) {
            log.info("登录用户：{} 已被停用.", username);
            throw new UserException("用户被停用");
        }
        return userMapper.selectUserByUsername(username);
    }
}
