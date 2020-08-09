package com.allianz.teamchallenge.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@Table(name="TBL_SENSORS")
@JacksonXmlRootElement(localName = "Sensor")
public class SensorEntity implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SENSOR_NAME")
	private String sensorName;

	@Column(name="CO2_EMISSION_LEVEL")
	private String co2EmissionLevel;
	
	@Column(name="CREATED_AT")
	private java.sql.Timestamp createdAt;

	public SensorEntity() {
		super();
	}

	public SensorEntity(int id, String sensorName, String co2EmissionLevel, java.sql.Timestamp createdAt) {
		super();
		this.id = id;
		this.sensorName = sensorName;
		this.co2EmissionLevel = co2EmissionLevel;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSensorName() {
		return sensorName;
	}

	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	public String getCo2EmissionLevel() {
		return co2EmissionLevel;
	}

	public void setCo2EmissionLevel(String co2EmissionLevel) {
		this.co2EmissionLevel = co2EmissionLevel;
	}

	public java.sql.Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(java.sql.Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "SensorEntity [id=" + id + ", sensorName=" + sensorName + ", co2EmissionLevel=" + co2EmissionLevel
				+ ", createdAt=" + createdAt + "]";
	}
}

