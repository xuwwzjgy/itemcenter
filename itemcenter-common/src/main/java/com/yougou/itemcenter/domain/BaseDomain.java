package com.yougou.itemcenter.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class BaseDomain implements Serializable {
    private static final long serialVersionUID = 1159712018304699650L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
