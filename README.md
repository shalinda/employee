# employee
Employee spring boot backend

#Dependancies
maven 3
jdk 1.8

#Database setup
install postgreSQL 9

update src/main/resources/application.properties with db info

mvn install
java -Dserver.port=8080 -jar target/emp-0.0.1-SNAPSHOT.jar