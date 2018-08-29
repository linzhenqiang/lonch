package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * sys_user 实体类
 */ 
public class SysUser implements Serializable {
	private String id;	// 主键ID
	private String userName;	// 用户名
	private String passWord;	// 密码
	private String openId;	// 微信唯一标识
	private int isAttention;	// 是否关注公众号   0：未关注；1：关注
	private int status;	// 用户状态  0:异常；1:正常
	private String phone;	// 业务员手机号
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 修改时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setPassWord(String passWord){
		this.passWord = passWord;
	}
	public String getPassWord(){
		return passWord;
	}
	public void setOpenId(String openId){
		this.openId = openId;
	}
	public String getOpenId(){
		return openId;
	}
	public void setIsAttention(int isAttention){
		this.isAttention = isAttention;
	}
	public int getIsAttention(){
		return isAttention;
	}
	public void setStatus(int status){
		this.status = status;
	}
	public int getStatus(){
		return status;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
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
