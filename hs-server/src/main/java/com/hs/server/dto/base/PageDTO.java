package com.hs.server.dto.base;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * description:${todo} <br/>
 * Date:     2017/7/11 15:54<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
public class PageDTO<T> {
    private long total;
    private List<T> rows;

    public PageDTO() {
    }

    public PageDTO(PageInfo pageInfo) {
        this.total = pageInfo.getTotal();
        this.rows = pageInfo.getList();
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
