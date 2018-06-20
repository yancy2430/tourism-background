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
public class Admin implements Serializable {

    private static final long serialVersionUID = 1526879541618L;


    /**
    * 主键
    * 用户ID
    * isNullAble:0
    */
    private Integer id;

    /**
    * 昵称
    * isNullAble:0,defaultVal:
    */
    private String name;

    /**
    * 密码
    * isNullAble:0,defaultVal:
    */
    private String password;

    /**
    * 用户名
    * isNullAble:0,defaultVal:
    */
    private String username;

    /**
    * 性别
    * isNullAble:0,defaultVal:
    */
    private String sex;

    /**
    * 手机号
    * isNullAble:1,defaultVal:
    */
    private String mobile;

    /**
    * 邮箱
    * isNullAble:1,defaultVal:
    */
    private String email;

    /**
    * 备注
    * isNullAble:1
    */
    private String note;

    /**
    * 最后登录时间
    * isNullAble:0
    */
    private java.time.LocalDateTime loginTime;

    /**
    * 最后登录IP
    * isNullAble:1
    */
    private String loginIp;

    /**
    * 角色ID
    * isNullAble:0
    */
    private Integer roleId;

    /**
    * 角色名
    * isNullAble:0,defaultVal:
    */
    private String roleName;

    /**
    * 
    * isNullAble:1
    */
    private String token;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return this.sex;
    }

    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    public String getMobile(){
        return this.mobile;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setNote(String note){
        this.note = note;
    }

    public String getNote(){
        return this.note;
    }

    public void setLoginTime(java.time.LocalDateTime loginTime){
        this.loginTime = loginTime;
    }

    public java.time.LocalDateTime getLoginTime(){
        return this.loginTime;
    }

    public void setLoginIp(String loginIp){
        this.loginIp = loginIp;
    }

    public String getLoginIp(){
        return this.loginIp;
    }

    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }

    public Integer getRoleId(){
        return this.roleId;
    }

    public void setRoleName(String roleName){
        this.roleName = roleName;
    }

    public String getRoleName(){
        return this.roleName;
    }

    public void setToken(String token){
        this.token = token;
    }

    public String getToken(){
        return this.token;
    }
    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "password='" + password + '\'' +
                "username='" + username + '\'' +
                "sex='" + sex + '\'' +
                "mobile='" + mobile + '\'' +
                "email='" + email + '\'' +
                "note='" + note + '\'' +
                "loginTime='" + loginTime + '\'' +
                "loginIp='" + loginIp + '\'' +
                "roleId='" + roleId + '\'' +
                "roleName='" + roleName + '\'' +
                "token='" + token + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Admin{
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

        private List<String> nameList;


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){
            return this.fuzzyName;
        }

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){
            return this.rightFuzzyName;
        }
        private List<String> passwordList;


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){
            return this.fuzzyPassword;
        }

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){
            return this.rightFuzzyPassword;
        }
        private List<String> usernameList;


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){
            return this.fuzzyUsername;
        }

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){
            return this.rightFuzzyUsername;
        }
        private List<String> sexList;


        private List<String> fuzzySex;

        public List<String> getFuzzySex(){
            return this.fuzzySex;
        }

        private List<String> rightFuzzySex;

        public List<String> getRightFuzzySex(){
            return this.rightFuzzySex;
        }
        private List<String> mobileList;


        private List<String> fuzzyMobile;

        public List<String> getFuzzyMobile(){
            return this.fuzzyMobile;
        }

        private List<String> rightFuzzyMobile;

        public List<String> getRightFuzzyMobile(){
            return this.rightFuzzyMobile;
        }
        private List<String> emailList;


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){
            return this.fuzzyEmail;
        }

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){
            return this.rightFuzzyEmail;
        }
        private List<String> noteList;


        private List<String> fuzzyNote;

        public List<String> getFuzzyNote(){
            return this.fuzzyNote;
        }

        private List<String> rightFuzzyNote;

        public List<String> getRightFuzzyNote(){
            return this.rightFuzzyNote;
        }
        private List<java.time.LocalDateTime> loginTimeList;

        private java.time.LocalDateTime loginTimeSt;

        private java.time.LocalDateTime loginTimeEd;

        public java.time.LocalDateTime getLoginTimeSt(){
            return this.loginTimeSt;
        }

        public java.time.LocalDateTime getLoginTimeEd(){
            return this.loginTimeEd;
        }

        private List<String> loginIpList;


        private List<String> fuzzyLoginIp;

        public List<String> getFuzzyLoginIp(){
            return this.fuzzyLoginIp;
        }

        private List<String> rightFuzzyLoginIp;

        public List<String> getRightFuzzyLoginIp(){
            return this.rightFuzzyLoginIp;
        }
        private List<Integer> roleIdList;

        private Integer roleIdSt;

        private Integer roleIdEd;

        public Integer getRoleIdSt(){
            return this.roleIdSt;
        }

        public Integer getRoleIdEd(){
            return this.roleIdEd;
        }

        private List<String> roleNameList;


        private List<String> fuzzyRoleName;

        public List<String> getFuzzyRoleName(){
            return this.fuzzyRoleName;
        }

        private List<String> rightFuzzyRoleName;

        public List<String> getRightFuzzyRoleName(){
            return this.rightFuzzyRoleName;
        }
        private List<String> tokenList;


        private List<String> fuzzyToken;

        public List<String> getFuzzyToken(){
            return this.fuzzyToken;
        }

        private List<String> rightFuzzyToken;

        public List<String> getRightFuzzyToken(){
            return this.rightFuzzyToken;
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



        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            if (fuzzyPassword != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPassword){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPassword = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            if (rightFuzzyPassword != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPassword){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPassword = list;
            }
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            if (password != null){
                List<String> list = new ArrayList<>();
                for (String item : password){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.passwordList = list;
            }

            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }



        public QueryBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public QueryBuilder fuzzyUsername (String ... fuzzyUsername){
            if (fuzzyUsername != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUsername){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUsername = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public QueryBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            if (rightFuzzyUsername != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUsername){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUsername = list;
            }
            return this;
        }

        public QueryBuilder username(String username){
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(String ... username){
            if (username != null){
                List<String> list = new ArrayList<>();
                for (String item : username){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.usernameList = list;
            }

            return this;
        }

        public QueryBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername(){
            setFetchFields("fetchFields","username");
            return this;
        }

        public QueryBuilder excludeUsername(){
            setFetchFields("excludeFields","username");
            return this;
        }



        public QueryBuilder fuzzySex (List<String> fuzzySex){
            this.fuzzySex = fuzzySex;
            return this;
        }

        public QueryBuilder fuzzySex (String ... fuzzySex){
            if (fuzzySex != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySex){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySex = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySex (List<String> rightFuzzySex){
            this.rightFuzzySex = rightFuzzySex;
            return this;
        }

        public QueryBuilder rightFuzzySex (String ... rightFuzzySex){
            if (rightFuzzySex != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySex){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySex = list;
            }
            return this;
        }

        public QueryBuilder sex(String sex){
            setSex(sex);
            return this;
        }

        public QueryBuilder sexList(String ... sex){
            if (sex != null){
                List<String> list = new ArrayList<>();
                for (String item : sex){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.sexList = list;
            }

            return this;
        }

        public QueryBuilder sexList(List<String> sex){
            this.sexList = sex;
            return this;
        }

        public QueryBuilder fetchSex(){
            setFetchFields("fetchFields","sex");
            return this;
        }

        public QueryBuilder excludeSex(){
            setFetchFields("excludeFields","sex");
            return this;
        }



        public QueryBuilder fuzzyMobile (List<String> fuzzyMobile){
            this.fuzzyMobile = fuzzyMobile;
            return this;
        }

        public QueryBuilder fuzzyMobile (String ... fuzzyMobile){
            if (fuzzyMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyMobile = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyMobile (List<String> rightFuzzyMobile){
            this.rightFuzzyMobile = rightFuzzyMobile;
            return this;
        }

        public QueryBuilder rightFuzzyMobile (String ... rightFuzzyMobile){
            if (rightFuzzyMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyMobile = list;
            }
            return this;
        }

        public QueryBuilder mobile(String mobile){
            setMobile(mobile);
            return this;
        }

        public QueryBuilder mobileList(String ... mobile){
            if (mobile != null){
                List<String> list = new ArrayList<>();
                for (String item : mobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.mobileList = list;
            }

            return this;
        }

        public QueryBuilder mobileList(List<String> mobile){
            this.mobileList = mobile;
            return this;
        }

        public QueryBuilder fetchMobile(){
            setFetchFields("fetchFields","mobile");
            return this;
        }

        public QueryBuilder excludeMobile(){
            setFetchFields("excludeFields","mobile");
            return this;
        }



        public QueryBuilder fuzzyEmail (List<String> fuzzyEmail){
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public QueryBuilder fuzzyEmail (String ... fuzzyEmail){
            if (fuzzyEmail != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyEmail){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyEmail = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyEmail (List<String> rightFuzzyEmail){
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public QueryBuilder rightFuzzyEmail (String ... rightFuzzyEmail){
            if (rightFuzzyEmail != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyEmail){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyEmail = list;
            }
            return this;
        }

        public QueryBuilder email(String email){
            setEmail(email);
            return this;
        }

        public QueryBuilder emailList(String ... email){
            if (email != null){
                List<String> list = new ArrayList<>();
                for (String item : email){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.emailList = list;
            }

            return this;
        }

        public QueryBuilder emailList(List<String> email){
            this.emailList = email;
            return this;
        }

        public QueryBuilder fetchEmail(){
            setFetchFields("fetchFields","email");
            return this;
        }

        public QueryBuilder excludeEmail(){
            setFetchFields("excludeFields","email");
            return this;
        }



        public QueryBuilder fuzzyNote (List<String> fuzzyNote){
            this.fuzzyNote = fuzzyNote;
            return this;
        }

        public QueryBuilder fuzzyNote (String ... fuzzyNote){
            if (fuzzyNote != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyNote){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyNote = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyNote (List<String> rightFuzzyNote){
            this.rightFuzzyNote = rightFuzzyNote;
            return this;
        }

        public QueryBuilder rightFuzzyNote (String ... rightFuzzyNote){
            if (rightFuzzyNote != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyNote){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyNote = list;
            }
            return this;
        }

        public QueryBuilder note(String note){
            setNote(note);
            return this;
        }

        public QueryBuilder noteList(String ... note){
            if (note != null){
                List<String> list = new ArrayList<>();
                for (String item : note){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.noteList = list;
            }

            return this;
        }

        public QueryBuilder noteList(List<String> note){
            this.noteList = note;
            return this;
        }

        public QueryBuilder fetchNote(){
            setFetchFields("fetchFields","note");
            return this;
        }

        public QueryBuilder excludeNote(){
            setFetchFields("excludeFields","note");
            return this;
        }



        public QueryBuilder loginTimeBetWeen(java.time.LocalDateTime loginTimeSt,java.time.LocalDateTime loginTimeEd){
            this.loginTimeSt = loginTimeSt;
            this.loginTimeEd = loginTimeEd;
            return this;
        }

        public QueryBuilder loginTimeGreaterEqThan(java.time.LocalDateTime loginTimeSt){
            this.loginTimeSt = loginTimeSt;
            return this;
        }
        public QueryBuilder loginTimeLessEqThan(java.time.LocalDateTime loginTimeEd){
            this.loginTimeEd = loginTimeEd;
            return this;
        }


        public QueryBuilder loginTime(java.time.LocalDateTime loginTime){
            setLoginTime(loginTime);
            return this;
        }

        public QueryBuilder loginTimeList(java.time.LocalDateTime ... loginTime){
            if (loginTime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : loginTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.loginTimeList = list;
            }

            return this;
        }

        public QueryBuilder loginTimeList(List<java.time.LocalDateTime> loginTime){
            this.loginTimeList = loginTime;
            return this;
        }

        public QueryBuilder fetchLoginTime(){
            setFetchFields("fetchFields","loginTime");
            return this;
        }

        public QueryBuilder excludeLoginTime(){
            setFetchFields("excludeFields","loginTime");
            return this;
        }



        public QueryBuilder fuzzyLoginIp (List<String> fuzzyLoginIp){
            this.fuzzyLoginIp = fuzzyLoginIp;
            return this;
        }

        public QueryBuilder fuzzyLoginIp (String ... fuzzyLoginIp){
            if (fuzzyLoginIp != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyLoginIp){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyLoginIp = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyLoginIp (List<String> rightFuzzyLoginIp){
            this.rightFuzzyLoginIp = rightFuzzyLoginIp;
            return this;
        }

        public QueryBuilder rightFuzzyLoginIp (String ... rightFuzzyLoginIp){
            if (rightFuzzyLoginIp != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyLoginIp){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyLoginIp = list;
            }
            return this;
        }

        public QueryBuilder loginIp(String loginIp){
            setLoginIp(loginIp);
            return this;
        }

        public QueryBuilder loginIpList(String ... loginIp){
            if (loginIp != null){
                List<String> list = new ArrayList<>();
                for (String item : loginIp){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.loginIpList = list;
            }

            return this;
        }

        public QueryBuilder loginIpList(List<String> loginIp){
            this.loginIpList = loginIp;
            return this;
        }

        public QueryBuilder fetchLoginIp(){
            setFetchFields("fetchFields","loginIp");
            return this;
        }

        public QueryBuilder excludeLoginIp(){
            setFetchFields("excludeFields","loginIp");
            return this;
        }



        public QueryBuilder roleIdBetWeen(Integer roleIdSt,Integer roleIdEd){
            this.roleIdSt = roleIdSt;
            this.roleIdEd = roleIdEd;
            return this;
        }

        public QueryBuilder roleIdGreaterEqThan(Integer roleIdSt){
            this.roleIdSt = roleIdSt;
            return this;
        }
        public QueryBuilder roleIdLessEqThan(Integer roleIdEd){
            this.roleIdEd = roleIdEd;
            return this;
        }


        public QueryBuilder roleId(Integer roleId){
            setRoleId(roleId);
            return this;
        }

        public QueryBuilder roleIdList(Integer ... roleId){
            if (roleId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : roleId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.roleIdList = list;
            }

            return this;
        }

        public QueryBuilder roleIdList(List<Integer> roleId){
            this.roleIdList = roleId;
            return this;
        }

        public QueryBuilder fetchRoleId(){
            setFetchFields("fetchFields","roleId");
            return this;
        }

        public QueryBuilder excludeRoleId(){
            setFetchFields("excludeFields","roleId");
            return this;
        }



        public QueryBuilder fuzzyRoleName (List<String> fuzzyRoleName){
            this.fuzzyRoleName = fuzzyRoleName;
            return this;
        }

        public QueryBuilder fuzzyRoleName (String ... fuzzyRoleName){
            if (fuzzyRoleName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyRoleName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyRoleName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyRoleName (List<String> rightFuzzyRoleName){
            this.rightFuzzyRoleName = rightFuzzyRoleName;
            return this;
        }

        public QueryBuilder rightFuzzyRoleName (String ... rightFuzzyRoleName){
            if (rightFuzzyRoleName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyRoleName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyRoleName = list;
            }
            return this;
        }

        public QueryBuilder roleName(String roleName){
            setRoleName(roleName);
            return this;
        }

        public QueryBuilder roleNameList(String ... roleName){
            if (roleName != null){
                List<String> list = new ArrayList<>();
                for (String item : roleName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.roleNameList = list;
            }

            return this;
        }

        public QueryBuilder roleNameList(List<String> roleName){
            this.roleNameList = roleName;
            return this;
        }

        public QueryBuilder fetchRoleName(){
            setFetchFields("fetchFields","roleName");
            return this;
        }

        public QueryBuilder excludeRoleName(){
            setFetchFields("excludeFields","roleName");
            return this;
        }



        public QueryBuilder fuzzyToken (List<String> fuzzyToken){
            this.fuzzyToken = fuzzyToken;
            return this;
        }

        public QueryBuilder fuzzyToken (String ... fuzzyToken){
            if (fuzzyToken != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyToken){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyToken = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyToken (List<String> rightFuzzyToken){
            this.rightFuzzyToken = rightFuzzyToken;
            return this;
        }

        public QueryBuilder rightFuzzyToken (String ... rightFuzzyToken){
            if (rightFuzzyToken != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyToken){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyToken = list;
            }
            return this;
        }

        public QueryBuilder token(String token){
            setToken(token);
            return this;
        }

        public QueryBuilder tokenList(String ... token){
            if (token != null){
                List<String> list = new ArrayList<>();
                for (String item : token){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.tokenList = list;
            }

            return this;
        }

        public QueryBuilder tokenList(List<String> token){
            this.tokenList = token;
            return this;
        }

        public QueryBuilder fetchToken(){
            setFetchFields("fetchFields","token");
            return this;
        }

        public QueryBuilder excludeToken(){
            setFetchFields("excludeFields","token");
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

        public Admin build(){
            return this;
        }
    }

}
