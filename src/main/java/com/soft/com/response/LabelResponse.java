package com.soft.com.response;

import org.springframework.beans.BeanUtils;

import static org.springframework.beans.BeanUtils.copyProperties;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.soft.com.domain.converter.BeanConverter;
import com.soft.com.entity.LabelEntity;
import com.soft.com.entity.LabelWhEntity;

public class LabelResponse implements BeanConverter<LabelEntity>,Cloneable{
	
	private String labelId;
	private String labelType;
	private String labelName;
	private String paperSize;
	private String company;
	private String hasBarCode;
	private String isActive;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;
	
	private List<LabelWhResponse> labelWhResponse;
	
	
	public LabelResponse() {
		super();
	}


	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelType() {
		return labelType;
	}

	public void setLabelType(String labelType) {
		this.labelType = labelType;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getPaperSize() {
		return paperSize;
	}

	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getHasBarCode() {
		return hasBarCode;
	}

	public void setHasBarCode(String hasBarCode) {
		this.hasBarCode = hasBarCode;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
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


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public Date getUpdatedOn() {
		return updatedOn;
	}


	public List<LabelWhResponse> getLabelWhResponse() {
		return labelWhResponse;
	}


	public void setLabelWhResponse(List<LabelWhResponse> labelWhResponse) {
		this.labelWhResponse = labelWhResponse;
	}


	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}


	@Override
	public void from(LabelEntity e) {
		
		if(null !=e) {
			this.labelId=e.getLabelId();
		}
		
		if(null !=e && null !=e.getLabelWhEntity()) {
			this.setLabelWhResponse(new ArrayList<>());
			for(LabelWhEntity labelWh:e.getLabelWhEntity()) {
				LabelWhResponse res=new LabelWhResponse();
				res.from(labelWh);
				this.labelWhResponse.add(res);
			}
		}
		BeanUtils.copyProperties(e, this);
		
	}

	@Override
	public LabelEntity to() {
		LabelEntity e=new LabelEntity();
		copyProperties(this,e);
		return e;
	}

}
