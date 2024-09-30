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
@Table(name="LABEL_WH")
public class LabelWhEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="LABEL_WH_ID",unique=true)
	private String labelWhId;
	
	@Column(name="LABEL_ID")
	private String labelId;
	
	@Column(name="WH_ID" ,unique=true)
	private String whId;
	
	@CreatedBy
	@Column(name="CREATED_BY",insertable=true,updatable=false)
	private String createdBy;
	
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_ON",insertable=true,updatable=false)
	private Date createdOn;
    
	public LabelWhEntity() {
		super();
	}

	public LabelWhEntity(String labelWhId, String labelId, String whId, String createdBy, Date createdOn) {
		super();
		this.labelWhId = labelWhId;
		this.labelId = labelId;
		this.whId = whId;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
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
	

}
