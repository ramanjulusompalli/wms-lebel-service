package com.soft.com;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.util.JacksonFeature;
import com.soft.com.api.LabelController;


@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig() {
		
		register(JerseyJsonConfig.class);
		register(JacksonFeature.class);
		register(LabelController.class);
		
		
	}

}
