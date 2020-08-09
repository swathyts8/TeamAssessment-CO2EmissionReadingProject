package com.allianz.teamchallenge.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TBL_CITIES")
public class CityEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="CITY_NAME")
	private String name;
	
	@JsonIgnore
	@OneToOne(mappedBy = "city")
    private CustomerEntity customer;
	
	@OneToMany(targetEntity = DistrictEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "city_id", referencedColumnName = "id")
	private List<DistrictEntity> districts;

	public CityEntity() {
		super();
	}

	public CityEntity(int id, String name, CustomerEntity customer, List<DistrictEntity> districts) {
		super();
		this.id = id;
		this.name = name;
		this.customer = customer;
		this.districts = districts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public List<DistrictEntity> getDistricts() {
		return districts;
	}

	public void setDistricts(List<DistrictEntity> districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		return "CityEntity [id=" + id + ", name=" + name + ", customer=" + customer + ", districts=" + districts + "]";
	}
}
