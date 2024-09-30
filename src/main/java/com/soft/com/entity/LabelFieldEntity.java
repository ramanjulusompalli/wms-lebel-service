package com.soft.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "LABEL_FIELD")
public class LabelFieldEntity extends GenericEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "LABEL_FIELD_ID", unique = true)
	private String labelFieldId;

	@Column(name = "LABEL_ID")
	private String labelId;

	@Column(name = "FIELD_NAME")
	private String fieldName;

	@Column(name = "FIELd_EDITOR")
	private String fieldEditor;
	@Column(name = "DISPLAY_NAME")
	private String displayName;
	@Column(name = "REQUIRED_FLG")
	private String requiredFlg;

	public LabelFieldEntity() {
		super();
	}

	public LabelFieldEntity(String labelFieldId, String labelId, String fieldName, String fieldEditor,
			String displayName, String requiredFlg) {
		super();
		this.labelFieldId = labelFieldId;
		this.labelId = labelId;
		this.fieldName = fieldName;
		this.fieldEditor = fieldEditor;
		this.displayName = displayName;
		this.requiredFlg = requiredFlg;
	}

	public String getLabelFieldId() {
		return labelFieldId;
	}

	public void setLabelFieldId(String labelFieldId) {
		this.labelFieldId = labelFieldId;
	}

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldEditor() {
		return fieldEditor;
	}

	public void setFieldEditor(String fieldEditor) {
		this.fieldEditor = fieldEditor;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getRequiredFlg() {
		return requiredFlg;
	}

	public void setRequiredFlg(String requiredFlg) {
		this.requiredFlg = requiredFlg;
	}

}
