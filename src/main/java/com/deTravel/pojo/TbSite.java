package com.deTravel.pojo;

public class TbSite {
    private Integer siteId;

    private String siteName;

    private Integer siteKeys;

    private Integer countriesKeys;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public Integer getSiteKeys() {
        return siteKeys;
    }

    public void setSiteKeys(Integer siteKeys) {
        this.siteKeys = siteKeys;
    }

    public Integer getCountriesKeys() {
        return countriesKeys;
    }

    public void setCountriesKeys(Integer countriesKeys) {
        this.countriesKeys = countriesKeys;
    }
}