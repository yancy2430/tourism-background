package com.tdeado.tourism.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class Notice implements Serializable {

    private static final long serialVersionUID = 1527847449415L;

    public Notice() {
    }

    public Notice( Integer userId, Integer noticeType, String title, String content, Integer check, LocalDateTime addtime) {
        this.userId = userId;
        this.noticeType = noticeType;
        this.title = title;
        this.content = content;
        this.check = check;
        this.addtime = addtime;
    }

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 用户id
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 1订单 
    * isNullAble:0
    */
    private Integer noticeType;

    /**
    * 通知标题
    * isNullAble:0,defaultVal:
    */
    private String title;

    /**
    * 通知内容
    * isNullAble:0,defaultVal:
    */
    private String content;

    /**
    * 是否查看
    * isNullAble:0
    */
    private Integer check;

    /**
    * 通知时间
    * isNullAble:0
    */
    private java.time.LocalDateTime addtime;


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

    public void setNoticeType(Integer noticeType){
        this.noticeType = noticeType;
    }

    public Integer getNoticeType(){
        return this.noticeType;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void setCheck(Integer check){
        this.check = check;
    }

    public Integer getCheck(){
        return this.check;
    }

    public void setAddtime(java.time.LocalDateTime addtime){
        this.addtime = addtime;
    }

    public java.time.LocalDateTime getAddtime(){
        return this.addtime;
    }
    @Override
    public String toString() {
        return "Notice{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                "noticeType='" + noticeType + '\'' +
                "title='" + title + '\'' +
                "content='" + content + '\'' +
                "check='" + check + '\'' +
                "addtime='" + addtime + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Notice{
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

        private List<Integer> noticeTypeList;

        private Integer noticeTypeSt;

        private Integer noticeTypeEd;

        public Integer getNoticeTypeSt(){
            return this.noticeTypeSt;
        }

        public Integer getNoticeTypeEd(){
            return this.noticeTypeEd;
        }

        private List<String> titleList;


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){
            return this.fuzzyTitle;
        }

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){
            return this.rightFuzzyTitle;
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
        private List<Integer> checkList;

        private Integer checkSt;

        private Integer checkEd;

        public Integer getCheckSt(){
            return this.checkSt;
        }

        public Integer getCheckEd(){
            return this.checkEd;
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



        public QueryBuilder noticeTypeBetWeen(Integer noticeTypeSt,Integer noticeTypeEd){
            this.noticeTypeSt = noticeTypeSt;
            this.noticeTypeEd = noticeTypeEd;
            return this;
        }

        public QueryBuilder noticeTypeGreaterEqThan(Integer noticeTypeSt){
            this.noticeTypeSt = noticeTypeSt;
            return this;
        }
        public QueryBuilder noticeTypeLessEqThan(Integer noticeTypeEd){
            this.noticeTypeEd = noticeTypeEd;
            return this;
        }


        public QueryBuilder noticeType(Integer noticeType){
            setNoticeType(noticeType);
            return this;
        }

        public QueryBuilder noticeTypeList(Integer ... noticeType){
            if (noticeType != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : noticeType){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.noticeTypeList = list;
            }

            return this;
        }

        public QueryBuilder noticeTypeList(List<Integer> noticeType){
            this.noticeTypeList = noticeType;
            return this;
        }

        public QueryBuilder fetchNoticeType(){
            setFetchFields("fetchFields","noticeType");
            return this;
        }

        public QueryBuilder excludeNoticeType(){
            setFetchFields("excludeFields","noticeType");
            return this;
        }



        public QueryBuilder fuzzyTitle (List<String> fuzzyTitle){
            this.fuzzyTitle = fuzzyTitle;
            return this;
        }

        public QueryBuilder fuzzyTitle (String ... fuzzyTitle){
            if (fuzzyTitle != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyTitle){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyTitle = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyTitle (List<String> rightFuzzyTitle){
            this.rightFuzzyTitle = rightFuzzyTitle;
            return this;
        }

        public QueryBuilder rightFuzzyTitle (String ... rightFuzzyTitle){
            if (rightFuzzyTitle != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyTitle){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyTitle = list;
            }
            return this;
        }

        public QueryBuilder title(String title){
            setTitle(title);
            return this;
        }

        public QueryBuilder titleList(String ... title){
            if (title != null){
                List<String> list = new ArrayList<>();
                for (String item : title){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.titleList = list;
            }

            return this;
        }

        public QueryBuilder titleList(List<String> title){
            this.titleList = title;
            return this;
        }

        public QueryBuilder fetchTitle(){
            setFetchFields("fetchFields","title");
            return this;
        }

        public QueryBuilder excludeTitle(){
            setFetchFields("excludeFields","title");
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



        public QueryBuilder checkBetWeen(Integer checkSt,Integer checkEd){
            this.checkSt = checkSt;
            this.checkEd = checkEd;
            return this;
        }

        public QueryBuilder checkGreaterEqThan(Integer checkSt){
            this.checkSt = checkSt;
            return this;
        }
        public QueryBuilder checkLessEqThan(Integer checkEd){
            this.checkEd = checkEd;
            return this;
        }


        public QueryBuilder check(Integer check){
            setCheck(check);
            return this;
        }

        public QueryBuilder checkList(Integer ... check){
            if (check != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : check){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.checkList = list;
            }

            return this;
        }

        public QueryBuilder checkList(List<Integer> check){
            this.checkList = check;
            return this;
        }

        public QueryBuilder fetchCheck(){
            setFetchFields("fetchFields","check");
            return this;
        }

        public QueryBuilder excludeCheck(){
            setFetchFields("excludeFields","check");
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

        public Notice build(){
            return this;
        }
    }

}
