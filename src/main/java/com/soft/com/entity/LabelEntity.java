package com.soft.com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@DynamicUpdate
@Table(name = "LABEL")
public class LabelEntity extends GenericEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "LABEL_ID", unique = true)
	private String labelId;

	@Column(name = "LABEL_TYPE")
	private String labelType;

	@Column(name = "LABEL_NAME")
	private String labelName;
	@Column(name = "PAER_SIZE")
	private String paperSize;
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "HAS_BARCODE")
	private String hasBarCode;
	@Column(name = "IS_ACTIVE")
	private String isActive;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name="LABEL_ID",referencedColumnName="LABEL_ID",nullable=false,insertable=false,updatable=false)
	private List<LabelWhEntity> labelWhEntity;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="LABEL_ID",referencedColumnName="LABEL_ID",nullable=false,insertable=false,updatable=false)
	private List<LabelTagEntity> labelTagEntity;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="LABEL_ID",referencedColumnName="LABEL_ID",nullable=false,insertable=false,updatable=false)
	private List<LabelFieldEntity> labelFieldEntity;

	public LabelEntity() {
		super();
	}

	public LabelEntity(String labelId, String labelType, String labelName, String paperSize, String company,
			String hasBarCode, String isActive) {
		super();
		this.labelId = labelId;
		this.labelType = labelType;
		this.labelName = labelName;
		this.paperSize = paperSize;
		this.company = company;
		this.hasBarCode = hasBarCode;
		this.isActive = isActive;
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

	public List<LabelWhEntity> getLabelWhEntity() {
		return labelWhEntity;
	}

	public void setLabelWhEntity(List<LabelWhEntity> labelWhEntity) {
		this.labelWhEntity = labelWhEntity;
	}

}
