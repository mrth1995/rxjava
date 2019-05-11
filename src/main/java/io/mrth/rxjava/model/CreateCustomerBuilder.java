package io.mrth.rxjava.model;

import java.util.Date;

public class CreateCustomerBuilder {
	private String name;
	private Date birthDate;
	private String birthPlace;
	private boolean gender;
	private String religion;
	private String address;
	private String city;
	private String province;

	public CreateCustomerBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public CreateCustomerBuilder setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	public CreateCustomerBuilder setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
		return this;
	}

	public CreateCustomerBuilder setGender(boolean gender) {
		this.gender = gender;
		return this;
	}

	public CreateCustomerBuilder setReligion(String religion) {
		this.religion = religion;
		return this;
	}

	public CreateCustomerBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public CreateCustomerBuilder setCity(String city) {
		this.city = city;
		return this;
	}

	public CreateCustomerBuilder setProvince(String province) {
		this.province = province;
		return this;
	}

	public CreateCustomer build() {
		return new CreateCustomer(name, birthDate, birthPlace, gender, religion, address, city, province);
	}
}