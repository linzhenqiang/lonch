package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 商业公司表 实体类
 */ 
public class Business implements Serializable {
	private static final long serialVersionUID = 8850806458048888047L;
	private String id;
	private String companyName;	// 公司名字
	private String name;	// 联系人姓名
	private String phone;
	private String companyCode;	// 组织机构代码
	private String provinceCode;	// 省代码
	private String provinceName;
	private String cityCode;	// 市代码
	private String cityName;
	private String areaCode;	// 区代码
	private String areaName;
	private String address;	// 具体地址
	private int isPass;	// 是否通过审核  0:未审核；1:通过；2:未通过
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 更新时间
	private int status;	// 0:禁用；1:启用
	private String orgId;	// 销客ID
	private double lon;	// 经度
	private double lat;	// 纬度
	private String aliasName;
	private String legalPerson;	// 公司法人
	private String pic;	// 门头照
	private String website;	// 公司网站
	private int isFrom;	// 0:业务员添加   1:销客同步   3:手动导入
	private String code;	// code
	private String other;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	public String getCompanyName(){
		return companyName;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}
	public String getCompanyCode(){
		return companyCode;
	}
	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode(){
		return provinceCode;
	}
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}
	public String getProvinceName(){
		return provinceName;
	}
	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}
	public String getCityCode(){
		return cityCode;
	}
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	public String getCityName(){
		return cityName;
	}
	public void setAreaCode(String areaCode){
		this.areaCode = areaCode;
	}
	public String getAreaCode(){
		return areaCode;
	}
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	public String getAreaName(){
		return areaName;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setIsPass(int isPass){
		this.isPass = isPass;
	}
	public int getIsPass(){
		return isPass;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public void setLastUpdated(Date lastUpdated){
		this.lastUpdated = lastUpdated;
	}
	public Date getLastUpdated(){
		return lastUpdated;
	}
	public void setStatus(int status){
		this.status = status;
	}
	public int getStatus(){
		return status;
	}
	public void setOrgId(String orgId){
		this.orgId = orgId;
	}
	public String getOrgId(){
		return orgId;
	}
	public void setLon(double lon){
		this.lon = lon;
	}
	public double getLon(){
		return lon;
	}
	public void setLat(double lat){
		this.lat = lat;
	}
	public double getLat(){
		return lat;
	}
	public void setAliasName(String aliasName){
		this.aliasName = aliasName;
	}
	public String getAliasName(){
		return aliasName;
	}
	public void setLegalPerson(String legalPerson){
		this.legalPerson = legalPerson;
	}
	public String getLegalPerson(){
		return legalPerson;
	}
	public void setPic(String pic){
		this.pic = pic;
	}
	public String getPic(){
		return pic;
	}
	public void setWebsite(String website){
		this.website = website;
	}
	public String getWebsite(){
		return website;
	}
	public void setIsFrom(int isFrom){
		this.isFrom = isFrom;
	}
	public int getIsFrom(){
		return isFrom;
	}
	public void setCode(String code){
		this.code = code;
	}
	public String getCode(){
		return code;
	}
	public void setOther(String other){
		this.other = other;
	}
	public String getOther(){
		return other;
	}
}
