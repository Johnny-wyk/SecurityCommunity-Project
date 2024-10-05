package com.pray.entity.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * LoginFormDto
 * <p>
 *
 * @author Johnny
 */
@Data
@Getter
@Setter
public class LoginFormDto {
    String username;
    String password;
    String code;
}
