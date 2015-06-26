package com.edusoft.controller;

import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.edusoft.model.Attendee;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Attendee greeting(@RequestParam(value="name", defaultValue="World") String name){
    	Date date = Date.valueOf("2015-05-26"); 
		return new Attendee(1, "Eduardo", "Begue", 29, "male", date);
    }
}