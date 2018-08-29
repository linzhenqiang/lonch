package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动赠品表 实体类
 */ 
public class ActivityGift implements Serializable {
	private String id;	// 活动赠品表
	private String activityInfoId;	// 活动详情表id
	private int type;	// 1:本品 2:其他药品 3:其他赠品
	private int num;	// 数量
	private String unit;	// 单位
	private String name;	// 名称(增品名) 雨伞 或 药品名称
	private String medicinalBasicId;	// 药品ID(type 1和2 )
	private Date dateCreated;	// date_created 属于 活动赠品表
	private Date lastUpdate;	// last_update 属于 活动赠品表
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setActivityInfoId(String activityInfoId){
		this.activityInfoId = activityInfoId;
	}
	public String getActivityInfoId(){
		return activityInfoId;
	}
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
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
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setMedicinalBasicId(String medicinalBasicId){
		this.medicinalBasicId = medicinalBasicId;
	}
	public String getMedicinalBasicId(){
		return medicinalBasicId;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public void setLastUpdate(Date lastUpdate){
		this.lastUpdate = lastUpdate;
	}
	public Date getLastUpdate(){
		return lastUpdate;
	}
}
