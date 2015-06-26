package com.edusoft.model;

import java.sql.Date;

public class Attendee {

    private final int id;
    private final String name;
    private final String last_name;
    private final int age;
    private final String genre; 
    private final Date signup_date;

    public Attendee(int id, String name, String last_name, int age, String genre, Date signup_date) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.genre = genre;
        this.signup_date = signup_date;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    public String getLastName(){
    	return this.last_name;
    }
    
    public int getAge(){
    	return this.age;
    }
    
    public String getGenre(){
    	return this.genre;
    }
    
    public Date getSignupDate(){
    	return this.signup_date;
    }
}
