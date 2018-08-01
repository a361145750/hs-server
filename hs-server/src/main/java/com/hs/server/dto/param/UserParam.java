package com.hs.server.dto.param;

import com.hs.server.dto.base.BaseParam;
import lombok.Data;

/**
 * Date:     2018/7/24 11:47<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Data
public class UserParam extends BaseParam {
    private Long userId;

    private String loginId;

    private String userName;

    private String passWord;

    private Long role;

    private Long userRight;
}
