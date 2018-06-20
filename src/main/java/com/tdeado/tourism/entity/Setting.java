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
public class Setting implements Serializable {

    private static final long serialVersionUID = 1528729935554L;

    public Setting() {
    }

    public Setting(String settingName, String settingValue) {
        this.settingName = settingName;
        this.settingValue = settingValue;
    }

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String settingName;

    /**
    * 
    * isNullAble:0
    */
    private String settingValue;


    public void setSettingName(String settingName){
        this.settingName = settingName;
    }

    public String getSettingName(){
        return this.settingName;
    }

    public void setSettingValue(String settingValue){
        this.settingValue = settingValue;
    }

    public String getSettingValue(){
        return this.settingValue;
    }
    @Override
    public String toString() {
        return "Setting{" +
                "settingName='" + settingName + '\'' +
                "settingValue='" + settingValue + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Setting{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<String> settingNameList;


        private List<String> fuzzySettingName;

        public List<String> getFuzzySettingName(){
            return this.fuzzySettingName;
        }

        private List<String> rightFuzzySettingName;

        public List<String> getRightFuzzySettingName(){
            return this.rightFuzzySettingName;
        }
        private List<String> settingValueList;


        private List<String> fuzzySettingValue;

        public List<String> getFuzzySettingValue(){
            return this.fuzzySettingValue;
        }

        private List<String> rightFuzzySettingValue;

        public List<String> getRightFuzzySettingValue(){
            return this.rightFuzzySettingValue;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder fuzzySettingName (List<String> fuzzySettingName){
            this.fuzzySettingName = fuzzySettingName;
            return this;
        }

        public QueryBuilder fuzzySettingName (String ... fuzzySettingName){
            if (fuzzySettingName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySettingName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySettingName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySettingName (List<String> rightFuzzySettingName){
            this.rightFuzzySettingName = rightFuzzySettingName;
            return this;
        }

        public QueryBuilder rightFuzzySettingName (String ... rightFuzzySettingName){
            if (rightFuzzySettingName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySettingName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySettingName = list;
            }
            return this;
        }

        public QueryBuilder withSettingName(String settingName){
            setSettingName(settingName);
            return this;
        }

        public QueryBuilder withSettingNameList(String ... settingName){
            if (settingName != null){
                List<String> list = new ArrayList<>();
                for (String item : settingName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.settingNameList = list;
            }

            return this;
        }

        public QueryBuilder withSettingNameList(List<String> settingName){
            this.settingNameList = settingName;
            return this;
        }

        public QueryBuilder fetchSettingName(){
            setFetchFields("fetchFields","settingName");
            return this;
        }

        public QueryBuilder excludeSettingName(){
            setFetchFields("excludeFields","settingName");
            return this;
        }



        public QueryBuilder fuzzySettingValue (List<String> fuzzySettingValue){
            this.fuzzySettingValue = fuzzySettingValue;
            return this;
        }

        public QueryBuilder fuzzySettingValue (String ... fuzzySettingValue){
            if (fuzzySettingValue != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySettingValue){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySettingValue = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySettingValue (List<String> rightFuzzySettingValue){
            this.rightFuzzySettingValue = rightFuzzySettingValue;
            return this;
        }

        public QueryBuilder rightFuzzySettingValue (String ... rightFuzzySettingValue){
            if (rightFuzzySettingValue != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySettingValue){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySettingValue = list;
            }
            return this;
        }

        public QueryBuilder withSettingValue(String settingValue){
            setSettingValue(settingValue);
            return this;
        }

        public QueryBuilder withSettingValueList(String ... settingValue){
            if (settingValue != null){
                List<String> list = new ArrayList<>();
                for (String item : settingValue){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.settingValueList = list;
            }

            return this;
        }

        public QueryBuilder withSettingValueList(List<String> settingValue){
            this.settingValueList = settingValue;
            return this;
        }

        public QueryBuilder fetchSettingValue(){
            setFetchFields("fetchFields","settingValue");
            return this;
        }

        public QueryBuilder excludeSettingValue(){
            setFetchFields("excludeFields","settingValue");
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

        public Setting build(){
            return this;
        }
    }

}
