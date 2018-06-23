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
