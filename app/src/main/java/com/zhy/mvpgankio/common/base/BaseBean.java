package com.zhy.mvpgankio.common.base;

/**
 * 所有的javabean类都要继承这个
 * Created by zhy on 2019/1/16.
 */
public class BaseBean {

    private boolean error;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
