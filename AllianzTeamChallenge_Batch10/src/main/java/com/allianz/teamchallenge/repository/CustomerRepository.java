package com.allianz.teamchallenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.allianz.teamchallenge.model.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

	@Query("SELECT CR FROM CustomerEntity CR")
	public List<CustomerEntity> getAllSensorData();
	
	@Query("SELECT CR FROM CustomerEntity CR "
	  		+ "WHERE CR.id = :customerid")
	public CustomerEntity getSensorDataByCustomerId(@Param("customerid") Integer id);
}
