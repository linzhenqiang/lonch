package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 商业公司详情表,主要存储审核拒绝原因 实体类
 */ 
public class BusinessInfo implements Serializable {
	private String id;
	private String businessId;	// 商业公司ID 
	private String refuseReason;	// 拒绝原因
	private Date dateCreated;	// 创建时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setBusinessId(String businessId){
		this.businessId = businessId;
	}
	public String getBusinessId(){
		return businessId;
	}
	public void setRefuseReason(String refuseReason){
		this.refuseReason = refuseReason;
	}
	public String getRefuseReason(){
		return refuseReason;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
}
