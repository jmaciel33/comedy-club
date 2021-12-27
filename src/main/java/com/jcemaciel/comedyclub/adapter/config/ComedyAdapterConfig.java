package com.jcemaciel.comedyclub.adapter.config;

import com.jcemaciel.comedyclub.adapter.out.repository.club.ClubAdapter;
import com.jcemaciel.comedyclub.adapter.out.repository.club.ClubRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComedyAdapterConfig {

    @Bean
    ClubAdapter clubAdapter(final ClubRepository clubRepository){
        return new ClubAdapter(clubRepository);
    }
}
