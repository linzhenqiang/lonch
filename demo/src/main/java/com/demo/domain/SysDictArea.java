package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * sys_dict_area 实体类
 */ 
public class SysDictArea implements Serializable {
	private int id;
	private String areaName;
	private String areaCode;
	private int areaLevel;
	private String parentId;
	private String zone;
	private String areaFlag;
	private String longitude;	// 经度
	private String latitude;	// 纬度
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	public String getAreaName(){
		return areaName;
	}
	public void setAreaCode(String areaCode){
		this.areaCode = areaCode;
	}
	public String getAreaCode(){
		return areaCode;
	}
	public void setAreaLevel(int areaLevel){
		this.areaLevel = areaLevel;
	}
	public int getAreaLevel(){
		return areaLevel;
	}
	public void setParentId(String parentId){
		this.parentId = parentId;
	}
	public String getParentId(){
		return parentId;
	}
	public void setZone(String zone){
		this.zone = zone;
	}
	public String getZone(){
		return zone;
	}
	public void setAreaFlag(String areaFlag){
		this.areaFlag = areaFlag;
	}
	public String getAreaFlag(){
		return areaFlag;
	}
	public void setLongitude(String longitude){
		this.longitude = longitude;
	}
	public String getLongitude(){
		return longitude;
	}
	public void setLatitude(String latitude){
		this.latitude = latitude;
	}
	public String getLatitude(){
		return latitude;
	}
}
