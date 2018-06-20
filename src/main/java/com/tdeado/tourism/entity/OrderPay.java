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
public class OrderPay implements Serializable {

    private static final long serialVersionUID = 1526976054517L;


    /**
    * 主键
    * 支付记录ID
    * isNullAble:0
    */
    private Integer payId;

    /**
    * 订单ID
    * isNullAble:1
    */
    private Integer orderId;

    /**
    * 是否支付成功
    * isNullAble:0,defaultVal:0
    */
    private Integer success;

    /**
    * 支付类型 1微信 2支付宝 3网银转账
    * isNullAble:1
    */
    private Integer payType;

    /**
    * 产品ID
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 
    * isNullAble:0,defaultVal:1
    */
    private Integer userId;

    /**
    * 备注
    * isNullAble:1
    */
    private String remark;

    /**
    * 第三方支付订单号
    * isNullAble:1
    */
    private String payNo;


    public void setPayId(Integer payId){
        this.payId = payId;
    }

    public Integer getPayId(){
        return this.payId;
    }

    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }

    public Integer getOrderId(){
        return this.orderId;
    }

    public void setSuccess(Integer success){
        this.success = success;
    }

    public Integer getSuccess(){
        return this.success;
    }

    public void setPayType(Integer payType){
        this.payType = payType;
    }

    public Integer getPayType(){
        return this.payType;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }

    public String getRemark(){
        return this.remark;
    }

    public void setPayNo(String payNo){
        this.payNo = payNo;
    }

    public String getPayNo(){
        return this.payNo;
    }
    @Override
    public String toString() {
        return "OrderPay{" +
                "payId='" + payId + '\'' +
                "orderId='" + orderId + '\'' +
                "success='" + success + '\'' +
                "payType='" + payType + '\'' +
                "productId='" + productId + '\'' +
                "userId='" + userId + '\'' +
                "remark='" + remark + '\'' +
                "payNo='" + payNo + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends OrderPay{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> payIdList;

        private Integer payIdSt;

        private Integer payIdEd;

        public Integer getPayIdSt(){
            return this.payIdSt;
        }

        public Integer getPayIdEd(){
            return this.payIdEd;
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

        private List<Integer> successList;

        private Integer successSt;

        private Integer successEd;

        public Integer getSuccessSt(){
            return this.successSt;
        }

        public Integer getSuccessEd(){
            return this.successEd;
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

        private List<Integer> productIdList;

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){
            return this.productIdSt;
        }

        public Integer getProductIdEd(){
            return this.productIdEd;
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

        private List<String> remarkList;


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){
            return this.fuzzyRemark;
        }

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){
            return this.rightFuzzyRemark;
        }
        private List<String> payNoList;


        private List<String> fuzzyPayNo;

        public List<String> getFuzzyPayNo(){
            return this.fuzzyPayNo;
        }

        private List<String> rightFuzzyPayNo;

        public List<String> getRightFuzzyPayNo(){
            return this.rightFuzzyPayNo;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder payIdBetWeen(Integer payIdSt,Integer payIdEd){
            this.payIdSt = payIdSt;
            this.payIdEd = payIdEd;
            return this;
        }

        public QueryBuilder payIdGreaterEqThan(Integer payIdSt){
            this.payIdSt = payIdSt;
            return this;
        }
        public QueryBuilder payIdLessEqThan(Integer payIdEd){
            this.payIdEd = payIdEd;
            return this;
        }


        public QueryBuilder payId(Integer payId){
            setPayId(payId);
            return this;
        }

        public QueryBuilder payIdList(Integer ... payId){
            if (payId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : payId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.payIdList = list;
            }

            return this;
        }

        public QueryBuilder payIdList(List<Integer> payId){
            this.payIdList = payId;
            return this;
        }

        public QueryBuilder fetchPayId(){
            setFetchFields("fetchFields","payId");
            return this;
        }

        public QueryBuilder excludePayId(){
            setFetchFields("excludeFields","payId");
            return this;
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



        public QueryBuilder successBetWeen(Integer successSt,Integer successEd){
            this.successSt = successSt;
            this.successEd = successEd;
            return this;
        }

        public QueryBuilder successGreaterEqThan(Integer successSt){
            this.successSt = successSt;
            return this;
        }
        public QueryBuilder successLessEqThan(Integer successEd){
            this.successEd = successEd;
            return this;
        }


        public QueryBuilder success(Integer success){
            setSuccess(success);
            return this;
        }

        public QueryBuilder successList(Integer ... success){
            if (success != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : success){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.successList = list;
            }

            return this;
        }

        public QueryBuilder successList(List<Integer> success){
            this.successList = success;
            return this;
        }

        public QueryBuilder fetchSuccess(){
            setFetchFields("fetchFields","success");
            return this;
        }

        public QueryBuilder excludeSuccess(){
            setFetchFields("excludeFields","success");
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



        public QueryBuilder fuzzyPayNo (List<String> fuzzyPayNo){
            this.fuzzyPayNo = fuzzyPayNo;
            return this;
        }

        public QueryBuilder fuzzyPayNo (String ... fuzzyPayNo){
            if (fuzzyPayNo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPayNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPayNo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPayNo (List<String> rightFuzzyPayNo){
            this.rightFuzzyPayNo = rightFuzzyPayNo;
            return this;
        }

        public QueryBuilder rightFuzzyPayNo (String ... rightFuzzyPayNo){
            if (rightFuzzyPayNo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPayNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPayNo = list;
            }
            return this;
        }

        public QueryBuilder payNo(String payNo){
            setPayNo(payNo);
            return this;
        }

        public QueryBuilder payNoList(String ... payNo){
            if (payNo != null){
                List<String> list = new ArrayList<>();
                for (String item : payNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.payNoList = list;
            }

            return this;
        }

        public QueryBuilder payNoList(List<String> payNo){
            this.payNoList = payNo;
            return this;
        }

        public QueryBuilder fetchPayNo(){
            setFetchFields("fetchFields","payNo");
            return this;
        }

        public QueryBuilder excludePayNo(){
            setFetchFields("excludeFields","payNo");
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

        public OrderPay build(){
            return this;
        }
    }

}
