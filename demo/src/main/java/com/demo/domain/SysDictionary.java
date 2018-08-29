package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 药品单位字典表 实体类
 */ 
public class SysDictionary implements Serializable {
	private String id;
	private String name;
	private String code;
	private String parentId;
	private String baseVersion;
	private double status;
	private double isDelete;
	private double orderNum;
	private String remark;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setCode(String code){
		this.code = code;
	}
	public String getCode(){
		return code;
	}
	public void setParentId(String parentId){
		this.parentId = parentId;
	}
	public String getParentId(){
		return parentId;
	}
	public void setBaseVersion(String baseVersion){
		this.baseVersion = baseVersion;
	}
	public String getBaseVersion(){
		return baseVersion;
	}
	public void setStatus(double status){
		this.status = status;
	}
	public double getStatus(){
		return status;
	}
	public void setIsDelete(double isDelete){
		this.isDelete = isDelete;
	}
	public double getIsDelete(){
		return isDelete;
	}
	public void setOrderNum(double orderNum){
		this.orderNum = orderNum;
	}
	public double getOrderNum(){
		return orderNum;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return remark;
	}
}
