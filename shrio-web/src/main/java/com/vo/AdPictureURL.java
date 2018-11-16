package com.vo;

import java.util.List;

/**
 * @author qiuzhi
 * @date 2018/11/16
 * @description
 */
public class AdPictureURL {
    private int errno;
    private List<String> data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
