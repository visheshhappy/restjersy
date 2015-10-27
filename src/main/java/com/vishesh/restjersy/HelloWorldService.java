package com.vishesh.restjersy;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces({ MediaType.APPLICATION_JSON })
@Consumes({MediaType.APPLICATION_JSON})
@Path("/hello")
public class HelloWorldService {
	
	@GET
	@Path("/{param}")
	public Map<String,String> getPrintMessage(@PathParam(value = "param") String param){
		String op = "My message is  : "+ param;
	//	return Response.status(200).entity(op).build();
		Map<String,String> map = new HashMap<String, String>();
		map.put("param", param);
		return map;
		
	}
	
	@POST
	@Path("/postReq")
	public String postRequestDemo(MyData data){
		System.out.println("Consuming data..!!" + data);
		
		
		return "consumed";
		
	}

}
