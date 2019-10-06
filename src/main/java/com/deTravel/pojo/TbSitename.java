package com.deTravel.pojo;

public class TbSitename {
    
    private Integer sitenameId;

    private String sitenameName;

    private String sitenameDetails;

    private String sitenameHistory;

    private String sitenameImagekeys;

    private String sitenameSitenameaddress;

    public Integer getSitenameId() {
        return sitenameId;
    }

    public void setSitenameId(Integer sitenameId) {
        this.sitenameId = sitenameId;
    }

    public String getSitenameName() {
        return sitenameName;
    }

    public void setSitenameName(String sitenameName) {
        this.sitenameName = sitenameName == null ? null : sitenameName.trim();
    }

    public String getSitenameDetails() {
        return sitenameDetails;
    }

    public void setSitenameDetails(String sitenameDetails) {
        this.sitenameDetails = sitenameDetails == null ? null : sitenameDetails.trim();
    }

    public String getSitenameHistory() {
        return sitenameHistory;
    }

    public void setSitenameHistory(String sitenameHistory) {
        this.sitenameHistory = sitenameHistory == null ? null : sitenameHistory.trim();
    }

    public String getSitenameImagekeys() {
        return sitenameImagekeys;
    }

    public void setSitenameImagekeys(String sitenameImagekeys) {
        this.sitenameImagekeys = sitenameImagekeys == null ? null : sitenameImagekeys.trim();
    }

    public String getSitenameSitenameaddress() {
        return sitenameSitenameaddress;
    }

    public void setSitenameSitenameaddress(String sitenameSitenameaddress) {
        this.sitenameSitenameaddress = sitenameSitenameaddress == null ? null : sitenameSitenameaddress.trim();
    }
}