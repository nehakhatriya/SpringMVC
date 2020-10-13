package com.controller.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	private String firstName;
	
	@NotNull(message="is required!")
	@Size(min=1,message="is required")
	private String lastName;
	private String country;
	private String language;
	private String[] operSystem;
	private LinkedHashMap<String,String> countryoptions;
	
	@NotNull(message="is required")
	@Min(value=1,message="greater than 0")
	@Max(value=10,message="less than 10")
	private int freepasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only five char/digits")
	private String postalcode;
	
	Student(){
		countryoptions=new LinkedHashMap<String,String>();
		countryoptions.put("IN","INDIA");
		countryoptions.put("AUS","AUSTRALIA");
		countryoptions.put("BRAZ","BRAZIL");
		countryoptions.put("SA","SOUTH AFRICA");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryoptions() {
		return countryoptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getOperSystem() {
		return operSystem;
	}

	public void setOperSystem(String[] operSystem) {
		this.operSystem = operSystem;
	}

	public int getFreepasses() {
		return freepasses;
	}

	public void setFreepasses(int freepasses) {
		this.freepasses = freepasses;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	
}
