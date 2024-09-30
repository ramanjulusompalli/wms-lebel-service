package com.soft.com.request;

import org.springframework.beans.BeanUtils;

import com.soft.com.domain.converter.BeanConverter;
import com.soft.com.entity.LabelFieldEntity;


public class LabelFieldRequest implements BeanConverter<LabelFieldEntity>{
	
	private String labelFieldId;
	private String labelId;
	private String fieldName;
	private String fieldEditor;
	private String displayName;
	private String requiredFlg;
	
	public LabelFieldRequest() {
		super();
	}

	public LabelFieldRequest(String labelFieldId, String labelId, String fieldName, String fieldEditor,
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

	@Override
	public void from(LabelFieldEntity e) {
		BeanUtils.copyProperties(this, e);
		
	}

	@Override
	public LabelFieldEntity to() {
		LabelFieldEntity e=new LabelFieldEntity();
		
		BeanUtils.copyProperties(this, e);
		
		return e;
	}

}
