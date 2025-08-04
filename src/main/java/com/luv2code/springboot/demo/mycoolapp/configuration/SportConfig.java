package com.luv2code.springboot.demo.mycoolapp.configuration;


import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import com.luv2code.springboot.demo.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {


    @Bean(name = "aq")
    public Coach getSwimCoach() {
        return new SwimCoach();
    }




}
