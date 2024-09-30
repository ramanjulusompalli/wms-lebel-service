package com.soft.com.repo;

import com.soft.com.entity.LabelEntity;
import com.soft.com.response.LabelResponse;

public interface LabelMapper {
	
	LabelResponse wrap(LabelEntity entity);
	
	LabelEntity unwrap(LabelResponse labelResponse);
}
