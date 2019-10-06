package com.deTravel.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "航班信息实体" ,description = "用于存储和传递航班的信息")
public class FlightInformation {
    //@ApiModelProperty(value = "airline",name = "航空公司",dataType = "String");
    private String airlineName;
    //@ApiModelProperty(value = "price",name = "价格",dataType = "double");
    private double price;
    //@ApiModelProperty(value = "departureTime",name = "起飞时间",dataType = "String");
    private String departureTime;
    //@ApiModelProperty(value = "wayToCity",name = "途经城市",dataType = "String");
    private String wayToCity;
    //@ApiModelProperty(value = "restriction",name = "乘坐限制",dataType = "String");
    private String restriction;
    //@ApiModelProperty(value = "id",name = "航班id",dataType = "");
    private int id;
    //@ApiModelProperty(value = "berth",name = "停靠城市",dataType = "");
    private String berth;
    //@ApiModelProperty(value = "berth",name = "停靠前时间",dataType = "");
    private String berthBeforeDate;
    //@ApiModelProperty(value = "berth",name = "停靠后时间",dataType = "");
    private String berthAfterDate;
    //@ApiModelProperty(value = "berthDate",name = "停靠时间",dataType = "");
    private String berthDate;
    //@ApiModelProperty(value = "berthDate",name = "降落时间",dataType = "");
    private String fallTime;
    //@ApiModelProperty(value = "berthDate",name = "起飞航班号",dataType = "");
    private String takeOffFlightNum;
    //@ApiModelProperty(value = "berthDate",name = "降落航班号",dataType = "");
    private String landingFlightNum;
    //@ApiModelProperty(value = "berthDate",name = "航班福利",dataType = "");
    private List<FlightWelfare> flightWelfare;
    //@ApiModelProperty(value = "berthDate",name = "起飞地点",dataType = "");
    private String start;
    //@ApiModelProperty(value = "berthDate",name = "降落地点",dataType = "");
    private String destination;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBerthBeforeDate() {
        return berthBeforeDate;
    }

    public void setBerthBeforeDate(String berthBeforeDate) {
        this.berthBeforeDate = berthBeforeDate;
    }

    public String getBerthAfterDate() {
        return berthAfterDate;
    }

    public void setBerthAfterDate(String berthAfterDate) {
        this.berthAfterDate = berthAfterDate;
    }

    public String getTakeOffFlightNum() {
        return takeOffFlightNum;
    }

    public void setTakeOffFlightNum(String takeOffFlightNum) {
        this.takeOffFlightNum = takeOffFlightNum;
    }

    public String getLandingFlightNum() {
        return landingFlightNum;
    }

    public void setLandingFlightNum(String landingFlightNum) {
        this.landingFlightNum = landingFlightNum;
    }

    public String getBerth() {
        return berth;
    }

    public void setBerth(String berth) {
        this.berth = berth;
    }

    public String getBerthDate() {
        return berthDate;
    }

    public void setBerthDate(String berthDate) {
        this.berthDate = berthDate;
    }

    public String getFallTime() {
        return fallTime;
    }

    public void setFallTime(String fallTime) {
        this.fallTime = fallTime;
    }

    public List<FlightWelfare> getFlightWelfare() {
        return flightWelfare;
    }

    public void setFlightWelfare(List<FlightWelfare> flightWelfare) {
        this.flightWelfare = flightWelfare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
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
                "airlineName='" + airlineName + '\'' +
                ", price=" + price +
                ", departureTime='" + departureTime + '\'' +
                ", wayToCity='" + wayToCity + '\'' +
                ", restriction='" + restriction + '\'' +
                ", id=" + id +
                ", berth='" + berth + '\'' +
                ", berthBeforeDate='" + berthBeforeDate + '\'' +
                ", berthAfterDate='" + berthAfterDate + '\'' +
                ", berthDate='" + berthDate + '\'' +
                ", fallTime='" + fallTime + '\'' +
                ", takeOffFlightNum='" + takeOffFlightNum + '\'' +
                ", landingFlightNum='" + landingFlightNum + '\'' +
                ", flightWelfare=" + flightWelfare +
                ", start='" + start + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
