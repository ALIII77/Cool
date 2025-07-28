package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;



//    @Autowired
//    public DemoController(@Qualifier("tennisCoach") Coach coach){
//        this.coach = coach;
//    }

    @Autowired
    public void setCoach(@Qualifier("tennisCoach") Coach coach){
        this.coach = coach;
    }

    @GetMapping(path = "/getDailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

}
