package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 报价单表 实体类
 */ 
public class OfferOrder implements Serializable {
	private String id;
	private String enquiryOrderId;	// 询价单id
	private String sysUserId;	// 用户id
	private int totalPrice;	// 总价
	private int medicinalTypeNum;	// 药品种类总数
	private String words;	// 留言
	private int isOffer;	// 是否报价 0:未报价; 1:已报价；2:已忽略
	private int freight;	// 运费
	private int isDelete;	// 是否删除 0:删除；1:正常
	private Date dateCreated;
	private Date lastUpdated;
	private String clinicName;	// 诊所名字
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
	public void setSysUserId(String sysUserId){
		this.sysUserId = sysUserId;
	}
	public String getSysUserId(){
		return sysUserId;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}
	public int getTotalPrice(){
		return totalPrice;
	}
	public void setMedicinalTypeNum(int medicinalTypeNum){
		this.medicinalTypeNum = medicinalTypeNum;
	}
	public int getMedicinalTypeNum(){
		return medicinalTypeNum;
	}
	public void setWords(String words){
		this.words = words;
	}
	public String getWords(){
		return words;
	}
	public void setIsOffer(int isOffer){
		this.isOffer = isOffer;
	}
	public int getIsOffer(){
		return isOffer;
	}
	public void setFreight(int freight){
		this.freight = freight;
	}
	public int getFreight(){
		return freight;
	}
	public void setIsDelete(int isDelete){
		this.isDelete = isDelete;
	}
	public int getIsDelete(){
		return isDelete;
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
	public void setClinicName(String clinicName){
		this.clinicName = clinicName;
	}
	public String getClinicName(){
		return clinicName;
	}
}
