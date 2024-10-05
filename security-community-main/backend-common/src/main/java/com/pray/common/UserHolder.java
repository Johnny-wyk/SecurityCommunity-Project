package com.pray.common;

import com.pray.entity.dto.UserDto;

/**
 * <p>
 * UserHolder
 * <p>
 *
 * @author Johnny
 */
public class UserHolder {
    private static ThreadLocal<UserDto> tl=new ThreadLocal<>();

    public static void setLocalUser(UserDto userDto) {
          tl.set(userDto);
    }

    public static UserDto getLocalUser() {
        return tl.get();
    }

    public void removeLocalUser(){
        tl.remove();
    }
}
