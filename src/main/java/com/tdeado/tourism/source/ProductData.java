package com.tdeado.tourism.source;

import java.util.List;

/**
 * 添加产品数据实体
 */
public class ProductData {


    /**
     * productinfo : {"product_no":"111","product_name":"222","product_cate":"3","product_tag":"3231","principal":"11","sketch":"2312","hotline":"123","notmobile":"1","operate":"1241","desc":"3142213","isshow":"1","images":["updata/images/75146826f4816271f5ac8c62163f4aee.jpg","updata/images/a5d36c05bcacdee69a5c358acc58f788.jpeg"]}
     * packagelist : [{"isshow":"0","package_name":"dawd","package_no":"1526461598720","notchildren":"1","content":[{"name":"dddw","html":" dawd  "}]},{"package_name":"awer","package_no":"1526462334577","notchildren":"1","isshow":"1","content":[{"name":"awra","html":" dewarf  "}]}]
     * groupdate : [{"date":"2018-05-16","list":[{"isshow":"","teamtime":"2018-05-16","package_name":"dawd","adult_price":"111","children_price":"22","LAY_TABLE_INDEX":0},{"isshow":"","teamtime":"2018-05-16","package_name":"awer","adult_price":"4442","children_price":"212","LAY_TABLE_INDEX":1}]},{"date":"2018-05-17","list":[{"isshow":"","teamtime":"2018-05-17","package_name":"dawd","adult_price":"222","children_price":"33","LAY_TABLE_INDEX":0},{"isshow":"","teamtime":"2018-05-17","package_name":"awer","adult_price":"221","children_price":"22","LAY_TABLE_INDEX":1}]}]
     */

    private ProductinfoBean productinfo;
    private List<PackagelistBean> packagelist;
    private List<GroupdateBean> groupdate;
    private String tripInfo;
    private List<TripBean> tripInfoList;

    public static class TripBean{

        /**
         * id : 0
         * name : 第一天
         * list : [{"time":"8点0分","type":"3","title":"集合前往\u201c中国园林之城\u201d\u2014苏州","time_h":"1","time_m":"40","content":"集合时间：08：00-08：30，具体已导游通知为准！ \r\n集合地点：上海宏泉丽笙酒店或上海南青华美达酒店（以具体通知为主）； \r\n特殊备注：如您时间来不及也可以自行前往苏州留园汇合；敬请谅解！ \r\n温馨提示：导游会提前1天与您确认集合时间及地点，请务必准时抵达，否则避免耽误其他客人行程，我们将准时准点出发，拒绝等候，如因客人原因没有按时抵达将承担全额损失。","img":[]},{"time":"10点30分","type":"1","title":"七里山塘","time_h":"3","time_m":"20","content":"山塘街位于古城苏州的西北部，东连\u201c红尘中一二等富贵风流之地\u201d阊门，西接\u201c吴中名胜\u201d虎丘。全长3600米。因此被称作\u201c七里山塘\u201d。唐宝历二年（825年），大诗人白居易从杭州调任苏州刺史，为了便利苏州水陆交通，开凿了一条西起虎丘东至阊门的山塘河，山塘河河北修建道路，称为\u201c山塘街\u201d，山塘河和山塘街长约七里，叫\u201c七里山塘\u201d。\r\n\r\n温馨提示：此景点无导游，请自行游览后，乘坐我们的接驳车前往【留园】与导游汇合！如遇用车紧张，则您可自行打车抵达【留园】与导游汇合，导游凭票报销车费，敬请谅解!","img":["/upload/images/2cd883079c4c102049cbde4e6e2d53b8.jpeg"]},{"time":"14点0分","type":"1","title":"留园","time_h":"1","time_m":"0","content":"游中国四大名园之一【留园】，原是明嘉靖年间太仆寺卿徐泰时的东园，清嘉庆年间，刘恕以故园改筑，名寒碧山庄，又称刘园。在一个园林中能领略到山水、田园、山林、庭园四种不同景色，表现淡泊处世之坦然的\u201c小蓬莱\u201d。\r\n\r\n集合方式：我们会安排车将您接到景点留园团队汇合，如遇用车紧张，则您可自行打车抵达【留园】与导游汇合，导游凭票报销车费，敬请谅解!","img":["/upload/images/b3154003c74fdd33ba62a649d2360b95.jpg"]},{"time":"15点30分","type":"1","title":"集合前往 \u201c中国极美村镇\u201d\u2014\u2014乌镇","time_h":"3","time_m":"0","content":"统一游览【乌镇西栅景区】注：此景区为自由活动，品味江南原生态的枕水人家。【夜游西栅】您可与自己的爱人或亲友选一家河边小店或在当地居民家中，点上几个可口的小菜，品乌镇美食，欣赏着满眼华丽的灯光水色。","img":["/upload/images/9db38174812c5bf621224c1ad27e90e4.jpeg"]},{"time":"12点30分","type":"4","title":"早餐自理|午餐自理|晚餐自理","time_h":"1","time_m":"0","content":"12:30 午餐敬请自理\r\n17:00 晚餐敬请自理\r\n为方便游览，敬请自理！ 小吃推荐：三珍斋酱品、红烧羊肉、熏豆茶、三白酒、姑嫂饼、白水鱼、定胜糕\u2026\u2026","img":[]},{"time":"18点0分","type":"2","title":"乌镇客栈或桐乡酒店","time_h":"12","time_m":"0","content":"除乌镇重大会议外，我们均100%保证入住西栅景区内特色客栈，360°体验枕水江南水乡古镇之休闲惬意！\r\n如节假日或重大会议乌镇西栅客栈满房，统一安排入住桐乡\u2014振石大酒店、黄金水岸大酒店或梵璞文化主题酒店等或同级，敬请知晓！\r\n\r\n重要提示：2018年5月14日、16日、17日，6月28日、29日、30日当晚入住乌镇西栅的团期，因景区内有重大会议，我们将安排您入住西栅外酒店，敬请谅解！","img":[]}]
         */

        private int id;
        private String name;
        private List<TripListBean> list;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<TripListBean> getList() {
            return list;
        }

        public void setList(List<TripListBean> list) {
            this.list = list;
        }

        public static class TripListBean {
            /**
             * time : 8点0分
             * type : 3
             * title : 集合前往“中国园林之城”—苏州
             * time_h : 1
             * time_m : 40
             * content : 集合时间：08：00-08：30，具体已导游通知为准！
             集合地点：上海宏泉丽笙酒店或上海南青华美达酒店（以具体通知为主）；
             特殊备注：如您时间来不及也可以自行前往苏州留园汇合；敬请谅解！
             温馨提示：导游会提前1天与您确认集合时间及地点，请务必准时抵达，否则避免耽误其他客人行程，我们将准时准点出发，拒绝等候，如因客人原因没有按时抵达将承担全额损失。
             * img : []
             */

            private String time;
            private String type;
            private String title;
            private String time_h;
            private String time_m;
            private String content;
            private List<String> img;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTime_h() {
                return time_h;
            }

            public void setTime_h(String time_h) {
                this.time_h = time_h;
            }

            public String getTime_m() {
                return time_m;
            }

            public void setTime_m(String time_m) {
                this.time_m = time_m;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public List<String> getImg() {
                return img;
            }

            public void setImg(List<String> img) {
                this.img = img;
            }
        }
    }



    public ProductinfoBean getProductinfo() {
        return productinfo;
    }

    public void setProductinfo(ProductinfoBean productinfo) {
        this.productinfo = productinfo;
    }

    public List<PackagelistBean> getPackagelist() {
        return packagelist;
    }

    public void setPackagelist(List<PackagelistBean> packagelist) {
        this.packagelist = packagelist;
    }

    public List<GroupdateBean> getGroupdate() {
        return groupdate;
    }

    public void setGroupdate(List<GroupdateBean> groupdate) {
        this.groupdate = groupdate;
    }
    public String getTripInfo() {
        return tripInfo;
    }

    public void setTripInfo(String tripInfo) {
        this.tripInfo = tripInfo;
    }

    public List<TripBean> getTripInfoList() {
        return tripInfoList;
    }

    public void setTripInfoList(List<TripBean> tripInfoList) {
        this.tripInfoList = tripInfoList;
    }

    public static class ProductinfoBean {
        /**
         * product_no : 111
         * product_name : 222
         * product_cate : 3
         * product_tag : 3231
         * principal : 11
         * sketch : 2312
         * hotline : 123
         * notmobile : 1
         * operate : 1241
         * desc : 3142213
         * isshow : 1
         * images : ["updata/images/75146826f4816271f5ac8c62163f4aee.jpg","updata/images/a5d36c05bcacdee69a5c358acc58f788.jpeg"]
         */

        private String product_no;
        private String product_name;
        private String product_cate;
        private String product_cate_name;
        private String product_tag;
        private String[] productTags;
        private String principal;
        private String sketch;
        private String origin;
        private String content;
        private String destination;
        private String hotline;
        private String notmobile;
        private String operate;
        private String desc;
        private String isshow;
        private List<String> images;
        private String price;
        private String security;
        private String[] securityList;

        public List<OperateBean>  operateList;
        public class OperateBean{


            /**
             * title : 费用说明
             * content : 费用包括XXXXXX
             * sort : 1
             */

            private String title;
            private String content;
            private String sort;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getSort() {
                return sort;
            }

            public void setSort(String sort) {
                this.sort = sort;
            }
        }

        public List<OperateBean> getOperateList() {
            return operateList;
        }

        public void setOperateList(List<OperateBean> operateList) {
            this.operateList = operateList;
        }

        public String[] getSecurityList() {
            return securityList;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setSecurityList(String[] securityList) {
            this.securityList = securityList;
        }

        public String[] getProductTags() {
            return productTags;
        }

        public void setProductTags(String[] productTags) {
            this.productTags = productTags;
        }

        public String getProduct_cate_name() {
            return product_cate_name;
        }

        public void setProduct_cate_name(String product_cate_name) {
            this.product_cate_name = product_cate_name;
        }

        public String getProduct_no() {
            return product_no;
        }

        public void setProduct_no(String product_no) {
            this.product_no = product_no;
        }

        public String getProduct_name() {
            return product_name;
        }

        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }

        public String getProduct_cate() {
            return product_cate;
        }

        public void setProduct_cate(String product_cate) {
            this.product_cate = product_cate;
        }

        public String getProduct_tag() {
            return product_tag;
        }

        public void setProduct_tag(String product_tag) {
            this.product_tag = product_tag;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getSecurity() {
            return security;
        }

        public void setSecurity(String security) {
            this.security = security;
        }

        public String getPrincipal() {
            return principal;
        }

        public void setPrincipal(String principal) {
            this.principal = principal;
        }

        public String getSketch() {
            return sketch;
        }

        public void setSketch(String sketch) {
            this.sketch = sketch;
        }


        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }
        public String getHotline() {
            return hotline;
        }

        public void setHotline(String hotline) {
            this.hotline = hotline;
        }

        public String getNotmobile() {
            return notmobile;
        }

        public void setNotmobile(String notmobile) {
            this.notmobile = notmobile;
        }

        public String getOperate() {
            return operate;
        }

        public void setOperate(String operate) {
            this.operate = operate;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getIsshow() {
            return isshow;
        }

        public void setIsshow(String isshow) {
            this.isshow = isshow;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "ProductinfoBean{" +
                    "product_no='" + product_no + '\'' +
                    ", product_name='" + product_name + '\'' +
                    ", product_cate='" + product_cate + '\'' +
                    ", product_cate_name='" + product_cate_name + '\'' +
                    ", product_tag='" + product_tag + '\'' +
                    ", principal='" + principal + '\'' +
                    ", sketch='" + sketch + '\'' +
                    ", hotline='" + hotline + '\'' +
                    ", notmobile='" + notmobile + '\'' +
                    ", operate='" + operate + '\'' +
                    ", desc='" + desc + '\'' +
                    ", isshow='" + isshow + '\'' +
                    ", images=" + images +
                    '}';
        }
    }

    public static class PackagelistBean {
        /**
         * isshow : 0
         * package_name : dawd
         * package_no : 1526461598720
         * notchildren : 1
         * content : [{"name":"dddw","html":" dawd  "}]
         */

        private String isshow;
        private String package_name;
        private String package_no;
        private String notchildren;
        private List<ContentBean> content;

        public String getIsshow() {
            return isshow;
        }

        public void setIsshow(String isshow) {
            this.isshow = isshow;
        }

        public String getPackage_name() {
            return package_name;
        }

        public void setPackage_name(String package_name) {
            this.package_name = package_name;
        }

        public String getPackage_no() {
            return package_no;
        }

        public void setPackage_no(String package_no) {
            this.package_no = package_no;
        }

        public String getNotchildren() {
            return notchildren;
        }

        public void setNotchildren(String notchildren) {
            this.notchildren = notchildren;
        }

        public List<ContentBean> getContent() {
            return content;
        }

        public void setContent(List<ContentBean> content) {
            this.content = content;
        }

        public static class ContentBean {
            /**
             * name : dddw
             * html :  dawd
             */

            private String name;
            private String html;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getHtml() {
                return html;
            }

            public void setHtml(String html) {
                this.html = html;
            }
        }

        @Override
        public String toString() {
            return "PackagelistBean{" +
                    "isshow='" + isshow + '\'' +
                    ", package_name='" + package_name + '\'' +
                    ", package_no='" + package_no + '\'' +
                    ", notchildren='" + notchildren + '\'' +
                    ", content=" + content +
                    '}';
        }
    }

    public static class GroupdateBean {
        public GroupdateBean(String date, List<ListBean> list) {
            this.date = date;
            this.list = list;
        }

        public GroupdateBean() {
        }

        /**
         * date : 2018-05-16
         * list : [{"isshow":"","teamtime":"2018-05-16","package_name":"dawd","adult_price":"111","children_price":"22","LAY_TABLE_INDEX":0},{"isshow":"","teamtime":"2018-05-16","package_name":"awer","adult_price":"4442","children_price":"212","LAY_TABLE_INDEX":1}]
         */


        private String date;
        private List<ListBean> list;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * isshow :
             * teamtime : 2018-05-16
             * package_name : dawd
             * adult_price : 111
             * children_price : 22
             * LAY_TABLE_INDEX : 0
             */

            private String isshow;
            private String product_id;
            private String package_no;
            private String teamtime;
            private String package_name;
            private String adult_price;
            private String housing_price;
            private String children_price;
            private int LAY_TABLE_INDEX;

            public String getHousing_price() {
                return housing_price;
            }

            public void setHousing_price(String housing_price) {
                this.housing_price = housing_price;
            }

            public String getPackage_no() {
                return package_no;
            }

            public void setPackage_no(String package_no) {
                this.package_no = package_no;
            }

            public String getProduct_id() {
                return product_id;
            }

            public void setProduct_id(String product_id) {
                this.product_id = product_id;
            }

            public String getIsshow() {
                return isshow;
            }

            public void setIsshow(String isshow) {
                this.isshow = isshow;
            }

            public String getTeamtime() {
                return teamtime;
            }

            public void setTeamtime(String teamtime) {
                this.teamtime = teamtime;
            }

            public String getPackage_name() {
                return package_name;
            }

            public void setPackage_name(String package_name) {
                this.package_name = package_name;
            }

            public String getAdult_price() {
                return adult_price;
            }

            public void setAdult_price(String adult_price) {
                this.adult_price = adult_price;
            }

            public String getChildren_price() {
                return children_price;
            }

            public void setChildren_price(String children_price) {
                this.children_price = children_price;
            }

            public int getLAY_TABLE_INDEX() {
                return LAY_TABLE_INDEX;
            }

            public void setLAY_TABLE_INDEX(int LAY_TABLE_INDEX) {
                this.LAY_TABLE_INDEX = LAY_TABLE_INDEX;
            }

            @Override
            public String toString() {
                return "ListBean{" +
                        "isshow='" + isshow + '\'' +
                        ", product_id='" + product_id + '\'' +
                        ", package_no='" + package_no + '\'' +
                        ", teamtime='" + teamtime + '\'' +
                        ", package_name='" + package_name + '\'' +
                        ", adult_price='" + adult_price + '\'' +
                        ", housing_price='" + housing_price + '\'' +
                        ", children_price='" + children_price + '\'' +
                        ", LAY_TABLE_INDEX=" + LAY_TABLE_INDEX +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "GroupdateBean{" +
                    "date='" + date + '\'' +
                    ", list=" + list +
                    '}';
        }
    }

}
