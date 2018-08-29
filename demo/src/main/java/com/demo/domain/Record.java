package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * record 实体类
 */ 
public class Record implements Serializable {
	private int id;	// 调试使用,该表无用
	private String account;	// 调试使用,该表无用
	private String password;	// 调试使用,该表无用
	private Date createTime;	// 调试使用,该表无用
	private String k;	// 调试使用,该表无用
	private String location;	// 调试使用,该表无用
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setAccount(String account){
		this.account = account;
	}
	public String getAccount(){
		return account;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return password;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
	public void setK(String k){
		this.k = k;
	}
	public String getK(){
		return k;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation(){
		return location;
	}
}
