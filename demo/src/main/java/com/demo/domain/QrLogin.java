package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * qr_login 实体类
 */ 
public class QrLogin implements Serializable {
	private String id;
	private String userKey;	// 用户登录标识key
	private String sysUserId;	// 用户id
	private int status;	// 登录状态 0 异常 1正常
	private int isLogined;	// 是否成功登录 0 : 否   1:是
	private int type;	// 登录用户类型  1:诊所医生；2:商业公司
	private String location;	// 用户定位
	private Date createTime;
	private Date updateTime;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setUserKey(String userKey){
		this.userKey = userKey;
	}
	public String getUserKey(){
		return userKey;
	}
	public void setSysUserId(String sysUserId){
		this.sysUserId = sysUserId;
	}
	public String getSysUserId(){
		return sysUserId;
	}
	public void setStatus(int status){
		this.status = status;
	}
	public int getStatus(){
		return status;
	}
	public void setIsLogined(int isLogined){
		this.isLogined = isLogined;
	}
	public int getIsLogined(){
		return isLogined;
	}
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation(){
		return location;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Date getUpdateTime(){
		return updateTime;
	}
}
