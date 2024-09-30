package com.soft.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableJpaAuditing
@SpringBootApplication 
@EnableJpaRepositories
@EnableTransactionManagement
//@ComponentScan(basePackages= {"com.soft.com"})
public class WmsLabelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WmsLabelServiceApplication.class, args);
	}

}
