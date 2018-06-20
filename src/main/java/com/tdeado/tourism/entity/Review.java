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
public class Review implements Serializable {

    private static final long serialVersionUID = 1525343322648L;


    /**
    * 主键
    * 自增ID
    * isNullAble:0
    */
    private Integer reviewId;

    /**
    * 所属订单
    * isNullAble:1
    */
    private Integer orderId;

    /**
    * 所属产品ID
    * isNullAble:1
    */
    private Integer productId;

    /**
    * 评论内容
    * isNullAble:1
    */
    private String content;

    /**
    * 
    * isNullAble:1
    */
    private Integer score1;

    /**
    * 
    * isNullAble:1
    */
    private Integer score2;

    /**
    * 
    * isNullAble:1
    */
    private Integer score3;

    /**
    * 
    * isNullAble:1
    */
    private Integer score4;

    /**
    * 
    * isNullAble:1
    */
    private Integer score5;

    /**
    * 
    * isNullAble:1
    */
    private Integer userId;


    public void setReviewId(Integer reviewId){
        this.reviewId = reviewId;
    }

    public Integer getReviewId(){
        return this.reviewId;
    }

    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }

    public Integer getOrderId(){
        return this.orderId;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void setScore1(Integer score1){
        this.score1 = score1;
    }

    public Integer getScore1(){
        return this.score1;
    }

    public void setScore2(Integer score2){
        this.score2 = score2;
    }

    public Integer getScore2(){
        return this.score2;
    }

    public void setScore3(Integer score3){
        this.score3 = score3;
    }

    public Integer getScore3(){
        return this.score3;
    }

    public void setScore4(Integer score4){
        this.score4 = score4;
    }

    public Integer getScore4(){
        return this.score4;
    }

    public void setScore5(Integer score5){
        this.score5 = score5;
    }

    public Integer getScore5(){
        return this.score5;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return this.userId;
    }
    @Override
    public String toString() {
        return "Review{" +
                "reviewId='" + reviewId + '\'' +
                "orderId='" + orderId + '\'' +
                "productId='" + productId + '\'' +
                "content='" + content + '\'' +
                "score1='" + score1 + '\'' +
                "score2='" + score2 + '\'' +
                "score3='" + score3 + '\'' +
                "score4='" + score4 + '\'' +
                "score5='" + score5 + '\'' +
                "userId='" + userId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Review{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> reviewIdList;

        private Integer reviewIdSt;

        private Integer reviewIdEd;

        public Integer getReviewIdSt(){
            return this.reviewIdSt;
        }

        public Integer getReviewIdEd(){
            return this.reviewIdEd;
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

        private List<Integer> productIdList;

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){
            return this.productIdSt;
        }

        public Integer getProductIdEd(){
            return this.productIdEd;
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
        private List<Integer> score1List;

        private Integer score1St;

        private Integer score1Ed;

        public Integer getScore1St(){
            return this.score1St;
        }

        public Integer getScore1Ed(){
            return this.score1Ed;
        }

        private List<Integer> score2List;

        private Integer score2St;

        private Integer score2Ed;

        public Integer getScore2St(){
            return this.score2St;
        }

        public Integer getScore2Ed(){
            return this.score2Ed;
        }

        private List<Integer> score3List;

        private Integer score3St;

        private Integer score3Ed;

        public Integer getScore3St(){
            return this.score3St;
        }

        public Integer getScore3Ed(){
            return this.score3Ed;
        }

        private List<Integer> score4List;

        private Integer score4St;

        private Integer score4Ed;

        public Integer getScore4St(){
            return this.score4St;
        }

        public Integer getScore4Ed(){
            return this.score4Ed;
        }

        private List<Integer> score5List;

        private Integer score5St;

        private Integer score5Ed;

        public Integer getScore5St(){
            return this.score5St;
        }

        public Integer getScore5Ed(){
            return this.score5Ed;
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


        public QueryBuilder reviewIdBetWeen(Integer reviewIdSt,Integer reviewIdEd){
            this.reviewIdSt = reviewIdSt;
            this.reviewIdEd = reviewIdEd;
            return this;
        }

        public QueryBuilder reviewIdGreaterEqThan(Integer reviewIdSt){
            this.reviewIdSt = reviewIdSt;
            return this;
        }
        public QueryBuilder reviewIdLessEqThan(Integer reviewIdEd){
            this.reviewIdEd = reviewIdEd;
            return this;
        }


        public QueryBuilder reviewId(Integer reviewId){
            setReviewId(reviewId);
            return this;
        }

        public QueryBuilder reviewIdList(Integer ... reviewId){
            if (reviewId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : reviewId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.reviewIdList = list;
            }

            return this;
        }

        public QueryBuilder reviewIdList(List<Integer> reviewId){
            this.reviewIdList = reviewId;
            return this;
        }

        public QueryBuilder fetchReviewId(){
            setFetchFields("fetchFields","reviewId");
            return this;
        }

        public QueryBuilder excludeReviewId(){
            setFetchFields("excludeFields","reviewId");
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



        public QueryBuilder score1BetWeen(Integer score1St,Integer score1Ed){
            this.score1St = score1St;
            this.score1Ed = score1Ed;
            return this;
        }

        public QueryBuilder score1GreaterEqThan(Integer score1St){
            this.score1St = score1St;
            return this;
        }
        public QueryBuilder score1LessEqThan(Integer score1Ed){
            this.score1Ed = score1Ed;
            return this;
        }


        public QueryBuilder score1(Integer score1){
            setScore1(score1);
            return this;
        }

        public QueryBuilder score1List(Integer ... score1){
            if (score1 != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : score1){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.score1List = list;
            }

            return this;
        }

        public QueryBuilder score1List(List<Integer> score1){
            this.score1List = score1;
            return this;
        }

        public QueryBuilder fetchScore1(){
            setFetchFields("fetchFields","score1");
            return this;
        }

        public QueryBuilder excludeScore1(){
            setFetchFields("excludeFields","score1");
            return this;
        }



        public QueryBuilder score2BetWeen(Integer score2St,Integer score2Ed){
            this.score2St = score2St;
            this.score2Ed = score2Ed;
            return this;
        }

        public QueryBuilder score2GreaterEqThan(Integer score2St){
            this.score2St = score2St;
            return this;
        }
        public QueryBuilder score2LessEqThan(Integer score2Ed){
            this.score2Ed = score2Ed;
            return this;
        }


        public QueryBuilder score2(Integer score2){
            setScore2(score2);
            return this;
        }

        public QueryBuilder score2List(Integer ... score2){
            if (score2 != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : score2){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.score2List = list;
            }

            return this;
        }

        public QueryBuilder score2List(List<Integer> score2){
            this.score2List = score2;
            return this;
        }

        public QueryBuilder fetchScore2(){
            setFetchFields("fetchFields","score2");
            return this;
        }

        public QueryBuilder excludeScore2(){
            setFetchFields("excludeFields","score2");
            return this;
        }



        public QueryBuilder score3BetWeen(Integer score3St,Integer score3Ed){
            this.score3St = score3St;
            this.score3Ed = score3Ed;
            return this;
        }

        public QueryBuilder score3GreaterEqThan(Integer score3St){
            this.score3St = score3St;
            return this;
        }
        public QueryBuilder score3LessEqThan(Integer score3Ed){
            this.score3Ed = score3Ed;
            return this;
        }


        public QueryBuilder score3(Integer score3){
            setScore3(score3);
            return this;
        }

        public QueryBuilder score3List(Integer ... score3){
            if (score3 != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : score3){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.score3List = list;
            }

            return this;
        }

        public QueryBuilder score3List(List<Integer> score3){
            this.score3List = score3;
            return this;
        }

        public QueryBuilder fetchScore3(){
            setFetchFields("fetchFields","score3");
            return this;
        }

        public QueryBuilder excludeScore3(){
            setFetchFields("excludeFields","score3");
            return this;
        }



        public QueryBuilder score4BetWeen(Integer score4St,Integer score4Ed){
            this.score4St = score4St;
            this.score4Ed = score4Ed;
            return this;
        }

        public QueryBuilder score4GreaterEqThan(Integer score4St){
            this.score4St = score4St;
            return this;
        }
        public QueryBuilder score4LessEqThan(Integer score4Ed){
            this.score4Ed = score4Ed;
            return this;
        }


        public QueryBuilder score4(Integer score4){
            setScore4(score4);
            return this;
        }

        public QueryBuilder score4List(Integer ... score4){
            if (score4 != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : score4){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.score4List = list;
            }

            return this;
        }

        public QueryBuilder score4List(List<Integer> score4){
            this.score4List = score4;
            return this;
        }

        public QueryBuilder fetchScore4(){
            setFetchFields("fetchFields","score4");
            return this;
        }

        public QueryBuilder excludeScore4(){
            setFetchFields("excludeFields","score4");
            return this;
        }



        public QueryBuilder score5BetWeen(Integer score5St,Integer score5Ed){
            this.score5St = score5St;
            this.score5Ed = score5Ed;
            return this;
        }

        public QueryBuilder score5GreaterEqThan(Integer score5St){
            this.score5St = score5St;
            return this;
        }
        public QueryBuilder score5LessEqThan(Integer score5Ed){
            this.score5Ed = score5Ed;
            return this;
        }


        public QueryBuilder score5(Integer score5){
            setScore5(score5);
            return this;
        }

        public QueryBuilder score5List(Integer ... score5){
            if (score5 != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : score5){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.score5List = list;
            }

            return this;
        }

        public QueryBuilder score5List(List<Integer> score5){
            this.score5List = score5;
            return this;
        }

        public QueryBuilder fetchScore5(){
            setFetchFields("fetchFields","score5");
            return this;
        }

        public QueryBuilder excludeScore5(){
            setFetchFields("excludeFields","score5");
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

        public Review build(){
            return this;
        }
    }

}
