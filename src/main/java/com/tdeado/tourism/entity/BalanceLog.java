package com.tdeado.tourism.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author 
*/
public class BalanceLog implements Serializable {

    private static final long serialVersionUID = 1525343284871L;


    /**
    * 主键
    * 记录ID
    * isNullAble:0
    */
    private Integer id;

    /**
    * 0提现、1分润
    * isNullAble:1
    */
    private Integer type;

    /**
    * 金额
    * isNullAble:1
    */
    private java.math.BigDecimal price;

    /**
    * 操作备注
    * isNullAble:1
    */
    private String remark;

    /**
    * 操作时间
    * isNullAble:1
    */
    private java.time.LocalDateTime addtime;

    /**
    * 
    * isNullAble:1
    */
    private Integer userId;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setType(Integer type){
        this.type = type;
    }

    public Integer getType(){
        return this.type;
    }

    public void setPrice(java.math.BigDecimal price){
        this.price = price;
    }

    public java.math.BigDecimal getPrice(){
        return this.price;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }

    public String getRemark(){
        return this.remark;
    }

    public void setAddtime(java.time.LocalDateTime addtime){
        this.addtime = addtime;
    }

    public java.time.LocalDateTime getAddtime(){
        return this.addtime;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return this.userId;
    }
    @Override
    public String toString() {
        return "BalanceLog{" +
                "id='" + id + '\'' +
                "type='" + type + '\'' +
                "price='" + price + '\'' +
                "remark='" + remark + '\'' +
                "addtime='" + addtime + '\'' +
                "userId='" + userId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends BalanceLog{
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

        private List<Integer> typeList;

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){
            return this.typeSt;
        }

        public Integer getTypeEd(){
            return this.typeEd;
        }

        private List<java.math.BigDecimal> priceList;

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){
            return this.priceSt;
        }

        public java.math.BigDecimal getPriceEd(){
            return this.priceEd;
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
        private List<java.time.LocalDateTime> addtimeList;

        private java.time.LocalDateTime addtimeSt;

        private java.time.LocalDateTime addtimeEd;

        public java.time.LocalDateTime getAddtimeSt(){
            return this.addtimeSt;
        }

        public java.time.LocalDateTime getAddtimeEd(){
            return this.addtimeEd;
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



        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            if (type != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : type){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.typeList = list;
            }

            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }



        public QueryBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(java.math.BigDecimal price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(java.math.BigDecimal ... price){
            if (price != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : price){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.priceList = list;
            }

            return this;
        }

        public QueryBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public QueryBuilder fetchPrice(){
            setFetchFields("fetchFields","price");
            return this;
        }

        public QueryBuilder excludePrice(){
            setFetchFields("excludeFields","price");
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

        public BalanceLog build(){
            return this;
        }
    }

}
