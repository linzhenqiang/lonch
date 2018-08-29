package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 红包主表  即  红包统计表 实体类
 */ 
public class RedPacket implements Serializable {
	private String id;	// 红包主表主键
	private String activeId;	// 红包互动表id
	private int activeNum;	// 活动编号
	private String activeClinicName;	// 活动诊所名
	private String activeClinicId;	// 活动诊所id
	private String clinicAdminNum;	// 诊所管理员账号
	private String clinicProvinceName;	// 诊所所在省名字
	private String clinicProvinceCode;	// 诊所所在省
	private String clinicCityName;	// 诊所所在市名字
	private String clinicCityCode;	// 诊所所在市
	private int isLimit;	// 是否已达到上限  暂时废弃
	private int unclaimedMoney;	// 待领取金额 单位 分
	private int totalPacketMoney;	// 累计红包金额
	private int totalPacketCount;	// 获得红包个数
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 更新时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setActiveId(String activeId){
		this.activeId = activeId;
	}
	public String getActiveId(){
		return activeId;
	}
	public void setActiveNum(int activeNum){
		this.activeNum = activeNum;
	}
	public int getActiveNum(){
		return activeNum;
	}
	public void setActiveClinicName(String activeClinicName){
		this.activeClinicName = activeClinicName;
	}
	public String getActiveClinicName(){
		return activeClinicName;
	}
	public void setActiveClinicId(String activeClinicId){
		this.activeClinicId = activeClinicId;
	}
	public String getActiveClinicId(){
		return activeClinicId;
	}
	public void setClinicAdminNum(String clinicAdminNum){
		this.clinicAdminNum = clinicAdminNum;
	}
	public String getClinicAdminNum(){
		return clinicAdminNum;
	}
	public void setClinicProvinceName(String clinicProvinceName){
		this.clinicProvinceName = clinicProvinceName;
	}
	public String getClinicProvinceName(){
		return clinicProvinceName;
	}
	public void setClinicProvinceCode(String clinicProvinceCode){
		this.clinicProvinceCode = clinicProvinceCode;
	}
	public String getClinicProvinceCode(){
		return clinicProvinceCode;
	}
	public void setClinicCityName(String clinicCityName){
		this.clinicCityName = clinicCityName;
	}
	public String getClinicCityName(){
		return clinicCityName;
	}
	public void setClinicCityCode(String clinicCityCode){
		this.clinicCityCode = clinicCityCode;
	}
	public String getClinicCityCode(){
		return clinicCityCode;
	}
	public void setIsLimit(int isLimit){
		this.isLimit = isLimit;
	}
	public int getIsLimit(){
		return isLimit;
	}
	public void setUnclaimedMoney(int unclaimedMoney){
		this.unclaimedMoney = unclaimedMoney;
	}
	public int getUnclaimedMoney(){
		return unclaimedMoney;
	}
	public void setTotalPacketMoney(int totalPacketMoney){
		this.totalPacketMoney = totalPacketMoney;
	}
	public int getTotalPacketMoney(){
		return totalPacketMoney;
	}
	public void setTotalPacketCount(int totalPacketCount){
		this.totalPacketCount = totalPacketCount;
	}
	public int getTotalPacketCount(){
		return totalPacketCount;
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
