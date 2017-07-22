package com.hs.server.dto.base;

/**
 * Date:     2017/7/14 9:11<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
public class ResponseDTO<T> {
    private String code;

    private String msg;

    private T data;

    public ResponseDTO() {
    }

    public ResponseDTO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseDTO(String code, String msg, T t) {
        this.code = code;
        this.msg = msg;
        this.data = t;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
