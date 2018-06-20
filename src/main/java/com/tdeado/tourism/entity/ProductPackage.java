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
public class ProductPackage implements Serializable {

    private static final long serialVersionUID = 1527680825692L;


    /**
    * 套餐名称
    * isNullAble:1
    */
    private String packageName;

    /**
    * 套餐起算金额
    * isNullAble:1
    */
    private java.math.BigDecimal packagePrice;

    /**
    * 不收儿童
    * isNullAble:1
    */
    private Integer notchildren;

    /**
    * 是否可用
    * isNullAble:1
    */
    private Integer isshow;

    /**
    * 区块组 用序列化数组保存
    * isNullAble:1
    */
    private String content;

    /**
    * 产品ID
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 
    * isNullAble:1
    */
    private String packageNo;

    /**
    * 集合点
    * isNullAble:1
    */
    private String rallyingPoint;


    public void setPackageName(String packageName){
        this.packageName = packageName;
    }

    public String getPackageName(){
        return this.packageName;
    }

    public void setPackagePrice(java.math.BigDecimal packagePrice){
        this.packagePrice = packagePrice;
    }

    public java.math.BigDecimal getPackagePrice(){
        return this.packagePrice;
    }

    public void setNotchildren(Integer notchildren){
        this.notchildren = notchildren;
    }

    public Integer getNotchildren(){
        return this.notchildren;
    }

    public void setIsshow(Integer isshow){
        this.isshow = isshow;
    }

    public Integer getIsshow(){
        return this.isshow;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
    }

    public void setPackageNo(String packageNo){
        this.packageNo = packageNo;
    }

    public String getPackageNo(){
        return this.packageNo;
    }

    public void setRallyingPoint(String rallyingPoint){
        this.rallyingPoint = rallyingPoint;
    }

    public String getRallyingPoint(){
        return this.rallyingPoint;
    }
    @Override
    public String toString() {
        return "ProductPackage{" +
                "packageName='" + packageName + '\'' +
                "packagePrice='" + packagePrice + '\'' +
                "notchildren='" + notchildren + '\'' +
                "isshow='" + isshow + '\'' +
                "content='" + content + '\'' +
                "productId='" + productId + '\'' +
                "packageNo='" + packageNo + '\'' +
                "rallyingPoint='" + rallyingPoint + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends ProductPackage{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
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
        private List<java.math.BigDecimal> packagePriceList;

        private java.math.BigDecimal packagePriceSt;

        private java.math.BigDecimal packagePriceEd;

        public java.math.BigDecimal getPackagePriceSt(){
            return this.packagePriceSt;
        }

        public java.math.BigDecimal getPackagePriceEd(){
            return this.packagePriceEd;
        }

        private List<Integer> notchildrenList;

        private Integer notchildrenSt;

        private Integer notchildrenEd;

        public Integer getNotchildrenSt(){
            return this.notchildrenSt;
        }

        public Integer getNotchildrenEd(){
            return this.notchildrenEd;
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

        private List<String> contentList;


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){
            return this.fuzzyContent;
        }

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){
            return this.rightFuzzyContent;
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

        private List<String> packageNoList;


        private List<String> fuzzyPackageNo;

        public List<String> getFuzzyPackageNo(){
            return this.fuzzyPackageNo;
        }

        private List<String> rightFuzzyPackageNo;

        public List<String> getRightFuzzyPackageNo(){
            return this.rightFuzzyPackageNo;
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



        public QueryBuilder packagePriceBetWeen(java.math.BigDecimal packagePriceSt,java.math.BigDecimal packagePriceEd){
            this.packagePriceSt = packagePriceSt;
            this.packagePriceEd = packagePriceEd;
            return this;
        }

        public QueryBuilder packagePriceGreaterEqThan(java.math.BigDecimal packagePriceSt){
            this.packagePriceSt = packagePriceSt;
            return this;
        }
        public QueryBuilder packagePriceLessEqThan(java.math.BigDecimal packagePriceEd){
            this.packagePriceEd = packagePriceEd;
            return this;
        }


        public QueryBuilder packagePrice(java.math.BigDecimal packagePrice){
            setPackagePrice(packagePrice);
            return this;
        }

        public QueryBuilder packagePriceList(java.math.BigDecimal ... packagePrice){
            if (packagePrice != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : packagePrice){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.packagePriceList = list;
            }

            return this;
        }

        public QueryBuilder packagePriceList(List<java.math.BigDecimal> packagePrice){
            this.packagePriceList = packagePrice;
            return this;
        }

        public QueryBuilder fetchPackagePrice(){
            setFetchFields("fetchFields","packagePrice");
            return this;
        }

        public QueryBuilder excludePackagePrice(){
            setFetchFields("excludeFields","packagePrice");
            return this;
        }



        public QueryBuilder notchildrenBetWeen(Integer notchildrenSt,Integer notchildrenEd){
            this.notchildrenSt = notchildrenSt;
            this.notchildrenEd = notchildrenEd;
            return this;
        }

        public QueryBuilder notchildrenGreaterEqThan(Integer notchildrenSt){
            this.notchildrenSt = notchildrenSt;
            return this;
        }
        public QueryBuilder notchildrenLessEqThan(Integer notchildrenEd){
            this.notchildrenEd = notchildrenEd;
            return this;
        }


        public QueryBuilder notchildren(Integer notchildren){
            setNotchildren(notchildren);
            return this;
        }

        public QueryBuilder notchildrenList(Integer ... notchildren){
            if (notchildren != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : notchildren){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.notchildrenList = list;
            }

            return this;
        }

        public QueryBuilder notchildrenList(List<Integer> notchildren){
            this.notchildrenList = notchildren;
            return this;
        }

        public QueryBuilder fetchNotchildren(){
            setFetchFields("fetchFields","notchildren");
            return this;
        }

        public QueryBuilder excludeNotchildren(){
            setFetchFields("excludeFields","notchildren");
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



        public QueryBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public QueryBuilder fuzzyContent (String ... fuzzyContent){
            if (fuzzyContent != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyContent){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyContent = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public QueryBuilder rightFuzzyContent (String ... rightFuzzyContent){
            if (rightFuzzyContent != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyContent){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyContent = list;
            }
            return this;
        }

        public QueryBuilder content(String content){
            setContent(content);
            return this;
        }

        public QueryBuilder contentList(String ... content){
            if (content != null){
                List<String> list = new ArrayList<>();
                for (String item : content){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.contentList = list;
            }

            return this;
        }

        public QueryBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public QueryBuilder fetchContent(){
            setFetchFields("fetchFields","content");
            return this;
        }

        public QueryBuilder excludeContent(){
            setFetchFields("excludeFields","content");
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

        public ProductPackage build(){
            return this;
        }
    }

}
