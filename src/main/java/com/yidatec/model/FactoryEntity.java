package com.yidatec.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Administrator on 2017/7/27.
 */
public class FactoryEntity extends BaseModel{
    @NotBlank(message = "必须输入推荐人", groups = {})
    private String referrer;//推荐人


    @NotBlank(message = "必须输入企业名称", groups = { })
    @Length( max = 200, message = "名称最多由200个字符组成", groups = { })
    private String name;//企业名称

    @NotBlank(message = "必须输入厂长名称", groups = { })
    @Length( max = 30, message = "名称最多由30个字符组成", groups = { })
    private String director;//厂长

    @Valid
    private List<Contact> userList;//联系人

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate firstOrderTime;//首单时间

    @NotBlank(message = "必须选择所在国家", groups = { })
    private String country;

    @NotBlank(message = "必须选择所在省份", groups = { })
    private String province;
    @NotBlank(message = "必须选择所在城市", groups = { })
    private String city;
    @NotBlank(message = "必须选择所在区域", groups = { })
    private String region;
    @NotBlank(message = "必须输入地址", groups = { })
    @Length(max = 200, message = "地址最多由200个字符组成", groups = { })
    private String address;

    @NotBlank(message = "必须输入厂房面积", groups = { })
    @Length(max = 50, message = "面积最多由50个字符组成", groups = { })
    private String factoryArea;//厂房面积

    private String photo;
    @NotNull(message = "必须输入注册资金", groups = { })
    @Digits(integer = 18 ,message = "资金整数位不能超过18位,小数位必须是两位", fraction = 2 /*scale*/)
    private Float registeredCapital;//注册资金

    @NotBlank(message = "必须选择纳税人身份", groups = { })
    private String taxpayerType;//纳税人身份

    @Length(max = 10, message = "工人数量最多由10个字符组成", groups = { })
    private String fixedEmployeeCount;//固定工人数量

    @NotBlank(message = "必须输入擅长行业", groups = { })
    private String goodAtIndustry;//擅长行业

    @NotBlank(message = "必须输入擅长材料", groups = { })
    private String goodAtMaterial;//擅长材料

    @NotBlank(message = "必须输入擅长面积", groups = { })
    private String goodAtArea;//擅长面积

    @NotBlank(message = "必须输入平台等级", groups = { })
    private String platformLevel;//平台等级


    private String valueAddedTaxAccount;//增值税发票账号
    private String taxNumber;//税号
    private Integer state;

    private List<Case> caseList;//案例列表

    public List<Case> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<Case> caseList) {
        this.caseList = caseList;
    }

    public List<Contact> getUserList() {
        return userList;
    }

    public void setUserList(List<Contact> userList) {
        this.userList = userList;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getFirstOrderTime() {
        return firstOrderTime;
    }

    public void setFirstOrderTime(LocalDate firstOrderTime) {
        this.firstOrderTime = firstOrderTime;
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

    public String getFactoryArea() {
        return factoryArea;
    }

    public void setFactoryArea(String factoryArea) {
        this.factoryArea = factoryArea;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Float getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(Float registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getTaxpayerType() {
        return taxpayerType;
    }

    public void setTaxpayerType(String taxpayerType) {
        this.taxpayerType = taxpayerType;
    }

    public String getFixedEmployeeCount() {
        return fixedEmployeeCount;
    }

    public void setFixedEmployeeCount(String fixedEmployeeCount) {
        this.fixedEmployeeCount = fixedEmployeeCount;
    }

    public String getGoodAtIndustry() {
        return goodAtIndustry;
    }

    public void setGoodAtIndustry(String goodAtIndustry) {
        this.goodAtIndustry = goodAtIndustry;
    }

    public String getGoodAtMaterial() {
        return goodAtMaterial;
    }

    public void setGoodAtMaterial(String goodAtMaterial) {
        this.goodAtMaterial = goodAtMaterial;
    }

    public String getGoodAtArea() {
        return goodAtArea;
    }

    public void setGoodAtArea(String goodAtArea) {
        this.goodAtArea = goodAtArea;
    }

    public String getPlatformLevel() {
        return platformLevel;
    }

    public void setPlatformLevel(String platformLevel) {
        this.platformLevel = platformLevel;
    }

    public String getValueAddedTaxAccount() {
        return valueAddedTaxAccount;
    }

    public void setValueAddedTaxAccount(String valueAddedTaxAccount) {
        this.valueAddedTaxAccount = valueAddedTaxAccount;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
