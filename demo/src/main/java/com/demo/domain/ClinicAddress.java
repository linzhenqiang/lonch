package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 诊所收货地址表 实体类
 */ 
public class ClinicAddress implements Serializable {
	private String id;
	private String clinicId;	// 诊所id
	private String consigneeName;	// 收货人名字
	private String consigneePhone;	// 收货人电话
	private String consigneeAddress;	// 收货人地址
	private String province;	// 省
	private String provinceCode;	// 省code
	private String city;	// 市
	private String cityCode;	// 市code
	private String area;	// 区
	private String areaCode;	// 区code
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 修改时间
	private int isDelete;	// 是否删除  0:删除；1:正常
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setClinicId(String clinicId){
		this.clinicId = clinicId;
	}
	public String getClinicId(){
		return clinicId;
	}
	public void setConsigneeName(String consigneeName){
		this.consigneeName = consigneeName;
	}
	public String getConsigneeName(){
		return consigneeName;
	}
	public void setConsigneePhone(String consigneePhone){
		this.consigneePhone = consigneePhone;
	}
	public String getConsigneePhone(){
		return consigneePhone;
	}
	public void setConsigneeAddress(String consigneeAddress){
		this.consigneeAddress = consigneeAddress;
	}
	public String getConsigneeAddress(){
		return consigneeAddress;
	}
	public void setProvince(String province){
		this.province = province;
	}
	public String getProvince(){
		return province;
	}
	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode(){
		return provinceCode;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}
	public String getCityCode(){
		return cityCode;
	}
	public void setArea(String area){
		this.area = area;
	}
	public String getArea(){
		return area;
	}
	public void setAreaCode(String areaCode){
		this.areaCode = areaCode;
	}
	public String getAreaCode(){
		return areaCode;
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
	public void setIsDelete(int isDelete){
		this.isDelete = isDelete;
	}
	public int getIsDelete(){
		return isDelete;
	}
}
