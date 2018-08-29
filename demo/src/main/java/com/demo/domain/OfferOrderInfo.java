package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 报价单详情表--报价的药品 实体类
 */ 
public class OfferOrderInfo implements Serializable {
	private String id;
	private String offerOrderId;	// 报价单id
	private String enquiryOrderId;	// 询价单ID
	private String enquiryOrderInfoId;	// 询价单从表id
	private String medicinalName;	// 药品名字
	private String medicinalId;	// 药品id
	private String norms;	// 规格
	private int price;	// 单价
	private int num;	// 数量
	private int isOffer;	// 是否报价 0:未报价；1:已报价
	private int isSave;	// 是否入库 0:未入库  ； 1:已入库
	private String smallUnit;	// 小单位
	private String scaler;	// 换算量
	private String unit;	// 单位
	private String invalidTime;	// 有效期
	private int totalPrice;	// 总价
	private Date dateCreated;
	private Date lastUpdated;
	private String medicinalCompanyName;	// 药品的生产厂家
	private String businessId;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setOfferOrderId(String offerOrderId){
		this.offerOrderId = offerOrderId;
	}
	public String getOfferOrderId(){
		return offerOrderId;
	}
	public void setEnquiryOrderId(String enquiryOrderId){
		this.enquiryOrderId = enquiryOrderId;
	}
	public String getEnquiryOrderId(){
		return enquiryOrderId;
	}
	public void setEnquiryOrderInfoId(String enquiryOrderInfoId){
		this.enquiryOrderInfoId = enquiryOrderInfoId;
	}
	public String getEnquiryOrderInfoId(){
		return enquiryOrderInfoId;
	}
	public void setMedicinalName(String medicinalName){
		this.medicinalName = medicinalName;
	}
	public String getMedicinalName(){
		return medicinalName;
	}
	public void setMedicinalId(String medicinalId){
		this.medicinalId = medicinalId;
	}
	public String getMedicinalId(){
		return medicinalId;
	}
	public void setNorms(String norms){
		this.norms = norms;
	}
	public String getNorms(){
		return norms;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setNum(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}
	public void setIsOffer(int isOffer){
		this.isOffer = isOffer;
	}
	public int getIsOffer(){
		return isOffer;
	}
	public void setIsSave(int isSave){
		this.isSave = isSave;
	}
	public int getIsSave(){
		return isSave;
	}
	public void setSmallUnit(String smallUnit){
		this.smallUnit = smallUnit;
	}
	public String getSmallUnit(){
		return smallUnit;
	}
	public void setScaler(String scaler){
		this.scaler = scaler;
	}
	public String getScaler(){
		return scaler;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return unit;
	}
	public void setInvalidTime(String invalidTime){
		this.invalidTime = invalidTime;
	}
	public String getInvalidTime(){
		return invalidTime;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}
	public int getTotalPrice(){
		return totalPrice;
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
	public void setMedicinalCompanyName(String medicinalCompanyName){
		this.medicinalCompanyName = medicinalCompanyName;
	}
	public String getMedicinalCompanyName(){
		return medicinalCompanyName;
	}
	public void setBusinessId(String businessId){
		this.businessId = businessId;
	}
	public String getBusinessId(){
		return businessId;
	}
}
