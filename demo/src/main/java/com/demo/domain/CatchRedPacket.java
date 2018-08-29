package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 红包领取信息表 实体类
 */ 
public class CatchRedPacket implements Serializable {
	private String id;	// 红包领取表主键id
	private String openId;	// 微信唯一标识
	private String redPacketInfoId;	// 红包详情表id,数组结构
	private String clinicId;	// 诊所id
	private String clinicName;	// 诊所名称
	private String doctorId;	// 医生id
	private String doctorName;	// 医生名字
	private Date dateCreated;	// 创建时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setOpenId(String openId){
		this.openId = openId;
	}
	public String getOpenId(){
		return openId;
	}
	public void setRedPacketInfoId(String redPacketInfoId){
		this.redPacketInfoId = redPacketInfoId;
	}
	public String getRedPacketInfoId(){
		return redPacketInfoId;
	}
	public void setClinicId(String clinicId){
		this.clinicId = clinicId;
	}
	public String getClinicId(){
		return clinicId;
	}
	public void setClinicName(String clinicName){
		this.clinicName = clinicName;
	}
	public String getClinicName(){
		return clinicName;
	}
	public void setDoctorId(String doctorId){
		this.doctorId = doctorId;
	}
	public String getDoctorId(){
		return doctorId;
	}
	public void setDoctorName(String doctorName){
		this.doctorName = doctorName;
	}
	public String getDoctorName(){
		return doctorName;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
}
