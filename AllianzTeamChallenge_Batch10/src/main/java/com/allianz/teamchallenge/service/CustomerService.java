package com.allianz.teamchallenge.service;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.allianz.teamchallenge.exception.RecordNotFoundException;
import com.allianz.teamchallenge.model.CityEntity;
import com.allianz.teamchallenge.model.CustomerEntity;
import com.allianz.teamchallenge.model.DistrictEntity;
import com.allianz.teamchallenge.repository.CityRepository;
import com.allianz.teamchallenge.repository.CustomerRepository;
import com.allianz.teamchallenge.repository.DistrictRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	DistrictRepository districtRepository;
	
	@Autowired
	CityRepository cityRepository;
	
	//Get all data
	public List<CustomerEntity> getAllSensorData() throws RecordNotFoundException {
		List<CustomerEntity> customerEntities= customerRepository.getAllSensorData();
    	if(!(customerEntities == null)) {
            return customerEntities;
        } else {
            throw new RecordNotFoundException("No records found");
        }
    }
	
	//Get by the customer Id
    public CustomerEntity getSensorDataByCustomerId(Integer id) throws RecordNotFoundException {
    	CustomerEntity customerEntity= customerRepository.getSensorDataByCustomerId(id);
    	if(!(customerEntity == null)) {
            return customerEntity;
        } else {
            throw new RecordNotFoundException("No customer record found for given id");
        }
    }
    
    //Get by the city Id
    public CityEntity getSensorDataByCityId(Integer customer_id, Integer city_id) throws RecordNotFoundException {
    	CityEntity cityEntity= cityRepository.getSensorDataByCityId(customer_id, city_id);
    	if(!(cityEntity == null)) {
            return cityEntity;
        } else {
            throw new RecordNotFoundException("No city record found for given id");
        }
    }
    
    //Get by the district Id
  	public DistrictEntity getSensorDataByDistrictId(Integer customer_id, Integer city_id, Integer district_id) throws RecordNotFoundException { 
  		DistrictEntity districtEntity = districtRepository.getSensorDataByDistrictId(customer_id, city_id, district_id);
  		if(!(districtEntity == null)) { 
  			return districtEntity; 
  		} else { 
  			throw new RecordNotFoundException("No district record found for given id"); 
  		}
  	}
  	
  	//Save customer, city, district and sensor data to CB
  	public CustomerEntity createCustomers(CustomerEntity customer) throws RecordNotFoundException
    {
  		if(!(customer == null)) {
  			return customerRepository.save(customer);
  		} else {
  			throw new RecordNotFoundException("Insert in proper format"); 
  		}
    }
}
