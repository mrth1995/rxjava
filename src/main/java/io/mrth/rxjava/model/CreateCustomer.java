package io.mrth.rxjava.model;

import io.mrth.webutil.json.JsonDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateCustomer {
	private String name;
	@XmlJavaTypeAdapter(JsonDateAdapter.class)
	private Date birthDate;
	private String birthPlace;
	private boolean gender;
	private String religion;
	private String address;
	private String city;
	private String province;

	public CreateCustomer() {
	}

	public CreateCustomer(String name, Date birthDate, String birthPlace, boolean gender, String religion, String address, String city, String province) {
		this.name = name;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.gender = gender;
		this.religion = religion;
		this.address = address;
		this.city = city;
		this.province = province;
	}

	public String getName() {
		return name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public boolean isGender() {
		return gender;
	}

	public String getReligion() {
		return religion;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}
}
