package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 采购单主表  一次采购一条记录 实体类
 */ 
public class Orders implements Serializable {
	private String id;
	private String enquiryOrderId;	// 询价单id
	private String clinicId;	// 诊所Id
	private String clinicName;	// 诊所名字
	private int totalPrice;	// 总金额
	private int totalNum;	// 总数量
	private String provinceCode;
	private String cityCode;
	private String areaCode;
	private String address;
	private String orderNum;	// 订单编号
	private Date lastUpdated;
	private Date dateCreated;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setEnquiryOrderId(String enquiryOrderId){
		this.enquiryOrderId = enquiryOrderId;
	}
	public String getEnquiryOrderId(){
		return enquiryOrderId;
	}
	public void setClinicId(String clinicId){
		this.clinicId = clinicId;
	}
	public String getClinicId(){
		return clinicId;
	}
	public void setClinicName(String clinicName){
		this.clinicName = clinicName;
	}
	public String getClinicName(){
		return clinicName;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}
	public int getTotalPrice(){
		return totalPrice;
	}
	public void setTotalNum(int totalNum){
		this.totalNum = totalNum;
	}
	public int getTotalNum(){
		return totalNum;
	}
	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode(){
		return provinceCode;
	}
	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}
	public String getCityCode(){
		return cityCode;
	}
	public void setAreaCode(String areaCode){
		this.areaCode = areaCode;
	}
	public String getAreaCode(){
		return areaCode;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setOrderNum(String orderNum){
		this.orderNum = orderNum;
	}
	public String getOrderNum(){
		return orderNum;
	}
	public void setLastUpdated(Date lastUpdated){
		this.lastUpdated = lastUpdated;
	}
	public Date getLastUpdated(){
		return lastUpdated;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
}
