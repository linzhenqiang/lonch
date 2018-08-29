package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 商业公司--采购单表  每个商业公司一条记录 实体类
 */ 
public class OrderBusiness implements Serializable {
	private String id;
	private String ordersId;	// 采购订单Id
	private String sysUserId;
	private int medicinalTypeNum;	// 报价药品种类
	private int medicinalTotalNum;
	private int status;	// 状态 0:待发货 ； 1:已发货(待收货) ； 2:已收货 3:已取消
	private String companyName;	// 商业公司名字
	private String phone;	// 商业公司联系电话
	private int freight;	// 运费
	private String businessId;	// 商业公司ID
	private Date dateCreated;
	private Date lastUpdated;
	private String linkman;	// 商家联系人
	private Date deliveryTime;	// 发货时间
	private Date receivingTime;	// 收货时间
	private String orderNum;	// 订单编号
	private int isFrom;	// 订单来源 0活动订单  1药报单询价
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setOrdersId(String ordersId){
		this.ordersId = ordersId;
	}
	public String getOrdersId(){
		return ordersId;
	}
	public void setSysUserId(String sysUserId){
		this.sysUserId = sysUserId;
	}
	public String getSysUserId(){
		return sysUserId;
	}
	public void setMedicinalTypeNum(int medicinalTypeNum){
		this.medicinalTypeNum = medicinalTypeNum;
	}
	public int getMedicinalTypeNum(){
		return medicinalTypeNum;
	}
	public void setMedicinalTotalNum(int medicinalTotalNum){
		this.medicinalTotalNum = medicinalTotalNum;
	}
	public int getMedicinalTotalNum(){
		return medicinalTotalNum;
	}
	public void setStatus(int status){
		this.status = status;
	}
	public int getStatus(){
		return status;
	}
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	public String getCompanyName(){
		return companyName;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setFreight(int freight){
		this.freight = freight;
	}
	public int getFreight(){
		return freight;
	}
	public void setBusinessId(String businessId){
		this.businessId = businessId;
	}
	public String getBusinessId(){
		return businessId;
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
	public void setLinkman(String linkman){
		this.linkman = linkman;
	}
	public String getLinkman(){
		return linkman;
	}
	public void setDeliveryTime(Date deliveryTime){
		this.deliveryTime = deliveryTime;
	}
	public Date getDeliveryTime(){
		return deliveryTime;
	}
	public void setReceivingTime(Date receivingTime){
		this.receivingTime = receivingTime;
	}
	public Date getReceivingTime(){
		return receivingTime;
	}
	public void setOrderNum(String orderNum){
		this.orderNum = orderNum;
	}
	public String getOrderNum(){
		return orderNum;
	}
	public void setIsFrom(int isFrom){
		this.isFrom = isFrom;
	}
	public int getIsFrom(){
		return isFrom;
	}
}
