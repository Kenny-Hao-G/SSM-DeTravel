package com.deTravel.pojo;

public class TbFlight {
    private Integer id;

    private String start;

    private String destination;

    private String airline;

    private String dateofdeparture;

    private String returndate;

    private Double price;

    private String departuretime;

    private String waytocity;

    private String restriction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline == null ? null : airline.trim();
    }

    public String getDateofdeparture() {
        return dateofdeparture;
    }

    public void setDateofdeparture(String dateofdeparture) {
        this.dateofdeparture = dateofdeparture == null ? null : dateofdeparture.trim();
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate == null ? null : returndate.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime == null ? null : departuretime.trim();
    }

    public String getWaytocity() {
        return waytocity;
    }

    public void setWaytocity(String waytocity) {
        this.waytocity = waytocity == null ? null : waytocity.trim();
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction == null ? null : restriction.trim();
    }
}