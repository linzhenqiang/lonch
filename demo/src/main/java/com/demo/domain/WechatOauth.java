package com.demo.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * wechat_oauth 实体类
 */ 
public class WechatOauth implements Serializable {
	private String id;
	private String content;
	private String remark;
	private Date createTime;
	private Date updateTime;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return content;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return remark;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Date getUpdateTime(){
		return updateTime;
	}
}
