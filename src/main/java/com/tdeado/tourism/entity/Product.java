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
public class Product implements Serializable {

    private static final long serialVersionUID = 1528193878196L;


    /**
    * 主键
    * 产品ID
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 产品编号
    * isNullAble:0,defaultVal:
    */
    private String productNo;

    /**
    * 产品分类
    * isNullAble:0
    */
    private Integer productCate;

    /**
    * 产品名称
    * isNullAble:0
    */
    private String productName;

    /**
    * 分类名称
    * isNullAble:1
    */
    private String productCateName;

    /**
    * 标签 用逗号隔开
    * isNullAble:1
    */
    private String productTag;
    /**
     * 保障数组
     * isNullAble:1
     */
    public String[] productTagList;

    /**
    * 负责人
    * isNullAble:1
    */
    private String principal;

    /**
    * 产品简述
    * isNullAble:1
    */
    private String sketch;

    /**
    * 咨询电话
    * isNullAble:1
    */
    private String hotline;

    /**
    * 不能电话咨询
    * isNullAble:1,defaultVal:0
    */
    private Integer notmobile;

    /**
    * 操作说明
    * isNullAble:1
    */
    private String operate;

    /**
    * 图片数组序列化串
    * isNullAble:1
    */
    private String images;

    /**
    * 查看数
    * isNullAble:1
    */
    private Integer views;

    /**
    * 点评人数
    * isNullAble:1
    */
    private Integer comments;

    /**
    * 购买人数
    * isNullAble:1
    */
    private Integer buyfew;

    /**
    *  佣金比例
    * isNullAble:1
    */
    private Double commissionRatio;

    /**
    * 添加时间
    * isNullAble:1
    */
    private java.time.LocalDateTime addtime;

    /**
    * 是否上架
    * isNullAble:1
    */
    private Integer isshow;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer isdel;

    /**
    * 显示价格
    * isNullAble:1
    */
    private String price;

    /**
     * 保障
     * isNullAble:1
     */
    private String security;
    /**
     * 保障数组
     * isNullAble:1
     */
    public String[] securityList;

    /**
    * 行程内容json
    * isNullAble:1
    */
    private String trip;

    /**
    * 出发地
    * isNullAble:1
    */
    private String origin;
    /**
     * 图文详情
     * isNullAble:1
     */
    private String content;

    /**
    * 
    * isNullAble:1
    */
    private String destination;

    public String[] getProductTagList() {
        return productTagList;
    }

    public void setProductTagList(String[] productTagList) {
        this.productTagList = productTagList;
    }

    public String[] getSecurityList() {
        return securityList;
    }

    public void setSecurityList(String[] securityList) {
        this.securityList = securityList;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
    }

    public void setProductNo(String productNo){
        this.productNo = productNo;
    }

    public String getProductNo(){
        return this.productNo;
    }

    public void setProductCate(Integer productCate){
        this.productCate = productCate;
    }

    public Integer getProductCate(){
        return this.productCate;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setProductCateName(String productCateName){
        this.productCateName = productCateName;
    }

    public String getProductCateName(){
        return this.productCateName;
    }

    public void setProductTag(String productTag){
        this.productTag = productTag;
    }

    public String getProductTag(){
        return this.productTag;
    }

    public void setPrincipal(String principal){
        this.principal = principal;
    }

    public String getPrincipal(){
        return this.principal;
    }

    public void setSketch(String sketch){
        this.sketch = sketch;
    }

    public String getSketch(){
        return this.sketch;
    }

    public void setHotline(String hotline){
        this.hotline = hotline;
    }

    public String getHotline(){
        return this.hotline;
    }

    public void setNotmobile(Integer notmobile){
        this.notmobile = notmobile;
    }

    public Integer getNotmobile(){
        return this.notmobile;
    }

    public void setOperate(String operate){
        this.operate = operate;
    }

    public String getOperate(){
        return this.operate;
    }

    public void setImages(String images){
        this.images = images;
    }

    public String getImages(){
        return this.images;
    }

    public void setViews(Integer views){
        this.views = views;
    }

    public Integer getViews(){
        return this.views;
    }

    public void setComments(Integer comments){
        this.comments = comments;
    }

    public Integer getComments(){
        return this.comments;
    }

    public void setBuyfew(Integer buyfew){
        this.buyfew = buyfew;
    }

    public Integer getBuyfew(){
        return this.buyfew;
    }

    public void setCommissionRatio(Double commissionRatio){
        this.commissionRatio = commissionRatio;
    }

    public Double getCommissionRatio(){
        return this.commissionRatio;
    }

    public void setAddtime(java.time.LocalDateTime addtime){
        this.addtime = addtime;
    }

    public java.time.LocalDateTime getAddtime(){
        return this.addtime;
    }

    public void setIsshow(Integer isshow){
        this.isshow = isshow;
    }

    public Integer getIsshow(){
        return this.isshow;
    }

    public void setIsdel(Integer isdel){
        this.isdel = isdel;
    }

    public Integer getIsdel(){
        return this.isdel;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getPrice(){
        return this.price;
    }

    public void setSecurity(String security){
        this.security = security;
    }

    public String getSecurity(){
        return this.security;
    }

    public void setTrip(String trip){
        this.trip = trip;
    }

    public String getTrip(){
        return this.trip;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public String getOrigin(){
        return this.origin;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getDestination(){
        return this.destination;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                "productNo='" + productNo + '\'' +
                "productCate='" + productCate + '\'' +
                "productName='" + productName + '\'' +
                "productCateName='" + productCateName + '\'' +
                "productTag='" + productTag + '\'' +
                "principal='" + principal + '\'' +
                "sketch='" + sketch + '\'' +
                "hotline='" + hotline + '\'' +
                "notmobile='" + notmobile + '\'' +
                "operate='" + operate + '\'' +
                "images='" + images + '\'' +
                "views='" + views + '\'' +
                "comments='" + comments + '\'' +
                "buyfew='" + buyfew + '\'' +
                "commissionRatio='" + commissionRatio + '\'' +
                "addtime='" + addtime + '\'' +
                "isshow='" + isshow + '\'' +
                "isdel='" + isdel + '\'' +
                "price='" + price + '\'' +
                "security='" + security + '\'' +
                "trip='" + trip + '\'' +
                "origin='" + origin + '\'' +
                "destination='" + destination + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Product{
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

        private List<String> productNoList;


        private List<String> fuzzyProductNo;

        public List<String> getFuzzyProductNo(){
            return this.fuzzyProductNo;
        }

        private List<String> rightFuzzyProductNo;

        public List<String> getRightFuzzyProductNo(){
            return this.rightFuzzyProductNo;
        }
        private List<Integer> productCateList;

        private Integer productCateSt;

        private Integer productCateEd;

        public Integer getProductCateSt(){
            return this.productCateSt;
        }

        public Integer getProductCateEd(){
            return this.productCateEd;
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
        private List<String> productCateNameList;


        private List<String> fuzzyProductCateName;

        public List<String> getFuzzyProductCateName(){
            return this.fuzzyProductCateName;
        }

        private List<String> rightFuzzyProductCateName;

        public List<String> getRightFuzzyProductCateName(){
            return this.rightFuzzyProductCateName;
        }
        private List<String> productTagList;


        private List<String> fuzzyProductTag;

        public List<String> getFuzzyProductTag(){
            return this.fuzzyProductTag;
        }

        private List<String> rightFuzzyProductTag;

        public List<String> getRightFuzzyProductTag(){
            return this.rightFuzzyProductTag;
        }
        private List<String> principalList;


        private List<String> fuzzyPrincipal;

        public List<String> getFuzzyPrincipal(){
            return this.fuzzyPrincipal;
        }

        private List<String> rightFuzzyPrincipal;

        public List<String> getRightFuzzyPrincipal(){
            return this.rightFuzzyPrincipal;
        }
        private List<String> sketchList;


        private List<String> fuzzySketch;

        public List<String> getFuzzySketch(){
            return this.fuzzySketch;
        }

        private List<String> rightFuzzySketch;

        public List<String> getRightFuzzySketch(){
            return this.rightFuzzySketch;
        }
        private List<String> hotlineList;


        private List<String> fuzzyHotline;

        public List<String> getFuzzyHotline(){
            return this.fuzzyHotline;
        }

        private List<String> rightFuzzyHotline;

        public List<String> getRightFuzzyHotline(){
            return this.rightFuzzyHotline;
        }
        private List<Integer> notmobileList;

        private Integer notmobileSt;

        private Integer notmobileEd;

        public Integer getNotmobileSt(){
            return this.notmobileSt;
        }

        public Integer getNotmobileEd(){
            return this.notmobileEd;
        }

        private List<String> operateList;


        private List<String> fuzzyOperate;

        public List<String> getFuzzyOperate(){
            return this.fuzzyOperate;
        }

        private List<String> rightFuzzyOperate;

        public List<String> getRightFuzzyOperate(){
            return this.rightFuzzyOperate;
        }
        private List<String> imagesList;


        private List<String> fuzzyImages;

        public List<String> getFuzzyImages(){
            return this.fuzzyImages;
        }

        private List<String> rightFuzzyImages;

        public List<String> getRightFuzzyImages(){
            return this.rightFuzzyImages;
        }
        private List<Integer> viewsList;

        private Integer viewsSt;

        private Integer viewsEd;

        public Integer getViewsSt(){
            return this.viewsSt;
        }

        public Integer getViewsEd(){
            return this.viewsEd;
        }

        private List<Integer> commentsList;

        private Integer commentsSt;

        private Integer commentsEd;

        public Integer getCommentsSt(){
            return this.commentsSt;
        }

        public Integer getCommentsEd(){
            return this.commentsEd;
        }

        private List<Integer> buyfewList;

        private Integer buyfewSt;

        private Integer buyfewEd;

        public Integer getBuyfewSt(){
            return this.buyfewSt;
        }

        public Integer getBuyfewEd(){
            return this.buyfewEd;
        }

        private List<Double> commissionRatioList;

        private Double commissionRatioSt;

        private Double commissionRatioEd;

        public Double getCommissionRatioSt(){
            return this.commissionRatioSt;
        }

        public Double getCommissionRatioEd(){
            return this.commissionRatioEd;
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

        private List<Integer> isshowList;

        private Integer isshowSt;

        private Integer isshowEd;

        public Integer getIsshowSt(){
            return this.isshowSt;
        }

        public Integer getIsshowEd(){
            return this.isshowEd;
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

        private List<String> priceList;


        private List<String> fuzzyPrice;

        public List<String> getFuzzyPrice(){
            return this.fuzzyPrice;
        }

        private List<String> rightFuzzyPrice;

        public List<String> getRightFuzzyPrice(){
            return this.rightFuzzyPrice;
        }
        private List<String> securityList;


        private List<String> fuzzySecurity;

        public List<String> getFuzzySecurity(){
            return this.fuzzySecurity;
        }

        private List<String> rightFuzzySecurity;

        public List<String> getRightFuzzySecurity(){
            return this.rightFuzzySecurity;
        }
        private List<String> tripList;


        private List<String> fuzzyTrip;

        public List<String> getFuzzyTrip(){
            return this.fuzzyTrip;
        }

        private List<String> rightFuzzyTrip;

        public List<String> getRightFuzzyTrip(){
            return this.rightFuzzyTrip;
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
        private List<String> destinationList;


        private List<String> fuzzyDestination;

        public List<String> getFuzzyDestination(){
            return this.fuzzyDestination;
        }

        private List<String> rightFuzzyDestination;

        public List<String> getRightFuzzyDestination(){
            return this.rightFuzzyDestination;
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



        public QueryBuilder fuzzyProductNo (List<String> fuzzyProductNo){
            this.fuzzyProductNo = fuzzyProductNo;
            return this;
        }

        public QueryBuilder fuzzyProductNo (String ... fuzzyProductNo){
            if (fuzzyProductNo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProductNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProductNo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProductNo (List<String> rightFuzzyProductNo){
            this.rightFuzzyProductNo = rightFuzzyProductNo;
            return this;
        }

        public QueryBuilder rightFuzzyProductNo (String ... rightFuzzyProductNo){
            if (rightFuzzyProductNo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProductNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProductNo = list;
            }
            return this;
        }

        public QueryBuilder productNo(String productNo){
            setProductNo(productNo);
            return this;
        }

        public QueryBuilder productNoList(String ... productNo){
            if (productNo != null){
                List<String> list = new ArrayList<>();
                for (String item : productNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productNoList = list;
            }

            return this;
        }

        public QueryBuilder productNoList(List<String> productNo){
            this.productNoList = productNo;
            return this;
        }

        public QueryBuilder fetchProductNo(){
            setFetchFields("fetchFields","productNo");
            return this;
        }

        public QueryBuilder excludeProductNo(){
            setFetchFields("excludeFields","productNo");
            return this;
        }



        public QueryBuilder productCateBetWeen(Integer productCateSt,Integer productCateEd){
            this.productCateSt = productCateSt;
            this.productCateEd = productCateEd;
            return this;
        }

        public QueryBuilder productCateGreaterEqThan(Integer productCateSt){
            this.productCateSt = productCateSt;
            return this;
        }
        public QueryBuilder productCateLessEqThan(Integer productCateEd){
            this.productCateEd = productCateEd;
            return this;
        }


        public QueryBuilder productCate(Integer productCate){
            setProductCate(productCate);
            return this;
        }

        public QueryBuilder productCateList(Integer ... productCate){
            if (productCate != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : productCate){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productCateList = list;
            }

            return this;
        }

        public QueryBuilder productCateList(List<Integer> productCate){
            this.productCateList = productCate;
            return this;
        }

        public QueryBuilder fetchProductCate(){
            setFetchFields("fetchFields","productCate");
            return this;
        }

        public QueryBuilder excludeProductCate(){
            setFetchFields("excludeFields","productCate");
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



        public QueryBuilder fuzzyProductCateName (List<String> fuzzyProductCateName){
            this.fuzzyProductCateName = fuzzyProductCateName;
            return this;
        }

        public QueryBuilder fuzzyProductCateName (String ... fuzzyProductCateName){
            if (fuzzyProductCateName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProductCateName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProductCateName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProductCateName (List<String> rightFuzzyProductCateName){
            this.rightFuzzyProductCateName = rightFuzzyProductCateName;
            return this;
        }

        public QueryBuilder rightFuzzyProductCateName (String ... rightFuzzyProductCateName){
            if (rightFuzzyProductCateName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProductCateName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProductCateName = list;
            }
            return this;
        }

        public QueryBuilder productCateName(String productCateName){
            setProductCateName(productCateName);
            return this;
        }

        public QueryBuilder productCateNameList(String ... productCateName){
            if (productCateName != null){
                List<String> list = new ArrayList<>();
                for (String item : productCateName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productCateNameList = list;
            }

            return this;
        }

        public QueryBuilder productCateNameList(List<String> productCateName){
            this.productCateNameList = productCateName;
            return this;
        }

        public QueryBuilder fetchProductCateName(){
            setFetchFields("fetchFields","productCateName");
            return this;
        }

        public QueryBuilder excludeProductCateName(){
            setFetchFields("excludeFields","productCateName");
            return this;
        }



        public QueryBuilder fuzzyProductTag (List<String> fuzzyProductTag){
            this.fuzzyProductTag = fuzzyProductTag;
            return this;
        }

        public QueryBuilder fuzzyProductTag (String ... fuzzyProductTag){
            if (fuzzyProductTag != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProductTag){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProductTag = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProductTag (List<String> rightFuzzyProductTag){
            this.rightFuzzyProductTag = rightFuzzyProductTag;
            return this;
        }

        public QueryBuilder rightFuzzyProductTag (String ... rightFuzzyProductTag){
            if (rightFuzzyProductTag != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProductTag){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProductTag = list;
            }
            return this;
        }

        public QueryBuilder productTag(String productTag){
            setProductTag(productTag);
            return this;
        }

        public QueryBuilder productTagList(String ... productTag){
            if (productTag != null){
                List<String> list = new ArrayList<>();
                for (String item : productTag){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productTagList = list;
            }

            return this;
        }

        public QueryBuilder productTagList(List<String> productTag){
            this.productTagList = productTag;
            return this;
        }

        public QueryBuilder fetchProductTag(){
            setFetchFields("fetchFields","productTag");
            return this;
        }

        public QueryBuilder excludeProductTag(){
            setFetchFields("excludeFields","productTag");
            return this;
        }



        public QueryBuilder fuzzyPrincipal (List<String> fuzzyPrincipal){
            this.fuzzyPrincipal = fuzzyPrincipal;
            return this;
        }

        public QueryBuilder fuzzyPrincipal (String ... fuzzyPrincipal){
            if (fuzzyPrincipal != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPrincipal){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPrincipal = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPrincipal (List<String> rightFuzzyPrincipal){
            this.rightFuzzyPrincipal = rightFuzzyPrincipal;
            return this;
        }

        public QueryBuilder rightFuzzyPrincipal (String ... rightFuzzyPrincipal){
            if (rightFuzzyPrincipal != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPrincipal){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPrincipal = list;
            }
            return this;
        }

        public QueryBuilder principal(String principal){
            setPrincipal(principal);
            return this;
        }

        public QueryBuilder principalList(String ... principal){
            if (principal != null){
                List<String> list = new ArrayList<>();
                for (String item : principal){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.principalList = list;
            }

            return this;
        }

        public QueryBuilder principalList(List<String> principal){
            this.principalList = principal;
            return this;
        }

        public QueryBuilder fetchPrincipal(){
            setFetchFields("fetchFields","principal");
            return this;
        }

        public QueryBuilder excludePrincipal(){
            setFetchFields("excludeFields","principal");
            return this;
        }



        public QueryBuilder fuzzySketch (List<String> fuzzySketch){
            this.fuzzySketch = fuzzySketch;
            return this;
        }

        public QueryBuilder fuzzySketch (String ... fuzzySketch){
            if (fuzzySketch != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySketch){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySketch = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySketch (List<String> rightFuzzySketch){
            this.rightFuzzySketch = rightFuzzySketch;
            return this;
        }

        public QueryBuilder rightFuzzySketch (String ... rightFuzzySketch){
            if (rightFuzzySketch != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySketch){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySketch = list;
            }
            return this;
        }

        public QueryBuilder sketch(String sketch){
            setSketch(sketch);
            return this;
        }

        public QueryBuilder sketchList(String ... sketch){
            if (sketch != null){
                List<String> list = new ArrayList<>();
                for (String item : sketch){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.sketchList = list;
            }

            return this;
        }

        public QueryBuilder sketchList(List<String> sketch){
            this.sketchList = sketch;
            return this;
        }

        public QueryBuilder fetchSketch(){
            setFetchFields("fetchFields","sketch");
            return this;
        }

        public QueryBuilder excludeSketch(){
            setFetchFields("excludeFields","sketch");
            return this;
        }



        public QueryBuilder fuzzyHotline (List<String> fuzzyHotline){
            this.fuzzyHotline = fuzzyHotline;
            return this;
        }

        public QueryBuilder fuzzyHotline (String ... fuzzyHotline){
            if (fuzzyHotline != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyHotline){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyHotline = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyHotline (List<String> rightFuzzyHotline){
            this.rightFuzzyHotline = rightFuzzyHotline;
            return this;
        }

        public QueryBuilder rightFuzzyHotline (String ... rightFuzzyHotline){
            if (rightFuzzyHotline != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyHotline){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyHotline = list;
            }
            return this;
        }

        public QueryBuilder hotline(String hotline){
            setHotline(hotline);
            return this;
        }

        public QueryBuilder hotlineList(String ... hotline){
            if (hotline != null){
                List<String> list = new ArrayList<>();
                for (String item : hotline){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.hotlineList = list;
            }

            return this;
        }

        public QueryBuilder hotlineList(List<String> hotline){
            this.hotlineList = hotline;
            return this;
        }

        public QueryBuilder fetchHotline(){
            setFetchFields("fetchFields","hotline");
            return this;
        }

        public QueryBuilder excludeHotline(){
            setFetchFields("excludeFields","hotline");
            return this;
        }



        public QueryBuilder notmobileBetWeen(Integer notmobileSt,Integer notmobileEd){
            this.notmobileSt = notmobileSt;
            this.notmobileEd = notmobileEd;
            return this;
        }

        public QueryBuilder notmobileGreaterEqThan(Integer notmobileSt){
            this.notmobileSt = notmobileSt;
            return this;
        }
        public QueryBuilder notmobileLessEqThan(Integer notmobileEd){
            this.notmobileEd = notmobileEd;
            return this;
        }


        public QueryBuilder notmobile(Integer notmobile){
            setNotmobile(notmobile);
            return this;
        }

        public QueryBuilder notmobileList(Integer ... notmobile){
            if (notmobile != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : notmobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.notmobileList = list;
            }

            return this;
        }

        public QueryBuilder notmobileList(List<Integer> notmobile){
            this.notmobileList = notmobile;
            return this;
        }

        public QueryBuilder fetchNotmobile(){
            setFetchFields("fetchFields","notmobile");
            return this;
        }

        public QueryBuilder excludeNotmobile(){
            setFetchFields("excludeFields","notmobile");
            return this;
        }



        public QueryBuilder fuzzyOperate (List<String> fuzzyOperate){
            this.fuzzyOperate = fuzzyOperate;
            return this;
        }

        public QueryBuilder fuzzyOperate (String ... fuzzyOperate){
            if (fuzzyOperate != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyOperate){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyOperate = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyOperate (List<String> rightFuzzyOperate){
            this.rightFuzzyOperate = rightFuzzyOperate;
            return this;
        }

        public QueryBuilder rightFuzzyOperate (String ... rightFuzzyOperate){
            if (rightFuzzyOperate != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyOperate){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyOperate = list;
            }
            return this;
        }

        public QueryBuilder operate(String operate){
            setOperate(operate);
            return this;
        }

        public QueryBuilder operateList(String ... operate){
            if (operate != null){
                List<String> list = new ArrayList<>();
                for (String item : operate){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.operateList = list;
            }

            return this;
        }

        public QueryBuilder operateList(List<String> operate){
            this.operateList = operate;
            return this;
        }

        public QueryBuilder fetchOperate(){
            setFetchFields("fetchFields","operate");
            return this;
        }

        public QueryBuilder excludeOperate(){
            setFetchFields("excludeFields","operate");
            return this;
        }



        public QueryBuilder fuzzyImages (List<String> fuzzyImages){
            this.fuzzyImages = fuzzyImages;
            return this;
        }

        public QueryBuilder fuzzyImages (String ... fuzzyImages){
            if (fuzzyImages != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyImages){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyImages = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyImages (List<String> rightFuzzyImages){
            this.rightFuzzyImages = rightFuzzyImages;
            return this;
        }

        public QueryBuilder rightFuzzyImages (String ... rightFuzzyImages){
            if (rightFuzzyImages != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyImages){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyImages = list;
            }
            return this;
        }

        public QueryBuilder images(String images){
            setImages(images);
            return this;
        }

        public QueryBuilder imagesList(String ... images){
            if (images != null){
                List<String> list = new ArrayList<>();
                for (String item : images){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.imagesList = list;
            }

            return this;
        }

        public QueryBuilder imagesList(List<String> images){
            this.imagesList = images;
            return this;
        }

        public QueryBuilder fetchImages(){
            setFetchFields("fetchFields","images");
            return this;
        }

        public QueryBuilder excludeImages(){
            setFetchFields("excludeFields","images");
            return this;
        }



        public QueryBuilder viewsBetWeen(Integer viewsSt,Integer viewsEd){
            this.viewsSt = viewsSt;
            this.viewsEd = viewsEd;
            return this;
        }

        public QueryBuilder viewsGreaterEqThan(Integer viewsSt){
            this.viewsSt = viewsSt;
            return this;
        }
        public QueryBuilder viewsLessEqThan(Integer viewsEd){
            this.viewsEd = viewsEd;
            return this;
        }


        public QueryBuilder views(Integer views){
            setViews(views);
            return this;
        }

        public QueryBuilder viewsList(Integer ... views){
            if (views != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : views){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.viewsList = list;
            }

            return this;
        }

        public QueryBuilder viewsList(List<Integer> views){
            this.viewsList = views;
            return this;
        }

        public QueryBuilder fetchViews(){
            setFetchFields("fetchFields","views");
            return this;
        }

        public QueryBuilder excludeViews(){
            setFetchFields("excludeFields","views");
            return this;
        }



        public QueryBuilder commentsBetWeen(Integer commentsSt,Integer commentsEd){
            this.commentsSt = commentsSt;
            this.commentsEd = commentsEd;
            return this;
        }

        public QueryBuilder commentsGreaterEqThan(Integer commentsSt){
            this.commentsSt = commentsSt;
            return this;
        }
        public QueryBuilder commentsLessEqThan(Integer commentsEd){
            this.commentsEd = commentsEd;
            return this;
        }


        public QueryBuilder comments(Integer comments){
            setComments(comments);
            return this;
        }

        public QueryBuilder commentsList(Integer ... comments){
            if (comments != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : comments){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.commentsList = list;
            }

            return this;
        }

        public QueryBuilder commentsList(List<Integer> comments){
            this.commentsList = comments;
            return this;
        }

        public QueryBuilder fetchComments(){
            setFetchFields("fetchFields","comments");
            return this;
        }

        public QueryBuilder excludeComments(){
            setFetchFields("excludeFields","comments");
            return this;
        }



        public QueryBuilder buyfewBetWeen(Integer buyfewSt,Integer buyfewEd){
            this.buyfewSt = buyfewSt;
            this.buyfewEd = buyfewEd;
            return this;
        }

        public QueryBuilder buyfewGreaterEqThan(Integer buyfewSt){
            this.buyfewSt = buyfewSt;
            return this;
        }
        public QueryBuilder buyfewLessEqThan(Integer buyfewEd){
            this.buyfewEd = buyfewEd;
            return this;
        }


        public QueryBuilder buyfew(Integer buyfew){
            setBuyfew(buyfew);
            return this;
        }

        public QueryBuilder buyfewList(Integer ... buyfew){
            if (buyfew != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : buyfew){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.buyfewList = list;
            }

            return this;
        }

        public QueryBuilder buyfewList(List<Integer> buyfew){
            this.buyfewList = buyfew;
            return this;
        }

        public QueryBuilder fetchBuyfew(){
            setFetchFields("fetchFields","buyfew");
            return this;
        }

        public QueryBuilder excludeBuyfew(){
            setFetchFields("excludeFields","buyfew");
            return this;
        }



        public QueryBuilder commissionRatioBetWeen(Double commissionRatioSt,Double commissionRatioEd){
            this.commissionRatioSt = commissionRatioSt;
            this.commissionRatioEd = commissionRatioEd;
            return this;
        }

        public QueryBuilder commissionRatioGreaterEqThan(Double commissionRatioSt){
            this.commissionRatioSt = commissionRatioSt;
            return this;
        }
        public QueryBuilder commissionRatioLessEqThan(Double commissionRatioEd){
            this.commissionRatioEd = commissionRatioEd;
            return this;
        }


        public QueryBuilder commissionRatio(Double commissionRatio){
            setCommissionRatio(commissionRatio);
            return this;
        }

        public QueryBuilder commissionRatioList(Double ... commissionRatio){
            if (commissionRatio != null){
                List<Double> list = new ArrayList<>();
                for (Double item : commissionRatio){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.commissionRatioList = list;
            }

            return this;
        }

        public QueryBuilder commissionRatioList(List<Double> commissionRatio){
            this.commissionRatioList = commissionRatio;
            return this;
        }

        public QueryBuilder fetchCommissionRatio(){
            setFetchFields("fetchFields","commissionRatio");
            return this;
        }

        public QueryBuilder excludeCommissionRatio(){
            setFetchFields("excludeFields","commissionRatio");
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



        public QueryBuilder fuzzyPrice (List<String> fuzzyPrice){
            this.fuzzyPrice = fuzzyPrice;
            return this;
        }

        public QueryBuilder fuzzyPrice (String ... fuzzyPrice){
            if (fuzzyPrice != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPrice){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPrice = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPrice (List<String> rightFuzzyPrice){
            this.rightFuzzyPrice = rightFuzzyPrice;
            return this;
        }

        public QueryBuilder rightFuzzyPrice (String ... rightFuzzyPrice){
            if (rightFuzzyPrice != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPrice){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPrice = list;
            }
            return this;
        }

        public QueryBuilder price(String price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(String ... price){
            if (price != null){
                List<String> list = new ArrayList<>();
                for (String item : price){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.priceList = list;
            }

            return this;
        }

        public QueryBuilder priceList(List<String> price){
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



        public QueryBuilder fuzzySecurity (List<String> fuzzySecurity){
            this.fuzzySecurity = fuzzySecurity;
            return this;
        }

        public QueryBuilder fuzzySecurity (String ... fuzzySecurity){
            if (fuzzySecurity != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySecurity){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySecurity = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySecurity (List<String> rightFuzzySecurity){
            this.rightFuzzySecurity = rightFuzzySecurity;
            return this;
        }

        public QueryBuilder rightFuzzySecurity (String ... rightFuzzySecurity){
            if (rightFuzzySecurity != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySecurity){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySecurity = list;
            }
            return this;
        }

        public QueryBuilder security(String security){
            setSecurity(security);
            return this;
        }

        public QueryBuilder securityList(String ... security){
            if (security != null){
                List<String> list = new ArrayList<>();
                for (String item : security){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.securityList = list;
            }

            return this;
        }

        public QueryBuilder securityList(List<String> security){
            this.securityList = security;
            return this;
        }

        public QueryBuilder fetchSecurity(){
            setFetchFields("fetchFields","security");
            return this;
        }

        public QueryBuilder excludeSecurity(){
            setFetchFields("excludeFields","security");
            return this;
        }



        public QueryBuilder fuzzyTrip (List<String> fuzzyTrip){
            this.fuzzyTrip = fuzzyTrip;
            return this;
        }

        public QueryBuilder fuzzyTrip (String ... fuzzyTrip){
            if (fuzzyTrip != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyTrip){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyTrip = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyTrip (List<String> rightFuzzyTrip){
            this.rightFuzzyTrip = rightFuzzyTrip;
            return this;
        }

        public QueryBuilder rightFuzzyTrip (String ... rightFuzzyTrip){
            if (rightFuzzyTrip != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyTrip){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyTrip = list;
            }
            return this;
        }

        public QueryBuilder trip(String trip){
            setTrip(trip);
            return this;
        }

        public QueryBuilder tripList(String ... trip){
            if (trip != null){
                List<String> list = new ArrayList<>();
                for (String item : trip){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.tripList = list;
            }

            return this;
        }

        public QueryBuilder tripList(List<String> trip){
            this.tripList = trip;
            return this;
        }

        public QueryBuilder fetchTrip(){
            setFetchFields("fetchFields","trip");
            return this;
        }

        public QueryBuilder excludeTrip(){
            setFetchFields("excludeFields","trip");
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



        public QueryBuilder fuzzyDestination (List<String> fuzzyDestination){
            this.fuzzyDestination = fuzzyDestination;
            return this;
        }

        public QueryBuilder fuzzyDestination (String ... fuzzyDestination){
            if (fuzzyDestination != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyDestination){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyDestination = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyDestination (List<String> rightFuzzyDestination){
            this.rightFuzzyDestination = rightFuzzyDestination;
            return this;
        }

        public QueryBuilder rightFuzzyDestination (String ... rightFuzzyDestination){
            if (rightFuzzyDestination != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyDestination){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyDestination = list;
            }
            return this;
        }

        public QueryBuilder destination(String destination){
            setDestination(destination);
            return this;
        }

        public QueryBuilder destinationList(String ... destination){
            if (destination != null){
                List<String> list = new ArrayList<>();
                for (String item : destination){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.destinationList = list;
            }

            return this;
        }

        public QueryBuilder destinationList(List<String> destination){
            this.destinationList = destination;
            return this;
        }

        public QueryBuilder fetchDestination(){
            setFetchFields("fetchFields","destination");
            return this;
        }

        public QueryBuilder excludeDestination(){
            setFetchFields("excludeFields","destination");
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

        public Product build(){
            return this;
        }
    }

}
