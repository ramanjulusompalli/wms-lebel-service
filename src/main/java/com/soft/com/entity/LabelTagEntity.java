package com.soft.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

@Entity
@DynamicUpdate
@Table(name = "LABEL_TAG")
public class LabelTagEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="LABEL_TAG_ID",unique=true)
	private String labelTagId;
	@Column(name="LABEL_ID")
	private String labelId;
	@Column(name="TAG")
	private String tag;
	
	@CreatedBy
	@Column(name="CREATED_BY",insertable=true,updatable=false)
	private String createdBy;
	
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_ON",insertable=true,updatable=false)
	private Date createdOn;
	
	public LabelTagEntity() {
		super();
	}

	public LabelTagEntity(String labelTagId, String labelId, String tag, String createdBy, Date createdOn) {
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
	
	

}
