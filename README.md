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
 
 # Do the following changes for Services Registry for PCF
 
 # step 1. add depencency in pom.xml
   <!-- service registry -->
	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>Dalston.SR1</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
			<dependency>
				<groupId>io.pivotal.spring.cloud</groupId>
				<artifactId>spring-cloud-services-dependencies</artifactId>
				<version>1.5.0.RELEASE</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
  
  <!-- service registry -->
		<dependency>
			<groupId>io.pivotal.spring.cloud</groupId>
			<artifactId>spring-cloud-services-starter-service-registry</artifactId>
		</dependency>
    
  # step 2 enable the discovery client
    @SpringBootApplication
    @EnableDiscoveryClient
    public class PcfSpringBootDeploymentApplication {}
    
 # changes the manifest.yml as 
  applications:
    - name: pcf-springBoot-deployment  --------> name of application
      memory: 1024M
      instances: 1
      path: target/pcf-springBoot-deployment.jar
 
      buildpack: https://github.com/cloudfoundry/java-buildpack
      env:
        SPRING_PROFILES_ACTIVE : cloud
      services:
       - cpf-service-registry  -------> name of services registry
       
  # change application.properties if required as 
      #spring.cloud.services.registrationMethod: route
      #security.basic.enabled=false
      #spring.cloud.discovery.enabled=false  
 # step 4 : Again do same build and deploy in PCF     
       mvn clean install
       cf push -f manifest.yml
      



 
 
 
   
   
   
