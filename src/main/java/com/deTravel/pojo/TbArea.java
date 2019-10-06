package com.deTravel.pojo;

public class TbArea {
    private Integer areaId;

    private String areaName;

    private Integer areaKeys;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaKeys() {
        return areaKeys;
    }

    public void setAreaKeys(Integer areaKeys) {
        this.areaKeys = areaKeys;
    }
}
