package com.example.FaresDammak_SOA_TP6;

import com.example.FaresDammak_SOA_TP6.web.jaxrs;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig start(){
        ResourceConfig res = new ResourceConfig();
        res.register(jaxrs.class);
        return res;
    }
}
