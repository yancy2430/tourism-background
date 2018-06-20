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
public class ProductCate implements Serializable {

    private static final long serialVersionUID = 1526726577784L;


    /**
    * 主键
    * 分类ID
    * isNullAble:0
    */
    private Integer cateId;

    /**
    * 上级分类ID
    * isNullAble:0,defaultVal:0
    */
    private Integer cateUpid;

    /**
    * 分类名称
    * isNullAble:1
    */
    private String cateName;

    /**
    * 排序
    * isNullAble:0,defaultVal:0
    */
    private Integer sort;


    public void setCateId(Integer cateId){
        this.cateId = cateId;
    }

    public Integer getCateId(){
        return this.cateId;
    }

    public void setCateUpid(Integer cateUpid){
        this.cateUpid = cateUpid;
    }

    public Integer getCateUpid(){
        return this.cateUpid;
    }

    public void setCateName(String cateName){
        this.cateName = cateName;
    }

    public String getCateName(){
        return this.cateName;
    }

    public void setSort(Integer sort){
        this.sort = sort;
    }

    public Integer getSort(){
        return this.sort;
    }
    @Override
    public String toString() {
        return "ProductCate{" +
                "cateId='" + cateId + '\'' +
                "cateUpid='" + cateUpid + '\'' +
                "cateName='" + cateName + '\'' +
                "sort='" + sort + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends ProductCate{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> cateIdList;

        private Integer cateIdSt;

        private Integer cateIdEd;

        public Integer getCateIdSt(){
            return this.cateIdSt;
        }

        public Integer getCateIdEd(){
            return this.cateIdEd;
        }

        private List<Integer> cateUpidList;

        private Integer cateUpidSt;

        private Integer cateUpidEd;

        public Integer getCateUpidSt(){
            return this.cateUpidSt;
        }

        public Integer getCateUpidEd(){
            return this.cateUpidEd;
        }

        private List<String> cateNameList;


        private List<String> fuzzyCateName;

        public List<String> getFuzzyCateName(){
            return this.fuzzyCateName;
        }

        private List<String> rightFuzzyCateName;

        public List<String> getRightFuzzyCateName(){
            return this.rightFuzzyCateName;
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

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder cateIdBetWeen(Integer cateIdSt,Integer cateIdEd){
            this.cateIdSt = cateIdSt;
            this.cateIdEd = cateIdEd;
            return this;
        }

        public QueryBuilder cateIdGreaterEqThan(Integer cateIdSt){
            this.cateIdSt = cateIdSt;
            return this;
        }
        public QueryBuilder cateIdLessEqThan(Integer cateIdEd){
            this.cateIdEd = cateIdEd;
            return this;
        }


        public QueryBuilder cateId(Integer cateId){
            setCateId(cateId);
            return this;
        }

        public QueryBuilder cateIdList(Integer ... cateId){
            if (cateId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : cateId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.cateIdList = list;
            }

            return this;
        }

        public QueryBuilder cateIdList(List<Integer> cateId){
            this.cateIdList = cateId;
            return this;
        }

        public QueryBuilder fetchCateId(){
            setFetchFields("fetchFields","cateId");
            return this;
        }

        public QueryBuilder excludeCateId(){
            setFetchFields("excludeFields","cateId");
            return this;
        }



        public QueryBuilder cateUpidBetWeen(Integer cateUpidSt,Integer cateUpidEd){
            this.cateUpidSt = cateUpidSt;
            this.cateUpidEd = cateUpidEd;
            return this;
        }

        public QueryBuilder cateUpidGreaterEqThan(Integer cateUpidSt){
            this.cateUpidSt = cateUpidSt;
            return this;
        }
        public QueryBuilder cateUpidLessEqThan(Integer cateUpidEd){
            this.cateUpidEd = cateUpidEd;
            return this;
        }


        public QueryBuilder cateUpid(Integer cateUpid){
            setCateUpid(cateUpid);
            return this;
        }

        public QueryBuilder cateUpidList(Integer ... cateUpid){
            if (cateUpid != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : cateUpid){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.cateUpidList = list;
            }

            return this;
        }

        public QueryBuilder cateUpidList(List<Integer> cateUpid){
            this.cateUpidList = cateUpid;
            return this;
        }

        public QueryBuilder fetchCateUpid(){
            setFetchFields("fetchFields","cateUpid");
            return this;
        }

        public QueryBuilder excludeCateUpid(){
            setFetchFields("excludeFields","cateUpid");
            return this;
        }



        public QueryBuilder fuzzyCateName (List<String> fuzzyCateName){
            this.fuzzyCateName = fuzzyCateName;
            return this;
        }

        public QueryBuilder fuzzyCateName (String ... fuzzyCateName){
            if (fuzzyCateName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCateName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCateName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCateName (List<String> rightFuzzyCateName){
            this.rightFuzzyCateName = rightFuzzyCateName;
            return this;
        }

        public QueryBuilder rightFuzzyCateName (String ... rightFuzzyCateName){
            if (rightFuzzyCateName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCateName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCateName = list;
            }
            return this;
        }

        public QueryBuilder cateName(String cateName){
            setCateName(cateName);
            return this;
        }

        public QueryBuilder cateNameList(String ... cateName){
            if (cateName != null){
                List<String> list = new ArrayList<>();
                for (String item : cateName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.cateNameList = list;
            }

            return this;
        }

        public QueryBuilder cateNameList(List<String> cateName){
            this.cateNameList = cateName;
            return this;
        }

        public QueryBuilder fetchCateName(){
            setFetchFields("fetchFields","cateName");
            return this;
        }

        public QueryBuilder excludeCateName(){
            setFetchFields("excludeFields","cateName");
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

        public ProductCate build(){
            return this;
        }
    }

}
