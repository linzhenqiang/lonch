package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 商业公司基础库从表 实体类
 */ 
public class BusinessBehind implements Serializable {
	private String id;	// 主键
	private String businessId;	// 基础库id
	private String regAddress;
	private String warehouseAddress;
	private String managerType;	// 商业公司类型  批发/零售
	private String meLicenceNo;	// 药品许可证编号
	private String meLicencePic;	// 药品许可证图片
	private String meLicenceStart;	// 许可证起始时间
	private String meLicenceEnd;	// 许可证结束时间
	private String gspNo;
	private String gspPic;	// GSP 照片
	private String gspStart;	// GSP 有效期开始
	private String gspEnd;	// GSP 有效期结束
	private String licenceNo;	// 营业执照号
	private String licencePic;	// 营业执照图片
	private String operationScope;	// 经营范围
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 更新时间
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
	public void setRegAddress(String regAddress){
		this.regAddress = regAddress;
	}
	public String getRegAddress(){
		return regAddress;
	}
	public void setWarehouseAddress(String warehouseAddress){
		this.warehouseAddress = warehouseAddress;
	}
	public String getWarehouseAddress(){
		return warehouseAddress;
	}
	public void setManagerType(String managerType){
		this.managerType = managerType;
	}
	public String getManagerType(){
		return managerType;
	}
	public void setMeLicenceNo(String meLicenceNo){
		this.meLicenceNo = meLicenceNo;
	}
	public String getMeLicenceNo(){
		return meLicenceNo;
	}
	public void setMeLicencePic(String meLicencePic){
		this.meLicencePic = meLicencePic;
	}
	public String getMeLicencePic(){
		return meLicencePic;
	}
	public void setMeLicenceStart(String meLicenceStart){
		this.meLicenceStart = meLicenceStart;
	}
	public String getMeLicenceStart(){
		return meLicenceStart;
	}
	public void setMeLicenceEnd(String meLicenceEnd){
		this.meLicenceEnd = meLicenceEnd;
	}
	public String getMeLicenceEnd(){
		return meLicenceEnd;
	}
	public void setGspNo(String gspNo){
		this.gspNo = gspNo;
	}
	public String getGspNo(){
		return gspNo;
	}
	public void setGspPic(String gspPic){
		this.gspPic = gspPic;
	}
	public String getGspPic(){
		return gspPic;
	}
	public void setGspStart(String gspStart){
		this.gspStart = gspStart;
	}
	public String getGspStart(){
		return gspStart;
	}
	public void setGspEnd(String gspEnd){
		this.gspEnd = gspEnd;
	}
	public String getGspEnd(){
		return gspEnd;
	}
	public void setLicenceNo(String licenceNo){
		this.licenceNo = licenceNo;
	}
	public String getLicenceNo(){
		return licenceNo;
	}
	public void setLicencePic(String licencePic){
		this.licencePic = licencePic;
	}
	public String getLicencePic(){
		return licencePic;
	}
	public void setOperationScope(String operationScope){
		this.operationScope = operationScope;
	}
	public String getOperationScope(){
		return operationScope;
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
