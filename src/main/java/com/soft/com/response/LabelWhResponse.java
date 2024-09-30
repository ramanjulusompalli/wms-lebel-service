package com.soft.com.response;

import static org.springframework.beans.BeanUtils.copyProperties;

import com.soft.com.domain.converter.BeanConverter;

import com.soft.com.entity.LabelWhEntity;

public class LabelWhResponse implements BeanConverter<LabelWhEntity>,Cloneable{
	
	private String labelWhId;
	private String labelId;
	private String whId;
	
	public LabelWhResponse() {
		super();
	}

	public LabelWhResponse(String labelWhId, String labelId, String whId) {
		super();
		this.labelWhId = labelWhId;
		this.labelId = labelId;
		this.whId = whId;
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

	@Override
	public void from(LabelWhEntity e) {
		copyProperties(e,this);
		
	}

	@Override
	public LabelWhEntity to() {
		
		LabelWhEntity wh=new LabelWhEntity();
		copyProperties(this,wh);
		return wh;
	}

}
