package com.deTravel.pojo;

public class TbCountries {
    private Integer countriesId;

    private String countriesName;

    private Integer areaKeys;

    private Integer siteKeys;

    public Integer getCountriesId() {
        return countriesId;
    }

    public void setCountriesId(Integer countriesId) {
        this.countriesId = countriesId;
    }

    public String getCountriesName() {
        return countriesName;
    }

    public void setCountriesName(String countriesName) {
        this.countriesName = countriesName == null ? null : countriesName.trim();
    }

    public Integer getAreaKeys() {
        return areaKeys;
    }

    public void setAreaKeys(Integer areaKeys) {
        this.areaKeys = areaKeys;
    }

    public Integer getSiteKeys() {
        return siteKeys;
    }

    public void setSiteKeys(Integer siteKeys) {
        this.siteKeys = siteKeys;
    }
}