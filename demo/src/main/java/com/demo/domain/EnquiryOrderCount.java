package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 询价单统计表 实体类
 */ 
public class EnquiryOrderCount implements Serializable {
	private String id;
	private String enquiryOrderId;	// 询价单Id
	private int medicinalTypeNum;	// 药品种类总数
	private int totalNum;	// 总数量
	private int offerCompanyNum;	// 报价的商业公司数量
	private int offerMedicinalNum;	// 报价药品种类总数
	private Date dateCreated;
	private Date lastUpdated;
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
	public void setMedicinalTypeNum(int medicinalTypeNum){
		this.medicinalTypeNum = medicinalTypeNum;
	}
	public int getMedicinalTypeNum(){
		return medicinalTypeNum;
	}
	public void setTotalNum(int totalNum){
		this.totalNum = totalNum;
	}
	public int getTotalNum(){
		return totalNum;
	}
	public void setOfferCompanyNum(int offerCompanyNum){
		this.offerCompanyNum = offerCompanyNum;
	}
	public int getOfferCompanyNum(){
		return offerCompanyNum;
	}
	public void setOfferMedicinalNum(int offerMedicinalNum){
		this.offerMedicinalNum = offerMedicinalNum;
	}
	public int getOfferMedicinalNum(){
		return offerMedicinalNum;
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
}
