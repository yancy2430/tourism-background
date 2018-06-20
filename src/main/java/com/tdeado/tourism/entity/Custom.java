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
public class Custom implements Serializable {

    private static final long serialVersionUID = 1528705460821L;


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
    * 出发地点
    * isNullAble:0,defaultVal:
    */
    private String origin;

    /**
    * 出发时间
    * isNullAble:0
    */
    private java.time.LocalDateTime departureTime;

    /**
    * 天数
    * isNullAble:0
    */
    private Integer days;

    /**
    * 游玩城市
    * isNullAble:0,defaultVal:
    */
    private String visitCity;

    /**
    * 成人
    * isNullAble:0
    */
    private Integer adultNum;

    /**
    * 儿童
    * isNullAble:0,defaultVal:0
    */
    private Integer childrenNum;

    /**
    * 人均预算
    * isNullAble:1
    */
    private java.math.BigDecimal budget;

    /**
    * 联系人
    * isNullAble:0,defaultVal:
    */
    private String contact;

    /**
    * 手机号码
    * isNullAble:0,defaultVal:
    */
    private String mobile;

    /**
    * 特殊备注
    * isNullAble:1
    */
    private String remark;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime addtime;

    /**
    * 是否删除
    * isNullAble:1
    */
    private Integer isdel;


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

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public String getOrigin(){
        return this.origin;
    }

    public void setDepartureTime(java.time.LocalDateTime departureTime){
        this.departureTime = departureTime;
    }

    public java.time.LocalDateTime getDepartureTime(){
        return this.departureTime;
    }

    public void setDays(Integer days){
        this.days = days;
    }

    public Integer getDays(){
        return this.days;
    }

    public void setVisitCity(String visitCity){
        this.visitCity = visitCity;
    }

    public String getVisitCity(){
        return this.visitCity;
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

    public void setBudget(java.math.BigDecimal budget){
        this.budget = budget;
    }

    public java.math.BigDecimal getBudget(){
        return this.budget;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public String getContact(){
        return this.contact;
    }

    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    public String getMobile(){
        return this.mobile;
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

    public void setIsdel(Integer isdel){
        this.isdel = isdel;
    }

    public Integer getIsdel(){
        return this.isdel;
    }
    @Override
    public String toString() {
        return "Custom{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                "origin='" + origin + '\'' +
                "departureTime='" + departureTime + '\'' +
                "days='" + days + '\'' +
                "visitCity='" + visitCity + '\'' +
                "adultNum='" + adultNum + '\'' +
                "childrenNum='" + childrenNum + '\'' +
                "budget='" + budget + '\'' +
                "contact='" + contact + '\'' +
                "mobile='" + mobile + '\'' +
                "remark='" + remark + '\'' +
                "addtime='" + addtime + '\'' +
                "isdel='" + isdel + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Custom{
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

        private List<String> originList;


        private List<String> fuzzyOrigin;

        public List<String> getFuzzyOrigin(){
            return this.fuzzyOrigin;
        }

        private List<String> rightFuzzyOrigin;

        public List<String> getRightFuzzyOrigin(){
            return this.rightFuzzyOrigin;
        }
        private List<java.time.LocalDateTime> departureTimeList;

        private java.time.LocalDateTime departureTimeSt;

        private java.time.LocalDateTime departureTimeEd;

        public java.time.LocalDateTime getDepartureTimeSt(){
            return this.departureTimeSt;
        }

        public java.time.LocalDateTime getDepartureTimeEd(){
            return this.departureTimeEd;
        }

        private List<Integer> daysList;

        private Integer daysSt;

        private Integer daysEd;

        public Integer getDaysSt(){
            return this.daysSt;
        }

        public Integer getDaysEd(){
            return this.daysEd;
        }

        private List<String> visitCityList;


        private List<String> fuzzyVisitCity;

        public List<String> getFuzzyVisitCity(){
            return this.fuzzyVisitCity;
        }

        private List<String> rightFuzzyVisitCity;

        public List<String> getRightFuzzyVisitCity(){
            return this.rightFuzzyVisitCity;
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

        private List<java.math.BigDecimal> budgetList;

        private java.math.BigDecimal budgetSt;

        private java.math.BigDecimal budgetEd;

        public java.math.BigDecimal getBudgetSt(){
            return this.budgetSt;
        }

        public java.math.BigDecimal getBudgetEd(){
            return this.budgetEd;
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
        private List<String> mobileList;


        private List<String> fuzzyMobile;

        public List<String> getFuzzyMobile(){
            return this.fuzzyMobile;
        }

        private List<String> rightFuzzyMobile;

        public List<String> getRightFuzzyMobile(){
            return this.rightFuzzyMobile;
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

        private List<Integer> isdelList;

        private Integer isdelSt;

        private Integer isdelEd;

        public Integer getIsdelSt(){
            return this.isdelSt;
        }

        public Integer getIsdelEd(){
            return this.isdelEd;
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



        public QueryBuilder fuzzyOrigin (List<String> fuzzyOrigin){
            this.fuzzyOrigin = fuzzyOrigin;
            return this;
        }

        public QueryBuilder fuzzyOrigin (String ... fuzzyOrigin){
            if (fuzzyOrigin != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyOrigin){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyOrigin = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyOrigin (List<String> rightFuzzyOrigin){
            this.rightFuzzyOrigin = rightFuzzyOrigin;
            return this;
        }

        public QueryBuilder rightFuzzyOrigin (String ... rightFuzzyOrigin){
            if (rightFuzzyOrigin != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyOrigin){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyOrigin = list;
            }
            return this;
        }

        public QueryBuilder origin(String origin){
            setOrigin(origin);
            return this;
        }

        public QueryBuilder originList(String ... origin){
            if (origin != null){
                List<String> list = new ArrayList<>();
                for (String item : origin){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.originList = list;
            }

            return this;
        }

        public QueryBuilder originList(List<String> origin){
            this.originList = origin;
            return this;
        }

        public QueryBuilder fetchOrigin(){
            setFetchFields("fetchFields","origin");
            return this;
        }

        public QueryBuilder excludeOrigin(){
            setFetchFields("excludeFields","origin");
            return this;
        }



        public QueryBuilder departureTimeBetWeen(java.time.LocalDateTime departureTimeSt,java.time.LocalDateTime departureTimeEd){
            this.departureTimeSt = departureTimeSt;
            this.departureTimeEd = departureTimeEd;
            return this;
        }

        public QueryBuilder departureTimeGreaterEqThan(java.time.LocalDateTime departureTimeSt){
            this.departureTimeSt = departureTimeSt;
            return this;
        }
        public QueryBuilder departureTimeLessEqThan(java.time.LocalDateTime departureTimeEd){
            this.departureTimeEd = departureTimeEd;
            return this;
        }


        public QueryBuilder departureTime(java.time.LocalDateTime departureTime){
            setDepartureTime(departureTime);
            return this;
        }

        public QueryBuilder departureTimeList(java.time.LocalDateTime ... departureTime){
            if (departureTime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : departureTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.departureTimeList = list;
            }

            return this;
        }

        public QueryBuilder departureTimeList(List<java.time.LocalDateTime> departureTime){
            this.departureTimeList = departureTime;
            return this;
        }

        public QueryBuilder fetchDepartureTime(){
            setFetchFields("fetchFields","departureTime");
            return this;
        }

        public QueryBuilder excludeDepartureTime(){
            setFetchFields("excludeFields","departureTime");
            return this;
        }



        public QueryBuilder daysBetWeen(Integer daysSt,Integer daysEd){
            this.daysSt = daysSt;
            this.daysEd = daysEd;
            return this;
        }

        public QueryBuilder daysGreaterEqThan(Integer daysSt){
            this.daysSt = daysSt;
            return this;
        }
        public QueryBuilder daysLessEqThan(Integer daysEd){
            this.daysEd = daysEd;
            return this;
        }


        public QueryBuilder days(Integer days){
            setDays(days);
            return this;
        }

        public QueryBuilder daysList(Integer ... days){
            if (days != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : days){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.daysList = list;
            }

            return this;
        }

        public QueryBuilder daysList(List<Integer> days){
            this.daysList = days;
            return this;
        }

        public QueryBuilder fetchDays(){
            setFetchFields("fetchFields","days");
            return this;
        }

        public QueryBuilder excludeDays(){
            setFetchFields("excludeFields","days");
            return this;
        }



        public QueryBuilder fuzzyVisitCity (List<String> fuzzyVisitCity){
            this.fuzzyVisitCity = fuzzyVisitCity;
            return this;
        }

        public QueryBuilder fuzzyVisitCity (String ... fuzzyVisitCity){
            if (fuzzyVisitCity != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyVisitCity){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyVisitCity = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyVisitCity (List<String> rightFuzzyVisitCity){
            this.rightFuzzyVisitCity = rightFuzzyVisitCity;
            return this;
        }

        public QueryBuilder rightFuzzyVisitCity (String ... rightFuzzyVisitCity){
            if (rightFuzzyVisitCity != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyVisitCity){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyVisitCity = list;
            }
            return this;
        }

        public QueryBuilder visitCity(String visitCity){
            setVisitCity(visitCity);
            return this;
        }

        public QueryBuilder visitCityList(String ... visitCity){
            if (visitCity != null){
                List<String> list = new ArrayList<>();
                for (String item : visitCity){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.visitCityList = list;
            }

            return this;
        }

        public QueryBuilder visitCityList(List<String> visitCity){
            this.visitCityList = visitCity;
            return this;
        }

        public QueryBuilder fetchVisitCity(){
            setFetchFields("fetchFields","visitCity");
            return this;
        }

        public QueryBuilder excludeVisitCity(){
            setFetchFields("excludeFields","visitCity");
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



        public QueryBuilder budgetBetWeen(java.math.BigDecimal budgetSt,java.math.BigDecimal budgetEd){
            this.budgetSt = budgetSt;
            this.budgetEd = budgetEd;
            return this;
        }

        public QueryBuilder budgetGreaterEqThan(java.math.BigDecimal budgetSt){
            this.budgetSt = budgetSt;
            return this;
        }
        public QueryBuilder budgetLessEqThan(java.math.BigDecimal budgetEd){
            this.budgetEd = budgetEd;
            return this;
        }


        public QueryBuilder budget(java.math.BigDecimal budget){
            setBudget(budget);
            return this;
        }

        public QueryBuilder budgetList(java.math.BigDecimal ... budget){
            if (budget != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : budget){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.budgetList = list;
            }

            return this;
        }

        public QueryBuilder budgetList(List<java.math.BigDecimal> budget){
            this.budgetList = budget;
            return this;
        }

        public QueryBuilder fetchBudget(){
            setFetchFields("fetchFields","budget");
            return this;
        }

        public QueryBuilder excludeBudget(){
            setFetchFields("excludeFields","budget");
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



        public QueryBuilder fuzzyMobile (List<String> fuzzyMobile){
            this.fuzzyMobile = fuzzyMobile;
            return this;
        }

        public QueryBuilder fuzzyMobile (String ... fuzzyMobile){
            if (fuzzyMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyMobile = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyMobile (List<String> rightFuzzyMobile){
            this.rightFuzzyMobile = rightFuzzyMobile;
            return this;
        }

        public QueryBuilder rightFuzzyMobile (String ... rightFuzzyMobile){
            if (rightFuzzyMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyMobile = list;
            }
            return this;
        }

        public QueryBuilder mobile(String mobile){
            setMobile(mobile);
            return this;
        }

        public QueryBuilder mobileList(String ... mobile){
            if (mobile != null){
                List<String> list = new ArrayList<>();
                for (String item : mobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.mobileList = list;
            }

            return this;
        }

        public QueryBuilder mobileList(List<String> mobile){
            this.mobileList = mobile;
            return this;
        }

        public QueryBuilder fetchMobile(){
            setFetchFields("fetchFields","mobile");
            return this;
        }

        public QueryBuilder excludeMobile(){
            setFetchFields("excludeFields","mobile");
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



        public QueryBuilder isdelBetWeen(Integer isdelSt,Integer isdelEd){
            this.isdelSt = isdelSt;
            this.isdelEd = isdelEd;
            return this;
        }

        public QueryBuilder isdelGreaterEqThan(Integer isdelSt){
            this.isdelSt = isdelSt;
            return this;
        }
        public QueryBuilder isdelLessEqThan(Integer isdelEd){
            this.isdelEd = isdelEd;
            return this;
        }


        public QueryBuilder isdel(Integer isdel){
            setIsdel(isdel);
            return this;
        }

        public QueryBuilder isdelList(Integer ... isdel){
            if (isdel != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : isdel){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.isdelList = list;
            }

            return this;
        }

        public QueryBuilder isdelList(List<Integer> isdel){
            this.isdelList = isdel;
            return this;
        }

        public QueryBuilder fetchIsdel(){
            setFetchFields("fetchFields","isdel");
            return this;
        }

        public QueryBuilder excludeIsdel(){
            setFetchFields("excludeFields","isdel");
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

        public Custom build(){
            return this;
        }
    }

}
