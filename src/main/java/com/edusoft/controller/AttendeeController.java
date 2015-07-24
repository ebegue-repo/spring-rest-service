package com.edusoft.controller;

import java.sql.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edusoft.model.Attendee;

@RestController
public class AttendeeController {

    @RequestMapping(value="/attendee", method=RequestMethod.GET)
    public Attendee getAttendee(@RequestParam(value="name", defaultValue="World") String name){
    	Date date = Date.valueOf("2015-05-26"); 
		return new Attendee(1, "Pepe", "Perez", 99, "male", date);
    }
}