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
public class OrderVisitors implements Serializable {

    private static final long serialVersionUID = 1527678435651L;


    /**
    * 主键
    * ID
    * isNullAble:0
    */
    private Integer id;

    /**
    * 订单号
    * isNullAble:0
    */
    private Integer orderId;

    /**
    * 是否成人
    * isNullAble:1,defaultVal:1
    */
    private Integer isadult;

    /**
    * 姓名
    * isNullAble:1
    */
    private String name;

    /**
    * 身份证
    * isNullAble:1,defaultVal:
    */
    private String idCard;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }

    public Integer getOrderId(){
        return this.orderId;
    }

    public void setIsadult(Integer isadult){
        this.isadult = isadult;
    }

    public Integer getIsadult(){
        return this.isadult;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setIdCard(String idCard){
        this.idCard = idCard;
    }

    public String getIdCard(){
        return this.idCard;
    }
    @Override
    public String toString() {
        return "OrderVisitors{" +
                "id='" + id + '\'' +
                "orderId='" + orderId + '\'' +
                "isadult='" + isadult + '\'' +
                "name='" + name + '\'' +
                "idCard='" + idCard + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends OrderVisitors{
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

        private List<Integer> orderIdList;

        private Integer orderIdSt;

        private Integer orderIdEd;

        public Integer getOrderIdSt(){
            return this.orderIdSt;
        }

        public Integer getOrderIdEd(){
            return this.orderIdEd;
        }

        private List<Integer> isadultList;

        private Integer isadultSt;

        private Integer isadultEd;

        public Integer getIsadultSt(){
            return this.isadultSt;
        }

        public Integer getIsadultEd(){
            return this.isadultEd;
        }

        private List<String> nameList;


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){
            return this.fuzzyName;
        }

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){
            return this.rightFuzzyName;
        }
        private List<String> idCardList;


        private List<String> fuzzyIdCard;

        public List<String> getFuzzyIdCard(){
            return this.fuzzyIdCard;
        }

        private List<String> rightFuzzyIdCard;

        public List<String> getRightFuzzyIdCard(){
            return this.rightFuzzyIdCard;
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



        public QueryBuilder isadultBetWeen(Integer isadultSt,Integer isadultEd){
            this.isadultSt = isadultSt;
            this.isadultEd = isadultEd;
            return this;
        }

        public QueryBuilder isadultGreaterEqThan(Integer isadultSt){
            this.isadultSt = isadultSt;
            return this;
        }
        public QueryBuilder isadultLessEqThan(Integer isadultEd){
            this.isadultEd = isadultEd;
            return this;
        }


        public QueryBuilder isadult(Integer isadult){
            setIsadult(isadult);
            return this;
        }

        public QueryBuilder isadultList(Integer ... isadult){
            if (isadult != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : isadult){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.isadultList = list;
            }

            return this;
        }

        public QueryBuilder isadultList(List<Integer> isadult){
            this.isadultList = isadult;
            return this;
        }

        public QueryBuilder fetchIsadult(){
            setFetchFields("fetchFields","isadult");
            return this;
        }

        public QueryBuilder excludeIsadult(){
            setFetchFields("excludeFields","isadult");
            return this;
        }



        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            if (fuzzyName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            if (rightFuzzyName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyName = list;
            }
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            if (name != null){
                List<String> list = new ArrayList<>();
                for (String item : name){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.nameList = list;
            }

            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }



        public QueryBuilder fuzzyIdCard (List<String> fuzzyIdCard){
            this.fuzzyIdCard = fuzzyIdCard;
            return this;
        }

        public QueryBuilder fuzzyIdCard (String ... fuzzyIdCard){
            if (fuzzyIdCard != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyIdCard){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyIdCard = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyIdCard (List<String> rightFuzzyIdCard){
            this.rightFuzzyIdCard = rightFuzzyIdCard;
            return this;
        }

        public QueryBuilder rightFuzzyIdCard (String ... rightFuzzyIdCard){
            if (rightFuzzyIdCard != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyIdCard){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyIdCard = list;
            }
            return this;
        }

        public QueryBuilder idCard(String idCard){
            setIdCard(idCard);
            return this;
        }

        public QueryBuilder idCardList(String ... idCard){
            if (idCard != null){
                List<String> list = new ArrayList<>();
                for (String item : idCard){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.idCardList = list;
            }

            return this;
        }

        public QueryBuilder idCardList(List<String> idCard){
            this.idCardList = idCard;
            return this;
        }

        public QueryBuilder fetchIdCard(){
            setFetchFields("fetchFields","idCard");
            return this;
        }

        public QueryBuilder excludeIdCard(){
            setFetchFields("excludeFields","idCard");
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

        public OrderVisitors build(){
            return this;
        }
    }

}
