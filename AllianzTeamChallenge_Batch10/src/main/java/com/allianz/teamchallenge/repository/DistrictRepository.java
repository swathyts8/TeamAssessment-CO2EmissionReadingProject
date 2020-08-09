package com.allianz.teamchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.allianz.teamchallenge.model.DistrictEntity;

@Repository
public interface DistrictRepository extends JpaRepository<DistrictEntity, Integer> {

	@Query("SELECT DT FROM CustomerEntity CR "
			+ "JOIN CR.city CT "
			+ "JOIN CT.districts DT "
			+ "WHERE CR.id = :customerid "
			+ "AND CT.id = :cityid "
	  		+ "AND DT.id = :districtid")
	public DistrictEntity getSensorDataByDistrictId(@Param("customerid") Integer customer_id, 
			@Param("cityid") Integer city_id, @Param("districtid") Integer district_id);

}
