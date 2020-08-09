package com.allianz.teamchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.allianz.teamchallenge.model.CityEntity;

public interface CityRepository extends JpaRepository<CityEntity, Integer> {
	
	@Query("SELECT CT FROM CustomerEntity CR "
			+ "JOIN CR.city CT "
	  		+ "WHERE CR.id = :customerid "
	  		+ "AND CT.id = :cityid")
	public CityEntity getSensorDataByCityId(@Param("customerid") Integer customer_id, @Param("cityid") Integer city_id);
}
