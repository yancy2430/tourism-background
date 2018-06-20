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
public class User implements Serializable {

    private static final long serialVersionUID = 1525400508666L;


    /**
    * 主键
    * 用户ID
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 用户组1是普通 2是同行
    * isNullAble:0,defaultVal:1
    */
    private Integer userCate;

    /**
    * 用户名
    * isNullAble:0
    */
    private String userName;

    /**
    * 密码
    * isNullAble:0
    */
    private String password;

    /**
    * 手机号
    * isNullAble:0
    */
    private String userMobile;

    /**
    * 邮箱
    * isNullAble:1
    */
    private String email;

    /**
    * 注册时间
    * isNullAble:0
    */
    private java.time.LocalDateTime regtime;

    /**
    * 通信秘钥
    * isNullAble:0
    */
    private String token;

    /**
    * 随机码
    * isNullAble:0
    */
    private String randcode;

    /**
    * 头像
    * isNullAble:1
    */
    private String avater;

    /**
    * 个人设置，序列号数组
    * isNullAble:1
    */
    private String setting;

    /**
    * 余额
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal balance;

    /**
    * 是否删除
    * isNullAble:0,defaultVal:0
    */
    private Integer isdelete;

    /**
    * 1男2女
    * isNullAble:1,defaultVal:1
    */
    private Integer sex;


    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public void setUserCate(Integer userCate){
        this.userCate = userCate;
    }

    public Integer getUserCate(){
        return this.userCate;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setUserMobile(String userMobile){
        this.userMobile = userMobile;
    }

    public String getUserMobile(){
        return this.userMobile;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setRegtime(java.time.LocalDateTime regtime){
        this.regtime = regtime;
    }

    public java.time.LocalDateTime getRegtime(){
        return this.regtime;
    }

    public void setToken(String token){
        this.token = token;
    }

    public String getToken(){
        return this.token;
    }

    public void setRandcode(String randcode){
        this.randcode = randcode;
    }

    public String getRandcode(){
        return this.randcode;
    }

    public void setAvater(String avater){
        this.avater = avater;
    }

    public String getAvater(){
        return this.avater;
    }

    public void setSetting(String setting){
        this.setting = setting;
    }

    public String getSetting(){
        return this.setting;
    }

    public void setBalance(java.math.BigDecimal balance){
        this.balance = balance;
    }

    public java.math.BigDecimal getBalance(){
        return this.balance;
    }

    public void setIsdelete(Integer isdelete){
        this.isdelete = isdelete;
    }

    public Integer getIsdelete(){
        return this.isdelete;
    }

    public void setSex(Integer sex){
        this.sex = sex;
    }

    public Integer getSex(){
        return this.sex;
    }
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                "userCate='" + userCate + '\'' +
                "userName='" + userName + '\'' +
                "password='" + password + '\'' +
                "userMobile='" + userMobile + '\'' +
                "email='" + email + '\'' +
                "regtime='" + regtime + '\'' +
                "token='" + token + '\'' +
                "randcode='" + randcode + '\'' +
                "avater='" + avater + '\'' +
                "setting='" + setting + '\'' +
                "balance='" + balance + '\'' +
                "isdelete='" + isdelete + '\'' +
                "sex='" + sex + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends User{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
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

        private List<Integer> userCateList;

        private Integer userCateSt;

        private Integer userCateEd;

        public Integer getUserCateSt(){
            return this.userCateSt;
        }

        public Integer getUserCateEd(){
            return this.userCateEd;
        }

        private List<String> userNameList;


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){
            return this.fuzzyUserName;
        }

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){
            return this.rightFuzzyUserName;
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
        private List<String> userMobileList;


        private List<String> fuzzyUserMobile;

        public List<String> getFuzzyUserMobile(){
            return this.fuzzyUserMobile;
        }

        private List<String> rightFuzzyUserMobile;

        public List<String> getRightFuzzyUserMobile(){
            return this.rightFuzzyUserMobile;
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
        private List<java.time.LocalDateTime> regtimeList;

        private java.time.LocalDateTime regtimeSt;

        private java.time.LocalDateTime regtimeEd;

        public java.time.LocalDateTime getRegtimeSt(){
            return this.regtimeSt;
        }

        public java.time.LocalDateTime getRegtimeEd(){
            return this.regtimeEd;
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
        private List<String> randcodeList;


        private List<String> fuzzyRandcode;

        public List<String> getFuzzyRandcode(){
            return this.fuzzyRandcode;
        }

        private List<String> rightFuzzyRandcode;

        public List<String> getRightFuzzyRandcode(){
            return this.rightFuzzyRandcode;
        }
        private List<String> avaterList;


        private List<String> fuzzyAvater;

        public List<String> getFuzzyAvater(){
            return this.fuzzyAvater;
        }

        private List<String> rightFuzzyAvater;

        public List<String> getRightFuzzyAvater(){
            return this.rightFuzzyAvater;
        }
        private List<String> settingList;


        private List<String> fuzzySetting;

        public List<String> getFuzzySetting(){
            return this.fuzzySetting;
        }

        private List<String> rightFuzzySetting;

        public List<String> getRightFuzzySetting(){
            return this.rightFuzzySetting;
        }
        private List<java.math.BigDecimal> balanceList;

        private java.math.BigDecimal balanceSt;

        private java.math.BigDecimal balanceEd;

        public java.math.BigDecimal getBalanceSt(){
            return this.balanceSt;
        }

        public java.math.BigDecimal getBalanceEd(){
            return this.balanceEd;
        }

        private List<Integer> isdeleteList;

        private Integer isdeleteSt;

        private Integer isdeleteEd;

        public Integer getIsdeleteSt(){
            return this.isdeleteSt;
        }

        public Integer getIsdeleteEd(){
            return this.isdeleteEd;
        }

        private List<Integer> sexList;

        private Integer sexSt;

        private Integer sexEd;

        public Integer getSexSt(){
            return this.sexSt;
        }

        public Integer getSexEd(){
            return this.sexEd;
        }

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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



        public QueryBuilder userCateBetWeen(Integer userCateSt,Integer userCateEd){
            this.userCateSt = userCateSt;
            this.userCateEd = userCateEd;
            return this;
        }

        public QueryBuilder userCateGreaterEqThan(Integer userCateSt){
            this.userCateSt = userCateSt;
            return this;
        }
        public QueryBuilder userCateLessEqThan(Integer userCateEd){
            this.userCateEd = userCateEd;
            return this;
        }


        public QueryBuilder userCate(Integer userCate){
            setUserCate(userCate);
            return this;
        }

        public QueryBuilder userCateList(Integer ... userCate){
            if (userCate != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : userCate){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userCateList = list;
            }

            return this;
        }

        public QueryBuilder userCateList(List<Integer> userCate){
            this.userCateList = userCate;
            return this;
        }

        public QueryBuilder fetchUserCate(){
            setFetchFields("fetchFields","userCate");
            return this;
        }

        public QueryBuilder excludeUserCate(){
            setFetchFields("excludeFields","userCate");
            return this;
        }



        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            if (fuzzyUserName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUserName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUserName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            if (rightFuzzyUserName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUserName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUserName = list;
            }
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            if (userName != null){
                List<String> list = new ArrayList<>();
                for (String item : userName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userNameList = list;
            }

            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
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



        public QueryBuilder fuzzyUserMobile (List<String> fuzzyUserMobile){
            this.fuzzyUserMobile = fuzzyUserMobile;
            return this;
        }

        public QueryBuilder fuzzyUserMobile (String ... fuzzyUserMobile){
            if (fuzzyUserMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUserMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUserMobile = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUserMobile (List<String> rightFuzzyUserMobile){
            this.rightFuzzyUserMobile = rightFuzzyUserMobile;
            return this;
        }

        public QueryBuilder rightFuzzyUserMobile (String ... rightFuzzyUserMobile){
            if (rightFuzzyUserMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUserMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUserMobile = list;
            }
            return this;
        }

        public QueryBuilder userMobile(String userMobile){
            setUserMobile(userMobile);
            return this;
        }

        public QueryBuilder userMobileList(String ... userMobile){
            if (userMobile != null){
                List<String> list = new ArrayList<>();
                for (String item : userMobile){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userMobileList = list;
            }

            return this;
        }

        public QueryBuilder userMobileList(List<String> userMobile){
            this.userMobileList = userMobile;
            return this;
        }

        public QueryBuilder fetchUserMobile(){
            setFetchFields("fetchFields","userMobile");
            return this;
        }

        public QueryBuilder excludeUserMobile(){
            setFetchFields("excludeFields","userMobile");
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



        public QueryBuilder regtimeBetWeen(java.time.LocalDateTime regtimeSt,java.time.LocalDateTime regtimeEd){
            this.regtimeSt = regtimeSt;
            this.regtimeEd = regtimeEd;
            return this;
        }

        public QueryBuilder regtimeGreaterEqThan(java.time.LocalDateTime regtimeSt){
            this.regtimeSt = regtimeSt;
            return this;
        }
        public QueryBuilder regtimeLessEqThan(java.time.LocalDateTime regtimeEd){
            this.regtimeEd = regtimeEd;
            return this;
        }


        public QueryBuilder regtime(java.time.LocalDateTime regtime){
            setRegtime(regtime);
            return this;
        }

        public QueryBuilder regtimeList(java.time.LocalDateTime ... regtime){
            if (regtime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : regtime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.regtimeList = list;
            }

            return this;
        }

        public QueryBuilder regtimeList(List<java.time.LocalDateTime> regtime){
            this.regtimeList = regtime;
            return this;
        }

        public QueryBuilder fetchRegtime(){
            setFetchFields("fetchFields","regtime");
            return this;
        }

        public QueryBuilder excludeRegtime(){
            setFetchFields("excludeFields","regtime");
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



        public QueryBuilder fuzzyRandcode (List<String> fuzzyRandcode){
            this.fuzzyRandcode = fuzzyRandcode;
            return this;
        }

        public QueryBuilder fuzzyRandcode (String ... fuzzyRandcode){
            if (fuzzyRandcode != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyRandcode){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyRandcode = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyRandcode (List<String> rightFuzzyRandcode){
            this.rightFuzzyRandcode = rightFuzzyRandcode;
            return this;
        }

        public QueryBuilder rightFuzzyRandcode (String ... rightFuzzyRandcode){
            if (rightFuzzyRandcode != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyRandcode){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyRandcode = list;
            }
            return this;
        }

        public QueryBuilder randcode(String randcode){
            setRandcode(randcode);
            return this;
        }

        public QueryBuilder randcodeList(String ... randcode){
            if (randcode != null){
                List<String> list = new ArrayList<>();
                for (String item : randcode){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.randcodeList = list;
            }

            return this;
        }

        public QueryBuilder randcodeList(List<String> randcode){
            this.randcodeList = randcode;
            return this;
        }

        public QueryBuilder fetchRandcode(){
            setFetchFields("fetchFields","randcode");
            return this;
        }

        public QueryBuilder excludeRandcode(){
            setFetchFields("excludeFields","randcode");
            return this;
        }



        public QueryBuilder fuzzyAvater (List<String> fuzzyAvater){
            this.fuzzyAvater = fuzzyAvater;
            return this;
        }

        public QueryBuilder fuzzyAvater (String ... fuzzyAvater){
            if (fuzzyAvater != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyAvater){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyAvater = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyAvater (List<String> rightFuzzyAvater){
            this.rightFuzzyAvater = rightFuzzyAvater;
            return this;
        }

        public QueryBuilder rightFuzzyAvater (String ... rightFuzzyAvater){
            if (rightFuzzyAvater != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyAvater){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyAvater = list;
            }
            return this;
        }

        public QueryBuilder avater(String avater){
            setAvater(avater);
            return this;
        }

        public QueryBuilder avaterList(String ... avater){
            if (avater != null){
                List<String> list = new ArrayList<>();
                for (String item : avater){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.avaterList = list;
            }

            return this;
        }

        public QueryBuilder avaterList(List<String> avater){
            this.avaterList = avater;
            return this;
        }

        public QueryBuilder fetchAvater(){
            setFetchFields("fetchFields","avater");
            return this;
        }

        public QueryBuilder excludeAvater(){
            setFetchFields("excludeFields","avater");
            return this;
        }



        public QueryBuilder fuzzySetting (List<String> fuzzySetting){
            this.fuzzySetting = fuzzySetting;
            return this;
        }

        public QueryBuilder fuzzySetting (String ... fuzzySetting){
            if (fuzzySetting != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySetting){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySetting = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySetting (List<String> rightFuzzySetting){
            this.rightFuzzySetting = rightFuzzySetting;
            return this;
        }

        public QueryBuilder rightFuzzySetting (String ... rightFuzzySetting){
            if (rightFuzzySetting != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySetting){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySetting = list;
            }
            return this;
        }

        public QueryBuilder withSetting(String setting){
            setSetting(setting);
            return this;
        }

        public QueryBuilder withSettingList(String ... setting){
            if (setting != null){
                List<String> list = new ArrayList<>();
                for (String item : setting){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.settingList = list;
            }

            return this;
        }

        public QueryBuilder withSettingList(List<String> setting){
            this.settingList = setting;
            return this;
        }

        public QueryBuilder fetchSetting(){
            setFetchFields("fetchFields","setting");
            return this;
        }

        public QueryBuilder excludeSetting(){
            setFetchFields("excludeFields","setting");
            return this;
        }



        public QueryBuilder balanceBetWeen(java.math.BigDecimal balanceSt,java.math.BigDecimal balanceEd){
            this.balanceSt = balanceSt;
            this.balanceEd = balanceEd;
            return this;
        }

        public QueryBuilder balanceGreaterEqThan(java.math.BigDecimal balanceSt){
            this.balanceSt = balanceSt;
            return this;
        }
        public QueryBuilder balanceLessEqThan(java.math.BigDecimal balanceEd){
            this.balanceEd = balanceEd;
            return this;
        }


        public QueryBuilder balance(java.math.BigDecimal balance){
            setBalance(balance);
            return this;
        }

        public QueryBuilder balanceList(java.math.BigDecimal ... balance){
            if (balance != null){
                List<java.math.BigDecimal> list = new ArrayList<>();
                for (java.math.BigDecimal item : balance){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.balanceList = list;
            }

            return this;
        }

        public QueryBuilder balanceList(List<java.math.BigDecimal> balance){
            this.balanceList = balance;
            return this;
        }

        public QueryBuilder fetchBalance(){
            setFetchFields("fetchFields","balance");
            return this;
        }

        public QueryBuilder excludeBalance(){
            setFetchFields("excludeFields","balance");
            return this;
        }



        public QueryBuilder isdeleteBetWeen(Integer isdeleteSt,Integer isdeleteEd){
            this.isdeleteSt = isdeleteSt;
            this.isdeleteEd = isdeleteEd;
            return this;
        }

        public QueryBuilder isdeleteGreaterEqThan(Integer isdeleteSt){
            this.isdeleteSt = isdeleteSt;
            return this;
        }
        public QueryBuilder isdeleteLessEqThan(Integer isdeleteEd){
            this.isdeleteEd = isdeleteEd;
            return this;
        }


        public QueryBuilder isdelete(Integer isdelete){
            setIsdelete(isdelete);
            return this;
        }

        public QueryBuilder isdeleteList(Integer ... isdelete){
            if (isdelete != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : isdelete){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.isdeleteList = list;
            }

            return this;
        }

        public QueryBuilder isdeleteList(List<Integer> isdelete){
            this.isdeleteList = isdelete;
            return this;
        }

        public QueryBuilder fetchIsdelete(){
            setFetchFields("fetchFields","isdelete");
            return this;
        }

        public QueryBuilder excludeIsdelete(){
            setFetchFields("excludeFields","isdelete");
            return this;
        }



        public QueryBuilder sexBetWeen(Integer sexSt,Integer sexEd){
            this.sexSt = sexSt;
            this.sexEd = sexEd;
            return this;
        }

        public QueryBuilder sexGreaterEqThan(Integer sexSt){
            this.sexSt = sexSt;
            return this;
        }
        public QueryBuilder sexLessEqThan(Integer sexEd){
            this.sexEd = sexEd;
            return this;
        }


        public QueryBuilder sex(Integer sex){
            setSex(sex);
            return this;
        }

        public QueryBuilder sexList(Integer ... sex){
            if (sex != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : sex){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.sexList = list;
            }

            return this;
        }

        public QueryBuilder sexList(List<Integer> sex){
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

        public User build(){
            return this;
        }
    }

}
