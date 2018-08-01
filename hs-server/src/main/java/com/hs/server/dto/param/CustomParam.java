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
public class CustomParam  extends BaseParam {
    private String birthFrom;

    private String birthTo;

    private String customId;

    private String cardId;

    private String userName;

    private String userNameEn;

    private String sex;

    private String age;

    private String phone;

    private String adress;

    private String prefer;

    private String level;

    private String job;

    private String weixin;

    private String birthday;

    private String customCharacter;

    private String hairNumber;

    private String hairLength;

    private String hairQuality;

    private String hairOprateType;

    private String hairPrefer;

    private String hairExclude;

    private String hairFrequency;

    private String comment;
}
