package com.soft.com.domain.converter;

public interface BeanConverter<E> {
	
	void from(E e);
	 
	E to();

}
