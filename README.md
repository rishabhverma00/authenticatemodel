# authenticatemodel
####################
Below are the steps to use this module.

1. git clone https://github.com/rishu0705/authenticatemodel.git
2. cd ##module directory##
3. mvn clean install
4. cd target
5. java -jar authenticatemodel-0.0.1-SNAPSHOT.jar
6. got to browser and hit on URL - http://localhost:8089/login
7. use default username password for access 
	username : testuser
	password : Pass@123
	
##################### 

Configuration Details :

Application Type : SpringBoot application
Authentication : Spring Security
Port : 8089
Database : H2 database (in memory)
Database console url : http://localhost:8089/h2-console
Driver Class : org.h2.Driver
JDBC url : jdbc:h2:mem:authenticatemodel
username : root
password : root

####################

Backend Validation:

Length Validation of fields : min = 5 and max = 255 except Role (min = 2)
