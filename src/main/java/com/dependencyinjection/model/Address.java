package com.dependencyinjection.model;

public class Address {
	private String city;
	private String state;
	
	
	 public Address(String state, String city) {
	        this.state = state;
	        this.city = city;
	        
	    }
	 

	    public String getState() {
	        return state;
	    }
	    
	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getCity() {
	        return city;
	    }
	    
	    public void setCity(String city) {
	        this.city = city;
	    }

	    @Override
	    public String toString() {
	        return "Address{street='" + state + "', city='" + city + "'}";
	    }

}
