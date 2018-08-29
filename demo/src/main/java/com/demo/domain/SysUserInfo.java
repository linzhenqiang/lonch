package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * sys_user_info 实体类
 */ 
public class SysUserInfo implements Serializable {
	private String id;	// 主键ID
	private String sysUserId;	// 外键，对应用户表主键ID 
	private String realName;	// 真实姓名
	private String birthDay;	// 出生日期
	private String idCard;	// 身份证号
	private String phone;	// 手机号
	private String provinceCode;	// 省code
	private String cityCode;	// 市code
	private String areaCode;	// 区code
	private String distributionArea;	// 配送区域
	private String nickName;	// 微信昵称
	private int sex;	// 1:男；   0:女
	private String portraitImg;	// 头像
	private String address;	// 地址
	private int type;	// 用户类型  1:诊所医生；2:商业公司
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 更新时间
	private String provinceName;
	private String cityName;
	private String areaName;
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
	public void setRealName(String realName){
		this.realName = realName;
	}
	public String getRealName(){
		return realName;
	}
	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}
	public String getBirthDay(){
		return birthDay;
	}
	public void setIdCard(String idCard){
		this.idCard = idCard;
	}
	public String getIdCard(){
		return idCard;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode(){
		return provinceCode;
	}
	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}
	public String getCityCode(){
		return cityCode;
	}
	public void setAreaCode(String areaCode){
		this.areaCode = areaCode;
	}
	public String getAreaCode(){
		return areaCode;
	}
	public void setDistributionArea(String distributionArea){
		this.distributionArea = distributionArea;
	}
	public String getDistributionArea(){
		return distributionArea;
	}
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	public String getNickName(){
		return nickName;
	}
	public void setSex(int sex){
		this.sex = sex;
	}
	public int getSex(){
		return sex;
	}
	public void setPortraitImg(String portraitImg){
		this.portraitImg = portraitImg;
	}
	public String getPortraitImg(){
		return portraitImg;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
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
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}
	public String getProvinceName(){
		return provinceName;
	}
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	public String getCityName(){
		return cityName;
	}
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	public String getAreaName(){
		return areaName;
	}
}
