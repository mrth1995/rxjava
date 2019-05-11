package io.mrth.rxjava.controller;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("system")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SystemController {

	@GET
	@Path("echo")
	public Map<String, Object> echo() {
		Map<String, Object> response = new HashMap<>();
		response.put("message", "Success");
		return response;
	}
}
