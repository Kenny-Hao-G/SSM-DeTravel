package com.deTravel.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "航班信息实体" ,description = "用于存储和传递航班的信息")
public class FlightInformation {
    //@ApiModelProperty(value = "airline",name = "航空公司",dataType = "String")
    private String airline;
    //@ApiModelProperty(value = "price",name = "价格",dataType = "double")
    private double price;
    //@ApiModelProperty(value = "departureTime",name = "起飞时间",dataType = "String")
    private String departureTime;
    //@ApiModelProperty(value = "wayToCity",name = "途经城市",dataType = "String")
    private String wayToCity;
    //@ApiModelProperty(value = "restriction",name = "乘坐限制",dataType = "String")
    private String restriction;
    //@ApiModelProperty(value = "id",name = "航班id",dataType = "")
    private int id;
    //@ApiModelProperty(value = "berth",name = "停靠城市",dataType = "")
    private String berth;
    //@ApiModelProperty(value = "berthDate",name = "停靠时间",dataType = "")
    private String berthDate;
    //@ApiModelProperty(value = "berthDate",name = "降落时间",dataType = "")
    private String fallTime;
    private String takeOffFlight;
    private String landingFlight;
    //private String[] ;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getWayToCity() {
        return wayToCity;
    }

    public void setWayToCity(String wayToCity) {
        this.wayToCity = wayToCity;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    @Override
    public String toString() {
        return "FlightInformation{" +
                "airline='" + airline + '\'' +
                ", price=" + price +
                ", departureTime='" + departureTime + '\'' +
                ", wayToCity='" + wayToCity + '\'' +
                ", restriction='" + restriction + '\'' +
                ", id=" + id +
                '}';
    }
}
