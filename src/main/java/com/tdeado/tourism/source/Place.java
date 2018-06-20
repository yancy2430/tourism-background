package com.tdeado.tourism.source;

import java.util.List;

public class Place {


    /**
     * username : ["22","22"]
     * userIdcard : ["11","113"]
     * contact : 11
     * mobile : 223
     * email : 113@qq.com
     * product_id : 91
     * package_no : 1527231756856
     * datetime : 2018-05-30
     * adultNum : 2
     * childrenNum : 0
     * singleNum : 0
     */

    private String contact;
    private String product_name;
    private String mobile;
    private String email;
    private String product_id;
    private String package_no;
    private String datetime;
    private String adultNum;
    private String childrenNum;
    private String singleNum;
    private List<String> username;
    private List<String> userIdcard;
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getContact() {
        return contact;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getPackage_no() {
        return package_no;
    }

    public void setPackage_no(String package_no) {
        this.package_no = package_no;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getAdultNum() {
        return adultNum;
    }

    public void setAdultNum(String adultNum) {
        this.adultNum = adultNum;
    }

    public String getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(String childrenNum) {
        this.childrenNum = childrenNum;
    }

    public String getSingleNum() {
        return singleNum;
    }

    public void setSingleNum(String singleNum) {
        this.singleNum = singleNum;
    }

    public List<String> getUsername() {
        return username;
    }

    public void setUsername(List<String> username) {
        this.username = username;
    }

    public List<String> getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(List<String> userIdcard) {
        this.userIdcard = userIdcard;
    }

    @Override
    public String toString() {
        return "Place{" +
                "contact='" + contact + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", product_id='" + product_id + '\'' +
                ", package_no='" + package_no + '\'' +
                ", datetime='" + datetime + '\'' +
                ", adultNum='" + adultNum + '\'' +
                ", childrenNum='" + childrenNum + '\'' +
                ", singleNum='" + singleNum + '\'' +
                ", username=" + username +
                ", userIdcard=" + userIdcard +
                '}';
    }
}
