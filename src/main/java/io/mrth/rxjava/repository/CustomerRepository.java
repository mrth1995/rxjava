package io.mrth.rxjava.repository;

import io.mrth.rxjava.domain.Customer;
import io.mrth.webutil.persistence.JpaRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Dependent
public class CustomerRepository extends JpaRepository<Customer, String> {

	@Inject
	private EntityManager entityManager;

	public CustomerRepository() {
		super(Customer.class);
	}

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
