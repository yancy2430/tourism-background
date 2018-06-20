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
public class Slideshow implements Serializable {

    private static final long serialVersionUID = 1526910980855L;


    /**
    * 主键
    * 幻灯ID
    * isNullAble:0
    */
    private Integer slideId;

    /**
    * 图片地址
    * isNullAble:1
    */
    private String image;

    /**
    * 链接类型
    * isNullAble:1
    */
    private Integer type;

    /**
    * H5跳转链接
    * isNullAble:1
    */
    private String url;

    /**
    * 产品ID
    * isNullAble:1
    */
    private Integer productId;

    /**
    * 产品排序
    * isNullAble:1
    */
    private Integer sort;

    /**
    * 是否显示
    * isNullAble:1
    */
    private Integer isshow;

    /**
    * 显示的城市，用|隔开
    * isNullAble:1
    */
    private String areas;

    /**
    * 开始时间
    * isNullAble:1
    */
    private java.time.LocalDateTime starttime;

    /**
    * 结束时间
    * isNullAble:1
    */
    private java.time.LocalDateTime endtime;

    /**
    * 
    * isNullAble:1
    */
    private String name;


    public void setSlideId(Integer slideId){
        this.slideId = slideId;
    }

    public Integer getSlideId(){
        return this.slideId;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getImage(){
        return this.image;
    }

    public void setType(Integer type){
        this.type = type;
    }

    public Integer getType(){
        return this.type;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl(){
        return this.url;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
    }

    public void setSort(Integer sort){
        this.sort = sort;
    }

    public Integer getSort(){
        return this.sort;
    }

    public void setIsshow(Integer isshow){
        this.isshow = isshow;
    }

    public Integer getIsshow(){
        return this.isshow;
    }

    public void setAreas(String areas){
        this.areas = areas;
    }

    public String getAreas(){
        return this.areas;
    }

    public void setStarttime(java.time.LocalDateTime starttime){
        this.starttime = starttime;
    }

    public java.time.LocalDateTime getStarttime(){
        return this.starttime;
    }

    public void setEndtime(java.time.LocalDateTime endtime){
        this.endtime = endtime;
    }

    public java.time.LocalDateTime getEndtime(){
        return this.endtime;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "Slideshow{" +
                "slideId='" + slideId + '\'' +
                "image='" + image + '\'' +
                "type='" + type + '\'' +
                "url='" + url + '\'' +
                "productId='" + productId + '\'' +
                "sort='" + sort + '\'' +
                "isshow='" + isshow + '\'' +
                "areas='" + areas + '\'' +
                "starttime='" + starttime + '\'' +
                "endtime='" + endtime + '\'' +
                "name='" + name + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Slideshow{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> slideIdList;

        private Integer slideIdSt;

        private Integer slideIdEd;

        public Integer getSlideIdSt(){
            return this.slideIdSt;
        }

        public Integer getSlideIdEd(){
            return this.slideIdEd;
        }

        private List<String> imageList;


        private List<String> fuzzyImage;

        public List<String> getFuzzyImage(){
            return this.fuzzyImage;
        }

        private List<String> rightFuzzyImage;

        public List<String> getRightFuzzyImage(){
            return this.rightFuzzyImage;
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

        private List<String> urlList;


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){
            return this.fuzzyUrl;
        }

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){
            return this.rightFuzzyUrl;
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

        private List<Integer> sortList;

        private Integer sortSt;

        private Integer sortEd;

        public Integer getSortSt(){
            return this.sortSt;
        }

        public Integer getSortEd(){
            return this.sortEd;
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

        private List<String> areasList;


        private List<String> fuzzyAreas;

        public List<String> getFuzzyAreas(){
            return this.fuzzyAreas;
        }

        private List<String> rightFuzzyAreas;

        public List<String> getRightFuzzyAreas(){
            return this.rightFuzzyAreas;
        }
        private List<java.time.LocalDateTime> starttimeList;

        private java.time.LocalDateTime starttimeSt;

        private java.time.LocalDateTime starttimeEd;

        public java.time.LocalDateTime getStarttimeSt(){
            return this.starttimeSt;
        }

        public java.time.LocalDateTime getStarttimeEd(){
            return this.starttimeEd;
        }

        private List<java.time.LocalDateTime> endtimeList;

        private java.time.LocalDateTime endtimeSt;

        private java.time.LocalDateTime endtimeEd;

        public java.time.LocalDateTime getEndtimeSt(){
            return this.endtimeSt;
        }

        public java.time.LocalDateTime getEndtimeEd(){
            return this.endtimeEd;
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
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder slideIdBetWeen(Integer slideIdSt,Integer slideIdEd){
            this.slideIdSt = slideIdSt;
            this.slideIdEd = slideIdEd;
            return this;
        }

        public QueryBuilder slideIdGreaterEqThan(Integer slideIdSt){
            this.slideIdSt = slideIdSt;
            return this;
        }
        public QueryBuilder slideIdLessEqThan(Integer slideIdEd){
            this.slideIdEd = slideIdEd;
            return this;
        }


        public QueryBuilder slideId(Integer slideId){
            setSlideId(slideId);
            return this;
        }

        public QueryBuilder slideIdList(Integer ... slideId){
            if (slideId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : slideId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.slideIdList = list;
            }

            return this;
        }

        public QueryBuilder slideIdList(List<Integer> slideId){
            this.slideIdList = slideId;
            return this;
        }

        public QueryBuilder fetchSlideId(){
            setFetchFields("fetchFields","slideId");
            return this;
        }

        public QueryBuilder excludeSlideId(){
            setFetchFields("excludeFields","slideId");
            return this;
        }



        public QueryBuilder fuzzyImage (List<String> fuzzyImage){
            this.fuzzyImage = fuzzyImage;
            return this;
        }

        public QueryBuilder fuzzyImage (String ... fuzzyImage){
            if (fuzzyImage != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyImage){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyImage = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyImage (List<String> rightFuzzyImage){
            this.rightFuzzyImage = rightFuzzyImage;
            return this;
        }

        public QueryBuilder rightFuzzyImage (String ... rightFuzzyImage){
            if (rightFuzzyImage != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyImage){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyImage = list;
            }
            return this;
        }

        public QueryBuilder image(String image){
            setImage(image);
            return this;
        }

        public QueryBuilder imageList(String ... image){
            if (image != null){
                List<String> list = new ArrayList<>();
                for (String item : image){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.imageList = list;
            }

            return this;
        }

        public QueryBuilder imageList(List<String> image){
            this.imageList = image;
            return this;
        }

        public QueryBuilder fetchImage(){
            setFetchFields("fetchFields","image");
            return this;
        }

        public QueryBuilder excludeImage(){
            setFetchFields("excludeFields","image");
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



        public QueryBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public QueryBuilder fuzzyUrl (String ... fuzzyUrl){
            if (fuzzyUrl != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUrl){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUrl = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public QueryBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            if (rightFuzzyUrl != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUrl){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUrl = list;
            }
            return this;
        }

        public QueryBuilder url(String url){
            setUrl(url);
            return this;
        }

        public QueryBuilder urlList(String ... url){
            if (url != null){
                List<String> list = new ArrayList<>();
                for (String item : url){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.urlList = list;
            }

            return this;
        }

        public QueryBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public QueryBuilder fetchUrl(){
            setFetchFields("fetchFields","url");
            return this;
        }

        public QueryBuilder excludeUrl(){
            setFetchFields("excludeFields","url");
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



        public QueryBuilder sortBetWeen(Integer sortSt,Integer sortEd){
            this.sortSt = sortSt;
            this.sortEd = sortEd;
            return this;
        }

        public QueryBuilder sortGreaterEqThan(Integer sortSt){
            this.sortSt = sortSt;
            return this;
        }
        public QueryBuilder sortLessEqThan(Integer sortEd){
            this.sortEd = sortEd;
            return this;
        }


        public QueryBuilder sort(Integer sort){
            setSort(sort);
            return this;
        }

        public QueryBuilder sortList(Integer ... sort){
            if (sort != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : sort){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.sortList = list;
            }

            return this;
        }

        public QueryBuilder sortList(List<Integer> sort){
            this.sortList = sort;
            return this;
        }

        public QueryBuilder fetchSort(){
            setFetchFields("fetchFields","sort");
            return this;
        }

        public QueryBuilder excludeSort(){
            setFetchFields("excludeFields","sort");
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



        public QueryBuilder fuzzyAreas (List<String> fuzzyAreas){
            this.fuzzyAreas = fuzzyAreas;
            return this;
        }

        public QueryBuilder fuzzyAreas (String ... fuzzyAreas){
            if (fuzzyAreas != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyAreas){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyAreas = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyAreas (List<String> rightFuzzyAreas){
            this.rightFuzzyAreas = rightFuzzyAreas;
            return this;
        }

        public QueryBuilder rightFuzzyAreas (String ... rightFuzzyAreas){
            if (rightFuzzyAreas != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyAreas){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyAreas = list;
            }
            return this;
        }

        public QueryBuilder areas(String areas){
            setAreas(areas);
            return this;
        }

        public QueryBuilder areasList(String ... areas){
            if (areas != null){
                List<String> list = new ArrayList<>();
                for (String item : areas){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.areasList = list;
            }

            return this;
        }

        public QueryBuilder areasList(List<String> areas){
            this.areasList = areas;
            return this;
        }

        public QueryBuilder fetchAreas(){
            setFetchFields("fetchFields","areas");
            return this;
        }

        public QueryBuilder excludeAreas(){
            setFetchFields("excludeFields","areas");
            return this;
        }



        public QueryBuilder starttimeBetWeen(java.time.LocalDateTime starttimeSt,java.time.LocalDateTime starttimeEd){
            this.starttimeSt = starttimeSt;
            this.starttimeEd = starttimeEd;
            return this;
        }

        public QueryBuilder starttimeGreaterEqThan(java.time.LocalDateTime starttimeSt){
            this.starttimeSt = starttimeSt;
            return this;
        }
        public QueryBuilder starttimeLessEqThan(java.time.LocalDateTime starttimeEd){
            this.starttimeEd = starttimeEd;
            return this;
        }


        public QueryBuilder starttime(java.time.LocalDateTime starttime){
            setStarttime(starttime);
            return this;
        }

        public QueryBuilder starttimeList(java.time.LocalDateTime ... starttime){
            if (starttime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : starttime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.starttimeList = list;
            }

            return this;
        }

        public QueryBuilder starttimeList(List<java.time.LocalDateTime> starttime){
            this.starttimeList = starttime;
            return this;
        }

        public QueryBuilder fetchStarttime(){
            setFetchFields("fetchFields","starttime");
            return this;
        }

        public QueryBuilder excludeStarttime(){
            setFetchFields("excludeFields","starttime");
            return this;
        }



        public QueryBuilder endtimeBetWeen(java.time.LocalDateTime endtimeSt,java.time.LocalDateTime endtimeEd){
            this.endtimeSt = endtimeSt;
            this.endtimeEd = endtimeEd;
            return this;
        }

        public QueryBuilder endtimeGreaterEqThan(java.time.LocalDateTime endtimeSt){
            this.endtimeSt = endtimeSt;
            return this;
        }
        public QueryBuilder endtimeLessEqThan(java.time.LocalDateTime endtimeEd){
            this.endtimeEd = endtimeEd;
            return this;
        }


        public QueryBuilder endtime(java.time.LocalDateTime endtime){
            setEndtime(endtime);
            return this;
        }

        public QueryBuilder endtimeList(java.time.LocalDateTime ... endtime){
            if (endtime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : endtime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.endtimeList = list;
            }

            return this;
        }

        public QueryBuilder endtimeList(List<java.time.LocalDateTime> endtime){
            this.endtimeList = endtime;
            return this;
        }

        public QueryBuilder fetchEndtime(){
            setFetchFields("fetchFields","endtime");
            return this;
        }

        public QueryBuilder excludeEndtime(){
            setFetchFields("excludeFields","endtime");
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

        public Slideshow build(){
            return this;
        }
    }

}
