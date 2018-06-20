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
public class ProductDate implements Serializable {

    private static final long serialVersionUID = 1526927689427L;


    /**
    * 产品ID
    * isNullAble:1
    */
    private Integer productId;

    /**
    * 成人价格
    * isNullAble:1
    */
    private java.math.BigDecimal adultPrice;

    /**
    * 儿童价格
    * isNullAble:1
    */
    private java.math.BigDecimal childrenPrice;

    /**
    * 差房价格
    * isNullAble:0
    */
    private java.math.BigDecimal housingPrice;

    /**
    * 开团日期
    * isNullAble:0
    */
    private String teamtime;

    /**
    * 是否启用
    * isNullAble:0,defaultVal:0
    */
    private Integer isshow;

    /**
    * 套餐名称
    * isNullAble:1
    */
    private String packageName;

    /**
    * 套餐编号
    * isNullAble:0,defaultVal:
    */
    private String packageNo;


    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
    }

    public void setAdultPrice(java.math.BigDecimal adultPrice){
        this.adultPrice = adultPrice;
    }

    public java.math.BigDecimal getAdultPrice(){
        return this.adultPrice;
    }

    public void setChildrenPrice(java.math.BigDecimal childrenPrice){
        this.childrenPrice = childrenPrice;
    }

    public java.math.BigDecimal getChildrenPrice(){
        return this.childrenPrice;
    }

    public void setHousingPrice(java.math.BigDecimal housingPrice){
        this.housingPrice = housingPrice;
    }

    public java.math.BigDecimal getHousingPrice(){
        return this.housingPrice;
    }

    public void setTeamtime(String teamtime){
        this.teamtime = teamtime;
    }

    public String getTeamtime(){
        return this.teamtime;
    }

    public void setIsshow(Integer isshow){
        this.isshow = isshow;
    }

    public Integer getIsshow(){
        return this.isshow;
    }

    public void setPackageName(String packageName){
        this.packageName = packageName;
    }

    public String getPackageName(){
        return this.packageName;
    }

    public void setPackageNo(String packageNo){
        this.packageNo = packageNo;
    }

    public String getPackageNo(){
        return this.packageNo;
    }
    @Override
    public String toString() {
        return "ProductDate{" +
                "productId='" + productId + '\'' +
                "adultPrice='" + adultPrice + '\'' +
                "childrenPrice='" + childrenPrice + '\'' +
                "housingPrice='" + housingPrice + '\'' +
                "teamtime='" + teamtime + '\'' +
                "isshow='" + isshow + '\'' +
                "packageName='" + packageName + '\'' +
                "packageNo='" + packageNo + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends ProductDate{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
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

        private List<java.math.BigDecimal> adultPriceList;

        private java.math.BigDecimal adultPriceSt;

        private java.math.BigDecimal adultPriceEd;

        public java.math.BigDecimal getAdultPriceSt(){
            return this.adultPriceSt;
        }

        public java.math.BigDecimal getAdultPriceEd(){
            return this.adultPriceEd;
        }

        private List<java.math.BigDecimal> childrenPriceList;

        private java.math.BigDecimal childrenPriceSt;

        private java.math.BigDecimal childrenPriceEd;

        public java.math.BigDecimal getChildrenPriceSt(){
            return this.childrenPriceSt;
        }

        public java.math.BigDecimal getChildrenPriceEd(){
            return this.childrenPriceEd;
        }

        private List<java.math.BigDecimal> housingPriceList;

        private java.math.BigDecimal housingPriceSt;

        private java.math.BigDecimal housingPriceEd;

        public java.math.BigDecimal getHousingPriceSt(){
            return this.housingPriceSt;
        }

        public java.math.BigDecimal getHousingPriceEd(){
            return this.housingPriceEd;
        }

        private List<String> teamtimeList;


        private List<String> fuzzyTeamtime;

        public List<String> getFuzzyTeamtime(){
            return this.fuzzyTeamtime;
        }

        private List<String> rightFuzzyTeamtime;

        public List<String> getRightFuzzyTeamtime(){
            return this.rightFuzzyTeamtime;
        }
        private List<Integer> isshowList;

        private Integer isshowSt;

        private Integer isshowEd;

        public Integer getIsshowSt(){
            return this.isshowSt;
        }

        public Integer getIsshowEd(){
            return this.isshowEd;
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
        private List<String> packageNoList;


        private List<String> fuzzyPackageNo;

        public List<String> getFuzzyPackageNo(){
            return this.fuzzyPackageNo;
        }

        private List<String> rightFuzzyPackageNo;

        public List<String> getRightFuzzyPackageNo(){
            return this.rightFuzzyPackageNo;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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



        public QueryBuilder adultPriceBetWeen(java.math.BigDecimal adultPriceSt,java.math.BigDecimal adultPriceEd){
            this.adultPriceSt = adultPriceSt;
            this.adultPriceEd = adultPriceEd;
            return this;
        }

        public QueryBuilder adultPriceGreaterEqThan(java.math.BigDecimal adultPriceSt){
            this.adultPriceSt = adultPriceSt;
            return this;
        }
        public QueryBuilder adultPriceLessEqThan(java.math.BigDecimal adultPriceEd){
            this.adultPriceEd = adultPriceEd;
            return this;
        }


        public QueryBuilder adultPrice(java.math.BigDecimal adultPrice){
            setAdultPrice(adultPrice);
            return this;
        }

        public QueryBuilder adultPriceList(java.math.BigDecimal ... adultPrice){
            if (adultPrice != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : adultPrice){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.adultPriceList = list;
            }

            return this;
        }

        public QueryBuilder adultPriceList(List<java.math.BigDecimal> adultPrice){
            this.adultPriceList = adultPrice;
            return this;
        }

        public QueryBuilder fetchAdultPrice(){
            setFetchFields("fetchFields","adultPrice");
            return this;
        }

        public QueryBuilder excludeAdultPrice(){
            setFetchFields("excludeFields","adultPrice");
            return this;
        }



        public QueryBuilder childrenPriceBetWeen(java.math.BigDecimal childrenPriceSt,java.math.BigDecimal childrenPriceEd){
            this.childrenPriceSt = childrenPriceSt;
            this.childrenPriceEd = childrenPriceEd;
            return this;
        }

        public QueryBuilder childrenPriceGreaterEqThan(java.math.BigDecimal childrenPriceSt){
            this.childrenPriceSt = childrenPriceSt;
            return this;
        }
        public QueryBuilder childrenPriceLessEqThan(java.math.BigDecimal childrenPriceEd){
            this.childrenPriceEd = childrenPriceEd;
            return this;
        }


        public QueryBuilder childrenPrice(java.math.BigDecimal childrenPrice){
            setChildrenPrice(childrenPrice);
            return this;
        }

        public QueryBuilder childrenPriceList(java.math.BigDecimal ... childrenPrice){
            if (childrenPrice != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : childrenPrice){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.childrenPriceList = list;
            }

            return this;
        }

        public QueryBuilder childrenPriceList(List<java.math.BigDecimal> childrenPrice){
            this.childrenPriceList = childrenPrice;
            return this;
        }

        public QueryBuilder fetchChildrenPrice(){
            setFetchFields("fetchFields","childrenPrice");
            return this;
        }

        public QueryBuilder excludeChildrenPrice(){
            setFetchFields("excludeFields","childrenPrice");
            return this;
        }



        public QueryBuilder housingPriceBetWeen(java.math.BigDecimal housingPriceSt,java.math.BigDecimal housingPriceEd){
            this.housingPriceSt = housingPriceSt;
            this.housingPriceEd = housingPriceEd;
            return this;
        }

        public QueryBuilder housingPriceGreaterEqThan(java.math.BigDecimal housingPriceSt){
            this.housingPriceSt = housingPriceSt;
            return this;
        }
        public QueryBuilder housingPriceLessEqThan(java.math.BigDecimal housingPriceEd){
            this.housingPriceEd = housingPriceEd;
            return this;
        }


        public QueryBuilder housingPrice(java.math.BigDecimal housingPrice){
            setHousingPrice(housingPrice);
            return this;
        }

        public QueryBuilder housingPriceList(java.math.BigDecimal ... housingPrice){
            if (housingPrice != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : housingPrice){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.housingPriceList = list;
            }

            return this;
        }

        public QueryBuilder housingPriceList(List<java.math.BigDecimal> housingPrice){
            this.housingPriceList = housingPrice;
            return this;
        }

        public QueryBuilder fetchHousingPrice(){
            setFetchFields("fetchFields","housingPrice");
            return this;
        }

        public QueryBuilder excludeHousingPrice(){
            setFetchFields("excludeFields","housingPrice");
            return this;
        }



        public QueryBuilder fuzzyTeamtime (List<String> fuzzyTeamtime){
            this.fuzzyTeamtime = fuzzyTeamtime;
            return this;
        }

        public QueryBuilder fuzzyTeamtime (String ... fuzzyTeamtime){
            if (fuzzyTeamtime != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyTeamtime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyTeamtime = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyTeamtime (List<String> rightFuzzyTeamtime){
            this.rightFuzzyTeamtime = rightFuzzyTeamtime;
            return this;
        }

        public QueryBuilder rightFuzzyTeamtime (String ... rightFuzzyTeamtime){
            if (rightFuzzyTeamtime != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyTeamtime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyTeamtime = list;
            }
            return this;
        }

        public QueryBuilder teamtime(String teamtime){
            setTeamtime(teamtime);
            return this;
        }

        public QueryBuilder teamtimeList(String ... teamtime){
            if (teamtime != null){
                List<String> list = new ArrayList<>();
                for (String item : teamtime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.teamtimeList = list;
            }

            return this;
        }

        public QueryBuilder teamtimeList(List<String> teamtime){
            this.teamtimeList = teamtime;
            return this;
        }

        public QueryBuilder fetchTeamtime(){
            setFetchFields("fetchFields","teamtime");
            return this;
        }

        public QueryBuilder excludeTeamtime(){
            setFetchFields("excludeFields","teamtime");
            return this;
        }



        public QueryBuilder isshowBetWeen(Integer isshowSt,Integer isshowEd){
            this.isshowSt = isshowSt;
            this.isshowEd = isshowEd;
            return this;
        }

        public QueryBuilder isshowGreaterEqThan(Integer isshowSt){
            this.isshowSt = isshowSt;
            return this;
        }
        public QueryBuilder isshowLessEqThan(Integer isshowEd){
            this.isshowEd = isshowEd;
            return this;
        }


        public QueryBuilder isshow(Integer isshow){
            setIsshow(isshow);
            return this;
        }

        public QueryBuilder isshowList(Integer ... isshow){
            if (isshow != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : isshow){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.isshowList = list;
            }

            return this;
        }

        public QueryBuilder isshowList(List<Integer> isshow){
            this.isshowList = isshow;
            return this;
        }

        public QueryBuilder fetchIsshow(){
            setFetchFields("fetchFields","isshow");
            return this;
        }

        public QueryBuilder excludeIsshow(){
            setFetchFields("excludeFields","isshow");
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



        public QueryBuilder fuzzyPackageNo (List<String> fuzzyPackageNo){
            this.fuzzyPackageNo = fuzzyPackageNo;
            return this;
        }

        public QueryBuilder fuzzyPackageNo (String ... fuzzyPackageNo){
            if (fuzzyPackageNo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPackageNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPackageNo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPackageNo (List<String> rightFuzzyPackageNo){
            this.rightFuzzyPackageNo = rightFuzzyPackageNo;
            return this;
        }

        public QueryBuilder rightFuzzyPackageNo (String ... rightFuzzyPackageNo){
            if (rightFuzzyPackageNo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPackageNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPackageNo = list;
            }
            return this;
        }

        public QueryBuilder packageNo(String packageNo){
            setPackageNo(packageNo);
            return this;
        }

        public QueryBuilder packageNoList(String ... packageNo){
            if (packageNo != null){
                List<String> list = new ArrayList<>();
                for (String item : packageNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.packageNoList = list;
            }

            return this;
        }

        public QueryBuilder packageNoList(List<String> packageNo){
            this.packageNoList = packageNo;
            return this;
        }

        public QueryBuilder fetchPackageNo(){
            setFetchFields("fetchFields","packageNo");
            return this;
        }

        public QueryBuilder excludePackageNo(){
            setFetchFields("excludeFields","packageNo");
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

        public ProductDate build(){
            return this;
        }
    }

}
