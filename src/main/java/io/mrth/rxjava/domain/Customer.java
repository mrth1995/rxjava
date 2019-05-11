package io.mrth.rxjava.domain;

import io.mrth.rxjava.model.CreateCustomer;
import io.mrth.webutil.IDGen;
import io.mrth.webutil.json.JsonDateAdapter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "customer")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 32)
	private String id;

	@Column(name = "name", length = 64, nullable = false)
	private String name;

	@Column(name = "birth_date")
	@Temporal(TemporalType.DATE)
	@XmlJavaTypeAdapter(JsonDateAdapter.class)
	private Date birthDate;

	@Column(name = "birth_place")
	private String birthPlace;

	@Column
	private boolean gender;

	@Column(length = 16)
	private String religion;

	@Column
	private String address;

	@Column(length = 64)
	private String city;

	@Column(length = 64)
	private String province;

	public Customer() {
		this.id = IDGen.generate();
	}

	public Customer(CreateCustomer param) {
		this();
		this.name = param.getName();
		this.birthDate = param.getBirthDate();
		this.birthPlace = param.getBirthPlace();
		this.address = param.getAddress();
		this.city = param.getCity();
		this.province = param.getProvince();
		this.religion = param.getReligion();
		this.gender = param.isGender();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}
