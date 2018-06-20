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
public class Area implements Serializable {

    private static final long serialVersionUID = 1525343280359L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer areaId;

    /**
    * 
    * isNullAble:1
    */
    private Integer areaUpid;

    /**
    * 
    * isNullAble:1
    */
    private String areaName;

    /**
    * 
    * isNullAble:1
    */
    private Integer sort;


    public void setAreaId(Integer areaId){
        this.areaId = areaId;
    }

    public Integer getAreaId(){
        return this.areaId;
    }

    public void setAreaUpid(Integer areaUpid){
        this.areaUpid = areaUpid;
    }

    public Integer getAreaUpid(){
        return this.areaUpid;
    }

    public void setAreaName(String areaName){
        this.areaName = areaName;
    }

    public String getAreaName(){
        return this.areaName;
    }

    public void setSort(Integer sort){
        this.sort = sort;
    }

    public Integer getSort(){
        return this.sort;
    }
    @Override
    public String toString() {
        return "Area{" +
                "areaId='" + areaId + '\'' +
                "areaUpid='" + areaUpid + '\'' +
                "areaName='" + areaName + '\'' +
                "sort='" + sort + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Area{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> areaIdList;

        private Integer areaIdSt;

        private Integer areaIdEd;

        public Integer getAreaIdSt(){
            return this.areaIdSt;
        }

        public Integer getAreaIdEd(){
            return this.areaIdEd;
        }

        private List<Integer> areaUpidList;

        private Integer areaUpidSt;

        private Integer areaUpidEd;

        public Integer getAreaUpidSt(){
            return this.areaUpidSt;
        }

        public Integer getAreaUpidEd(){
            return this.areaUpidEd;
        }

        private List<String> areaNameList;


        private List<String> fuzzyAreaName;

        public List<String> getFuzzyAreaName(){
            return this.fuzzyAreaName;
        }

        private List<String> rightFuzzyAreaName;

        public List<String> getRightFuzzyAreaName(){
            return this.rightFuzzyAreaName;
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


        public QueryBuilder areaIdBetWeen(Integer areaIdSt,Integer areaIdEd){
            this.areaIdSt = areaIdSt;
            this.areaIdEd = areaIdEd;
            return this;
        }

        public QueryBuilder areaIdGreaterEqThan(Integer areaIdSt){
            this.areaIdSt = areaIdSt;
            return this;
        }
        public QueryBuilder areaIdLessEqThan(Integer areaIdEd){
            this.areaIdEd = areaIdEd;
            return this;
        }


        public QueryBuilder areaId(Integer areaId){
            setAreaId(areaId);
            return this;
        }

        public QueryBuilder areaIdList(Integer ... areaId){
            if (areaId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : areaId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.areaIdList = list;
            }

            return this;
        }

        public QueryBuilder areaIdList(List<Integer> areaId){
            this.areaIdList = areaId;
            return this;
        }

        public QueryBuilder fetchAreaId(){
            setFetchFields("fetchFields","areaId");
            return this;
        }

        public QueryBuilder excludeAreaId(){
            setFetchFields("excludeFields","areaId");
            return this;
        }



        public QueryBuilder areaUpidBetWeen(Integer areaUpidSt,Integer areaUpidEd){
            this.areaUpidSt = areaUpidSt;
            this.areaUpidEd = areaUpidEd;
            return this;
        }

        public QueryBuilder areaUpidGreaterEqThan(Integer areaUpidSt){
            this.areaUpidSt = areaUpidSt;
            return this;
        }
        public QueryBuilder areaUpidLessEqThan(Integer areaUpidEd){
            this.areaUpidEd = areaUpidEd;
            return this;
        }


        public QueryBuilder areaUpid(Integer areaUpid){
            setAreaUpid(areaUpid);
            return this;
        }

        public QueryBuilder areaUpidList(Integer ... areaUpid){
            if (areaUpid != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : areaUpid){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.areaUpidList = list;
            }

            return this;
        }

        public QueryBuilder areaUpidList(List<Integer> areaUpid){
            this.areaUpidList = areaUpid;
            return this;
        }

        public QueryBuilder fetchAreaUpid(){
            setFetchFields("fetchFields","areaUpid");
            return this;
        }

        public QueryBuilder excludeAreaUpid(){
            setFetchFields("excludeFields","areaUpid");
            return this;
        }



        public QueryBuilder fuzzyAreaName (List<String> fuzzyAreaName){
            this.fuzzyAreaName = fuzzyAreaName;
            return this;
        }

        public QueryBuilder fuzzyAreaName (String ... fuzzyAreaName){
            if (fuzzyAreaName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyAreaName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyAreaName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyAreaName (List<String> rightFuzzyAreaName){
            this.rightFuzzyAreaName = rightFuzzyAreaName;
            return this;
        }

        public QueryBuilder rightFuzzyAreaName (String ... rightFuzzyAreaName){
            if (rightFuzzyAreaName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyAreaName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyAreaName = list;
            }
            return this;
        }

        public QueryBuilder areaName(String areaName){
            setAreaName(areaName);
            return this;
        }

        public QueryBuilder areaNameList(String ... areaName){
            if (areaName != null){
                List<String> list = new ArrayList<>();
                for (String item : areaName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.areaNameList = list;
            }

            return this;
        }

        public QueryBuilder areaNameList(List<String> areaName){
            this.areaNameList = areaName;
            return this;
        }

        public QueryBuilder fetchAreaName(){
            setFetchFields("fetchFields","areaName");
            return this;
        }

        public QueryBuilder excludeAreaName(){
            setFetchFields("excludeFields","areaName");
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

        public Area build(){
            return this;
        }
    }

}
