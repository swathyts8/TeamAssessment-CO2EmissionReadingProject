package com.allianz.teamchallenge.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="TBL_CUSTOMERS")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	    
	@Column(name="FIRST_NAME")
	private String firstName;
	    
	@Column(name="LAST_NAME")
	private String lastName;
	    
	@Column(name="EMAIL", nullable=false, length=200)
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
	private CityEntity city;
	
	public CustomerEntity() {
		super();
	}

	public CustomerEntity(Integer id, String firstName, String lastName, String email, CityEntity city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CityEntity getcity() {
		return city;
	}

	public void setcity(CityEntity city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", city=" + city + "]";
	}
}
