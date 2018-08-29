package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动审核表 实体类
 */ 
public class ActivityReason implements Serializable {
	private String id;	// id 标识 activity_reason
	private String activityId;	// 活动ID
	private String reason;	// 拒绝原因
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 修改时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setActivityId(String activityId){
		this.activityId = activityId;
	}
	public String getActivityId(){
		return activityId;
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
	public void setLastUpdated(Date lastUpdated){
		this.lastUpdated = lastUpdated;
	}
	public Date getLastUpdated(){
		return lastUpdated;
	}
}
