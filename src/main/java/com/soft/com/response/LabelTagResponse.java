package com.soft.com.response;

import static org.springframework.beans.BeanUtils.copyProperties;

import java.util.Date;

import com.soft.com.domain.converter.BeanConverter;
import com.soft.com.entity.LabelTagEntity;


public class LabelTagResponse implements BeanConverter<LabelTagEntity>,Cloneable {
	
	
	private String labelTagId;
	private String labelId;
	private String tag;
	private String createdBy;
	private Date createdOn;
	
	
	public LabelTagResponse() {
		super();
	}

	@Override
	public void from(LabelTagEntity e) {
		copyProperties(e,this);
		
	}

	@Override
	public LabelTagEntity to() {
		
		LabelTagEntity ld=new LabelTagEntity();
		
		copyProperties(ld,this);
		
		return ld;
	}

}
