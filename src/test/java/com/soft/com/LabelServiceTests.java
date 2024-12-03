package com.soft.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.soft.com.request.LabelRequest;
import com.soft.com.response.LabelResponse;
import com.soft.com.service.DefaultLableService;

@ActiveProfiles("h2")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes= {WmsLabelServiceApplication.class})
@TestMethodOrder(value =MethodOrderer.OrderAnnotation.class)
@AutoConfigureMockMvc
public class LabelServiceTests {
	
	/*@Autowired
	DefaultLableService defaultLableService;
	
	private static final Logger log=LoggerFactory.getLogger(LabelServiceTests.class);
	
	Date date=new Date();
	
	@Test
	@Order(0)
	@Sql("classpath:loadData.sql")
	public void loadData() {
		log.info("@Before All-executes once before all test methods in this class");
		
	}
	
	@Test
	@Order(1)
	public void checkLabelExistTest() {
		
		LabelResponse lr=defaultLableService.getLabeleById("123");
		
		assertEquals("Y",lr.getIsActive());
		assertEquals("123",lr.getLabelId());
		
	}
	
	@Test
	@Order(2)
	public void createOrUpdateLabelTest() {
		
		LabelRequest req=new LabelRequest();
		
		req.setLabelType("CUSTOM");
		req.setCompany("Ross");
		req.setCreatedBy("992552");
		req.setCompany("Y");
		req.setHasBarCode("Y");
		req.setLabelName("TestABCLabel");
		req.setPaperSize("2X2");
		req.setUpdatedBy("992552");
		req.setCreatedOn(date);
		req.setUpdatedOn(date);
		
		LabelResponse l=defaultLableService.createOrUpdateLabel(req);
		
		assertEquals("992552",l.getCreatedBy());
		
		
		
	}**/
	
	

}
