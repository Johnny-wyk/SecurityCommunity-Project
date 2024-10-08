package com.pray.entity.dto;

import lombok.Data;

/**
 * <p>
 * RegisterDto
 * <p>
 *
 * @author Johnny
 * @since 2023/8/29 20:02
 */
@Data
public class RegisterDto {
    /**
     * 用户名
     */
    public String username;

    /**
     * 密码
     */
    public String password;

    public String email;

    public String code;
}
