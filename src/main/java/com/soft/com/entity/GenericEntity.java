package com.soft.com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class GenericEntity {
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_ON",insertable=true,updatable=false)
	private Date createdOn;
	
	@CreatedBy
	@Column(name="CREATED_BY",insertable=true,updatable=false)
	private String createdBy;
	
	
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_ON")
	private Date updateOn;
	
	
	@LastModifiedBy
	@Column(name="UPDATED_By")
	private String updatedBy;


	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Date getUpdateOn() {
		return updateOn;
	}


	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	

}
