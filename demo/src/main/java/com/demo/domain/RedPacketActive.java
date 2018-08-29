package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 红包活动表 实体类
 */ 
public class RedPacketActive implements Serializable {
	private String id;	// 红包活动表主键
	private int activeNum;	// 红包活动编号
	private String activeArea;	// 活动区域
	private int activeType;	// 活动方式   0累计订单金额  1单笔订单金额
	private int cumulativeCycle;	// 活动周期 0一周  1一个月  2活动时间段
	private int grantCondition;	// 红包发放条件,累计订单金额要求/订单金额要求金额要求  单位：分
	private int proportion;	// 发放比例 整数
	private int upperLimitUnit;	// 发放上限单位 0单次发放  1累计发放
	private int upperLimitMoney;	// 红包上限金额 单位 分
	private Date startTime;	// 活动起始时间
	private Date endTime;	// 活动结束时间
	private int activeStatus;	// 活动状态 0未开始 1进行中 2已结束
	private int startStatus;	// 启动状态  0 关闭  1 启动
	private String activePageUrl;	// 活动页链接
	private int preheatTime;	// 活动预热时间
	private String remarks;	// 活动备注
	private String operationNum;	// 操作账号
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 更新时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setActiveNum(int activeNum){
		this.activeNum = activeNum;
	}
	public int getActiveNum(){
		return activeNum;
	}
	public void setActiveArea(String activeArea){
		this.activeArea = activeArea;
	}
	public String getActiveArea(){
		return activeArea;
	}
	public void setActiveType(int activeType){
		this.activeType = activeType;
	}
	public int getActiveType(){
		return activeType;
	}
	public void setCumulativeCycle(int cumulativeCycle){
		this.cumulativeCycle = cumulativeCycle;
	}
	public int getCumulativeCycle(){
		return cumulativeCycle;
	}
	public void setGrantCondition(int grantCondition){
		this.grantCondition = grantCondition;
	}
	public int getGrantCondition(){
		return grantCondition;
	}
	public void setProportion(int proportion){
		this.proportion = proportion;
	}
	public int getProportion(){
		return proportion;
	}
	public void setUpperLimitUnit(int upperLimitUnit){
		this.upperLimitUnit = upperLimitUnit;
	}
	public int getUpperLimitUnit(){
		return upperLimitUnit;
	}
	public void setUpperLimitMoney(int upperLimitMoney){
		this.upperLimitMoney = upperLimitMoney;
	}
	public int getUpperLimitMoney(){
		return upperLimitMoney;
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
	public void setActiveStatus(int activeStatus){
		this.activeStatus = activeStatus;
	}
	public int getActiveStatus(){
		return activeStatus;
	}
	public void setStartStatus(int startStatus){
		this.startStatus = startStatus;
	}
	public int getStartStatus(){
		return startStatus;
	}
	public void setActivePageUrl(String activePageUrl){
		this.activePageUrl = activePageUrl;
	}
	public String getActivePageUrl(){
		return activePageUrl;
	}
	public void setPreheatTime(int preheatTime){
		this.preheatTime = preheatTime;
	}
	public int getPreheatTime(){
		return preheatTime;
	}
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}
	public String getRemarks(){
		return remarks;
	}
	public void setOperationNum(String operationNum){
		this.operationNum = operationNum;
	}
	public String getOperationNum(){
		return operationNum;
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
