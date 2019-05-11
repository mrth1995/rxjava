package io.mrth.rxjava.controller;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.is;

public class SystemControllerIT {

	private static final Logger LOG = LoggerFactory.getLogger(SystemControllerIT.class);

	@Before
	public void prepare() {
		basePath = "/rxjava/rest";
		baseURI = "http://localhost";
		port = 8080;
	}

	@Test
	public void echo() {
		LOG.info("echo test");
		get("/system/echo").then().body("message", is("Success"));
	}
}
