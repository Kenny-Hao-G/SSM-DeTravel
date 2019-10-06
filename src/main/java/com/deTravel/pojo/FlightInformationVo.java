package com.deTravel.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "条件查询航班实体",description = "条件查询航班信息")
public class FlightInformationVo {
    //@ApiModelProperty(name = "出发机场",dataType = "String")

    private String start;
    //@ApiModelProperty(name = "降落机场",dataType = "String");
    private String destination;
    //@ApiModelProperty(name = "航空公司",dataType = "String");
    private Integer airlineId;
    //@ApiModelProperty(name = "出发日期",dataType = "String");
    private String dateOfDeparture;
    //@ApiModelProperty(name = "返程日期",dataType = "String");
    private String returnDate;
    //@ApiModelProperty(name = "是否单程",dataType = "String");
    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

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

    public Integer getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }


    @Override
    public String toString() {
        return "FlightInformationVo{" +
                "start='" + start + '\'' +
                ", destination='" + destination + '\'' +
                ", airlineId=" + airlineId +
                ", dateOfDeparture='" + dateOfDeparture + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", ids='" + ids + '\'' +
                '}';
    }
}
