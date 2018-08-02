package com.hs.server.dto.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Date:     2018/7/26 11:04<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Data
public class BaseParam implements Serializable {
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date from;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date to;

    private int pageSize;

    private int pageNum;
}
