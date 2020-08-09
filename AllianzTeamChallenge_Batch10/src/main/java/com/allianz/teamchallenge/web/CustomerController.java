package com.allianz.teamchallenge.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.allianz.teamchallenge.exception.RecordNotFoundException;
import com.allianz.teamchallenge.model.CityEntity;
import com.allianz.teamchallenge.model.CustomerEntity;
import com.allianz.teamchallenge.model.DistrictEntity;
import com.allianz.teamchallenge.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	//Get all data
	@GetMapping(value = "/", produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE)
    public ResponseEntity<List<CustomerEntity>> getAllSensorData() throws RecordNotFoundException {
		List<CustomerEntity> customerEntities = customerService.getAllSensorData();
        return new ResponseEntity<List<CustomerEntity>>(customerEntities, new HttpHeaders(), HttpStatus.OK);
    }
	
	//Get CO2 emission reading against a customer
	@GetMapping(value = "/{id}", produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE)
    public ResponseEntity<CustomerEntity> getSensorDataByCustomerId(@PathVariable("id") Integer id) throws RecordNotFoundException {
		CustomerEntity customerEntity = customerService.getSensorDataByCustomerId(id);
        return new ResponseEntity<CustomerEntity>(customerEntity, new HttpHeaders(), HttpStatus.OK);
    }
	
	//Get CO2 emission reading against a city
	@GetMapping(value = "{customerid}/city/{cityid}", produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE)
    public ResponseEntity<CityEntity> getSensorDataByCityId(@PathVariable("customerid") Integer customer_id,
    		@PathVariable("cityid") Integer city_id) throws RecordNotFoundException {
		CityEntity cityEntity = customerService.getSensorDataByCityId(customer_id, city_id);
        return new ResponseEntity<CityEntity>(cityEntity, new HttpHeaders(), HttpStatus.OK);
    }
	
	//Get CO2 emission reading against a district
	@GetMapping(value = "/{customerid}/city/{cityid}/district/{districtid}", produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE) 
	public ResponseEntity<DistrictEntity> getSensorDataByDistrictId(@PathVariable("customerid") Integer customer_id, 
			@PathVariable("cityid") Integer city_id, @PathVariable("districtid") Integer district_id) throws RecordNotFoundException { 
		DistrictEntity districtEntity = customerService.getSensorDataByDistrictId(customer_id, city_id, district_id); 
		return new ResponseEntity<DistrictEntity>(districtEntity, new HttpHeaders(), HttpStatus.OK); 
	}
	
	//Save customer, city, district and sensor data to CB
	@PostMapping()
    public ResponseEntity<CustomerEntity> createCustomers(@RequestBody CustomerEntity customer)
                                                    throws RecordNotFoundException {
		CustomerEntity customerData = customerService.createCustomers(customer);
        return new ResponseEntity<CustomerEntity>(customerData, new HttpHeaders(), HttpStatus.OK);
    }
}
