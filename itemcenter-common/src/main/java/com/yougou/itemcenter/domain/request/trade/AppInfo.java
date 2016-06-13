package com.yougou.itemcenter.domain.request.trade;

import com.yougou.itemcenter.domain.BaseDomain;


public class AppInfo extends BaseDomain {

    private static final long serialVersionUID = -4051499458541533451L;

    private String appName;

    private String ip;

    private String mail;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
