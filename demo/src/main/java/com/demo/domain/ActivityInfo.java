package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动详情表--活动详细商品 实体类
 */ 
public class ActivityInfo implements Serializable {
	private String id;	// id 标识 活动详情表
	private String activityId;	// 活动主键ID
	private String medicinalBaseId;	// 药品ID
	private String acMeQrcode;	// 活动-药品二维码
	private String commonName;	// 通用名
	private String commodityName;	// 商品名
	private String dosage;	// 剂型
	private String specifcations;	// 规格
	private String direction;	// 用法
	private String frequentness;	// 频率
	private String frequentnessUnit;	// 频率单位
	private String quantum;	// 用量
	private String quantumUnit;	// 用量单位
	private String dose;	// 剂量
	private int price;	// 药品价格（分）
	private int discountPrice;	// 折扣价 （分）
	private String doseUnit;	// 剂量单位
	private int type;	// 药品类型  1西药  2中药  3医疗器械
	private String commonUnit;	// 大单位
	private String minUnit;	// 小单位
	private String matrix;	// 换算量
	private String commoditySpell;	// 拼音简码
	private String commodityCode;	// 商品条码
	private String factory;	// 生产厂家
	private String factorySpell;	// 生产厂家简拼
	private String approvalNum;	// 批准文号
	private String pic;	// 药品图片
	private Date dateCreated;	// 创建时间
	private Date lastUpdate;	// 更新时间
	private String invalidTime;	// 药品效期
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setActivityId(String activityId){
		this.activityId = activityId;
	}
	public String getActivityId(){
		return activityId;
	}
	public void setMedicinalBaseId(String medicinalBaseId){
		this.medicinalBaseId = medicinalBaseId;
	}
	public String getMedicinalBaseId(){
		return medicinalBaseId;
	}
	public void setAcMeQrcode(String acMeQrcode){
		this.acMeQrcode = acMeQrcode;
	}
	public String getAcMeQrcode(){
		return acMeQrcode;
	}
	public void setCommonName(String commonName){
		this.commonName = commonName;
	}
	public String getCommonName(){
		return commonName;
	}
	public void setCommodityName(String commodityName){
		this.commodityName = commodityName;
	}
	public String getCommodityName(){
		return commodityName;
	}
	public void setDosage(String dosage){
		this.dosage = dosage;
	}
	public String getDosage(){
		return dosage;
	}
	public void setSpecifcations(String specifcations){
		this.specifcations = specifcations;
	}
	public String getSpecifcations(){
		return specifcations;
	}
	public void setDirection(String direction){
		this.direction = direction;
	}
	public String getDirection(){
		return direction;
	}
	public void setFrequentness(String frequentness){
		this.frequentness = frequentness;
	}
	public String getFrequentness(){
		return frequentness;
	}
	public void setFrequentnessUnit(String frequentnessUnit){
		this.frequentnessUnit = frequentnessUnit;
	}
	public String getFrequentnessUnit(){
		return frequentnessUnit;
	}
	public void setQuantum(String quantum){
		this.quantum = quantum;
	}
	public String getQuantum(){
		return quantum;
	}
	public void setQuantumUnit(String quantumUnit){
		this.quantumUnit = quantumUnit;
	}
	public String getQuantumUnit(){
		return quantumUnit;
	}
	public void setDose(String dose){
		this.dose = dose;
	}
	public String getDose(){
		return dose;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setDiscountPrice(int discountPrice){
		this.discountPrice = discountPrice;
	}
	public int getDiscountPrice(){
		return discountPrice;
	}
	public void setDoseUnit(String doseUnit){
		this.doseUnit = doseUnit;
	}
	public String getDoseUnit(){
		return doseUnit;
	}
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
	}
	public void setCommonUnit(String commonUnit){
		this.commonUnit = commonUnit;
	}
	public String getCommonUnit(){
		return commonUnit;
	}
	public void setMinUnit(String minUnit){
		this.minUnit = minUnit;
	}
	public String getMinUnit(){
		return minUnit;
	}
	public void setMatrix(String matrix){
		this.matrix = matrix;
	}
	public String getMatrix(){
		return matrix;
	}
	public void setCommoditySpell(String commoditySpell){
		this.commoditySpell = commoditySpell;
	}
	public String getCommoditySpell(){
		return commoditySpell;
	}
	public void setCommodityCode(String commodityCode){
		this.commodityCode = commodityCode;
	}
	public String getCommodityCode(){
		return commodityCode;
	}
	public void setFactory(String factory){
		this.factory = factory;
	}
	public String getFactory(){
		return factory;
	}
	public void setFactorySpell(String factorySpell){
		this.factorySpell = factorySpell;
	}
	public String getFactorySpell(){
		return factorySpell;
	}
	public void setApprovalNum(String approvalNum){
		this.approvalNum = approvalNum;
	}
	public String getApprovalNum(){
		return approvalNum;
	}
	public void setPic(String pic){
		this.pic = pic;
	}
	public String getPic(){
		return pic;
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
	public void setInvalidTime(String invalidTime){
		this.invalidTime = invalidTime;
	}
	public String getInvalidTime(){
		return invalidTime;
	}
}
