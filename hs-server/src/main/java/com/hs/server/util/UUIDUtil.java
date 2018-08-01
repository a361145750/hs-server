package com.hs.server.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Date:     2018/7/24 13:59<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Component
public class UUIDUtil {

    public String getUuid() {
        return UUID.randomUUID().toString().replace("-","").toLowerCase();
    }
}
