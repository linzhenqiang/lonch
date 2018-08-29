package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单驳回表 实体类
 */ 
public class OrderRefuse implements Serializable {
	private String id;	// 主键id
	private String orderBusinessId;	// 订单id
	private String clinicId;
	private String reason;	// 驳回原因
	private Date dateCreated;	// 驳回时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setOrderBusinessId(String orderBusinessId){
		this.orderBusinessId = orderBusinessId;
	}
	public String getOrderBusinessId(){
		return orderBusinessId;
	}
	public void setClinicId(String clinicId){
		this.clinicId = clinicId;
	}
	public String getClinicId(){
		return clinicId;
	}
	public void setReason(String reason){
		this.reason = reason;
	}
	public String getReason(){
		return reason;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
}
