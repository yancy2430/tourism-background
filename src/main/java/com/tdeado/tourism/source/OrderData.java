package com.tdeado.tourism.source;

/**
 * 代下单data
 */
public class OrderData {


    /**
     * product_name : 84
     * username : 订单密码
     * package_id : 1526929778912
     * start : 2018-05-23
     * pay_type : 1
     * adult_num : 12
     * children_num : 1
     * housing_price : 1
     * contact : 杨霞
     * contact_mobile : 18152833212
     * remark : 其他需求
     * salesman : 杨哲
     * salesman_mobile : 18152733661
     */

    private String product_id;
    private String order_name;
    private String package_id;
    private String start;
    private String pay_type;
    private String adult_num;
    private String children_num;
    private String housing_num;
    private String contact;
    private String contact_mobile;
    private String remark;
    private String salesman;
    private String salesman_mobile;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getPackage_id() {
        return package_id;
    }

    public void setPackage_id(String package_id) {
        this.package_id = package_id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getAdult_num() {
        return adult_num;
    }

    public void setAdult_num(String adult_num) {
        this.adult_num = adult_num;
    }

    public String getChildren_num() {
        return children_num;
    }

    public void setChildren_num(String children_num) {
        this.children_num = children_num;
    }

    public String getHousing_num() {
        return housing_num;
    }

    public void setHousing_num(String housing_num) {
        this.housing_num = housing_num;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact_mobile() {
        return contact_mobile;
    }

    public void setContact_mobile(String contact_mobile) {
        this.contact_mobile = contact_mobile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getSalesman_mobile() {
        return salesman_mobile;
    }

    public void setSalesman_mobile(String salesman_mobile) {
        this.salesman_mobile = salesman_mobile;
    }
}
