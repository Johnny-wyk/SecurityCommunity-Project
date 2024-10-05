package com.pray.entity.vo.request;

import lombok.Data;

/**
 * <p>
 * WeiXinCheckUrl
 * <p>
 *
 * @author Johnny
 * @since 2023/9/21 23:02
 */
@Data
public class WeiXinCheckUrl {
    String timestamp;
    String echostr;
    String signature;
    String nonce;
}
