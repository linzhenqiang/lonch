package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * sys_business 实体类
 */ 
public class SysBusiness implements Serializable {
	private String id;
	private String sysUserId;
	private String baseId;
	private Date dateCreated;
	private int type;	// 0: 用户与商业公司关系 ；  1:用户与诊所的关系
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setSysUserId(String sysUserId){
		this.sysUserId = sysUserId;
	}
	public String getSysUserId(){
		return sysUserId;
	}
	public void setBaseId(String baseId){
		this.baseId = baseId;
	}
	public String getBaseId(){
		return baseId;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
	}
}
