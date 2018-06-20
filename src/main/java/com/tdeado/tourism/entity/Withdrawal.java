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
public class Withdrawal implements Serializable {

    private static final long serialVersionUID = 1528810080025L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 用户ID
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 用户名
    * isNullAble:0
    */
    private String userName;

    /**
    * 提现成功
    * isNullAble:0
    */
    private Integer succeed;

    /**
    * 提现金额
    * isNullAble:0
    */
    private java.math.BigDecimal amount;

    /**
    * 提现前金额
    * isNullAble:0
    */
    private java.math.BigDecimal before;

    /**
    * 提现后余额
    * isNullAble:0
    */
    private java.math.BigDecimal after;

    /**
    * 操作人ID
    * isNullAble:0
    */
    private Integer operatorId;

    /**
    * 1支付宝2微信3银行卡
    * isNullAble:0,defaultVal:1
    */
    private Integer collectionType;

    /**
    * 收款信息
    * isNullAble:0,defaultVal:
    */
    private String collection;

    /**
    * 操作人名称
    * isNullAble:0,defaultVal:
    */
    private String operatorName;

    /**
    * 提现时间
    * isNullAble:0
    */
    private java.time.LocalDateTime addtime;

    /**
    * 操作时间
    * isNullAble:0
    */
    private java.time.LocalDateTime operatorTime;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setSucceed(Integer succeed){
        this.succeed = succeed;
    }

    public Integer getSucceed(){
        return this.succeed;
    }

    public void setAmount(java.math.BigDecimal amount){
        this.amount = amount;
    }

    public java.math.BigDecimal getAmount(){
        return this.amount;
    }

    public void setBefore(java.math.BigDecimal before){
        this.before = before;
    }

    public java.math.BigDecimal getBefore(){
        return this.before;
    }

    public void setAfter(java.math.BigDecimal after){
        this.after = after;
    }

    public java.math.BigDecimal getAfter(){
        return this.after;
    }

    public void setOperatorId(Integer operatorId){
        this.operatorId = operatorId;
    }

    public Integer getOperatorId(){
        return this.operatorId;
    }

    public void setCollectionType(Integer collectionType){
        this.collectionType = collectionType;
    }

    public Integer getCollectionType(){
        return this.collectionType;
    }

    public void setCollection(String collection){
        this.collection = collection;
    }

    public String getCollection(){
        return this.collection;
    }

    public void setOperatorName(String operatorName){
        this.operatorName = operatorName;
    }

    public String getOperatorName(){
        return this.operatorName;
    }

    public void setAddtime(java.time.LocalDateTime addtime){
        this.addtime = addtime;
    }

    public java.time.LocalDateTime getAddtime(){
        return this.addtime;
    }

    public void setOperatorTime(java.time.LocalDateTime operatorTime){
        this.operatorTime = operatorTime;
    }

    public java.time.LocalDateTime getOperatorTime(){
        return this.operatorTime;
    }
    @Override
    public String toString() {
        return "Withdrawal{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                "userName='" + userName + '\'' +
                "succeed='" + succeed + '\'' +
                "amount='" + amount + '\'' +
                "before='" + before + '\'' +
                "after='" + after + '\'' +
                "operatorId='" + operatorId + '\'' +
                "collectionType='" + collectionType + '\'' +
                "collection='" + collection + '\'' +
                "operatorName='" + operatorName + '\'' +
                "addtime='" + addtime + '\'' +
                "operatorTime='" + operatorTime + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Withdrawal{
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

        private List<Integer> userIdList;

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){
            return this.userIdSt;
        }

        public Integer getUserIdEd(){
            return this.userIdEd;
        }

        private List<String> userNameList;


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){
            return this.fuzzyUserName;
        }

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){
            return this.rightFuzzyUserName;
        }
        private List<Integer> succeedList;

        private Integer succeedSt;

        private Integer succeedEd;

        public Integer getSucceedSt(){
            return this.succeedSt;
        }

        public Integer getSucceedEd(){
            return this.succeedEd;
        }

        private List<java.math.BigDecimal> amountList;

        private java.math.BigDecimal amountSt;

        private java.math.BigDecimal amountEd;

        public java.math.BigDecimal getAmountSt(){
            return this.amountSt;
        }

        public java.math.BigDecimal getAmountEd(){
            return this.amountEd;
        }

        private List<java.math.BigDecimal> beforeList;

        private java.math.BigDecimal beforeSt;

        private java.math.BigDecimal beforeEd;

        public java.math.BigDecimal getBeforeSt(){
            return this.beforeSt;
        }

        public java.math.BigDecimal getBeforeEd(){
            return this.beforeEd;
        }

        private List<java.math.BigDecimal> afterList;

        private java.math.BigDecimal afterSt;

        private java.math.BigDecimal afterEd;

        public java.math.BigDecimal getAfterSt(){
            return this.afterSt;
        }

        public java.math.BigDecimal getAfterEd(){
            return this.afterEd;
        }

        private List<Integer> operatorIdList;

        private Integer operatorIdSt;

        private Integer operatorIdEd;

        public Integer getOperatorIdSt(){
            return this.operatorIdSt;
        }

        public Integer getOperatorIdEd(){
            return this.operatorIdEd;
        }

        private List<Integer> collectionTypeList;

        private Integer collectionTypeSt;

        private Integer collectionTypeEd;

        public Integer getCollectionTypeSt(){
            return this.collectionTypeSt;
        }

        public Integer getCollectionTypeEd(){
            return this.collectionTypeEd;
        }

        private List<String> collectionList;


        private List<String> fuzzyCollection;

        public List<String> getFuzzyCollection(){
            return this.fuzzyCollection;
        }

        private List<String> rightFuzzyCollection;

        public List<String> getRightFuzzyCollection(){
            return this.rightFuzzyCollection;
        }
        private List<String> operatorNameList;


        private List<String> fuzzyOperatorName;

        public List<String> getFuzzyOperatorName(){
            return this.fuzzyOperatorName;
        }

        private List<String> rightFuzzyOperatorName;

        public List<String> getRightFuzzyOperatorName(){
            return this.rightFuzzyOperatorName;
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

        private List<java.time.LocalDateTime> operatorTimeList;

        private java.time.LocalDateTime operatorTimeSt;

        private java.time.LocalDateTime operatorTimeEd;

        public java.time.LocalDateTime getOperatorTimeSt(){
            return this.operatorTimeSt;
        }

        public java.time.LocalDateTime getOperatorTimeEd(){
            return this.operatorTimeEd;
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



        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            if (fuzzyUserName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUserName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUserName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            if (rightFuzzyUserName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUserName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUserName = list;
            }
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            if (userName != null){
                List<String> list = new ArrayList<>();
                for (String item : userName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userNameList = list;
            }

            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }



        public QueryBuilder succeedBetWeen(Integer succeedSt,Integer succeedEd){
            this.succeedSt = succeedSt;
            this.succeedEd = succeedEd;
            return this;
        }

        public QueryBuilder succeedGreaterEqThan(Integer succeedSt){
            this.succeedSt = succeedSt;
            return this;
        }
        public QueryBuilder succeedLessEqThan(Integer succeedEd){
            this.succeedEd = succeedEd;
            return this;
        }


        public QueryBuilder succeed(Integer succeed){
            setSucceed(succeed);
            return this;
        }

        public QueryBuilder succeedList(Integer ... succeed){
            if (succeed != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : succeed){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.succeedList = list;
            }

            return this;
        }

        public QueryBuilder succeedList(List<Integer> succeed){
            this.succeedList = succeed;
            return this;
        }

        public QueryBuilder fetchSucceed(){
            setFetchFields("fetchFields","succeed");
            return this;
        }

        public QueryBuilder excludeSucceed(){
            setFetchFields("excludeFields","succeed");
            return this;
        }



        public QueryBuilder amountBetWeen(java.math.BigDecimal amountSt,java.math.BigDecimal amountEd){
            this.amountSt = amountSt;
            this.amountEd = amountEd;
            return this;
        }

        public QueryBuilder amountGreaterEqThan(java.math.BigDecimal amountSt){
            this.amountSt = amountSt;
            return this;
        }
        public QueryBuilder amountLessEqThan(java.math.BigDecimal amountEd){
            this.amountEd = amountEd;
            return this;
        }


        public QueryBuilder amount(java.math.BigDecimal amount){
            setAmount(amount);
            return this;
        }

        public QueryBuilder amountList(java.math.BigDecimal ... amount){
            if (amount != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : amount){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.amountList = list;
            }

            return this;
        }

        public QueryBuilder amountList(List<java.math.BigDecimal> amount){
            this.amountList = amount;
            return this;
        }

        public QueryBuilder fetchAmount(){
            setFetchFields("fetchFields","amount");
            return this;
        }

        public QueryBuilder excludeAmount(){
            setFetchFields("excludeFields","amount");
            return this;
        }



        public QueryBuilder beforeBetWeen(java.math.BigDecimal beforeSt,java.math.BigDecimal beforeEd){
            this.beforeSt = beforeSt;
            this.beforeEd = beforeEd;
            return this;
        }

        public QueryBuilder beforeGreaterEqThan(java.math.BigDecimal beforeSt){
            this.beforeSt = beforeSt;
            return this;
        }
        public QueryBuilder beforeLessEqThan(java.math.BigDecimal beforeEd){
            this.beforeEd = beforeEd;
            return this;
        }


        public QueryBuilder before(java.math.BigDecimal before){
            setBefore(before);
            return this;
        }

        public QueryBuilder beforeList(java.math.BigDecimal ... before){
            if (before != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : before){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.beforeList = list;
            }

            return this;
        }

        public QueryBuilder beforeList(List<java.math.BigDecimal> before){
            this.beforeList = before;
            return this;
        }

        public QueryBuilder fetchBefore(){
            setFetchFields("fetchFields","before");
            return this;
        }

        public QueryBuilder excludeBefore(){
            setFetchFields("excludeFields","before");
            return this;
        }



        public QueryBuilder afterBetWeen(java.math.BigDecimal afterSt,java.math.BigDecimal afterEd){
            this.afterSt = afterSt;
            this.afterEd = afterEd;
            return this;
        }

        public QueryBuilder afterGreaterEqThan(java.math.BigDecimal afterSt){
            this.afterSt = afterSt;
            return this;
        }
        public QueryBuilder afterLessEqThan(java.math.BigDecimal afterEd){
            this.afterEd = afterEd;
            return this;
        }


        public QueryBuilder after(java.math.BigDecimal after){
            setAfter(after);
            return this;
        }

        public QueryBuilder afterList(java.math.BigDecimal ... after){
            if (after != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : after){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.afterList = list;
            }

            return this;
        }

        public QueryBuilder afterList(List<java.math.BigDecimal> after){
            this.afterList = after;
            return this;
        }

        public QueryBuilder fetchAfter(){
            setFetchFields("fetchFields","after");
            return this;
        }

        public QueryBuilder excludeAfter(){
            setFetchFields("excludeFields","after");
            return this;
        }



        public QueryBuilder operatorIdBetWeen(Integer operatorIdSt,Integer operatorIdEd){
            this.operatorIdSt = operatorIdSt;
            this.operatorIdEd = operatorIdEd;
            return this;
        }

        public QueryBuilder operatorIdGreaterEqThan(Integer operatorIdSt){
            this.operatorIdSt = operatorIdSt;
            return this;
        }
        public QueryBuilder operatorIdLessEqThan(Integer operatorIdEd){
            this.operatorIdEd = operatorIdEd;
            return this;
        }


        public QueryBuilder operatorId(Integer operatorId){
            setOperatorId(operatorId);
            return this;
        }

        public QueryBuilder operatorIdList(Integer ... operatorId){
            if (operatorId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : operatorId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.operatorIdList = list;
            }

            return this;
        }

        public QueryBuilder operatorIdList(List<Integer> operatorId){
            this.operatorIdList = operatorId;
            return this;
        }

        public QueryBuilder fetchOperatorId(){
            setFetchFields("fetchFields","operatorId");
            return this;
        }

        public QueryBuilder excludeOperatorId(){
            setFetchFields("excludeFields","operatorId");
            return this;
        }



        public QueryBuilder collectionTypeBetWeen(Integer collectionTypeSt,Integer collectionTypeEd){
            this.collectionTypeSt = collectionTypeSt;
            this.collectionTypeEd = collectionTypeEd;
            return this;
        }

        public QueryBuilder collectionTypeGreaterEqThan(Integer collectionTypeSt){
            this.collectionTypeSt = collectionTypeSt;
            return this;
        }
        public QueryBuilder collectionTypeLessEqThan(Integer collectionTypeEd){
            this.collectionTypeEd = collectionTypeEd;
            return this;
        }


        public QueryBuilder collectionType(Integer collectionType){
            setCollectionType(collectionType);
            return this;
        }

        public QueryBuilder collectionTypeList(Integer ... collectionType){
            if (collectionType != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : collectionType){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.collectionTypeList = list;
            }

            return this;
        }

        public QueryBuilder collectionTypeList(List<Integer> collectionType){
            this.collectionTypeList = collectionType;
            return this;
        }

        public QueryBuilder fetchCollectionType(){
            setFetchFields("fetchFields","collectionType");
            return this;
        }

        public QueryBuilder excludeCollectionType(){
            setFetchFields("excludeFields","collectionType");
            return this;
        }



        public QueryBuilder fuzzyCollection (List<String> fuzzyCollection){
            this.fuzzyCollection = fuzzyCollection;
            return this;
        }

        public QueryBuilder fuzzyCollection (String ... fuzzyCollection){
            if (fuzzyCollection != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCollection){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCollection = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCollection (List<String> rightFuzzyCollection){
            this.rightFuzzyCollection = rightFuzzyCollection;
            return this;
        }

        public QueryBuilder rightFuzzyCollection (String ... rightFuzzyCollection){
            if (rightFuzzyCollection != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCollection){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCollection = list;
            }
            return this;
        }

        public QueryBuilder collection(String collection){
            setCollection(collection);
            return this;
        }

        public QueryBuilder collectionList(String ... collection){
            if (collection != null){
                List<String> list = new ArrayList<>();
                for (String item : collection){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.collectionList = list;
            }

            return this;
        }

        public QueryBuilder collectionList(List<String> collection){
            this.collectionList = collection;
            return this;
        }

        public QueryBuilder fetchCollection(){
            setFetchFields("fetchFields","collection");
            return this;
        }

        public QueryBuilder excludeCollection(){
            setFetchFields("excludeFields","collection");
            return this;
        }



        public QueryBuilder fuzzyOperatorName (List<String> fuzzyOperatorName){
            this.fuzzyOperatorName = fuzzyOperatorName;
            return this;
        }

        public QueryBuilder fuzzyOperatorName (String ... fuzzyOperatorName){
            if (fuzzyOperatorName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyOperatorName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyOperatorName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyOperatorName (List<String> rightFuzzyOperatorName){
            this.rightFuzzyOperatorName = rightFuzzyOperatorName;
            return this;
        }

        public QueryBuilder rightFuzzyOperatorName (String ... rightFuzzyOperatorName){
            if (rightFuzzyOperatorName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyOperatorName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyOperatorName = list;
            }
            return this;
        }

        public QueryBuilder operatorName(String operatorName){
            setOperatorName(operatorName);
            return this;
        }

        public QueryBuilder operatorNameList(String ... operatorName){
            if (operatorName != null){
                List<String> list = new ArrayList<>();
                for (String item : operatorName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.operatorNameList = list;
            }

            return this;
        }

        public QueryBuilder operatorNameList(List<String> operatorName){
            this.operatorNameList = operatorName;
            return this;
        }

        public QueryBuilder fetchOperatorName(){
            setFetchFields("fetchFields","operatorName");
            return this;
        }

        public QueryBuilder excludeOperatorName(){
            setFetchFields("excludeFields","operatorName");
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



        public QueryBuilder operatorTimeBetWeen(java.time.LocalDateTime operatorTimeSt,java.time.LocalDateTime operatorTimeEd){
            this.operatorTimeSt = operatorTimeSt;
            this.operatorTimeEd = operatorTimeEd;
            return this;
        }

        public QueryBuilder operatorTimeGreaterEqThan(java.time.LocalDateTime operatorTimeSt){
            this.operatorTimeSt = operatorTimeSt;
            return this;
        }
        public QueryBuilder operatorTimeLessEqThan(java.time.LocalDateTime operatorTimeEd){
            this.operatorTimeEd = operatorTimeEd;
            return this;
        }


        public QueryBuilder operatorTime(java.time.LocalDateTime operatorTime){
            setOperatorTime(operatorTime);
            return this;
        }

        public QueryBuilder operatorTimeList(java.time.LocalDateTime ... operatorTime){
            if (operatorTime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : operatorTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.operatorTimeList = list;
            }

            return this;
        }

        public QueryBuilder operatorTimeList(List<java.time.LocalDateTime> operatorTime){
            this.operatorTimeList = operatorTime;
            return this;
        }

        public QueryBuilder fetchOperatorTime(){
            setFetchFields("fetchFields","operatorTime");
            return this;
        }

        public QueryBuilder excludeOperatorTime(){
            setFetchFields("excludeFields","operatorTime");
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

        public Withdrawal build(){
            return this;
        }
    }

}
