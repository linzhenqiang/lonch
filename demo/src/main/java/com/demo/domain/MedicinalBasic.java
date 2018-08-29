package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 我的商品库表 实体类
 */ 
public class MedicinalBasic implements Serializable {
	private String id;	// 主键id
	private String mebId;	// 云诊室药品ID
	private String sysUserId;	// sys_user_id用户id
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
	private int type;	// 药品类型  0其他 1西药  2中药  3中草药
	private int price;	// 药品价格
	private String doseUnit;	// 剂量单位
	private String commonUnit;	// 大单位
	private String minUnit;	// 小单位
	private String matrix;	// 换算量
	private String commoditySpell;	// 拼音简码
	private String commodityCode;	// 商品条码
	private String factory;	// 生产厂家
	private String factorySpell;	// 生产厂家简拼
	private int isForm;	// 数据来源 1:云诊室 ；2:手动添加 
	private String approvalNum;	// 批准文号
	private String pic;	// 药品图片
	private String qcode;	// 药品二维码
	private int status;	// 药品状态 0:异常；1:正常
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 修改时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setMebId(String mebId){
		this.mebId = mebId;
	}
	public String getMebId(){
		return mebId;
	}
	public void setSysUserId(String sysUserId){
		this.sysUserId = sysUserId;
	}
	public String getSysUserId(){
		return sysUserId;
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
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setDoseUnit(String doseUnit){
		this.doseUnit = doseUnit;
	}
	public String getDoseUnit(){
		return doseUnit;
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
	public void setIsForm(int isForm){
		this.isForm = isForm;
	}
	public int getIsForm(){
		return isForm;
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
	public void setQcode(String qcode){
		this.qcode = qcode;
	}
	public String getQcode(){
		return qcode;
	}
	public void setStatus(int status){
		this.status = status;
	}
	public int getStatus(){
		return status;
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
}
