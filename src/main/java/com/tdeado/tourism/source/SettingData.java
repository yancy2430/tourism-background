package com.tdeado.tourism.source;

public class SettingData {


    /**
     * sitename : layuiAdmin
     * domain : http://www.layui.com
     * logo : logo
     * cache : 0
     * uploadsize : 2048
     * uploadtype : png|gif|jpg|jpeg|zip|rar
     * title : layuiAdmin 通用后台管理模板系统
     * keywords :
     * descript : layuiAdmin 是 layui 官方出品的通用型后台模板解决方案，提供了单页版和 iframe 版两种开发模式。layuiAdmin 是目前非常流行的后台模板框架，广泛用于各类管理平台。
     * copyright : © 2018 layui.com MIT license
     */

    private String sitename;
    private String domain;
    private String logo;
    private String cache;
    private String uploadsize;
    private String uploadtype;
    private String title;
    private String keywords;
    private String descript;
    private String copyright;
    private String sms;
    private String home_icon;
    private String search_key;

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getHome_icon() {
        return home_icon;
    }

    public void setHome_icon(String home_icon) {
        this.home_icon = home_icon;
    }

    public String getSearch_key() {
        return search_key;
    }

    public void setSearch_key(String search_key) {
        this.search_key = search_key;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getUploadsize() {
        return uploadsize;
    }

    public void setUploadsize(String uploadsize) {
        this.uploadsize = uploadsize;
    }

    public String getUploadtype() {
        return uploadtype;
    }

    public void setUploadtype(String uploadtype) {
        this.uploadtype = uploadtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @Override
    public String toString() {
        return "SettingData{" +
                "sitename='" + sitename + '\'' +
                ", domain='" + domain + '\'' +
                ", logo='" + logo + '\'' +
                ", cache='" + cache + '\'' +
                ", uploadsize='" + uploadsize + '\'' +
                ", uploadtype='" + uploadtype + '\'' +
                ", title='" + title + '\'' +
                ", keywords='" + keywords + '\'' +
                ", descript='" + descript + '\'' +
                ", copyright='" + copyright + '\'' +
                ", sms='" + sms + '\'' +
                ", home_icon='" + home_icon + '\'' +
                ", search_key='" + search_key + '\'' +
                '}';
    }
}
