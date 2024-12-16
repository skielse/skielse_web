package com.ski.estate.oldhouse.bean;

import lombok.Data;

import java.util.Date;

@Data
public class House {
    private String id;
    private String title;
    private String url;
    private String city;
    private String region;
    private String street;
    private String community;
    private String floor;
    private Double totalPrice;
    private Double averagePrice;
    private String image;
    private Integer watch;
    private Integer view;
    private String releaseDate;
    private String roomCount;
    private String towards;
    private Double houseArea;
    private String decoration;
    private String elevator;
    private Date createDate;

    @Override
    public String toString() {
        return "House{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", community='" + community + '\'' +
                ", floor='" + floor + '\'' +
                ", totalPrice=" + totalPrice +
                ", averagePrice=" + averagePrice +
                ", image='" + image + '\'' +
                ", watch=" + watch +
                ", view=" + view +
                ", releaseDate='" + releaseDate + '\'' +
                ", roomCount='" + roomCount + '\'' +
                ", towards='" + towards + '\'' +
                ", houseArea=" + houseArea +
                ", decoration='" + decoration + '\'' +
                ", elevator='" + elevator + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
