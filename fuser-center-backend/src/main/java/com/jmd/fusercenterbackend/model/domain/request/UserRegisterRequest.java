package com.jmd.fusercenterbackend.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/5/5 005 14:14
 * File: UserRegisterRequest
 * Description: 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;

}
