package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动表 实体类
 */ 
public class Activity implements Serializable {
	private String id;	// 主键ID
	private String businessId;	// 商业公司id
	private String sysUserId;	// 用户id  业务员id
	private String theme;	// 活动主题
	private Date startTime;	// 活动开始时间
	private Date endTime;	// 活动结束时间
	private String description;	// 活动说明
	private long activityNum;	// 活动编号 15 位不重复的随机数
	private int type;	// 1:折扣 ; 2:满赠
	private String discounts;	// 折扣力度
	private int num;	// 最低购买数量
	private String url;	// 活动图片
	private String distributionArea;	// 活动区域
	private int freight;	// 运费(存 分)
	private int status;	// 活动状态 1:待审核; 2:审核通过;3:已拒绝; 4:进行中; 5:结束; 6:下架; 7:失效；
	private int isDelete;	// 是否删除  0删除  1正常
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 修改时间
	private Date examineTime;	// 审核时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setBusinessId(String businessId){
		this.businessId = businessId;
	}
	public String getBusinessId(){
		return businessId;
	}
	public void setSysUserId(String sysUserId){
		this.sysUserId = sysUserId;
	}
	public String getSysUserId(){
		return sysUserId;
	}
	public void setTheme(String theme){
		this.theme = theme;
	}
	public String getTheme(){
		return theme;
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
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	public void setActivityNum(long activityNum){
		this.activityNum = activityNum;
	}
	public long getActivityNum(){
		return activityNum;
	}
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
	}
	public void setDiscounts(String discounts){
		this.discounts = discounts;
	}
	public String getDiscounts(){
		return discounts;
	}
	public void setNum(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return url;
	}
	public void setDistributionArea(String distributionArea){
		this.distributionArea = distributionArea;
	}
	public String getDistributionArea(){
		return distributionArea;
	}
	public void setFreight(int freight){
		this.freight = freight;
	}
	public int getFreight(){
		return freight;
	}
	public void setStatus(int status){
		this.status = status;
	}
	public int getStatus(){
		return status;
	}
	public void setIsDelete(int isDelete){
		this.isDelete = isDelete;
	}
	public int getIsDelete(){
		return isDelete;
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
	public void setExamineTime(Date examineTime){
		this.examineTime = examineTime;
	}
	public Date getExamineTime(){
		return examineTime;
	}
}
