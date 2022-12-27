package com.programmingtechie.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    //esta classe fara o gerenciamento das classes externas
    //se quiser usar este bean em um servico externo deve declarar um bean com o mesmo nome do metodo
    @Bean
    public WebClient webClient(){
        return  WebClient.builder().build();
    }
}
