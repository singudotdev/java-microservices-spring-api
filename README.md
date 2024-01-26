# Spring API
## The ultimate template for starting a Java API with Spring


This is an API with the purpose of be a template for microservice based projects that uses Spring Boot 3, 
Swagger/OpenAPI 3, Logstash and Consul as a service discovery.
Will add elasticsearch in the future in orroder to use PostgreSQL, Elasticsearch and MongoDB.

How to deploy with Docker Compose:
```sh
docker compose up -d
```

To stop the deploy:
```sh
docker compose down
```


This API is intended to be used with the ELK Stack in order to centralize logs,
so you will need to deploy it also. If not, you must update the code.

Docker ELK: https://github.com/deviantony/docker-elk
