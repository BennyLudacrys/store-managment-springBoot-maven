package com.bennyTech.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain (ServerHttpSecurity serverHttpSecurity){
        serverHttpSecurity
                .csrf().disable()
                .authorizeExchange(exchange ->
                        exchange.pathMatchers("/eureka/**", "/**/swagger-ui.html", "/**/swagger-resources/**"
                                , "/**/webjars/springfox-swagger-ui/**", "**/v2/api-docs/**")
                        .permitAll()
                        .anyExchange()
                        .authenticated())

                .oauth2ResourceServer(ServerHttpSecurity.OAuth2ResourceServerSpec::jwt);
        return serverHttpSecurity.build();
    }
}
