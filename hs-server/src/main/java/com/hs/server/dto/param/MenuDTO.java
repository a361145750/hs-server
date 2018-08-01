package com.hs.server.dto.param;

import lombok.Data;

import java.io.Serializable;

/**
 * Date:     2018/7/30 16:56<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Data
public class MenuDTO implements Serializable {
    private String menuId;
    private String menuName;
    private String menuIcon;
    private String menuHref;
    private String parentMenuId;
}
