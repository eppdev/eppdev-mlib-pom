/* FileName: RestResult.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.commons.entity;

import cn.eppdev.mlib.reg.logistic.utils.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class RestResult <T> {
    static Logger logger = LoggerFactory.getLogger(RestResult.class);

    public static final int STATUS_SUCCESS = 2000;
    public static final int STATUS_FAILED = 2001;

    public Integer status;

    public String message;

    public T data;

    public RestResult(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }

}
