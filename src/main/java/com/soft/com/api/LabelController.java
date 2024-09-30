package com.soft.com.api;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.com.request.LabelRequest;
import com.soft.com.service.DefaultLableService;

import static javax.ws.rs.core.Response.ok;

@Component
@Path("/label")
//@RequestMapping("/label")
@Produces(MediaType.APPLICATION_JSON)
@RestController
public class LabelController {
	
	
	@Autowired
	DefaultLableService defaultLableService;
	
	
	
	public LabelController(DefaultLableService defaultLableService) {
		this.defaultLableService=defaultLableService;
	}
	
	
	
	@GET
	@Path("/{labelId}")
	//@GetMapping("/{labelId}")
	public Response getByLabelId(@PathParam("labelId") String labelId) {
		
		return ok(defaultLableService.getLabeleById(labelId)).build();
		
	}
	
	@PUT
	public Response createOrUpdateLabel(LabelRequest lrequest) {
		return  ok(defaultLableService.createOrUpdateLabel(lrequest)).build();
		
	}
	

}
