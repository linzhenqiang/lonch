package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * phone_code 实体类
 */ 
public class PhoneCode implements Serializable {
	private String id;
	private String phone;
	private String code;
	private Date dateCreated;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setCode(String code){
		this.code = code;
	}
	public String getCode(){
		return code;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
}
