package com.soft.com.repo;

import com.soft.com.entity.LabelEntity;
import com.soft.com.response.LabelResponse;

public class LabelRepositoryImpl implements LabelMapper{

	@Override
	public LabelResponse wrap(LabelEntity entity) {
		LabelResponse res=new LabelResponse();
		res.from(entity);
		return res;
	}

	@Override
	public LabelEntity unwrap(LabelResponse response) {
		
		return response.to();
	}

}
