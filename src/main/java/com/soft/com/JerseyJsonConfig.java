package com.soft.com;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Provider
public class JerseyJsonConfig implements ContextResolver<ObjectMapper> {

	private final ObjectMapper objectMapper;

	public JerseyJsonConfig() {
		this.objectMapper = createObjectMapper();
	}

	private ObjectMapper createObjectMapper() {
		final ObjectMapper mapper = new ObjectMapper();

		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		return mapper;
	}

	@Override
	public ObjectMapper getContext(Class<?> arg0) {
		// TODO Auto-generated method stub
		return objectMapper;
	}

}
