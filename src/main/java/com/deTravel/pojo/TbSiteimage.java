package com.deTravel.pojo;

public class TbSiteimage {

    private Integer siteimage;

    private String siteimageImageaddress;

    private String sitenameKeys;

    public Integer getSiteimage() {
        return siteimage;
    }

    public void setSiteimage(Integer siteimage) {
        this.siteimage = siteimage;
    }

    public String getSiteimageImageaddress() {
        return siteimageImageaddress;
    }

    public void setSiteimageImageaddress(String siteimageImageaddress) {
        this.siteimageImageaddress = siteimageImageaddress == null ? null : siteimageImageaddress.trim();
    }

    public String getSitenameKeys() {
        return sitenameKeys;
    }

    public void setSitenameKeys(String sitenameKeys) {
        this.sitenameKeys = sitenameKeys == null ? null : sitenameKeys.trim();
    }
}