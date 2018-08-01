package com.hs.server.service;

import com.hs.server.domain.Custom;
import com.hs.server.dto.param.CustomParam;

import java.util.List;

/**
 * Date:     2018/7/24 11:27<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
public interface CustomService {
    List<Custom> getCustoms(CustomParam custom);
    void addCustom(Custom custom);
    void updateCustom(Custom custom);
    void delCustom(String customId);
    Custom queryCustomDetail(CustomParam custom);
}
