spring-examples
===============

This project will help someone to create a new spring project with maven dependencies
To run this project, you need to install:
  - At least JDK 6
  - Apache Maven 3.x
  - Apache Tomcat 7.x

Rememeber to create environment variables:
  - $CATALINA_HOME points to apache tomcat folder
  - $M2_HOME points to apache maven folder
  
To build and push new .war file to local tomcat server, you can run command: bash tomcat-local-deploy.sh
To start tomcat server you can run following command:
  cd $CATALINA_HOME/bin
  bash startup.sh (bash shutdhown.sh)
  
Or you can create a service to be more convinient.

Documents:
  Apache Tomcat: http://tomcat.apache.org/
  Apache Maven: http://maven.apache.org/
  Spring: http://spring.io/
