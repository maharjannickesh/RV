
 Assumption
 1. Same city name can be in more than one state eg fairfield in ohio and iowa
 
 About the application
 1. The application is developed in Java in Spring framework, and Hibernate as ORM, MySql as database
 2. The appliciation handle the rest request, no front end is created.
 3. Postman is used for testing the apis. 
 
 About database; 
 1. The database is MySql.
 2. Please config the databse in rv-config.properties as per the user machine. 
 3. The database is provided in the resources folder. 
 
 Server
 1. Jetty and Tomcat server has been used. By Default jetty is in use. 
 2. Postman test is done on the basis of Jetty Server. 
 
 
 As Per the task:
 
 1. How should you deal with invalid or improperly formed requests?
    This is handled by providing 404 error in JSON. 
    
 2. How should you handle requests that result in large data sets?
    This is handled by using pagination of JPA. 
    
 3. Handle authentication of users prior to allowing changes to their visits
    Sprin Security has been used for the authentication. 
    
 4. Make use of the lat/long data for cities in a creative way that provides additional functionality for the client
    Used google place API for finding the resturant in radius of 5000 meter. 
    
 5. DEL /user/{user}/visit/{visit} has been modified to DEL /user/{user}/visit/{visit}/{state}
    considering that same city name can be in more than one state eg fairfield in ohio and iowa
     
 Misc:
 Postman test  has been provided. 
 
 
 
 
 
 
 