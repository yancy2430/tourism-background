package com.tdeado.tourism.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class Order implements Serializable {

    private static final long serialVersionUID = 1527680814493L;


    /**
    * 主键
    * 订单ID
    * isNullAble:0
    */
    private Integer orderId;

    /**
    * 产品ID
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 产品名称
    * isNullAble:1
    */
    private String productName;

    /**
    * 产品信息
    * isNullAble:1
    */
    private String productInfo;

    /**
    * 产品套餐ID
    * isNullAble:0,defaultVal:
    */
    private String packageId;

    /**
    * 套餐信息
    * isNullAble:1
    */
    private String packageInfo;

    /**
    * 套餐名称
    * isNullAble:1
    */
    private String packageName;

    /**
    * 团期信息
    * isNullAble:1
    */
    private String dateInfo;

    /**
    * 订单名称
    * isNullAble:1
    */
    private String orderName;

    /**
    * 订单总价
    * isNullAble:0
    */
    private java.math.BigDecimal orderPrice;

    /**
    * 订单状态
    * isNullAble:0,defaultVal:0
    */
    private Integer status;

    /**
    * 销售人员
    * isNullAble:1
    */
    private String salesman;

    /**
    * 销售人员手机
    * isNullAble:1
    */
    private String salesmanMobile;

    /**
    * 下单时间
    * isNullAble:1
    */
    private java.time.LocalDateTime addtime;

    /**
    * 团期
    * isNullAble:0,defaultVal:
    */
    private String teamdate;

    /**
    * 星期几
    * isNullAble:1
    */
    private String whatday;

    /**
    * 成人人数
    * isNullAble:1
    */
    private Integer adultNum;

    /**
    * 儿童人数
    * isNullAble:1
    */
    private Integer childrenNum;

    /**
    * 单房差人数
    * isNullAble:1
    */
    private Integer housingNum;

    /**
    * 联系人
    * isNullAble:1
    */
    private String contact;

    /**
    * 联系人手机
    * isNullAble:1
    */
    private String contactMobile;

    /**
    * 备注
    * isNullAble:1
    */
    private String remark;

    /**
    * 下单用户
    * isNullAble:0,defaultVal:1
    */
    private Integer userId;

    /**
    * 
    * isNullAble:0,defaultVal:1
    */
    private Integer payType;

    /**
    * 支付状态
    * isNullAble:0,defaultVal:0
    */
    private Integer payStatus;

    /**
    * 集合点
    * isNullAble:1
    */
    private String rallyingPoint;


    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }

    public Integer getOrderId(){
        return this.orderId;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setProductInfo(String productInfo){
        this.productInfo = productInfo;
    }

    public String getProductInfo(){
        return this.productInfo;
    }

    public void setPackageId(String packageId){
        this.packageId = packageId;
    }

    public String getPackageId(){
        return this.packageId;
    }

    public void setPackageInfo(String packageInfo){
        this.packageInfo = packageInfo;
    }

    public String getPackageInfo(){
        return this.packageInfo;
    }

    public void setPackageName(String packageName){
        this.packageName = packageName;
    }

    public String getPackageName(){
        return this.packageName;
    }

    public void setDateInfo(String dateInfo){
        this.dateInfo = dateInfo;
    }

    public String getDateInfo(){
        return this.dateInfo;
    }

    public void setOrderName(String orderName){
        this.orderName = orderName;
    }

    public String getOrderName(){
        return this.orderName;
    }

    public void setOrderPrice(java.math.BigDecimal orderPrice){
        this.orderPrice = orderPrice;
    }

    public java.math.BigDecimal getOrderPrice(){
        return this.orderPrice;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setSalesman(String salesman){
        this.salesman = salesman;
    }

    public String getSalesman(){
        return this.salesman;
    }

    public void setSalesmanMobile(String salesmanMobile){
        this.salesmanMobile = salesmanMobile;
    }

    public String getSalesmanMobile(){
        return this.salesmanMobile;
    }

    public void setAddtime(java.time.LocalDateTime addtime){
        this.addtime = addtime;
    }

    public java.time.LocalDateTime getAddtime(){
        return this.addtime;
    }

    public void setTeamdate(String teamdate){
        this.teamdate = teamdate;
    }

    public String getTeamdate(){
        return this.teamdate;
    }

    public void setWhatday(String whatday){
        this.whatday = whatday;
    }

    public String getWhatday(){
        return this.whatday;
    }

    public void setAdultNum(Integer adultNum){
        this.adultNum = adultNum;
    }

    public Integer getAdultNum(){
        return this.adultNum;
    }

    public void setChildrenNum(Integer childrenNum){
        this.childrenNum = childrenNum;
    }

    public Integer getChildrenNum(){
        return this.childrenNum;
    }

    public void setHousingNum(Integer housingNum){
        this.housingNum = housingNum;
    }

    public Integer getHousingNum(){
        return this.housingNum;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public String getContact(){
        return this.contact;
    }

    public void setContactMobile(String contactMobile){
        this.contactMobile = contactMobile;
    }

    public String getContactMobile(){
        return this.contactMobile;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }

    public String getRemark(){
        return this.remark;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public void setPayType(Integer payType){
        this.payType = payType;
    }

    public Integer getPayType(){
        return this.payType;
    }

    public void setPayStatus(Integer payStatus){
        this.payStatus = payStatus;
    }

    public Integer getPayStatus(){
        return this.payStatus;
    }

    public void setRallyingPoint(String rallyingPoint){
        this.rallyingPoint = rallyingPoint;
    }

    public String getRallyingPoint(){
        return this.rallyingPoint;
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                "productId='" + productId + '\'' +
                "productName='" + productName + '\'' +
                "productInfo='" + productInfo + '\'' +
                "packageId='" + packageId + '\'' +
                "packageInfo='" + packageInfo + '\'' +
                "packageName='" + packageName + '\'' +
                "dateInfo='" + dateInfo + '\'' +
                "orderName='" + orderName + '\'' +
                "orderPrice='" + orderPrice + '\'' +
                "status='" + status + '\'' +
                "salesman='" + salesman + '\'' +
                "salesmanMobile='" + salesmanMobile + '\'' +
                "addtime='" + addtime + '\'' +
                "teamdate='" + teamdate + '\'' +
                "whatday='" + whatday + '\'' +
                "adultNum='" + adultNum + '\'' +
                "childrenNum='" + childrenNum + '\'' +
                "housingNum='" + housingNum + '\'' +
                "contact='" + contact + '\'' +
                "contactMobile='" + contactMobile + '\'' +
                "remark='" + remark + '\'' +
                "userId='" + userId + '\'' +
                "payType='" + payType + '\'' +
                "payStatus='" + payStatus + '\'' +
                "rallyingPoint='" + rallyingPoint + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Order{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> orderIdList;

        private Integer orderIdSt;

        private Integer orderIdEd;

        public Integer getOrderIdSt(){
            return this.orderIdSt;
        }

        public Integer getOrderIdEd(){
            return this.orderIdEd;
        }

        private List<Integer> productIdList;

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){
            return this.productIdSt;
        }

        public Integer getProductIdEd(){
            return this.productIdEd;
        }

        private List<String> productNameList;


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){
            return this.fuzzyProductName;
        }

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){
            return this.rightFuzzyProductName;
        }
        private List<String> productInfoList;


        private List<String> fuzzyProductInfo;

        public List<String> getFuzzyProductInfo(){
            return this.fuzzyProductInfo;
        }

        private List<String> rightFuzzyProductInfo;

        public List<String> getRightFuzzyProductInfo(){
            return this.rightFuzzyProductInfo;
        }
        private List<String> packageIdList;


        private List<String> fuzzyPackageId;

        public List<String> getFuzzyPackageId(){
            return this.fuzzyPackageId;
        }

        private List<String> rightFuzzyPackageId;

        public List<String> getRightFuzzyPackageId(){
            return this.rightFuzzyPackageId;
        }
        private List<String> packageInfoList;


        private List<String> fuzzyPackageInfo;

        public List<String> getFuzzyPackageInfo(){
            return this.fuzzyPackageInfo;
        }

        private List<String> rightFuzzyPackageInfo;

        public List<String> getRightFuzzyPackageInfo(){
            return this.rightFuzzyPackageInfo;
        }
        private List<String> packageNameList;


        private List<String> fuzzyPackageName;

        public List<String> getFuzzyPackageName(){
            return this.fuzzyPackageName;
        }

        private List<String> rightFuzzyPackageName;

        public List<String> getRightFuzzyPackageName(){
            return this.rightFuzzyPackageName;
        }
        private List<String> dateInfoList;


        private List<String> fuzzyDateInfo;

        public List<String> getFuzzyDateInfo(){
            return this.fuzzyDateInfo;
        }

        private List<String> rightFuzzyDateInfo;

        public List<String> getRightFuzzyDateInfo(){
            return this.rightFuzzyDateInfo;
        }
        private List<String> orderNameList;


        private List<String> fuzzyOrderName;

        public List<String> getFuzzyOrderName(){
            return this.fuzzyOrderName;
        }

        private List<String> rightFuzzyOrderName;

        public List<String> getRightFuzzyOrderName(){
            return this.rightFuzzyOrderName;
        }
        private List<java.math.BigDecimal> orderPriceList;

        private java.math.BigDecimal orderPriceSt;

        private java.math.BigDecimal orderPriceEd;

        public java.math.BigDecimal getOrderPriceSt(){
            return this.orderPriceSt;
        }

        public java.math.BigDecimal getOrderPriceEd(){
            return this.orderPriceEd;
        }

        private List<Integer> statusList;

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){
            return this.statusSt;
        }

        public Integer getStatusEd(){
            return this.statusEd;
        }

        private List<String> salesmanList;


        private List<String> fuzzySalesman;

        public List<String> getFuzzySalesman(){
            return this.fuzzySalesman;
        }

        private List<String> rightFuzzySalesman;

        public List<String> getRightFuzzySalesman(){
            return this.rightFuzzySalesman;
        }
        private List<String> salesmanMobileList;


        private List<String> fuzzySalesmanMobile;

        public List<String> getFuzzySalesmanMobile(){
            return this.fuzzySalesmanMobile;
        }

        private List<String> rightFuzzySalesmanMobile;

        public List<String> getRightFuzzySalesmanMobile(){
            return this.rightFuzzySalesmanMobile;
        }
        private List<java.time.LocalDateTime> addtimeList;

        private java.time.LocalDateTime addtimeSt;

        private java.time.LocalDateTime addtimeEd;

        public java.time.LocalDateTime getAddtimeSt(){
            return this.addtimeSt;
        }

        public java.time.LocalDateTime getAddtimeEd(){
            return this.addtimeEd;
        }

        private List<String> teamdateList;


        private List<String> fuzzyTeamdate;

        public List<String> getFuzzyTeamdate(){
            return this.fuzzyTeamdate;
        }

        private List<String> rightFuzzyTeamdate;

        public List<String> getRightFuzzyTeamdate(){
            return this.rightFuzzyTeamdate;
        }
        private List<String> whatdayList;


        private List<String> fuzzyWhatday;

        public List<String> getFuzzyWhatday(){
            return this.fuzzyWhatday;
        }

        private List<String> rightFuzzyWhatday;

        public List<String> getRightFuzzyWhatday(){
            return this.rightFuzzyWhatday;
        }
        private List<Integer> adultNumList;

        private Integer adultNumSt;

        private Integer adultNumEd;

        public Integer getAdultNumSt(){
            return this.adultNumSt;
        }

        public Integer getAdultNumEd(){
            return this.adultNumEd;
        }

        private List<Integer> childrenNumList;

        private Integer childrenNumSt;

        private Integer childrenNumEd;

        public Integer getChildrenNumSt(){
            return this.childrenNumSt;
        }

        public Integer getChildrenNumEd(){
            return this.childrenNumEd;
        }

        private List<Integer> housingNumList;

        private Integer housingNumSt;

        private Integer housingNumEd;

        public Integer getHousingNumSt(){
            return this.housingNumSt;
        }

        public Integer getHousingNumEd(){
            return this.housingNumEd;
        }

        private List<String> contactList;


        private List<String> fuzzyContact;

        public List<String> getFuzzyContact(){
            return this.fuzzyContact;
        }

        private List<String> rightFuzzyContact;

        public List<String> getRightFuzzyContact(){
            return this.rightFuzzyContact;
        }
        private List<String> contactMobileList;


        private List<String> fuzzyContactMobile;

        public List<String> getFuzzyContactMobile(){
            return this.fuzzyContactMobile;
        }

        private List<String> rightFuzzyContactMobile;

        public List<String> getRightFuzzyContactMobile(){
            return this.rightFuzzyContactMobile;
        }
        private List<String> remarkList;


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){
            return this.fuzzyRemark;
        }

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){
            return this.rightFuzzyRemark;
        }
        private List<Integer> userIdList;

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){
            return this.userIdSt;
        }

        public Integer getUserIdEd(){
            return this.userIdEd;
        }

        private List<Integer> payTypeList;

        private Integer payTypeSt;

        private Integer payTypeEd;

        public Integer getPayTypeSt(){
            return this.payTypeSt;
        }

        public Integer getPayTypeEd(){
            return this.payTypeEd;
        }

        private List<Integer> payStatusList;

        private Integer payStatusSt;

        private Integer payStatusEd;

        public Integer getPayStatusSt(){
            return this.payStatusSt;
        }

        public Integer getPayStatusEd(){
            return this.payStatusEd;
        }

        private List<String> rallyingPointList;


        private List<String> fuzzyRallyingPoint;

        public List<String> getFuzzyRallyingPoint(){
            return this.fuzzyRallyingPoint;
        }

        private List<String> rightFuzzyRallyingPoint;

        public List<String> getRightFuzzyRallyingPoint(){
            return this.rightFuzzyRallyingPoint;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder orderIdBetWeen(Integer orderIdSt,Integer orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public QueryBuilder orderIdGreaterEqThan(Integer orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public QueryBuilder orderIdLessEqThan(Integer orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public QueryBuilder orderId(Integer orderId){
            setOrderId(orderId);
            return this;
        }

        public QueryBuilder orderIdList(Integer ... orderId){
            if (orderId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : orderId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.orderIdList = list;
            }

            return this;
        }

        public QueryBuilder orderIdList(List<Integer> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public QueryBuilder fetchOrderId(){
            setFetchFields("fetchFields","orderId");
            return this;
        }

        public QueryBuilder excludeOrderId(){
            setFetchFields("excludeFields","orderId");
            return this;
        }



        public QueryBuilder productIdBetWeen(Integer productIdSt,Integer productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public QueryBuilder productIdGreaterEqThan(Integer productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public QueryBuilder productIdLessEqThan(Integer productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public QueryBuilder productId(Integer productId){
            setProductId(productId);
            return this;
        }

        public QueryBuilder productIdList(Integer ... productId){
            if (productId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : productId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productIdList = list;
            }

            return this;
        }

        public QueryBuilder productIdList(List<Integer> productId){
            this.productIdList = productId;
            return this;
        }

        public QueryBuilder fetchProductId(){
            setFetchFields("fetchFields","productId");
            return this;
        }

        public QueryBuilder excludeProductId(){
            setFetchFields("excludeFields","productId");
            return this;
        }



        public QueryBuilder fuzzyProductName (List<String> fuzzyProductName){
            this.fuzzyProductName = fuzzyProductName;
            return this;
        }

        public QueryBuilder fuzzyProductName (String ... fuzzyProductName){
            if (fuzzyProductName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProductName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProductName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProductName (List<String> rightFuzzyProductName){
            this.rightFuzzyProductName = rightFuzzyProductName;
            return this;
        }

        public QueryBuilder rightFuzzyProductName (String ... rightFuzzyProductName){
            if (rightFuzzyProductName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProductName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProductName = list;
            }
            return this;
        }

        public QueryBuilder productName(String productName){
            setProductName(productName);
            return this;
        }

        public QueryBuilder productNameList(String ... productName){
            if (productName != null){
                List<String> list = new ArrayList<>();
                for (String item : productName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productNameList = list;
            }

            return this;
        }

        public QueryBuilder productNameList(List<String> productName){
            this.productNameList = productName;
            return this;
        }

        public QueryBuilder fetchProductName(){
            setFetchFields("fetchFields","productName");
            return this;
        }

        public QueryBuilder excludeProductName(){
            setFetchFields("excludeFields","productName");
            return this;
        }



        public QueryBuilder fuzzyProductInfo (List<String> fuzzyProductInfo){
            this.fuzzyProductInfo = fuzzyProductInfo;
            return this;
        }

        public QueryBuilder fuzzyProductInfo (String ... fuzzyProductInfo){
            if (fuzzyProductInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProductInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProductInfo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProductInfo (List<String> rightFuzzyProductInfo){
            this.rightFuzzyProductInfo = rightFuzzyProductInfo;
            return this;
        }

        public QueryBuilder rightFuzzyProductInfo (String ... rightFuzzyProductInfo){
            if (rightFuzzyProductInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProductInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProductInfo = list;
            }
            return this;
        }

        public QueryBuilder productInfo(String productInfo){
            setProductInfo(productInfo);
            return this;
        }

        public QueryBuilder productInfoList(String ... productInfo){
            if (productInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : productInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productInfoList = list;
            }

            return this;
        }

        public QueryBuilder productInfoList(List<String> productInfo){
            this.productInfoList = productInfo;
            return this;
        }

        public QueryBuilder fetchProductInfo(){
            setFetchFields("fetchFields","productInfo");
            return this;
        }

        public QueryBuilder excludeProductInfo(){
            setFetchFields("excludeFields","productInfo");
            return this;
        }



        public QueryBuilder fuzzyPackageId (List<String> fuzzyPackageId){
            this.fuzzyPackageId = fuzzyPackageId;
            return this;
        }

        public QueryBuilder fuzzyPackageId (String ... fuzzyPackageId){
            if (fuzzyPackageId != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPackageId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPackageId = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPackageId (List<String> rightFuzzyPackageId){
            this.rightFuzzyPackageId = rightFuzzyPackageId;
            return this;
        }

        public QueryBuilder rightFuzzyPackageId (String ... rightFuzzyPackageId){
            if (rightFuzzyPackageId != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPackageId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPackageId = list;
            }
            return this;
        }

        public QueryBuilder packageId(String packageId){
            setPackageId(packageId);
            return this;
        }

        public QueryBuilder packageIdList(String ... packageId){
            if (packageId != null){
                List<String> list = new ArrayList<>();
                for (String item : packageId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.packageIdList = list;
            }

            return this;
        }

        public QueryBuilder packageIdList(List<String> packageId){
            this.packageIdList = packageId;
            return this;
        }

        public QueryBuilder fetchPackageId(){
            setFetchFields("fetchFields","packageId");
            return this;
        }

        public QueryBuilder excludePackageId(){
            setFetchFields("excludeFields","packageId");
            return this;
        }



        public QueryBuilder fuzzyPackageInfo (List<String> fuzzyPackageInfo){
            this.fuzzyPackageInfo = fuzzyPackageInfo;
            return this;
        }

        public QueryBuilder fuzzyPackageInfo (String ... fuzzyPackageInfo){
            if (fuzzyPackageInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPackageInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPackageInfo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPackageInfo (List<String> rightFuzzyPackageInfo){
            this.rightFuzzyPackageInfo = rightFuzzyPackageInfo;
            return this;
        }

        public QueryBuilder rightFuzzyPackageInfo (String ... rightFuzzyPackageInfo){
            if (rightFuzzyPackageInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPackageInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPackageInfo = list;
            }
            return this;
        }

        public QueryBuilder packageInfo(String packageInfo){
            setPackageInfo(packageInfo);
            return this;
        }

        public QueryBuilder packageInfoList(String ... packageInfo){
            if (packageInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : packageInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.packageInfoList = list;
            }

            return this;
        }

        public QueryBuilder packageInfoList(List<String> packageInfo){
            this.packageInfoList = packageInfo;
            return this;
        }

        public QueryBuilder fetchPackageInfo(){
            setFetchFields("fetchFields","packageInfo");
            return this;
        }

        public QueryBuilder excludePackageInfo(){
            setFetchFields("excludeFields","packageInfo");
            return this;
        }



        public QueryBuilder fuzzyPackageName (List<String> fuzzyPackageName){
            this.fuzzyPackageName = fuzzyPackageName;
            return this;
        }

        public QueryBuilder fuzzyPackageName (String ... fuzzyPackageName){
            if (fuzzyPackageName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPackageName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPackageName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPackageName (List<String> rightFuzzyPackageName){
            this.rightFuzzyPackageName = rightFuzzyPackageName;
            return this;
        }

        public QueryBuilder rightFuzzyPackageName (String ... rightFuzzyPackageName){
            if (rightFuzzyPackageName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPackageName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPackageName = list;
            }
            return this;
        }

        public QueryBuilder packageName(String packageName){
            setPackageName(packageName);
            return this;
        }

        public QueryBuilder packageNameList(String ... packageName){
            if (packageName != null){
                List<String> list = new ArrayList<>();
                for (String item : packageName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.packageNameList = list;
            }

            return this;
        }

        public QueryBuilder packageNameList(List<String> packageName){
            this.packageNameList = packageName;
            return this;
        }

        public QueryBuilder fetchPackageName(){
            setFetchFields("fetchFields","packageName");
            return this;
        }

        public QueryBuilder excludePackageName(){
            setFetchFields("excludeFields","packageName");
            return this;
        }



        public QueryBuilder fuzzyDateInfo (List<String> fuzzyDateInfo){
            this.fuzzyDateInfo = fuzzyDateInfo;
            return this;
        }

        public QueryBuilder fuzzyDateInfo (String ... fuzzyDateInfo){
            if (fuzzyDateInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyDateInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyDateInfo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyDateInfo (List<String> rightFuzzyDateInfo){
            this.rightFuzzyDateInfo = rightFuzzyDateInfo;
            return this;
        }

        public QueryBuilder rightFuzzyDateInfo (String ... rightFuzzyDateInfo){
            if (rightFuzzyDateInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyDateInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyDateInfo = list;
            }
            return this;
        }

        public QueryBuilder dateInfo(String dateInfo){
            setDateInfo(dateInfo);
            return this;
        }

        public QueryBuilder dateInfoList(String ... dateInfo){
            if (dateInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : dateInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.dateInfoList = list;
            }

            return this;
        }

        public QueryBuilder dateInfoList(List<String> dateInfo){
            this.dateInfoList = dateInfo;
            return this;
        }

        public QueryBuilder fetchDateInfo(){
            setFetchFields("fetchFields","dateInfo");
            return this;
        }

        public QueryBuilder excludeDateInfo(){
            setFetchFields("excludeFields","dateInfo");
            return this;
        }



        public QueryBuilder fuzzyOrderName (List<String> fuzzyOrderName){
            this.fuzzyOrderName = fuzzyOrderName;
            return this;
        }

        public QueryBuilder fuzzyOrderName (String ... fuzzyOrderName){
            if (fuzzyOrderName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyOrderName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyOrderName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyOrderName (List<String> rightFuzzyOrderName){
            this.rightFuzzyOrderName = rightFuzzyOrderName;
            return this;
        }

        public QueryBuilder rightFuzzyOrderName (String ... rightFuzzyOrderName){
            if (rightFuzzyOrderName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyOrderName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyOrderName = list;
            }
            return this;
        }

        public QueryBuilder orderName(String orderName){
            setOrderName(orderName);
            return this;
        }

        public QueryBuilder orderNameList(String ... orderName){
            if (orderName != null){
                List<String> list = new ArrayList<>();
                for (String item : orderName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.orderNameList = list;
            }

            return this;
        }

        public QueryBuilder orderNameList(List<String> orderName){
            this.orderNameList = orderName;
            return this;
        }

        public QueryBuilder fetchOrderName(){
            setFetchFields("fetchFields","orderName");
            return this;
        }

        public QueryBuilder excludeOrderName(){
            setFetchFields("excludeFields","orderName");
            return this;
        }



        public QueryBuilder orderPriceBetWeen(java.math.BigDecimal orderPriceSt,java.math.BigDecimal orderPriceEd){
            this.orderPriceSt = orderPriceSt;
            this.orderPriceEd = orderPriceEd;
            return this;
        }

        public QueryBuilder orderPriceGreaterEqThan(java.math.BigDecimal orderPriceSt){
            this.orderPriceSt = orderPriceSt;
            return this;
        }
        public QueryBuilder orderPriceLessEqThan(java.math.BigDecimal orderPriceEd){
            this.orderPriceEd = orderPriceEd;
            return this;
        }


        public QueryBuilder orderPrice(java.math.BigDecimal orderPrice){
            setOrderPrice(orderPrice);
            return this;
        }

        public QueryBuilder orderPriceList(java.math.BigDecimal ... orderPrice){
            if (orderPrice != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : orderPrice){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.orderPriceList = list;
            }

            return this;
        }

        public QueryBuilder orderPriceList(List<java.math.BigDecimal> orderPrice){
            this.orderPriceList = orderPrice;
            return this;
        }

        public QueryBuilder fetchOrderPrice(){
            setFetchFields("fetchFields","orderPrice");
            return this;
        }

        public QueryBuilder excludeOrderPrice(){
            setFetchFields("excludeFields","orderPrice");
            return this;
        }



        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            if (status != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : status){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.statusList = list;
            }

            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }



        public QueryBuilder fuzzySalesman (List<String> fuzzySalesman){
            this.fuzzySalesman = fuzzySalesman;
            return this;
        }

        public QueryBuilder fuzzySalesman (String ... fuzzySalesman){
            if (fuzzySalesman != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySalesman){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySalesman = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySalesman (List<String> rightFuzzySalesman){
            this.rightFuzzySalesman = rightFuzzySalesman;
            return this;
        }

        public QueryBuilder rightFuzzySalesman (String ... rightFuzzySalesman){
            if (rightFuzzySalesman != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySalesman){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySalesman = list;
            }
            return this;
        }

        public QueryBuilder salesman(String salesman){
            setSalesman(salesman);
            return this;
        }

        public QueryBuilder salesmanList(String ... salesman){
            if (salesman != null){
                List<String> list = new ArrayList<>();
                for (String item : salesman){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.salesmanList = list;
            }

            return this;
        }

        public QueryBuilder salesmanList(List<String> salesman){
            this.salesmanList = salesman;
            return this;
        }

        public QueryBuilder fetchSalesman(){
            setFetchFields("fetchFields","salesman");
            return this;
        }

        public QueryBuilder excludeSalesman(){
            setFetchFields("excludeFields","salesman");
            return this;
        }



        public QueryBuilder fuzzySalesmanMobile (List<String> fuzzySalesmanMobile){
            this.fuzzySalesmanMobile = fuzzySalesmanMobile;
            return this;
        }

        public QueryBuilder fuzzySalesmanMobile (String ... fuzzySalesmanMobile){
            if (fuzzySalesmanMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySalesmanMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySalesmanMobile = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySalesmanMobile (List<String> rightFuzzySalesmanMobile){
            this.rightFuzzySalesmanMobile = rightFuzzySalesmanMobile;
            return this;
        }

        public QueryBuilder rightFuzzySalesmanMobile (String ... rightFuzzySalesmanMobile){
            if (rightFuzzySalesmanMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySalesmanMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySalesmanMobile = list;
            }
            return this;
        }

        public QueryBuilder salesmanMobile(String salesmanMobile){
            setSalesmanMobile(salesmanMobile);
            return this;
        }

        public QueryBuilder salesmanMobileList(String ... salesmanMobile){
            if (salesmanMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : salesmanMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.salesmanMobileList = list;
            }

            return this;
        }

        public QueryBuilder salesmanMobileList(List<String> salesmanMobile){
            this.salesmanMobileList = salesmanMobile;
            return this;
        }

        public QueryBuilder fetchSalesmanMobile(){
            setFetchFields("fetchFields","salesmanMobile");
            return this;
        }

        public QueryBuilder excludeSalesmanMobile(){
            setFetchFields("excludeFields","salesmanMobile");
            return this;
        }



        public QueryBuilder addtimeBetWeen(java.time.LocalDateTime addtimeSt,java.time.LocalDateTime addtimeEd){
            this.addtimeSt = addtimeSt;
            this.addtimeEd = addtimeEd;
            return this;
        }

        public QueryBuilder addtimeGreaterEqThan(java.time.LocalDateTime addtimeSt){
            this.addtimeSt = addtimeSt;
            return this;
        }
        public QueryBuilder addtimeLessEqThan(java.time.LocalDateTime addtimeEd){
            this.addtimeEd = addtimeEd;
            return this;
        }


        public QueryBuilder addtime(java.time.LocalDateTime addtime){
            setAddtime(addtime);
            return this;
        }

        public QueryBuilder addtimeList(java.time.LocalDateTime ... addtime){
            if (addtime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : addtime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.addtimeList = list;
            }

            return this;
        }

        public QueryBuilder addtimeList(List<java.time.LocalDateTime> addtime){
            this.addtimeList = addtime;
            return this;
        }

        public QueryBuilder fetchAddtime(){
            setFetchFields("fetchFields","addtime");
            return this;
        }

        public QueryBuilder excludeAddtime(){
            setFetchFields("excludeFields","addtime");
            return this;
        }



        public QueryBuilder fuzzyTeamdate (List<String> fuzzyTeamdate){
            this.fuzzyTeamdate = fuzzyTeamdate;
            return this;
        }

        public QueryBuilder fuzzyTeamdate (String ... fuzzyTeamdate){
            if (fuzzyTeamdate != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyTeamdate){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyTeamdate = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyTeamdate (List<String> rightFuzzyTeamdate){
            this.rightFuzzyTeamdate = rightFuzzyTeamdate;
            return this;
        }

        public QueryBuilder rightFuzzyTeamdate (String ... rightFuzzyTeamdate){
            if (rightFuzzyTeamdate != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyTeamdate){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyTeamdate = list;
            }
            return this;
        }

        public QueryBuilder teamdate(String teamdate){
            setTeamdate(teamdate);
            return this;
        }

        public QueryBuilder teamdateList(String ... teamdate){
            if (teamdate != null){
                List<String> list = new ArrayList<>();
                for (String item : teamdate){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.teamdateList = list;
            }

            return this;
        }

        public QueryBuilder teamdateList(List<String> teamdate){
            this.teamdateList = teamdate;
            return this;
        }

        public QueryBuilder fetchTeamdate(){
            setFetchFields("fetchFields","teamdate");
            return this;
        }

        public QueryBuilder excludeTeamdate(){
            setFetchFields("excludeFields","teamdate");
            return this;
        }



        public QueryBuilder fuzzyWhatday (List<String> fuzzyWhatday){
            this.fuzzyWhatday = fuzzyWhatday;
            return this;
        }

        public QueryBuilder fuzzyWhatday (String ... fuzzyWhatday){
            if (fuzzyWhatday != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyWhatday){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyWhatday = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyWhatday (List<String> rightFuzzyWhatday){
            this.rightFuzzyWhatday = rightFuzzyWhatday;
            return this;
        }

        public QueryBuilder rightFuzzyWhatday (String ... rightFuzzyWhatday){
            if (rightFuzzyWhatday != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyWhatday){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyWhatday = list;
            }
            return this;
        }

        public QueryBuilder whatday(String whatday){
            setWhatday(whatday);
            return this;
        }

        public QueryBuilder whatdayList(String ... whatday){
            if (whatday != null){
                List<String> list = new ArrayList<>();
                for (String item : whatday){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.whatdayList = list;
            }

            return this;
        }

        public QueryBuilder whatdayList(List<String> whatday){
            this.whatdayList = whatday;
            return this;
        }

        public QueryBuilder fetchWhatday(){
            setFetchFields("fetchFields","whatday");
            return this;
        }

        public QueryBuilder excludeWhatday(){
            setFetchFields("excludeFields","whatday");
            return this;
        }



        public QueryBuilder adultNumBetWeen(Integer adultNumSt,Integer adultNumEd){
            this.adultNumSt = adultNumSt;
            this.adultNumEd = adultNumEd;
            return this;
        }

        public QueryBuilder adultNumGreaterEqThan(Integer adultNumSt){
            this.adultNumSt = adultNumSt;
            return this;
        }
        public QueryBuilder adultNumLessEqThan(Integer adultNumEd){
            this.adultNumEd = adultNumEd;
            return this;
        }


        public QueryBuilder adultNum(Integer adultNum){
            setAdultNum(adultNum);
            return this;
        }

        public QueryBuilder adultNumList(Integer ... adultNum){
            if (adultNum != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : adultNum){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.adultNumList = list;
            }

            return this;
        }

        public QueryBuilder adultNumList(List<Integer> adultNum){
            this.adultNumList = adultNum;
            return this;
        }

        public QueryBuilder fetchAdultNum(){
            setFetchFields("fetchFields","adultNum");
            return this;
        }

        public QueryBuilder excludeAdultNum(){
            setFetchFields("excludeFields","adultNum");
            return this;
        }



        public QueryBuilder childrenNumBetWeen(Integer childrenNumSt,Integer childrenNumEd){
            this.childrenNumSt = childrenNumSt;
            this.childrenNumEd = childrenNumEd;
            return this;
        }

        public QueryBuilder childrenNumGreaterEqThan(Integer childrenNumSt){
            this.childrenNumSt = childrenNumSt;
            return this;
        }
        public QueryBuilder childrenNumLessEqThan(Integer childrenNumEd){
            this.childrenNumEd = childrenNumEd;
            return this;
        }


        public QueryBuilder childrenNum(Integer childrenNum){
            setChildrenNum(childrenNum);
            return this;
        }

        public QueryBuilder childrenNumList(Integer ... childrenNum){
            if (childrenNum != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : childrenNum){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.childrenNumList = list;
            }

            return this;
        }

        public QueryBuilder childrenNumList(List<Integer> childrenNum){
            this.childrenNumList = childrenNum;
            return this;
        }

        public QueryBuilder fetchChildrenNum(){
            setFetchFields("fetchFields","childrenNum");
            return this;
        }

        public QueryBuilder excludeChildrenNum(){
            setFetchFields("excludeFields","childrenNum");
            return this;
        }



        public QueryBuilder housingNumBetWeen(Integer housingNumSt,Integer housingNumEd){
            this.housingNumSt = housingNumSt;
            this.housingNumEd = housingNumEd;
            return this;
        }

        public QueryBuilder housingNumGreaterEqThan(Integer housingNumSt){
            this.housingNumSt = housingNumSt;
            return this;
        }
        public QueryBuilder housingNumLessEqThan(Integer housingNumEd){
            this.housingNumEd = housingNumEd;
            return this;
        }


        public QueryBuilder housingNum(Integer housingNum){
            setHousingNum(housingNum);
            return this;
        }

        public QueryBuilder housingNumList(Integer ... housingNum){
            if (housingNum != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : housingNum){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.housingNumList = list;
            }

            return this;
        }

        public QueryBuilder housingNumList(List<Integer> housingNum){
            this.housingNumList = housingNum;
            return this;
        }

        public QueryBuilder fetchHousingNum(){
            setFetchFields("fetchFields","housingNum");
            return this;
        }

        public QueryBuilder excludeHousingNum(){
            setFetchFields("excludeFields","housingNum");
            return this;
        }



        public QueryBuilder fuzzyContact (List<String> fuzzyContact){
            this.fuzzyContact = fuzzyContact;
            return this;
        }

        public QueryBuilder fuzzyContact (String ... fuzzyContact){
            if (fuzzyContact != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyContact){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyContact = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyContact (List<String> rightFuzzyContact){
            this.rightFuzzyContact = rightFuzzyContact;
            return this;
        }

        public QueryBuilder rightFuzzyContact (String ... rightFuzzyContact){
            if (rightFuzzyContact != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyContact){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyContact = list;
            }
            return this;
        }

        public QueryBuilder contact(String contact){
            setContact(contact);
            return this;
        }

        public QueryBuilder contactList(String ... contact){
            if (contact != null){
                List<String> list = new ArrayList<>();
                for (String item : contact){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.contactList = list;
            }

            return this;
        }

        public QueryBuilder contactList(List<String> contact){
            this.contactList = contact;
            return this;
        }

        public QueryBuilder fetchContact(){
            setFetchFields("fetchFields","contact");
            return this;
        }

        public QueryBuilder excludeContact(){
            setFetchFields("excludeFields","contact");
            return this;
        }



        public QueryBuilder fuzzyContactMobile (List<String> fuzzyContactMobile){
            this.fuzzyContactMobile = fuzzyContactMobile;
            return this;
        }

        public QueryBuilder fuzzyContactMobile (String ... fuzzyContactMobile){
            if (fuzzyContactMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyContactMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyContactMobile = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyContactMobile (List<String> rightFuzzyContactMobile){
            this.rightFuzzyContactMobile = rightFuzzyContactMobile;
            return this;
        }

        public QueryBuilder rightFuzzyContactMobile (String ... rightFuzzyContactMobile){
            if (rightFuzzyContactMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyContactMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyContactMobile = list;
            }
            return this;
        }

        public QueryBuilder contactMobile(String contactMobile){
            setContactMobile(contactMobile);
            return this;
        }

        public QueryBuilder contactMobileList(String ... contactMobile){
            if (contactMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : contactMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.contactMobileList = list;
            }

            return this;
        }

        public QueryBuilder contactMobileList(List<String> contactMobile){
            this.contactMobileList = contactMobile;
            return this;
        }

        public QueryBuilder fetchContactMobile(){
            setFetchFields("fetchFields","contactMobile");
            return this;
        }

        public QueryBuilder excludeContactMobile(){
            setFetchFields("excludeFields","contactMobile");
            return this;
        }



        public QueryBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public QueryBuilder fuzzyRemark (String ... fuzzyRemark){
            if (fuzzyRemark != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyRemark){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyRemark = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public QueryBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            if (rightFuzzyRemark != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyRemark){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyRemark = list;
            }
            return this;
        }

        public QueryBuilder remark(String remark){
            setRemark(remark);
            return this;
        }

        public QueryBuilder remarkList(String ... remark){
            if (remark != null){
                List<String> list = new ArrayList<>();
                for (String item : remark){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.remarkList = list;
            }

            return this;
        }

        public QueryBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public QueryBuilder fetchRemark(){
            setFetchFields("fetchFields","remark");
            return this;
        }

        public QueryBuilder excludeRemark(){
            setFetchFields("excludeFields","remark");
            return this;
        }



        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            if (userId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : userId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userIdList = list;
            }

            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }



        public QueryBuilder payTypeBetWeen(Integer payTypeSt,Integer payTypeEd){
            this.payTypeSt = payTypeSt;
            this.payTypeEd = payTypeEd;
            return this;
        }

        public QueryBuilder payTypeGreaterEqThan(Integer payTypeSt){
            this.payTypeSt = payTypeSt;
            return this;
        }
        public QueryBuilder payTypeLessEqThan(Integer payTypeEd){
            this.payTypeEd = payTypeEd;
            return this;
        }


        public QueryBuilder payType(Integer payType){
            setPayType(payType);
            return this;
        }

        public QueryBuilder payTypeList(Integer ... payType){
            if (payType != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : payType){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.payTypeList = list;
            }

            return this;
        }

        public QueryBuilder payTypeList(List<Integer> payType){
            this.payTypeList = payType;
            return this;
        }

        public QueryBuilder fetchPayType(){
            setFetchFields("fetchFields","payType");
            return this;
        }

        public QueryBuilder excludePayType(){
            setFetchFields("excludeFields","payType");
            return this;
        }



        public QueryBuilder payStatusBetWeen(Integer payStatusSt,Integer payStatusEd){
            this.payStatusSt = payStatusSt;
            this.payStatusEd = payStatusEd;
            return this;
        }

        public QueryBuilder payStatusGreaterEqThan(Integer payStatusSt){
            this.payStatusSt = payStatusSt;
            return this;
        }
        public QueryBuilder payStatusLessEqThan(Integer payStatusEd){
            this.payStatusEd = payStatusEd;
            return this;
        }


        public QueryBuilder payStatus(Integer payStatus){
            setPayStatus(payStatus);
            return this;
        }

        public QueryBuilder payStatusList(Integer ... payStatus){
            if (payStatus != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : payStatus){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.payStatusList = list;
            }

            return this;
        }

        public QueryBuilder payStatusList(List<Integer> payStatus){
            this.payStatusList = payStatus;
            return this;
        }

        public QueryBuilder fetchPayStatus(){
            setFetchFields("fetchFields","payStatus");
            return this;
        }

        public QueryBuilder excludePayStatus(){
            setFetchFields("excludeFields","payStatus");
            return this;
        }



        public QueryBuilder fuzzyRallyingPoint (List<String> fuzzyRallyingPoint){
            this.fuzzyRallyingPoint = fuzzyRallyingPoint;
            return this;
        }

        public QueryBuilder fuzzyRallyingPoint (String ... fuzzyRallyingPoint){
            if (fuzzyRallyingPoint != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyRallyingPoint){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyRallyingPoint = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyRallyingPoint (List<String> rightFuzzyRallyingPoint){
            this.rightFuzzyRallyingPoint = rightFuzzyRallyingPoint;
            return this;
        }

        public QueryBuilder rightFuzzyRallyingPoint (String ... rightFuzzyRallyingPoint){
            if (rightFuzzyRallyingPoint != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyRallyingPoint){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyRallyingPoint = list;
            }
            return this;
        }

        public QueryBuilder rallyingPoint(String rallyingPoint){
            setRallyingPoint(rallyingPoint);
            return this;
        }

        public QueryBuilder rallyingPointList(String ... rallyingPoint){
            if (rallyingPoint != null){
                List<String> list = new ArrayList<>();
                for (String item : rallyingPoint){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rallyingPointList = list;
            }

            return this;
        }

        public QueryBuilder rallyingPointList(List<String> rallyingPoint){
            this.rallyingPointList = rallyingPoint;
            return this;
        }

        public QueryBuilder fetchRallyingPoint(){
            setFetchFields("fetchFields","rallyingPoint");
            return this;
        }

        public QueryBuilder excludeRallyingPoint(){
            setFetchFields("excludeFields","rallyingPoint");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Order build(){
            return this;
        }
    }

}
