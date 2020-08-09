package com.allianz.teamchallenge.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@Table(name="TBL_DISTRICTS")
@JacksonXmlRootElement(localName = "District")
public class DistrictEntity implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="DISTRICT_NAME")
	private String name;
	
	@OneToMany(targetEntity = SensorEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "district_id", referencedColumnName = "id")
	private List<SensorEntity> sensors;
	
	public DistrictEntity() {
		super();
	}

	public DistrictEntity(int id, String name, List<SensorEntity> sensors) {
		super();
		this.id = id;
		this.name = name;
		this.sensors = sensors;
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

	public List<SensorEntity> getsensors() {
		return sensors;
	}

	public void setsensors(List<SensorEntity> sensors) {
		this.sensors = sensors;
	}

	@Override
	public String toString() {
		return "DistrictEntity [id=" + id + ", name=" + name + ", sensors=" + sensors + "]";
	}
	
}
