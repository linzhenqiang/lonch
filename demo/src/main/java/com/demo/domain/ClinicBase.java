package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 诊所-药店  基础库 实体类
 */ 
public class ClinicBase implements Serializable {
	private String id;	// 主键
	private String orgId;	// 销客诊所id
	private String clinicName;	// 诊所名字
	private String legalPerson;	// 企业法人
	private String legalPhone;	// 法人手机号
	private String contactsPerson;	// 联系人
	private String contactsPhone;	// 联系人手机号
	private String province;	// 省编码
	private String city;	// 市编码
	private String area;	// 区编码
	private String address;	// 地址
	private double lon;	// 经度
	private double lat;	// 纬度
	private int clinicType;	// 企业类型(1:诊所 2:单体药店 ,3: 连锁药店 4:综合医疗机构 5:社区服务中心)
	private String collectAddress;	// 收货地址
	private String clinicpeSpecial;	// 诊所特色
	private String managerScope;	// 经营项目
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 更新时间
	private String provinceName;
	private String cityName;
	private String areaName;
	private int isUse;	// 该诊所是否已被占用 0:未被占用   1:已被占用
	private int isFrom;	// 该诊所的数据来源 0:基础数据   1:手动添加    2:逍客同步
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setOrgId(String orgId){
		this.orgId = orgId;
	}
	public String getOrgId(){
		return orgId;
	}
	public void setClinicName(String clinicName){
		this.clinicName = clinicName;
	}
	public String getClinicName(){
		return clinicName;
	}
	public void setLegalPerson(String legalPerson){
		this.legalPerson = legalPerson;
	}
	public String getLegalPerson(){
		return legalPerson;
	}
	public void setLegalPhone(String legalPhone){
		this.legalPhone = legalPhone;
	}
	public String getLegalPhone(){
		return legalPhone;
	}
	public void setContactsPerson(String contactsPerson){
		this.contactsPerson = contactsPerson;
	}
	public String getContactsPerson(){
		return contactsPerson;
	}
	public void setContactsPhone(String contactsPhone){
		this.contactsPhone = contactsPhone;
	}
	public String getContactsPhone(){
		return contactsPhone;
	}
	public void setProvince(String province){
		this.province = province;
	}
	public String getProvince(){
		return province;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	public void setArea(String area){
		this.area = area;
	}
	public String getArea(){
		return area;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setLon(double lon){
		this.lon = lon;
	}
	public double getLon(){
		return lon;
	}
	public void setLat(double lat){
		this.lat = lat;
	}
	public double getLat(){
		return lat;
	}
	public void setClinicType(int clinicType){
		this.clinicType = clinicType;
	}
	public int getClinicType(){
		return clinicType;
	}
	public void setCollectAddress(String collectAddress){
		this.collectAddress = collectAddress;
	}
	public String getCollectAddress(){
		return collectAddress;
	}
	public void setClinicpeSpecial(String clinicpeSpecial){
		this.clinicpeSpecial = clinicpeSpecial;
	}
	public String getClinicpeSpecial(){
		return clinicpeSpecial;
	}
	public void setManagerScope(String managerScope){
		this.managerScope = managerScope;
	}
	public String getManagerScope(){
		return managerScope;
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
	public void setIsUse(int isUse){
		this.isUse = isUse;
	}
	public int getIsUse(){
		return isUse;
	}
	public void setIsFrom(int isFrom){
		this.isFrom = isFrom;
	}
	public int getIsFrom(){
		return isFrom;
	}
}
