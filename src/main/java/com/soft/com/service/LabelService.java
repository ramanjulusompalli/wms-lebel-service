package com.soft.com.service;

import com.soft.com.request.LabelRequest;
import com.soft.com.response.LabelResponse;

public interface LabelService {
	
	LabelResponse getLabeleById(String labelId);
    LabelResponse createOrUpdateLabel(LabelRequest lrequest);

}
