package com.jcemaciel.comedyclub.adapter.config;

import com.jcemaciel.comedyclub.application.port.out.ClubPort;
import com.jcemaciel.comedyclub.application.service.ClubService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComedyServiceConfig {

    @Bean
    ClubService clubService(final ClubPort port) {
        return new ClubService(port);
    }
}
