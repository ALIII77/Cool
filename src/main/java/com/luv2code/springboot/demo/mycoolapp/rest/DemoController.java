package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(
             @Qualifier("cricketCoach") Coach theMyCoach
            ,@Qualifier("cricketCoach") Coach theAnotherCoach) {
        myCoach = theMyCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping(path = "/getDailyWorkout")
    public String getDailyWorkout (){
        return myCoach.getDailyWorkout();
    }


    @GetMapping("/checkBean")
    public String checkBean(){
        return "comparing bean ! the my coach bean = the another bean " + "\n "  + (myCoach + " * " + anotherCoach);
    }
}
