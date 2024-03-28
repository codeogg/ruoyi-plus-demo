package com.xufei.common.core.domain;

import com.xufei.common.enums.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

    private int code;
    private String msg;
    private T data;

    public static <T> CommonResult<T> ok(){
        return restResult(null, ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());
    }

    public static <T> CommonResult<T> ok(T data){
        return restResult(data, ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());
    }

    public static <T> CommonResult<T> ok(String msg){
        return restResult(null, ResultCode.SUCCESS.getCode(), msg);
    }

    public static <T> CommonResult<T> ok(String msg,T data){
        return restResult(data, ResultCode.SUCCESS.getCode(), msg);
    }

    public static <T> CommonResult<T> fail(){
        return restResult(null, ResultCode.FAIL.getCode(), ResultCode.FAIL.getMsg());
    }

    public static <T> CommonResult<T> fail(T data){
        return restResult(data, ResultCode.FAIL.getCode(), ResultCode.FAIL.getMsg());
    }

    public static <T> CommonResult<T> fail(String msg){
        return restResult(null, ResultCode.FAIL.getCode(), msg);
    }

    public static <T> CommonResult<T> fail(String msg,T data){
        return restResult(data, ResultCode.FAIL.getCode(), msg);
    }

    public static <T> CommonResult<T> fail(ResultCode resultCode){
        return restResult(null, resultCode.getCode(), resultCode.getMsg());
    }

    private static <T> CommonResult<T> restResult(T data, int code, String msg){
        CommonResult<T> result = new CommonResult<>();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }
}
