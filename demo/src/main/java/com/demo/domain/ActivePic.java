package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动标准图库 实体类
 */ 
public class ActivePic implements Serializable {
	private static final long serialVersionUID = -3244090857344057648L;
	private String id;	// id 标识 活动图片库
	private String pic;	// 图片地址 url
	private int type;	// 1: 活动标准图;2商品标准图
	private int isDelete;	// 是否删除 1:正常 0：删除
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 修改时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setPic(String pic){
		this.pic = pic;
	}
	public String getPic(){
		return pic;
	}
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
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
}
