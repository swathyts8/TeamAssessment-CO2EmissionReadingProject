INSERT INTO 
	TBL_EMPLOYEES (first_name, last_name, email) 
VALUES
  	('Lokesh', 'Gupta', 'howtodoinjava@gmail.com'),
  	('John', 'Doe', 'xyz@email.com');

  	
INSERT INTO 
	TBL_CUSTOMERS (first_name, last_name, email, city_id) 
VALUES
  	('custfn1', 'custln1', 'custln1@gmail.com', 1),
  	('custln2', 'custln2', 'custln2@email.com', 2),
  	('custln3', 'custln3', 'custln3@email.com', 3);
  	
  	
INSERT INTO 
	TBL_CITIES (city_name) 
VALUES
  	('city1'),
  	('city2'),
  	('city3');
  	
  	
INSERT INTO 
	TBL_DISTRICTS (district_name, city_id) 
VALUES
  	('dist1', 1),
  	('dist2', 1),
  	('dist3', 1),
  	('dist4', 1),
  	('dist5', 2),
  	('dist6', 2),
  	('dist7', 3),
  	('dist8', 3),
  	('dist9', 3);
  	
  	
INSERT INTO 
	TBL_SENSORS (sensor_name, co2_emission_level, district_id) 
VALUES
--  	('sensor1', 22, 1, '2020/08/09 10:36:30'),
  	('sensor2', 32, 1),
  	('sensor2', 56, 2),
  	('sensor4', 66, 3),
  	('sensor5', 28, 3),
  	('sensor6', 22, 3),
  	('sensor7', 27, 4),
  	('sensor8', 72, 4),
  	('sensor9', 54, 5),
  	('sensor10', 44, 6),
  	('sensor11', 18, 7),
  	('sensor12', 30, 8);
  	
 
  	
  	
  	