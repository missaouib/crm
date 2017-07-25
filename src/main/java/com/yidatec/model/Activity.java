package com.yidatec.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Administrator on 2017/7/21.
 */
public class Activity extends BaseModel{
//    @NotBlank(message = "必须选择活动类型", groups = { })
//    private String type;
    @NotBlank(message = "必须输入活动名称", groups = { })
    @Length( max = 200, message = "名称最多由200个字符组成", groups = { })
    private String name;
    @NotBlank(message = "必须输入开始时间", groups = { })
    private String startDate;
    @NotBlank(message = "必须输入结束时间", groups = { })
    private String endDate;
    @NotBlank(message = "必须选择国家", groups = { })
    private String country;
    @NotBlank(message = "必须选择省份", groups = { })
    private String province;
    @NotBlank(message = "必须选择城市", groups = { })
    private String city;
    @NotBlank(message = "必须选择区域", groups = { })
    private String region;
    @Length( max = 200, message = "地址最多由200个字符组成", groups = { })
    private String address;
    private String state;
    //展馆
    @NotBlank(message = "必须选择展馆", groups = { })
    private String exhibitioHall;
    //主办方
    @NotBlank(message = "必须选择主办方", groups = { })
    private String sponsor;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getExhibitioHall() {
        return exhibitioHall;
    }

    public void setExhibitioHall(String exhibitioHall) {
        this.exhibitioHall = exhibitioHall;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
}
