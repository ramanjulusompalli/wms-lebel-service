package com.soft.com.request;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.soft.com.domain.converter.BeanConverter;
import com.soft.com.entity.LabelWhEntity;

public class LabelWhRequest implements BeanConverter<LabelWhEntity>{
	
	private String labelWhId;
	private String labelId;
	private String whId;
	private String createdBy;
	private Date createdOn;
	
	
	
	public LabelWhRequest() {
		super();
	}

	public String getLabelWhId() {
		return labelWhId;
	}

	public void setLabelWhId(String labelWhId) {
		this.labelWhId = labelWhId;
	}

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getWhId() {
		return whId;
	}

	public void setWhId(String whId) {
		this.whId = whId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public void from(LabelWhEntity e) {
		
		BeanUtils.copyProperties(e, this);
		
	}

	@Override
	public LabelWhEntity to() {
		
		LabelWhEntity e=new LabelWhEntity();
		
		BeanUtils.copyProperties(this, e);
		
		return e;
	}

}
