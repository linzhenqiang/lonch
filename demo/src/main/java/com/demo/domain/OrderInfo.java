package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 采购单详情表--采购单的详细药品信息 实体类
 */ 
public class OrderInfo implements Serializable {
	private String id;
	private String orderBusinessId;	// 订单商业公司id
	private String sysUserId;	// 用户id
	private String medicinalName;	// 药品名字
	private String medicinalId;	// 活动详情id(activeInfoId)
	private int price;	// 单价
	private int num;	// 数量
	private String unit;	// 单位
	private String norms;
	private String smallUnit;	// 小单位
	private String scaler;	// 换算量
	private String invalidTime;	// 失效时间
	private String medicinalCompanyName;	// 药品公司名字
	private Date dateCreated;	// 创建时间
	private int totalPrice;	// 总价
	private int isSave;	// 是否入库
	private int saveNum;	// 入库数量
	private Date lastUpdated;	// 更新时间
	private String ordersId;	// orders表id 
	private int savePrice;	// 入库单价
	private Date saveTime;	// 入库时间
	private String activityGiftId;	// 活动赠品Id
	private String activityInfoId;	// 活动详情Id
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setOrderBusinessId(String orderBusinessId){
		this.orderBusinessId = orderBusinessId;
	}
	public String getOrderBusinessId(){
		return orderBusinessId;
	}
	public void setSysUserId(String sysUserId){
		this.sysUserId = sysUserId;
	}
	public String getSysUserId(){
		return sysUserId;
	}
	public void setMedicinalName(String medicinalName){
		this.medicinalName = medicinalName;
	}
	public String getMedicinalName(){
		return medicinalName;
	}
	public void setMedicinalId(String medicinalId){
		this.medicinalId = medicinalId;
	}
	public String getMedicinalId(){
		return medicinalId;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
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
	public void setNorms(String norms){
		this.norms = norms;
	}
	public String getNorms(){
		return norms;
	}
	public void setSmallUnit(String smallUnit){
		this.smallUnit = smallUnit;
	}
	public String getSmallUnit(){
		return smallUnit;
	}
	public void setScaler(String scaler){
		this.scaler = scaler;
	}
	public String getScaler(){
		return scaler;
	}
	public void setInvalidTime(String invalidTime){
		this.invalidTime = invalidTime;
	}
	public String getInvalidTime(){
		return invalidTime;
	}
	public void setMedicinalCompanyName(String medicinalCompanyName){
		this.medicinalCompanyName = medicinalCompanyName;
	}
	public String getMedicinalCompanyName(){
		return medicinalCompanyName;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}
	public int getTotalPrice(){
		return totalPrice;
	}
	public void setIsSave(int isSave){
		this.isSave = isSave;
	}
	public int getIsSave(){
		return isSave;
	}
	public void setSaveNum(int saveNum){
		this.saveNum = saveNum;
	}
	public int getSaveNum(){
		return saveNum;
	}
	public void setLastUpdated(Date lastUpdated){
		this.lastUpdated = lastUpdated;
	}
	public Date getLastUpdated(){
		return lastUpdated;
	}
	public void setOrdersId(String ordersId){
		this.ordersId = ordersId;
	}
	public String getOrdersId(){
		return ordersId;
	}
	public void setSavePrice(int savePrice){
		this.savePrice = savePrice;
	}
	public int getSavePrice(){
		return savePrice;
	}
	public void setSaveTime(Date saveTime){
		this.saveTime = saveTime;
	}
	public Date getSaveTime(){
		return saveTime;
	}
	public void setActivityGiftId(String activityGiftId){
		this.activityGiftId = activityGiftId;
	}
	public String getActivityGiftId(){
		return activityGiftId;
	}
	public void setActivityInfoId(String activityInfoId){
		this.activityInfoId = activityInfoId;
	}
	public String getActivityInfoId(){
		return activityInfoId;
	}
}
