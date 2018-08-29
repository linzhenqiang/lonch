package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 询价单详情表--询价单得药品详情 实体类
 */ 
public class EnquiryOrderInfo implements Serializable {
	private String id;	// 主键id
	private String enquiryOrderId;	// 询价单表id
	private String medicinalId;	// 药品Id
	private String medicinalName;	// 药品名字
	private String medicinalCompanyName;	// 药厂名字
	private String norms;	// 规格
	private int num;	// 数量
	private String unit;	// 单位
	private String smallUnit;	// 小单位
	private String scaler;	// 换算量
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 修改时间
	private int savaStatus;	// 入库状态 0:未入库 ； 1:已入库 ; 2:已报价
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
	public void setMedicinalId(String medicinalId){
		this.medicinalId = medicinalId;
	}
	public String getMedicinalId(){
		return medicinalId;
	}
	public void setMedicinalName(String medicinalName){
		this.medicinalName = medicinalName;
	}
	public String getMedicinalName(){
		return medicinalName;
	}
	public void setMedicinalCompanyName(String medicinalCompanyName){
		this.medicinalCompanyName = medicinalCompanyName;
	}
	public String getMedicinalCompanyName(){
		return medicinalCompanyName;
	}
	public void setNorms(String norms){
		this.norms = norms;
	}
	public String getNorms(){
		return norms;
	}
	public void setNum(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return unit;
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
	public void setSavaStatus(int savaStatus){
		this.savaStatus = savaStatus;
	}
	public int getSavaStatus(){
		return savaStatus;
	}
}
