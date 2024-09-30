package com.soft.com.service;

import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.soft.com.entity.LabelEntity;
import com.soft.com.repo.LabelRepository;
import com.soft.com.request.LabelRequest;
import com.soft.com.response.LabelResponse;


@Service 
@Transactional
public class DefaultLableService implements LabelService{
	
	@Autowired
	LabelRepository labelRepository;

	@Override
	public LabelResponse getLabeleById(String labelId) {
		
		LabelResponse labelres=null;
		
		Optional<LabelEntity> entity=labelRepository.findByLabelId(labelId);
		LabelEntity ent=entity.get();
		
		LabelResponse res=labelRepository.wrap(ent);
		
		
		Optional<LabelResponse> labelResponse=labelRepository.findByLabelId(labelId).map(labelRepository::wrap);
		if(labelResponse.isPresent()) {
			labelres=labelResponse.get();
		}
		return labelres;
	}

	@Override
	public LabelResponse createOrUpdateLabel(LabelRequest lrequest) {
		
		//Generating UUID for LABELID
		lrequest.setLabelId(UUID.randomUUID().toString());
		
		//Generating UUID for LabelWHID
		if(null != lrequest.getWhRequest() && !ObjectUtils.isEmpty(lrequest.getWhRequest())) {
			
			lrequest.getWhRequest().stream().forEach(e->e.setLabelWhId(UUID.randomUUID().toString()));
			
		}
		//setting LabelId and dates
		
		lrequest.getWhRequest().stream().forEach(e->{
			if(e.getLabelId()==null) {
				e.setLabelId(lrequest.getLabelId());
				
			}
			if(e.getCreatedBy()==null) {
				e.setCreatedBy(lrequest.getCreatedBy());
			}
			if(e.getCreatedOn()==null) {
				e.setCreatedOn(lrequest.getCreatedOn());
			}
		});
		LabelEntity entity=labelRepository.save(lrequest.to());
		
	//return labelRepository.wrap(labelRepository.save(lrequest.to()));
		
		return labelRepository.wrap(entity);
	}

	

}
