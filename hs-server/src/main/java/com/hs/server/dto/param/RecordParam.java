package com.hs.server.dto.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hs.server.dto.base.BaseParam;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Date:     2018/7/24 11:47<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Data
public class RecordParam extends BaseParam {
    private String recordId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date oprateDate;

    private String description;

    private String disinerId;

    private String customId;

    private String totalFee;

    private String disinType;

    private String hairLevel;

    private String hairLength;

    private String hairBar;

    private String hairPermBrand;

    private String hairDyeBrand;

    private String hairCairBrand;

    private String hairHateItems;

    private String customRequireItems;

    private String oprateNoticeItems;

    private String imgUrl;
}
