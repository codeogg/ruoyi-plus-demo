package com.xufei.common.helper;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.context.model.SaStorage;
import cn.dev33.satoken.stp.SaLoginModel;
import cn.dev33.satoken.stp.StpUtil;
import com.xufei.common.core.domain.model.LoginUser;
import com.xufei.common.enums.DeviceType;

public class LoginHelper {

    public static void loginByDevice(LoginUser loginUser, DeviceType deviceType) {
        SaStorage storage = SaHolder.getStorage();
        storage.set("loginUser", loginUser);
        storage.set("userId", loginUser.getId());
        SaLoginModel model = new SaLoginModel();
        model.setDevice(deviceType.getDevice());

        StpUtil.login(loginUser.getId(), model.setExtra("userId", loginUser.getId()));
        StpUtil.getTokenSession().set("loginUser", loginUser);
    }
}
