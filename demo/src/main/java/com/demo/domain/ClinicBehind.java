package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * 诊所基础库从表 实体类
 */ 
public class ClinicBehind implements Serializable {
	private String id;	// 主键
	private String clinicBaseId;	// 主表Id
	private String clinicNo;	// 诊所登记号
	private String licenceNo;	// 营业执照号
	private String licencePic;	// 营业执照图片
	private String regAddress;	// 注册地址
	private String outpatientNum;	// 门诊量
	private String acreage;	// 诊所面积
	private String medicalTreatment;	// 医疗机构执业许可证(URL)
	private String villageLicence;	// 乡村医生执业证(url)
	private String meLicence;	// 药品经营许可证(url)
	private int cnMe;	// 中药数量
	private int weMe;	// 西药数量
	private String recognitionNum;	// 纳税人识别或统一社会信用代码
	private int doctorNum;	// 医生数量
	private int nurseNum;	// 护士数量
	private String insuranceType;	// 医保类型
	private Date dateCreated;	// 创建时间
	private Date lastUpdated;	// 更新时间
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setClinicBaseId(String clinicBaseId){
		this.clinicBaseId = clinicBaseId;
	}
	public String getClinicBaseId(){
		return clinicBaseId;
	}
	public void setClinicNo(String clinicNo){
		this.clinicNo = clinicNo;
	}
	public String getClinicNo(){
		return clinicNo;
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
	public void setRegAddress(String regAddress){
		this.regAddress = regAddress;
	}
	public String getRegAddress(){
		return regAddress;
	}
	public void setOutpatientNum(String outpatientNum){
		this.outpatientNum = outpatientNum;
	}
	public String getOutpatientNum(){
		return outpatientNum;
	}
	public void setAcreage(String acreage){
		this.acreage = acreage;
	}
	public String getAcreage(){
		return acreage;
	}
	public void setMedicalTreatment(String medicalTreatment){
		this.medicalTreatment = medicalTreatment;
	}
	public String getMedicalTreatment(){
		return medicalTreatment;
	}
	public void setVillageLicence(String villageLicence){
		this.villageLicence = villageLicence;
	}
	public String getVillageLicence(){
		return villageLicence;
	}
	public void setMeLicence(String meLicence){
		this.meLicence = meLicence;
	}
	public String getMeLicence(){
		return meLicence;
	}
	public void setCnMe(int cnMe){
		this.cnMe = cnMe;
	}
	public int getCnMe(){
		return cnMe;
	}
	public void setWeMe(int weMe){
		this.weMe = weMe;
	}
	public int getWeMe(){
		return weMe;
	}
	public void setRecognitionNum(String recognitionNum){
		this.recognitionNum = recognitionNum;
	}
	public String getRecognitionNum(){
		return recognitionNum;
	}
	public void setDoctorNum(int doctorNum){
		this.doctorNum = doctorNum;
	}
	public int getDoctorNum(){
		return doctorNum;
	}
	public void setNurseNum(int nurseNum){
		this.nurseNum = nurseNum;
	}
	public int getNurseNum(){
		return nurseNum;
	}
	public void setInsuranceType(String insuranceType){
		this.insuranceType = insuranceType;
	}
	public String getInsuranceType(){
		return insuranceType;
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
