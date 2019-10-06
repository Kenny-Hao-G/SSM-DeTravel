package com.deTravel.pojo;

public class FlightWelfare {
    private String welfareName;

    public String getWelfareName() {
        return welfareName;
    }

    public void setWelfareName(String welfareName) {
        this.welfareName = welfareName;
    }

    @Override
    public String toString() {
        return "FlightWelfare{" +
                "welfareName='" + welfareName + '\'' +
                '}';
    }
}
