package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 询价单表 实体类
 */ 
public class EnquiryOrder implements Serializable {
	private String id;
	private String clinicId;	// 诊所ID
	private String doctorId;	// 医生ID
	private String clinicName;	// 诊所名字
	private String doctorName;	// 医生名字
	private String orderNum;	// 订单编号
	private String words;	// 留言
	private int orderStatus;	// 询价单状态  0:询价 ;1:已报价; 2:已入库(已采购)
	private String qrcode;	// 二维码
	private String consigneeName;	// 收货人姓名
	private String consigneePhone;	// 收货人电话
	private String consigneeAddress;	// 收货人详情地址
	private int isDelete;	// 是否删除  0：删除  ； 1：正常 
	private int isShare;	// 是否分享 0:未分享 ；1:已分享
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 更新时间
	private String province;	// 收货人省份
	private String city;	// 城市
	private String area;	// 区
	private String provinceCode;
	private String cityCode;
	private String areaCode;
	private int type;	// 1:一体机;2:小程序
	private int share;	// 0为分享到商城 1分享到商城
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setClinicId(String clinicId){
		this.clinicId = clinicId;
	}
	public String getClinicId(){
		return clinicId;
	}
	public void setDoctorId(String doctorId){
		this.doctorId = doctorId;
	}
	public String getDoctorId(){
		return doctorId;
	}
	public void setClinicName(String clinicName){
		this.clinicName = clinicName;
	}
	public String getClinicName(){
		return clinicName;
	}
	public void setDoctorName(String doctorName){
		this.doctorName = doctorName;
	}
	public String getDoctorName(){
		return doctorName;
	}
	public void setOrderNum(String orderNum){
		this.orderNum = orderNum;
	}
	public String getOrderNum(){
		return orderNum;
	}
	public void setWords(String words){
		this.words = words;
	}
	public String getWords(){
		return words;
	}
	public void setOrderStatus(int orderStatus){
		this.orderStatus = orderStatus;
	}
	public int getOrderStatus(){
		return orderStatus;
	}
	public void setQrcode(String qrcode){
		this.qrcode = qrcode;
	}
	public String getQrcode(){
		return qrcode;
	}
	public void setConsigneeName(String consigneeName){
		this.consigneeName = consigneeName;
	}
	public String getConsigneeName(){
		return consigneeName;
	}
	public void setConsigneePhone(String consigneePhone){
		this.consigneePhone = consigneePhone;
	}
	public String getConsigneePhone(){
		return consigneePhone;
	}
	public void setConsigneeAddress(String consigneeAddress){
		this.consigneeAddress = consigneeAddress;
	}
	public String getConsigneeAddress(){
		return consigneeAddress;
	}
	public void setIsDelete(int isDelete){
		this.isDelete = isDelete;
	}
	public int getIsDelete(){
		return isDelete;
	}
	public void setIsShare(int isShare){
		this.isShare = isShare;
	}
	public int getIsShare(){
		return isShare;
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
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
	}
	public void setShare(int share){
		this.share = share;
	}
	public int getShare(){
		return share;
	}
}
