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
public class OrderOperate implements Serializable {

    private static final long serialVersionUID = 1526996874715L;


    /**
    * 主键
    * 订单操作ID
    * isNullAble:0
    */
    private Integer id;

    /**
    * 操作时间
    * isNullAble:1
    */
    private java.time.LocalDateTime addtime;

    /**
    * 备注内容
    * isNullAble:1
    */
    private String remark;

    /**
    * 是否同步前台
    * isNullAble:1
    */
    private Integer issync;

    /**
    * 操作员
    * isNullAble:1
    */
    private String operator;

    /**
    * 
    * isNullAble:0
    */
    private Integer orderId;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setAddtime(java.time.LocalDateTime addtime){
        this.addtime = addtime;
    }

    public java.time.LocalDateTime getAddtime(){
        return this.addtime;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }

    public String getRemark(){
        return this.remark;
    }

    public void setIssync(Integer issync){
        this.issync = issync;
    }

    public Integer getIssync(){
        return this.issync;
    }

    public void setOperator(String operator){
        this.operator = operator;
    }

    public String getOperator(){
        return this.operator;
    }

    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }

    public Integer getOrderId(){
        return this.orderId;
    }
    @Override
    public String toString() {
        return "OrderOperate{" +
                "id='" + id + '\'' +
                "addtime='" + addtime + '\'' +
                "remark='" + remark + '\'' +
                "issync='" + issync + '\'' +
                "operator='" + operator + '\'' +
                "orderId='" + orderId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends OrderOperate{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> idList;

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){
            return this.idSt;
        }

        public Integer getIdEd(){
            return this.idEd;
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

        private List<String> remarkList;


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){
            return this.fuzzyRemark;
        }

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){
            return this.rightFuzzyRemark;
        }
        private List<Integer> issyncList;

        private Integer issyncSt;

        private Integer issyncEd;

        public Integer getIssyncSt(){
            return this.issyncSt;
        }

        public Integer getIssyncEd(){
            return this.issyncEd;
        }

        private List<String> operatorList;


        private List<String> fuzzyOperator;

        public List<String> getFuzzyOperator(){
            return this.fuzzyOperator;
        }

        private List<String> rightFuzzyOperator;

        public List<String> getRightFuzzyOperator(){
            return this.rightFuzzyOperator;
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

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            if (id != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.idList = list;
            }

            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
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



        public QueryBuilder issyncBetWeen(Integer issyncSt,Integer issyncEd){
            this.issyncSt = issyncSt;
            this.issyncEd = issyncEd;
            return this;
        }

        public QueryBuilder issyncGreaterEqThan(Integer issyncSt){
            this.issyncSt = issyncSt;
            return this;
        }
        public QueryBuilder issyncLessEqThan(Integer issyncEd){
            this.issyncEd = issyncEd;
            return this;
        }


        public QueryBuilder issync(Integer issync){
            setIssync(issync);
            return this;
        }

        public QueryBuilder issyncList(Integer ... issync){
            if (issync != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : issync){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.issyncList = list;
            }

            return this;
        }

        public QueryBuilder issyncList(List<Integer> issync){
            this.issyncList = issync;
            return this;
        }

        public QueryBuilder fetchIssync(){
            setFetchFields("fetchFields","issync");
            return this;
        }

        public QueryBuilder excludeIssync(){
            setFetchFields("excludeFields","issync");
            return this;
        }



        public QueryBuilder fuzzyOperator (List<String> fuzzyOperator){
            this.fuzzyOperator = fuzzyOperator;
            return this;
        }

        public QueryBuilder fuzzyOperator (String ... fuzzyOperator){
            if (fuzzyOperator != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyOperator){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyOperator = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyOperator (List<String> rightFuzzyOperator){
            this.rightFuzzyOperator = rightFuzzyOperator;
            return this;
        }

        public QueryBuilder rightFuzzyOperator (String ... rightFuzzyOperator){
            if (rightFuzzyOperator != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyOperator){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyOperator = list;
            }
            return this;
        }

        public QueryBuilder operator(String operator){
            setOperator(operator);
            return this;
        }

        public QueryBuilder operatorList(String ... operator){
            if (operator != null){
                List<String> list = new ArrayList<>();
                for (String item : operator){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.operatorList = list;
            }

            return this;
        }

        public QueryBuilder operatorList(List<String> operator){
            this.operatorList = operator;
            return this;
        }

        public QueryBuilder fetchOperator(){
            setFetchFields("fetchFields","operator");
            return this;
        }

        public QueryBuilder excludeOperator(){
            setFetchFields("excludeFields","operator");
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

        public OrderOperate build(){
            return this;
        }
    }

}
