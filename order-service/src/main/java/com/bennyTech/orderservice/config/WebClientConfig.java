package com.bennyTech.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    //esta classe fara o gerenciamento das classes externas
    //se quiser usar este bean em um servico externo deve declarar um bean com o mesmo nome do metodo
    @Bean
    @LoadBalanced //faz o balanco das rotas disponiveis na api
    public WebClient.Builder webClientBuilder(){
        return  WebClient.builder();
    }
}
