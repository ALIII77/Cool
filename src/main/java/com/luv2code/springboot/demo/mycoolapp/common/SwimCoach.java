package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {


    public SwimCoach () {
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return " swimming 1000 meter as a warmup  ";
    }
}
