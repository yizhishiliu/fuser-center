package com.jmd.fusercenterbackend.exception;

import com.jmd.fusercenterbackend.common.ErrorCode;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/6/29 029 23:08
 * File: BusinessException
 * Description: 自定义异常类
 */
public class BusinessException extends RuntimeException {

    private final int code;

    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
