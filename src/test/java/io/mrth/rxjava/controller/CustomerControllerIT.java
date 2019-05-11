package io.mrth.rxjava.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.mrth.rxjava.model.CreateCustomer;
import io.mrth.rxjava.model.CreateCustomerBuilder;
import io.mrth.webutil.json.Json;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static io.restassured.RestAssured.*;

public class CustomerControllerIT {

	private static final Logger LOG = LoggerFactory.getLogger(CustomerControllerIT.class);

	@Before
	public void prepare() {
		basePath = "/rxjava/rest";
		baseURI = "http://localhost";
		port = 8080;
	}

		@Test
		public void createCustomer() throws JsonProcessingException {
			LOG.info("createCustomer");
			CreateCustomer createCustomer = new CreateCustomerBuilder()
					.setName("Ridwan")
					.setAddress("Jl Sadarmanah")
					.setBirthDate(new GregorianCalendar(1995, Calendar.MARCH, 1).getTime())
					.setBirthPlace("Jakarta")
					.setCity("Cimahi")
					.setProvince("Jawa Barat")
					.setGender(true)
					.setReligion("Islam")
					.build();
			given()
					.contentType("application/json")
					.body(Json.getWriter().writeValueAsBytes(createCustomer))
					.post("/customer")
					.then().assertThat().statusCode(204);
	}
}
