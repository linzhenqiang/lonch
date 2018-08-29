package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * sys_user_extend 实体类
 */ 
public class SysUserExtend implements Serializable {
	private static final long serialVersionUID = 4206555432752019599L;
	private String id;	// id
	private String sysUserId;	// 对应用户表id
	private int type;	// 1 表示unionId, 2表示药保单小程序openId (因为现在没有跟开方平台关联，所有 1 现在不用)
	private String value;	// 类型对应的字段值
	private Date dateCreated;	// 创建时间

	public SysUserExtend() {
		super();
	}

	public SysUserExtend(String id, String sysUserId, int type, String value, Date dateCreated) {
		this.id = id;
		this.sysUserId = sysUserId;
		this.type = type;
		this.value = value;
		this.dateCreated = dateCreated;
	}

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
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
	}
	public void setValue(String value){
		this.value = value;
	}
	public String getValue(){
		return value;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
}
