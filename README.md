# pcf-springBoot-deployment

1. Do git clone or download the project 
2. import in eclipse or STS , InteliJ ide
3. Do build using commad "mvn clean install"
4. using some command to deployee in PCF

  \> cf login 
   provide following information
   API-url : https://api.run.pivotal.io
   user id : xyz
   password : xyz
   
   then go in project directory and then type comman
   
   \> cf push -f manifest.yml
 
 6. login in PCF and go in "Home/pankaj-org/spring-app-service"
 7. click on "Route" url
 8. and replace the "localhost:8000" with "https://pcf-springboot-deployment.cfapps.io"
 
 
   
   
   
