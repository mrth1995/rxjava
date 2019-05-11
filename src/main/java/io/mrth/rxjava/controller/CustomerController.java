package io.mrth.rxjava.controller;

import io.mrth.rxjava.domain.Customer;
import io.mrth.rxjava.model.CreateCustomer;
import io.mrth.rxjava.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerController {

	private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

	@Inject
	private CustomerRepository customerRepository;

	@POST
	@Path("rxjava")
	public void registerUsingRx() {

	}

	@POST
	@Transactional
	public void register(CreateCustomer createCustomer) {
		Customer customer = new Customer(createCustomer);
		customerRepository.store(customer);
	}
}
