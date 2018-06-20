package com.tdeado.tourism.source;

public class HomeIconData {
    /**
     * icon : icon/url
     * title : name
     * type : url/class
     */

    private String icon;
    private String title;
    private String type;
    private String color;
    private String link;
    public String getIcon() {
        return icon;
    }

    public HomeIconData() {
    }

    public HomeIconData(String icon, String title, String type, String color, String link) {
        this.icon = icon;
        this.title = title;
        this.type = type;
        this.color = color;
        this.link = link;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
