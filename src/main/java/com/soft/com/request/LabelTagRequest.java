package com.soft.com.request;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.soft.com.domain.converter.BeanConverter;

import com.soft.com.entity.LabelTagEntity;
import com.soft.com.entity.LabelWhEntity;

public class LabelTagRequest implements BeanConverter<LabelTagEntity> {

	private String labelTagId;
	private String labelId;
	private String tag;
	private String createdBy;
	private Date createdOn;

	public LabelTagRequest() {
		super();
	}

	public LabelTagRequest(String labelTagId, String labelId, String tag, String createdBy, Date createdOn) {
		super();
		this.labelTagId = labelTagId;
		this.labelId = labelId;
		this.tag = tag;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}

	public String getLabelTagId() {
		return labelTagId;
	}

	public void setLabelTagId(String labelTagId) {
		this.labelTagId = labelTagId;
	}

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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
	public void from(LabelTagEntity e) {
		BeanUtils.copyProperties(e, this);

	}

	@Override
	public LabelTagEntity to() {
		LabelTagEntity e=new LabelTagEntity();
		
		BeanUtils.copyProperties(this, e);
		
		return e;
	}

}
