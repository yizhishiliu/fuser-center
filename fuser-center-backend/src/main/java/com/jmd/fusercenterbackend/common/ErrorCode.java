package com.jmd.fusercenterbackend.common;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/6/16 016 20:29
 * File: ErrorCode
 * Description: 错误码
 */
public enum ErrorCode {

    SUCCESS_CODE(0, "OK", ""),
    PARAMS_ERROR(40000, "请求参数错误", ""),
    PARAMS_NULL_ERROR(40001, "请求参数为空", ""),
    NOT_LOGIN(40100, "未登录", ""),
    NOT_AUTH(40101, "无权限", "");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 状态码信息
     */
    private final String message;

    /**
     * 状态码描述（详情）
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
