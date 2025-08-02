package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//TIP $END$
@Component
@Primary
@Qualifier(value = "cricketCoach")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//TIP create one bea
public class CricketCoach implements Coach {


    public CricketCoach(){
        System.out.println("In Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "implement dailyWorkout in CricketCoach class:-)";
     }


}
