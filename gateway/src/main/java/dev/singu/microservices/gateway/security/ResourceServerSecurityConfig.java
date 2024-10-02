package dev.singu.microservices.gateway.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class ResourceServerSecurityConfig {

    @Bean
    public SecurityWebFilterChain configureResourceServer(ServerHttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .authorizeExchange(authorize -> authorize
                        .pathMatchers("/actuator/health/**").permitAll()
                        .anyExchange().authenticated()
                )
                .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()))
                .build();
    }

}
