# Spring API
## The ultimate template for starting a Java API with Spring


This is an API with the purpose of be a template for microservice based projects that uses Spring Boot 3, 
Swagger/OpenAPI 3, Logstash, Consul as a service discovery and Keycloak as authentication platform.
Will add elasticsearch and PostgreSQL in the future in order to use PostgreSQL, Elasticsearch and MongoDB.

How to deploy with Docker Compose:
Chmod in order to add execution permissions:
```sh
chmod +x ./run.sh
```

Execute with root:
```sh
sudo ./run.sh
```

To stop the deploy:
```sh
sudo ./stop.sh
```


This API is intended to be used with the ELK Stack in order to centralize logs,
so you will need to deploy it also. If not, you must update the code: delete "logback.xml" and logstash dependency.

Docker ELK: https://github.com/deviantony/docker-elk
