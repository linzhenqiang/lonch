package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 红包详情表 实体类
 */ 
public class RedPacketInfo implements Serializable {
	private String id;	// 红包从表主键
	private String redPacketId;	// 红包表id
	private String orderBusinessId;	// 采购单商业公司表id--数组
	private String clinicId;	// 诊所id
	private String activeId;	// 活动id
	private String activeNum;	// 活动编号
	private String clinicName;	// 诊所名字
	private String catchRedPacketNum;	// 领取红包账号
	private int sendType;	// 红包发放类型 0累计订单金额  1单笔订单金额
	private int orderTotalPrice;	// 订单金额
	private int sendMoney;	// 红包发放金额
	private Date startTime;	// 红包产生周期的起始时间
	private Date endTime;	// 红包产生周期结束时间（如果是单笔订单金额方式就是产生红包时间）
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 更新时间(发放时间)
	private int warehousingStatus;	// 入库状态  0 未入库  1 已入库
	private int redStatus;	// 红包状态: 0 : 未发放   1 : 已发放    2 : 发放失败
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setRedPacketId(String redPacketId){
		this.redPacketId = redPacketId;
	}
	public String getRedPacketId(){
		return redPacketId;
	}
	public void setOrderBusinessId(String orderBusinessId){
		this.orderBusinessId = orderBusinessId;
	}
	public String getOrderBusinessId(){
		return orderBusinessId;
	}
	public void setClinicId(String clinicId){
		this.clinicId = clinicId;
	}
	public String getClinicId(){
		return clinicId;
	}
	public void setActiveId(String activeId){
		this.activeId = activeId;
	}
	public String getActiveId(){
		return activeId;
	}
	public void setActiveNum(String activeNum){
		this.activeNum = activeNum;
	}
	public String getActiveNum(){
		return activeNum;
	}
	public void setClinicName(String clinicName){
		this.clinicName = clinicName;
	}
	public String getClinicName(){
		return clinicName;
	}
	public void setCatchRedPacketNum(String catchRedPacketNum){
		this.catchRedPacketNum = catchRedPacketNum;
	}
	public String getCatchRedPacketNum(){
		return catchRedPacketNum;
	}
	public void setSendType(int sendType){
		this.sendType = sendType;
	}
	public int getSendType(){
		return sendType;
	}
	public void setOrderTotalPrice(int orderTotalPrice){
		this.orderTotalPrice = orderTotalPrice;
	}
	public int getOrderTotalPrice(){
		return orderTotalPrice;
	}
	public void setSendMoney(int sendMoney){
		this.sendMoney = sendMoney;
	}
	public int getSendMoney(){
		return sendMoney;
	}
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	public Date getStartTime(){
		return startTime;
	}
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	public Date getEndTime(){
		return endTime;
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
	public void setWarehousingStatus(int warehousingStatus){
		this.warehousingStatus = warehousingStatus;
	}
	public int getWarehousingStatus(){
		return warehousingStatus;
	}
	public void setRedStatus(int redStatus){
		this.redStatus = redStatus;
	}
	public int getRedStatus(){
		return redStatus;
	}
}
