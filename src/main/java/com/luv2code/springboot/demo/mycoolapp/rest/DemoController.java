package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;


    @Autowired
    public DemoController (@Qualifier("aq") Coach coach){
        System.out.println("In Constructor demo controller swimCoach");
        this.coach = coach;
    }

    @GetMapping(path = "getSwimCoach")
    public String getSwimCoach(){
        return coach.getDailyWorkout();
    }


}
