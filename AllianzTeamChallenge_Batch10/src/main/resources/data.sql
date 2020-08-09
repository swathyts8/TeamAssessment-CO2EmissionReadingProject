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
	TBL_SENSORS (sensor_name, co2_emission_level, district_id, created_at) 
VALUES
  	('sensor1', 22, 1, '2020-08-09 15:30:14.332'),
  	('sensor2', 32, 1, '2020-08-09 18:20:14.222'),
  	('sensor2', 56, 2, '2020-08-09 15:30:14.332'),
  	('sensor4', 66, 3, '2020-08-09 23:10:14.332'),
  	('sensor5', 28, 3, '2020-08-10 15:30:14.332'),
  	('sensor6', 22, 3, '2020-08-10 15:30:14.332'),
  	('sensor7', 27, 4, '2020-08-10 15:30:14.332'),
  	('sensor8', 72, 4, '2020-08-10 15:30:14.332'),
  	('sensor9', 54, 5, '2020-08-10 15:30:14.332'),
  	('sensor10', 44, 6, '2020-08-10 15:30:14.332'),
  	('sensor11', 18, 7, '2020-08-10 15:30:14.332'),
  	('sensor12', 30, 8, '2020-08-10 15:30:14.332');
  	
 
  	
  	
  	