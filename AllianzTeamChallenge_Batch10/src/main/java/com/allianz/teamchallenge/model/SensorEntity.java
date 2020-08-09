package com.allianz.teamchallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_SENSORS")
public class SensorEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SENSOR_NAME")
	private String sensorName;

	@Column(name="CO2_EMISSION_LEVEL")
	private String co2EmissionLevel;

	public SensorEntity() {
		super();
	}

	public SensorEntity(int id, String sensorName, String co2EmissionLevel) {
		super();
		this.id = id;
		this.sensorName = sensorName;
		this.co2EmissionLevel = co2EmissionLevel;
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

	@Override
	public String toString() {
		return "SensorEntity [id=" + id + ", sensorName=" + sensorName + ", co2EmissionLevel=" + co2EmissionLevel
				+ "]";
	}
}

