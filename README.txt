# spring-rest-service
First example of a simple web REST service using SPRING JAVA framework.

1) Use Maven to create the jar: mvn clean package (or install if you want to install this in your maven repository).

2) Run the following command to run the web service in the port 9000 (I've got Wildfly running on the 8080 port):

	java -jar spring-rest-service.jar --server.port=9000 &

3) Write in the browser the following URL:

	http://localhost:9000/attendee

4) You will see a JSON as the web service response (GET operation over the "attendee" resource):

	{"id":1,"name":"Pepe","age":99,"genre":"male","lastName":"Perez","signupDate":"2015-05-26"}
