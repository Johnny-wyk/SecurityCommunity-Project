package com.pray.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * <p>
 * CustomPasswordEncoder
 * <p>
 *
 * @author Johnny
 * @since 2023/9/23 14:34
 */
public class CustomPasswordEncoder  implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(rawPassword.toString());
    }
}
