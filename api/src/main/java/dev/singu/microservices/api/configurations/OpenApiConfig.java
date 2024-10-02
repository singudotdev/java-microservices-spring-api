package dev.singu.microservices.api.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "SINGU",
                        email = "jota@singu.dev",
                        url = "https://singu.dev/"
                ),
                description = "OpenApi documentation for Spring Security",
                title = "OpenApi specification - SINGU",
                version = "1.0",
                license = @License(
                        name = "MIT License",
                        url = "https://mit-license.org/"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:9001"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "https://singu.dev/"
                )
        }
)
public class OpenApiConfig {

}
