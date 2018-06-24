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

    private static final long serialVersionUID = 1529753496724L;


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
    * 
    * isNullAble:1
    */
    private String destination;

    /**
    * 
    * isNullAble:1
    */
    private String content;


    /**
     * 保障数组
     * isNullAble:1
     */
    public String[] productTagList;


    /**
     * 保障数组
     * isNullAble:1
     */
    public String[] securityList;


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


    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setProductNo(String productNo){this.productNo = productNo;}

    public String getProductNo(){return this.productNo;}

    public void setProductCate(Integer productCate){this.productCate = productCate;}

    public Integer getProductCate(){return this.productCate;}

    public void setProductName(String productName){this.productName = productName;}

    public String getProductName(){return this.productName;}

    public void setProductCateName(String productCateName){this.productCateName = productCateName;}

    public String getProductCateName(){return this.productCateName;}

    public void setProductTag(String productTag){this.productTag = productTag;}

    public String getProductTag(){return this.productTag;}

    public void setPrincipal(String principal){this.principal = principal;}

    public String getPrincipal(){return this.principal;}

    public void setSketch(String sketch){this.sketch = sketch;}

    public String getSketch(){return this.sketch;}

    public void setHotline(String hotline){this.hotline = hotline;}

    public String getHotline(){return this.hotline;}

    public void setNotmobile(Integer notmobile){this.notmobile = notmobile;}

    public Integer getNotmobile(){return this.notmobile;}

    public void setOperate(String operate){this.operate = operate;}

    public String getOperate(){return this.operate;}

    public void setImages(String images){this.images = images;}

    public String getImages(){return this.images;}

    public void setViews(Integer views){this.views = views;}

    public Integer getViews(){return this.views;}

    public void setComments(Integer comments){this.comments = comments;}

    public Integer getComments(){return this.comments;}

    public void setBuyfew(Integer buyfew){this.buyfew = buyfew;}

    public Integer getBuyfew(){return this.buyfew;}

    public void setCommissionRatio(Double commissionRatio){this.commissionRatio = commissionRatio;}

    public Double getCommissionRatio(){return this.commissionRatio;}

    public void setAddtime(java.time.LocalDateTime addtime){this.addtime = addtime;}

    public java.time.LocalDateTime getAddtime(){return this.addtime;}

    public void setIsshow(Integer isshow){this.isshow = isshow;}

    public Integer getIsshow(){return this.isshow;}

    public void setIsdel(Integer isdel){this.isdel = isdel;}

    public Integer getIsdel(){return this.isdel;}

    public void setPrice(String price){this.price = price;}

    public String getPrice(){return this.price;}

    public void setSecurity(String security){this.security = security;}

    public String getSecurity(){return this.security;}

    public void setTrip(String trip){this.trip = trip;}

    public String getTrip(){return this.trip;}

    public void setOrigin(String origin){this.origin = origin;}

    public String getOrigin(){return this.origin;}

    public void setDestination(String destination){this.destination = destination;}

    public String getDestination(){return this.destination;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}
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
                "content='" + content + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Product set;

        private ConditionBuilder where;

        public UpdateBuilder set(Product set){
            this.set = set;
            return this;
        }

        public Product getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Product{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<String> productNoList;

        public List<String> getProductNoList(){return this.productNoList;}


        private List<String> fuzzyProductNo;

        public List<String> getFuzzyProductNo(){return this.fuzzyProductNo;}

        private List<String> rightFuzzyProductNo;

        public List<String> getRightFuzzyProductNo(){return this.rightFuzzyProductNo;}
        private List<Integer> productCateList;

        public List<Integer> getProductCateList(){return this.productCateList;}

        private Integer productCateSt;

        private Integer productCateEd;

        public Integer getProductCateSt(){return this.productCateSt;}

        public Integer getProductCateEd(){return this.productCateEd;}

        private List<String> productNameList;

        public List<String> getProductNameList(){return this.productNameList;}


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){return this.fuzzyProductName;}

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){return this.rightFuzzyProductName;}
        private List<String> productCateNameList;

        public List<String> getProductCateNameList(){return this.productCateNameList;}


        private List<String> fuzzyProductCateName;

        public List<String> getFuzzyProductCateName(){return this.fuzzyProductCateName;}

        private List<String> rightFuzzyProductCateName;

        public List<String> getRightFuzzyProductCateName(){return this.rightFuzzyProductCateName;}
        private List<String> productTagList;



        private List<String> fuzzyProductTag;

        public List<String> getFuzzyProductTag(){return this.fuzzyProductTag;}

        private List<String> rightFuzzyProductTag;

        public List<String> getRightFuzzyProductTag(){return this.rightFuzzyProductTag;}
        private List<String> principalList;

        public List<String> getPrincipalList(){return this.principalList;}


        private List<String> fuzzyPrincipal;

        public List<String> getFuzzyPrincipal(){return this.fuzzyPrincipal;}

        private List<String> rightFuzzyPrincipal;

        public List<String> getRightFuzzyPrincipal(){return this.rightFuzzyPrincipal;}
        private List<String> sketchList;

        public List<String> getSketchList(){return this.sketchList;}


        private List<String> fuzzySketch;

        public List<String> getFuzzySketch(){return this.fuzzySketch;}

        private List<String> rightFuzzySketch;

        public List<String> getRightFuzzySketch(){return this.rightFuzzySketch;}
        private List<String> hotlineList;

        public List<String> getHotlineList(){return this.hotlineList;}


        private List<String> fuzzyHotline;

        public List<String> getFuzzyHotline(){return this.fuzzyHotline;}

        private List<String> rightFuzzyHotline;

        public List<String> getRightFuzzyHotline(){return this.rightFuzzyHotline;}
        private List<Integer> notmobileList;

        public List<Integer> getNotmobileList(){return this.notmobileList;}

        private Integer notmobileSt;

        private Integer notmobileEd;

        public Integer getNotmobileSt(){return this.notmobileSt;}

        public Integer getNotmobileEd(){return this.notmobileEd;}

        private List<String> operateList;

        public List<String> getOperateList(){return this.operateList;}


        private List<String> fuzzyOperate;

        public List<String> getFuzzyOperate(){return this.fuzzyOperate;}

        private List<String> rightFuzzyOperate;

        public List<String> getRightFuzzyOperate(){return this.rightFuzzyOperate;}
        private List<String> imagesList;

        public List<String> getImagesList(){return this.imagesList;}


        private List<String> fuzzyImages;

        public List<String> getFuzzyImages(){return this.fuzzyImages;}

        private List<String> rightFuzzyImages;

        public List<String> getRightFuzzyImages(){return this.rightFuzzyImages;}
        private List<Integer> viewsList;

        public List<Integer> getViewsList(){return this.viewsList;}

        private Integer viewsSt;

        private Integer viewsEd;

        public Integer getViewsSt(){return this.viewsSt;}

        public Integer getViewsEd(){return this.viewsEd;}

        private List<Integer> commentsList;

        public List<Integer> getCommentsList(){return this.commentsList;}

        private Integer commentsSt;

        private Integer commentsEd;

        public Integer getCommentsSt(){return this.commentsSt;}

        public Integer getCommentsEd(){return this.commentsEd;}

        private List<Integer> buyfewList;

        public List<Integer> getBuyfewList(){return this.buyfewList;}

        private Integer buyfewSt;

        private Integer buyfewEd;

        public Integer getBuyfewSt(){return this.buyfewSt;}

        public Integer getBuyfewEd(){return this.buyfewEd;}

        private List<Double> commissionRatioList;

        public List<Double> getCommissionRatioList(){return this.commissionRatioList;}

        private Double commissionRatioSt;

        private Double commissionRatioEd;

        public Double getCommissionRatioSt(){return this.commissionRatioSt;}

        public Double getCommissionRatioEd(){return this.commissionRatioEd;}

        private List<java.time.LocalDateTime> addtimeList;

        public List<java.time.LocalDateTime> getAddtimeList(){return this.addtimeList;}

        private java.time.LocalDateTime addtimeSt;

        private java.time.LocalDateTime addtimeEd;

        public java.time.LocalDateTime getAddtimeSt(){return this.addtimeSt;}

        public java.time.LocalDateTime getAddtimeEd(){return this.addtimeEd;}

        private List<Integer> isshowList;

        public List<Integer> getIsshowList(){return this.isshowList;}

        private Integer isshowSt;

        private Integer isshowEd;

        public Integer getIsshowSt(){return this.isshowSt;}

        public Integer getIsshowEd(){return this.isshowEd;}

        private List<Integer> isdelList;

        public List<Integer> getIsdelList(){return this.isdelList;}

        private Integer isdelSt;

        private Integer isdelEd;

        public Integer getIsdelSt(){return this.isdelSt;}

        public Integer getIsdelEd(){return this.isdelEd;}

        private List<String> priceList;

        public List<String> getPriceList(){return this.priceList;}


        private List<String> fuzzyPrice;

        public List<String> getFuzzyPrice(){return this.fuzzyPrice;}

        private List<String> rightFuzzyPrice;

        public List<String> getRightFuzzyPrice(){return this.rightFuzzyPrice;}
        private List<String> securityList;



        private List<String> fuzzySecurity;

        public List<String> getFuzzySecurity(){return this.fuzzySecurity;}

        private List<String> rightFuzzySecurity;

        public List<String> getRightFuzzySecurity(){return this.rightFuzzySecurity;}
        private List<String> tripList;

        public List<String> getTripList(){return this.tripList;}


        private List<String> fuzzyTrip;

        public List<String> getFuzzyTrip(){return this.fuzzyTrip;}

        private List<String> rightFuzzyTrip;

        public List<String> getRightFuzzyTrip(){return this.rightFuzzyTrip;}
        private List<String> originList;

        public List<String> getOriginList(){return this.originList;}


        private List<String> fuzzyOrigin;

        public List<String> getFuzzyOrigin(){return this.fuzzyOrigin;}

        private List<String> rightFuzzyOrigin;

        public List<String> getRightFuzzyOrigin(){return this.rightFuzzyOrigin;}
        private List<String> destinationList;

        public List<String> getDestinationList(){return this.destinationList;}


        private List<String> fuzzyDestination;

        public List<String> getFuzzyDestination(){return this.fuzzyDestination;}

        private List<String> rightFuzzyDestination;

        public List<String> getRightFuzzyDestination(){return this.rightFuzzyDestination;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
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
            this.productIdList = solveNullList(productId);
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
            this.fuzzyProductNo = solveNullList(fuzzyProductNo);
            return this;
        }

        public QueryBuilder rightFuzzyProductNo (List<String> rightFuzzyProductNo){
            this.rightFuzzyProductNo = rightFuzzyProductNo;
            return this;
        }

        public QueryBuilder rightFuzzyProductNo (String ... rightFuzzyProductNo){
            this.rightFuzzyProductNo = solveNullList(rightFuzzyProductNo);
            return this;
        }

        public QueryBuilder productNo(String productNo){
            setProductNo(productNo);
            return this;
        }

        public QueryBuilder productNoList(String ... productNo){
            this.productNoList = solveNullList(productNo);
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
            this.productCateList = solveNullList(productCate);
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
            this.fuzzyProductName = solveNullList(fuzzyProductName);
            return this;
        }

        public QueryBuilder rightFuzzyProductName (List<String> rightFuzzyProductName){
            this.rightFuzzyProductName = rightFuzzyProductName;
            return this;
        }

        public QueryBuilder rightFuzzyProductName (String ... rightFuzzyProductName){
            this.rightFuzzyProductName = solveNullList(rightFuzzyProductName);
            return this;
        }

        public QueryBuilder productName(String productName){
            setProductName(productName);
            return this;
        }

        public QueryBuilder productNameList(String ... productName){
            this.productNameList = solveNullList(productName);
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
            this.fuzzyProductCateName = solveNullList(fuzzyProductCateName);
            return this;
        }

        public QueryBuilder rightFuzzyProductCateName (List<String> rightFuzzyProductCateName){
            this.rightFuzzyProductCateName = rightFuzzyProductCateName;
            return this;
        }

        public QueryBuilder rightFuzzyProductCateName (String ... rightFuzzyProductCateName){
            this.rightFuzzyProductCateName = solveNullList(rightFuzzyProductCateName);
            return this;
        }

        public QueryBuilder productCateName(String productCateName){
            setProductCateName(productCateName);
            return this;
        }

        public QueryBuilder productCateNameList(String ... productCateName){
            this.productCateNameList = solveNullList(productCateName);
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
            this.fuzzyProductTag = solveNullList(fuzzyProductTag);
            return this;
        }

        public QueryBuilder rightFuzzyProductTag (List<String> rightFuzzyProductTag){
            this.rightFuzzyProductTag = rightFuzzyProductTag;
            return this;
        }

        public QueryBuilder rightFuzzyProductTag (String ... rightFuzzyProductTag){
            this.rightFuzzyProductTag = solveNullList(rightFuzzyProductTag);
            return this;
        }

        public QueryBuilder productTag(String productTag){
            setProductTag(productTag);
            return this;
        }

        public QueryBuilder productTagList(String ... productTag){
            this.productTagList = solveNullList(productTag);
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
            this.fuzzyPrincipal = solveNullList(fuzzyPrincipal);
            return this;
        }

        public QueryBuilder rightFuzzyPrincipal (List<String> rightFuzzyPrincipal){
            this.rightFuzzyPrincipal = rightFuzzyPrincipal;
            return this;
        }

        public QueryBuilder rightFuzzyPrincipal (String ... rightFuzzyPrincipal){
            this.rightFuzzyPrincipal = solveNullList(rightFuzzyPrincipal);
            return this;
        }

        public QueryBuilder principal(String principal){
            setPrincipal(principal);
            return this;
        }

        public QueryBuilder principalList(String ... principal){
            this.principalList = solveNullList(principal);
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
            this.fuzzySketch = solveNullList(fuzzySketch);
            return this;
        }

        public QueryBuilder rightFuzzySketch (List<String> rightFuzzySketch){
            this.rightFuzzySketch = rightFuzzySketch;
            return this;
        }

        public QueryBuilder rightFuzzySketch (String ... rightFuzzySketch){
            this.rightFuzzySketch = solveNullList(rightFuzzySketch);
            return this;
        }

        public QueryBuilder sketch(String sketch){
            setSketch(sketch);
            return this;
        }

        public QueryBuilder sketchList(String ... sketch){
            this.sketchList = solveNullList(sketch);
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
            this.fuzzyHotline = solveNullList(fuzzyHotline);
            return this;
        }

        public QueryBuilder rightFuzzyHotline (List<String> rightFuzzyHotline){
            this.rightFuzzyHotline = rightFuzzyHotline;
            return this;
        }

        public QueryBuilder rightFuzzyHotline (String ... rightFuzzyHotline){
            this.rightFuzzyHotline = solveNullList(rightFuzzyHotline);
            return this;
        }

        public QueryBuilder hotline(String hotline){
            setHotline(hotline);
            return this;
        }

        public QueryBuilder hotlineList(String ... hotline){
            this.hotlineList = solveNullList(hotline);
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
            this.notmobileList = solveNullList(notmobile);
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
            this.fuzzyOperate = solveNullList(fuzzyOperate);
            return this;
        }

        public QueryBuilder rightFuzzyOperate (List<String> rightFuzzyOperate){
            this.rightFuzzyOperate = rightFuzzyOperate;
            return this;
        }

        public QueryBuilder rightFuzzyOperate (String ... rightFuzzyOperate){
            this.rightFuzzyOperate = solveNullList(rightFuzzyOperate);
            return this;
        }

        public QueryBuilder operate(String operate){
            setOperate(operate);
            return this;
        }

        public QueryBuilder operateList(String ... operate){
            this.operateList = solveNullList(operate);
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
            this.fuzzyImages = solveNullList(fuzzyImages);
            return this;
        }

        public QueryBuilder rightFuzzyImages (List<String> rightFuzzyImages){
            this.rightFuzzyImages = rightFuzzyImages;
            return this;
        }

        public QueryBuilder rightFuzzyImages (String ... rightFuzzyImages){
            this.rightFuzzyImages = solveNullList(rightFuzzyImages);
            return this;
        }

        public QueryBuilder images(String images){
            setImages(images);
            return this;
        }

        public QueryBuilder imagesList(String ... images){
            this.imagesList = solveNullList(images);
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
            this.viewsList = solveNullList(views);
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
            this.commentsList = solveNullList(comments);
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
            this.buyfewList = solveNullList(buyfew);
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
            this.commissionRatioList = solveNullList(commissionRatio);
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
            this.addtimeList = solveNullList(addtime);
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
            this.isshowList = solveNullList(isshow);
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
            this.isdelList = solveNullList(isdel);
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
            this.fuzzyPrice = solveNullList(fuzzyPrice);
            return this;
        }

        public QueryBuilder rightFuzzyPrice (List<String> rightFuzzyPrice){
            this.rightFuzzyPrice = rightFuzzyPrice;
            return this;
        }

        public QueryBuilder rightFuzzyPrice (String ... rightFuzzyPrice){
            this.rightFuzzyPrice = solveNullList(rightFuzzyPrice);
            return this;
        }

        public QueryBuilder price(String price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(String ... price){
            this.priceList = solveNullList(price);
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
            this.fuzzySecurity = solveNullList(fuzzySecurity);
            return this;
        }

        public QueryBuilder rightFuzzySecurity (List<String> rightFuzzySecurity){
            this.rightFuzzySecurity = rightFuzzySecurity;
            return this;
        }

        public QueryBuilder rightFuzzySecurity (String ... rightFuzzySecurity){
            this.rightFuzzySecurity = solveNullList(rightFuzzySecurity);
            return this;
        }

        public QueryBuilder security(String security){
            setSecurity(security);
            return this;
        }

        public QueryBuilder securityList(String ... security){
            this.securityList = solveNullList(security);
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
            this.fuzzyTrip = solveNullList(fuzzyTrip);
            return this;
        }

        public QueryBuilder rightFuzzyTrip (List<String> rightFuzzyTrip){
            this.rightFuzzyTrip = rightFuzzyTrip;
            return this;
        }

        public QueryBuilder rightFuzzyTrip (String ... rightFuzzyTrip){
            this.rightFuzzyTrip = solveNullList(rightFuzzyTrip);
            return this;
        }

        public QueryBuilder trip(String trip){
            setTrip(trip);
            return this;
        }

        public QueryBuilder tripList(String ... trip){
            this.tripList = solveNullList(trip);
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
            this.fuzzyOrigin = solveNullList(fuzzyOrigin);
            return this;
        }

        public QueryBuilder rightFuzzyOrigin (List<String> rightFuzzyOrigin){
            this.rightFuzzyOrigin = rightFuzzyOrigin;
            return this;
        }

        public QueryBuilder rightFuzzyOrigin (String ... rightFuzzyOrigin){
            this.rightFuzzyOrigin = solveNullList(rightFuzzyOrigin);
            return this;
        }

        public QueryBuilder origin(String origin){
            setOrigin(origin);
            return this;
        }

        public QueryBuilder originList(String ... origin){
            this.originList = solveNullList(origin);
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
            this.fuzzyDestination = solveNullList(fuzzyDestination);
            return this;
        }

        public QueryBuilder rightFuzzyDestination (List<String> rightFuzzyDestination){
            this.rightFuzzyDestination = rightFuzzyDestination;
            return this;
        }

        public QueryBuilder rightFuzzyDestination (String ... rightFuzzyDestination){
            this.rightFuzzyDestination = solveNullList(rightFuzzyDestination);
            return this;
        }

        public QueryBuilder destination(String destination){
            setDestination(destination);
            return this;
        }

        public QueryBuilder destinationList(String ... destination){
            this.destinationList = solveNullList(destination);
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

        public QueryBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public QueryBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public QueryBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public QueryBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public QueryBuilder content(String content){
            setContent(content);
            return this;
        }

        public QueryBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
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
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
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

        public Product build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<String> productNoList;

        public List<String> getProductNoList(){return this.productNoList;}


        private List<String> fuzzyProductNo;

        public List<String> getFuzzyProductNo(){return this.fuzzyProductNo;}

        private List<String> rightFuzzyProductNo;

        public List<String> getRightFuzzyProductNo(){return this.rightFuzzyProductNo;}
        private List<Integer> productCateList;

        public List<Integer> getProductCateList(){return this.productCateList;}

        private Integer productCateSt;

        private Integer productCateEd;

        public Integer getProductCateSt(){return this.productCateSt;}

        public Integer getProductCateEd(){return this.productCateEd;}

        private List<String> productNameList;

        public List<String> getProductNameList(){return this.productNameList;}


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){return this.fuzzyProductName;}

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){return this.rightFuzzyProductName;}
        private List<String> productCateNameList;

        public List<String> getProductCateNameList(){return this.productCateNameList;}


        private List<String> fuzzyProductCateName;

        public List<String> getFuzzyProductCateName(){return this.fuzzyProductCateName;}

        private List<String> rightFuzzyProductCateName;

        public List<String> getRightFuzzyProductCateName(){return this.rightFuzzyProductCateName;}
        private List<String> productTagList;

        public List<String> getProductTagList(){return this.productTagList;}


        private List<String> fuzzyProductTag;

        public List<String> getFuzzyProductTag(){return this.fuzzyProductTag;}

        private List<String> rightFuzzyProductTag;

        public List<String> getRightFuzzyProductTag(){return this.rightFuzzyProductTag;}
        private List<String> principalList;

        public List<String> getPrincipalList(){return this.principalList;}


        private List<String> fuzzyPrincipal;

        public List<String> getFuzzyPrincipal(){return this.fuzzyPrincipal;}

        private List<String> rightFuzzyPrincipal;

        public List<String> getRightFuzzyPrincipal(){return this.rightFuzzyPrincipal;}
        private List<String> sketchList;

        public List<String> getSketchList(){return this.sketchList;}


        private List<String> fuzzySketch;

        public List<String> getFuzzySketch(){return this.fuzzySketch;}

        private List<String> rightFuzzySketch;

        public List<String> getRightFuzzySketch(){return this.rightFuzzySketch;}
        private List<String> hotlineList;

        public List<String> getHotlineList(){return this.hotlineList;}


        private List<String> fuzzyHotline;

        public List<String> getFuzzyHotline(){return this.fuzzyHotline;}

        private List<String> rightFuzzyHotline;

        public List<String> getRightFuzzyHotline(){return this.rightFuzzyHotline;}
        private List<Integer> notmobileList;

        public List<Integer> getNotmobileList(){return this.notmobileList;}

        private Integer notmobileSt;

        private Integer notmobileEd;

        public Integer getNotmobileSt(){return this.notmobileSt;}

        public Integer getNotmobileEd(){return this.notmobileEd;}

        private List<String> operateList;

        public List<String> getOperateList(){return this.operateList;}


        private List<String> fuzzyOperate;

        public List<String> getFuzzyOperate(){return this.fuzzyOperate;}

        private List<String> rightFuzzyOperate;

        public List<String> getRightFuzzyOperate(){return this.rightFuzzyOperate;}
        private List<String> imagesList;

        public List<String> getImagesList(){return this.imagesList;}


        private List<String> fuzzyImages;

        public List<String> getFuzzyImages(){return this.fuzzyImages;}

        private List<String> rightFuzzyImages;

        public List<String> getRightFuzzyImages(){return this.rightFuzzyImages;}
        private List<Integer> viewsList;

        public List<Integer> getViewsList(){return this.viewsList;}

        private Integer viewsSt;

        private Integer viewsEd;

        public Integer getViewsSt(){return this.viewsSt;}

        public Integer getViewsEd(){return this.viewsEd;}

        private List<Integer> commentsList;

        public List<Integer> getCommentsList(){return this.commentsList;}

        private Integer commentsSt;

        private Integer commentsEd;

        public Integer getCommentsSt(){return this.commentsSt;}

        public Integer getCommentsEd(){return this.commentsEd;}

        private List<Integer> buyfewList;

        public List<Integer> getBuyfewList(){return this.buyfewList;}

        private Integer buyfewSt;

        private Integer buyfewEd;

        public Integer getBuyfewSt(){return this.buyfewSt;}

        public Integer getBuyfewEd(){return this.buyfewEd;}

        private List<Double> commissionRatioList;

        public List<Double> getCommissionRatioList(){return this.commissionRatioList;}

        private Double commissionRatioSt;

        private Double commissionRatioEd;

        public Double getCommissionRatioSt(){return this.commissionRatioSt;}

        public Double getCommissionRatioEd(){return this.commissionRatioEd;}

        private List<java.time.LocalDateTime> addtimeList;

        public List<java.time.LocalDateTime> getAddtimeList(){return this.addtimeList;}

        private java.time.LocalDateTime addtimeSt;

        private java.time.LocalDateTime addtimeEd;

        public java.time.LocalDateTime getAddtimeSt(){return this.addtimeSt;}

        public java.time.LocalDateTime getAddtimeEd(){return this.addtimeEd;}

        private List<Integer> isshowList;

        public List<Integer> getIsshowList(){return this.isshowList;}

        private Integer isshowSt;

        private Integer isshowEd;

        public Integer getIsshowSt(){return this.isshowSt;}

        public Integer getIsshowEd(){return this.isshowEd;}

        private List<Integer> isdelList;

        public List<Integer> getIsdelList(){return this.isdelList;}

        private Integer isdelSt;

        private Integer isdelEd;

        public Integer getIsdelSt(){return this.isdelSt;}

        public Integer getIsdelEd(){return this.isdelEd;}

        private List<String> priceList;

        public List<String> getPriceList(){return this.priceList;}


        private List<String> fuzzyPrice;

        public List<String> getFuzzyPrice(){return this.fuzzyPrice;}

        private List<String> rightFuzzyPrice;

        public List<String> getRightFuzzyPrice(){return this.rightFuzzyPrice;}
        private List<String> securityList;

        public List<String> getSecurityList(){return this.securityList;}


        private List<String> fuzzySecurity;

        public List<String> getFuzzySecurity(){return this.fuzzySecurity;}

        private List<String> rightFuzzySecurity;

        public List<String> getRightFuzzySecurity(){return this.rightFuzzySecurity;}
        private List<String> tripList;

        public List<String> getTripList(){return this.tripList;}


        private List<String> fuzzyTrip;

        public List<String> getFuzzyTrip(){return this.fuzzyTrip;}

        private List<String> rightFuzzyTrip;

        public List<String> getRightFuzzyTrip(){return this.rightFuzzyTrip;}
        private List<String> originList;

        public List<String> getOriginList(){return this.originList;}


        private List<String> fuzzyOrigin;

        public List<String> getFuzzyOrigin(){return this.fuzzyOrigin;}

        private List<String> rightFuzzyOrigin;

        public List<String> getRightFuzzyOrigin(){return this.rightFuzzyOrigin;}
        private List<String> destinationList;

        public List<String> getDestinationList(){return this.destinationList;}


        private List<String> fuzzyDestination;

        public List<String> getFuzzyDestination(){return this.fuzzyDestination;}

        private List<String> rightFuzzyDestination;

        public List<String> getRightFuzzyDestination(){return this.rightFuzzyDestination;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}

        public ConditionBuilder productIdBetWeen(Integer productIdSt,Integer productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public ConditionBuilder productIdGreaterEqThan(Integer productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public ConditionBuilder productIdLessEqThan(Integer productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public ConditionBuilder productIdList(Integer ... productId){
            this.productIdList = solveNullList(productId);
            return this;
        }

        public ConditionBuilder productIdList(List<Integer> productId){
            this.productIdList = productId;
            return this;
        }

        public ConditionBuilder fuzzyProductNo (List<String> fuzzyProductNo){
            this.fuzzyProductNo = fuzzyProductNo;
            return this;
        }

        public ConditionBuilder fuzzyProductNo (String ... fuzzyProductNo){
            this.fuzzyProductNo = solveNullList(fuzzyProductNo);
            return this;
        }

        public ConditionBuilder rightFuzzyProductNo (List<String> rightFuzzyProductNo){
            this.rightFuzzyProductNo = rightFuzzyProductNo;
            return this;
        }

        public ConditionBuilder rightFuzzyProductNo (String ... rightFuzzyProductNo){
            this.rightFuzzyProductNo = solveNullList(rightFuzzyProductNo);
            return this;
        }

        public ConditionBuilder productNoList(String ... productNo){
            this.productNoList = solveNullList(productNo);
            return this;
        }

        public ConditionBuilder productNoList(List<String> productNo){
            this.productNoList = productNo;
            return this;
        }

        public ConditionBuilder productCateBetWeen(Integer productCateSt,Integer productCateEd){
            this.productCateSt = productCateSt;
            this.productCateEd = productCateEd;
            return this;
        }

        public ConditionBuilder productCateGreaterEqThan(Integer productCateSt){
            this.productCateSt = productCateSt;
            return this;
        }
        public ConditionBuilder productCateLessEqThan(Integer productCateEd){
            this.productCateEd = productCateEd;
            return this;
        }


        public ConditionBuilder productCateList(Integer ... productCate){
            this.productCateList = solveNullList(productCate);
            return this;
        }

        public ConditionBuilder productCateList(List<Integer> productCate){
            this.productCateList = productCate;
            return this;
        }

        public ConditionBuilder fuzzyProductName (List<String> fuzzyProductName){
            this.fuzzyProductName = fuzzyProductName;
            return this;
        }

        public ConditionBuilder fuzzyProductName (String ... fuzzyProductName){
            this.fuzzyProductName = solveNullList(fuzzyProductName);
            return this;
        }

        public ConditionBuilder rightFuzzyProductName (List<String> rightFuzzyProductName){
            this.rightFuzzyProductName = rightFuzzyProductName;
            return this;
        }

        public ConditionBuilder rightFuzzyProductName (String ... rightFuzzyProductName){
            this.rightFuzzyProductName = solveNullList(rightFuzzyProductName);
            return this;
        }

        public ConditionBuilder productNameList(String ... productName){
            this.productNameList = solveNullList(productName);
            return this;
        }

        public ConditionBuilder productNameList(List<String> productName){
            this.productNameList = productName;
            return this;
        }

        public ConditionBuilder fuzzyProductCateName (List<String> fuzzyProductCateName){
            this.fuzzyProductCateName = fuzzyProductCateName;
            return this;
        }

        public ConditionBuilder fuzzyProductCateName (String ... fuzzyProductCateName){
            this.fuzzyProductCateName = solveNullList(fuzzyProductCateName);
            return this;
        }

        public ConditionBuilder rightFuzzyProductCateName (List<String> rightFuzzyProductCateName){
            this.rightFuzzyProductCateName = rightFuzzyProductCateName;
            return this;
        }

        public ConditionBuilder rightFuzzyProductCateName (String ... rightFuzzyProductCateName){
            this.rightFuzzyProductCateName = solveNullList(rightFuzzyProductCateName);
            return this;
        }

        public ConditionBuilder productCateNameList(String ... productCateName){
            this.productCateNameList = solveNullList(productCateName);
            return this;
        }

        public ConditionBuilder productCateNameList(List<String> productCateName){
            this.productCateNameList = productCateName;
            return this;
        }

        public ConditionBuilder fuzzyProductTag (List<String> fuzzyProductTag){
            this.fuzzyProductTag = fuzzyProductTag;
            return this;
        }

        public ConditionBuilder fuzzyProductTag (String ... fuzzyProductTag){
            this.fuzzyProductTag = solveNullList(fuzzyProductTag);
            return this;
        }

        public ConditionBuilder rightFuzzyProductTag (List<String> rightFuzzyProductTag){
            this.rightFuzzyProductTag = rightFuzzyProductTag;
            return this;
        }

        public ConditionBuilder rightFuzzyProductTag (String ... rightFuzzyProductTag){
            this.rightFuzzyProductTag = solveNullList(rightFuzzyProductTag);
            return this;
        }

        public ConditionBuilder productTagList(String ... productTag){
            this.productTagList = solveNullList(productTag);
            return this;
        }

        public ConditionBuilder productTagList(List<String> productTag){
            this.productTagList = productTag;
            return this;
        }

        public ConditionBuilder fuzzyPrincipal (List<String> fuzzyPrincipal){
            this.fuzzyPrincipal = fuzzyPrincipal;
            return this;
        }

        public ConditionBuilder fuzzyPrincipal (String ... fuzzyPrincipal){
            this.fuzzyPrincipal = solveNullList(fuzzyPrincipal);
            return this;
        }

        public ConditionBuilder rightFuzzyPrincipal (List<String> rightFuzzyPrincipal){
            this.rightFuzzyPrincipal = rightFuzzyPrincipal;
            return this;
        }

        public ConditionBuilder rightFuzzyPrincipal (String ... rightFuzzyPrincipal){
            this.rightFuzzyPrincipal = solveNullList(rightFuzzyPrincipal);
            return this;
        }

        public ConditionBuilder principalList(String ... principal){
            this.principalList = solveNullList(principal);
            return this;
        }

        public ConditionBuilder principalList(List<String> principal){
            this.principalList = principal;
            return this;
        }

        public ConditionBuilder fuzzySketch (List<String> fuzzySketch){
            this.fuzzySketch = fuzzySketch;
            return this;
        }

        public ConditionBuilder fuzzySketch (String ... fuzzySketch){
            this.fuzzySketch = solveNullList(fuzzySketch);
            return this;
        }

        public ConditionBuilder rightFuzzySketch (List<String> rightFuzzySketch){
            this.rightFuzzySketch = rightFuzzySketch;
            return this;
        }

        public ConditionBuilder rightFuzzySketch (String ... rightFuzzySketch){
            this.rightFuzzySketch = solveNullList(rightFuzzySketch);
            return this;
        }

        public ConditionBuilder sketchList(String ... sketch){
            this.sketchList = solveNullList(sketch);
            return this;
        }

        public ConditionBuilder sketchList(List<String> sketch){
            this.sketchList = sketch;
            return this;
        }

        public ConditionBuilder fuzzyHotline (List<String> fuzzyHotline){
            this.fuzzyHotline = fuzzyHotline;
            return this;
        }

        public ConditionBuilder fuzzyHotline (String ... fuzzyHotline){
            this.fuzzyHotline = solveNullList(fuzzyHotline);
            return this;
        }

        public ConditionBuilder rightFuzzyHotline (List<String> rightFuzzyHotline){
            this.rightFuzzyHotline = rightFuzzyHotline;
            return this;
        }

        public ConditionBuilder rightFuzzyHotline (String ... rightFuzzyHotline){
            this.rightFuzzyHotline = solveNullList(rightFuzzyHotline);
            return this;
        }

        public ConditionBuilder hotlineList(String ... hotline){
            this.hotlineList = solveNullList(hotline);
            return this;
        }

        public ConditionBuilder hotlineList(List<String> hotline){
            this.hotlineList = hotline;
            return this;
        }

        public ConditionBuilder notmobileBetWeen(Integer notmobileSt,Integer notmobileEd){
            this.notmobileSt = notmobileSt;
            this.notmobileEd = notmobileEd;
            return this;
        }

        public ConditionBuilder notmobileGreaterEqThan(Integer notmobileSt){
            this.notmobileSt = notmobileSt;
            return this;
        }
        public ConditionBuilder notmobileLessEqThan(Integer notmobileEd){
            this.notmobileEd = notmobileEd;
            return this;
        }


        public ConditionBuilder notmobileList(Integer ... notmobile){
            this.notmobileList = solveNullList(notmobile);
            return this;
        }

        public ConditionBuilder notmobileList(List<Integer> notmobile){
            this.notmobileList = notmobile;
            return this;
        }

        public ConditionBuilder fuzzyOperate (List<String> fuzzyOperate){
            this.fuzzyOperate = fuzzyOperate;
            return this;
        }

        public ConditionBuilder fuzzyOperate (String ... fuzzyOperate){
            this.fuzzyOperate = solveNullList(fuzzyOperate);
            return this;
        }

        public ConditionBuilder rightFuzzyOperate (List<String> rightFuzzyOperate){
            this.rightFuzzyOperate = rightFuzzyOperate;
            return this;
        }

        public ConditionBuilder rightFuzzyOperate (String ... rightFuzzyOperate){
            this.rightFuzzyOperate = solveNullList(rightFuzzyOperate);
            return this;
        }

        public ConditionBuilder operateList(String ... operate){
            this.operateList = solveNullList(operate);
            return this;
        }

        public ConditionBuilder operateList(List<String> operate){
            this.operateList = operate;
            return this;
        }

        public ConditionBuilder fuzzyImages (List<String> fuzzyImages){
            this.fuzzyImages = fuzzyImages;
            return this;
        }

        public ConditionBuilder fuzzyImages (String ... fuzzyImages){
            this.fuzzyImages = solveNullList(fuzzyImages);
            return this;
        }

        public ConditionBuilder rightFuzzyImages (List<String> rightFuzzyImages){
            this.rightFuzzyImages = rightFuzzyImages;
            return this;
        }

        public ConditionBuilder rightFuzzyImages (String ... rightFuzzyImages){
            this.rightFuzzyImages = solveNullList(rightFuzzyImages);
            return this;
        }

        public ConditionBuilder imagesList(String ... images){
            this.imagesList = solveNullList(images);
            return this;
        }

        public ConditionBuilder imagesList(List<String> images){
            this.imagesList = images;
            return this;
        }

        public ConditionBuilder viewsBetWeen(Integer viewsSt,Integer viewsEd){
            this.viewsSt = viewsSt;
            this.viewsEd = viewsEd;
            return this;
        }

        public ConditionBuilder viewsGreaterEqThan(Integer viewsSt){
            this.viewsSt = viewsSt;
            return this;
        }
        public ConditionBuilder viewsLessEqThan(Integer viewsEd){
            this.viewsEd = viewsEd;
            return this;
        }


        public ConditionBuilder viewsList(Integer ... views){
            this.viewsList = solveNullList(views);
            return this;
        }

        public ConditionBuilder viewsList(List<Integer> views){
            this.viewsList = views;
            return this;
        }

        public ConditionBuilder commentsBetWeen(Integer commentsSt,Integer commentsEd){
            this.commentsSt = commentsSt;
            this.commentsEd = commentsEd;
            return this;
        }

        public ConditionBuilder commentsGreaterEqThan(Integer commentsSt){
            this.commentsSt = commentsSt;
            return this;
        }
        public ConditionBuilder commentsLessEqThan(Integer commentsEd){
            this.commentsEd = commentsEd;
            return this;
        }


        public ConditionBuilder commentsList(Integer ... comments){
            this.commentsList = solveNullList(comments);
            return this;
        }

        public ConditionBuilder commentsList(List<Integer> comments){
            this.commentsList = comments;
            return this;
        }

        public ConditionBuilder buyfewBetWeen(Integer buyfewSt,Integer buyfewEd){
            this.buyfewSt = buyfewSt;
            this.buyfewEd = buyfewEd;
            return this;
        }

        public ConditionBuilder buyfewGreaterEqThan(Integer buyfewSt){
            this.buyfewSt = buyfewSt;
            return this;
        }
        public ConditionBuilder buyfewLessEqThan(Integer buyfewEd){
            this.buyfewEd = buyfewEd;
            return this;
        }


        public ConditionBuilder buyfewList(Integer ... buyfew){
            this.buyfewList = solveNullList(buyfew);
            return this;
        }

        public ConditionBuilder buyfewList(List<Integer> buyfew){
            this.buyfewList = buyfew;
            return this;
        }

        public ConditionBuilder commissionRatioBetWeen(Double commissionRatioSt,Double commissionRatioEd){
            this.commissionRatioSt = commissionRatioSt;
            this.commissionRatioEd = commissionRatioEd;
            return this;
        }

        public ConditionBuilder commissionRatioGreaterEqThan(Double commissionRatioSt){
            this.commissionRatioSt = commissionRatioSt;
            return this;
        }
        public ConditionBuilder commissionRatioLessEqThan(Double commissionRatioEd){
            this.commissionRatioEd = commissionRatioEd;
            return this;
        }


        public ConditionBuilder commissionRatioList(Double ... commissionRatio){
            this.commissionRatioList = solveNullList(commissionRatio);
            return this;
        }

        public ConditionBuilder commissionRatioList(List<Double> commissionRatio){
            this.commissionRatioList = commissionRatio;
            return this;
        }

        public ConditionBuilder addtimeBetWeen(java.time.LocalDateTime addtimeSt,java.time.LocalDateTime addtimeEd){
            this.addtimeSt = addtimeSt;
            this.addtimeEd = addtimeEd;
            return this;
        }

        public ConditionBuilder addtimeGreaterEqThan(java.time.LocalDateTime addtimeSt){
            this.addtimeSt = addtimeSt;
            return this;
        }
        public ConditionBuilder addtimeLessEqThan(java.time.LocalDateTime addtimeEd){
            this.addtimeEd = addtimeEd;
            return this;
        }


        public ConditionBuilder addtimeList(java.time.LocalDateTime ... addtime){
            this.addtimeList = solveNullList(addtime);
            return this;
        }

        public ConditionBuilder addtimeList(List<java.time.LocalDateTime> addtime){
            this.addtimeList = addtime;
            return this;
        }

        public ConditionBuilder isshowBetWeen(Integer isshowSt,Integer isshowEd){
            this.isshowSt = isshowSt;
            this.isshowEd = isshowEd;
            return this;
        }

        public ConditionBuilder isshowGreaterEqThan(Integer isshowSt){
            this.isshowSt = isshowSt;
            return this;
        }
        public ConditionBuilder isshowLessEqThan(Integer isshowEd){
            this.isshowEd = isshowEd;
            return this;
        }


        public ConditionBuilder isshowList(Integer ... isshow){
            this.isshowList = solveNullList(isshow);
            return this;
        }

        public ConditionBuilder isshowList(List<Integer> isshow){
            this.isshowList = isshow;
            return this;
        }

        public ConditionBuilder isdelBetWeen(Integer isdelSt,Integer isdelEd){
            this.isdelSt = isdelSt;
            this.isdelEd = isdelEd;
            return this;
        }

        public ConditionBuilder isdelGreaterEqThan(Integer isdelSt){
            this.isdelSt = isdelSt;
            return this;
        }
        public ConditionBuilder isdelLessEqThan(Integer isdelEd){
            this.isdelEd = isdelEd;
            return this;
        }


        public ConditionBuilder isdelList(Integer ... isdel){
            this.isdelList = solveNullList(isdel);
            return this;
        }

        public ConditionBuilder isdelList(List<Integer> isdel){
            this.isdelList = isdel;
            return this;
        }

        public ConditionBuilder fuzzyPrice (List<String> fuzzyPrice){
            this.fuzzyPrice = fuzzyPrice;
            return this;
        }

        public ConditionBuilder fuzzyPrice (String ... fuzzyPrice){
            this.fuzzyPrice = solveNullList(fuzzyPrice);
            return this;
        }

        public ConditionBuilder rightFuzzyPrice (List<String> rightFuzzyPrice){
            this.rightFuzzyPrice = rightFuzzyPrice;
            return this;
        }

        public ConditionBuilder rightFuzzyPrice (String ... rightFuzzyPrice){
            this.rightFuzzyPrice = solveNullList(rightFuzzyPrice);
            return this;
        }

        public ConditionBuilder priceList(String ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<String> price){
            this.priceList = price;
            return this;
        }

        public ConditionBuilder fuzzySecurity (List<String> fuzzySecurity){
            this.fuzzySecurity = fuzzySecurity;
            return this;
        }

        public ConditionBuilder fuzzySecurity (String ... fuzzySecurity){
            this.fuzzySecurity = solveNullList(fuzzySecurity);
            return this;
        }

        public ConditionBuilder rightFuzzySecurity (List<String> rightFuzzySecurity){
            this.rightFuzzySecurity = rightFuzzySecurity;
            return this;
        }

        public ConditionBuilder rightFuzzySecurity (String ... rightFuzzySecurity){
            this.rightFuzzySecurity = solveNullList(rightFuzzySecurity);
            return this;
        }

        public ConditionBuilder securityList(String ... security){
            this.securityList = solveNullList(security);
            return this;
        }

        public ConditionBuilder securityList(List<String> security){
            this.securityList = security;
            return this;
        }

        public ConditionBuilder fuzzyTrip (List<String> fuzzyTrip){
            this.fuzzyTrip = fuzzyTrip;
            return this;
        }

        public ConditionBuilder fuzzyTrip (String ... fuzzyTrip){
            this.fuzzyTrip = solveNullList(fuzzyTrip);
            return this;
        }

        public ConditionBuilder rightFuzzyTrip (List<String> rightFuzzyTrip){
            this.rightFuzzyTrip = rightFuzzyTrip;
            return this;
        }

        public ConditionBuilder rightFuzzyTrip (String ... rightFuzzyTrip){
            this.rightFuzzyTrip = solveNullList(rightFuzzyTrip);
            return this;
        }

        public ConditionBuilder tripList(String ... trip){
            this.tripList = solveNullList(trip);
            return this;
        }

        public ConditionBuilder tripList(List<String> trip){
            this.tripList = trip;
            return this;
        }

        public ConditionBuilder fuzzyOrigin (List<String> fuzzyOrigin){
            this.fuzzyOrigin = fuzzyOrigin;
            return this;
        }

        public ConditionBuilder fuzzyOrigin (String ... fuzzyOrigin){
            this.fuzzyOrigin = solveNullList(fuzzyOrigin);
            return this;
        }

        public ConditionBuilder rightFuzzyOrigin (List<String> rightFuzzyOrigin){
            this.rightFuzzyOrigin = rightFuzzyOrigin;
            return this;
        }

        public ConditionBuilder rightFuzzyOrigin (String ... rightFuzzyOrigin){
            this.rightFuzzyOrigin = solveNullList(rightFuzzyOrigin);
            return this;
        }

        public ConditionBuilder originList(String ... origin){
            this.originList = solveNullList(origin);
            return this;
        }

        public ConditionBuilder originList(List<String> origin){
            this.originList = origin;
            return this;
        }

        public ConditionBuilder fuzzyDestination (List<String> fuzzyDestination){
            this.fuzzyDestination = fuzzyDestination;
            return this;
        }

        public ConditionBuilder fuzzyDestination (String ... fuzzyDestination){
            this.fuzzyDestination = solveNullList(fuzzyDestination);
            return this;
        }

        public ConditionBuilder rightFuzzyDestination (List<String> rightFuzzyDestination){
            this.rightFuzzyDestination = rightFuzzyDestination;
            return this;
        }

        public ConditionBuilder rightFuzzyDestination (String ... rightFuzzyDestination){
            this.rightFuzzyDestination = solveNullList(rightFuzzyDestination);
            return this;
        }

        public ConditionBuilder destinationList(String ... destination){
            this.destinationList = solveNullList(destination);
            return this;
        }

        public ConditionBuilder destinationList(List<String> destination){
            this.destinationList = destination;
            return this;
        }

        public ConditionBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public ConditionBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public ConditionBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public ConditionBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public ConditionBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public ConditionBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Product obj;

        public Builder(){
            this.obj = new Product();
        }

        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder productNo(String productNo){
            this.obj.setProductNo(productNo);
            return this;
        }
        public Builder productCate(Integer productCate){
            this.obj.setProductCate(productCate);
            return this;
        }
        public Builder productName(String productName){
            this.obj.setProductName(productName);
            return this;
        }
        public Builder productCateName(String productCateName){
            this.obj.setProductCateName(productCateName);
            return this;
        }
        public Builder productTag(String productTag){
            this.obj.setProductTag(productTag);
            return this;
        }
        public Builder principal(String principal){
            this.obj.setPrincipal(principal);
            return this;
        }
        public Builder sketch(String sketch){
            this.obj.setSketch(sketch);
            return this;
        }
        public Builder hotline(String hotline){
            this.obj.setHotline(hotline);
            return this;
        }
        public Builder notmobile(Integer notmobile){
            this.obj.setNotmobile(notmobile);
            return this;
        }
        public Builder operate(String operate){
            this.obj.setOperate(operate);
            return this;
        }
        public Builder images(String images){
            this.obj.setImages(images);
            return this;
        }
        public Builder views(Integer views){
            this.obj.setViews(views);
            return this;
        }
        public Builder comments(Integer comments){
            this.obj.setComments(comments);
            return this;
        }
        public Builder buyfew(Integer buyfew){
            this.obj.setBuyfew(buyfew);
            return this;
        }
        public Builder commissionRatio(Double commissionRatio){
            this.obj.setCommissionRatio(commissionRatio);
            return this;
        }
        public Builder addtime(java.time.LocalDateTime addtime){
            this.obj.setAddtime(addtime);
            return this;
        }
        public Builder isshow(Integer isshow){
            this.obj.setIsshow(isshow);
            return this;
        }
        public Builder isdel(Integer isdel){
            this.obj.setIsdel(isdel);
            return this;
        }
        public Builder price(String price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder security(String security){
            this.obj.setSecurity(security);
            return this;
        }
        public Builder trip(String trip){
            this.obj.setTrip(trip);
            return this;
        }
        public Builder origin(String origin){
            this.obj.setOrigin(origin);
            return this;
        }
        public Builder destination(String destination){
            this.obj.setDestination(destination);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public Product build(){return obj;}
    }

}
