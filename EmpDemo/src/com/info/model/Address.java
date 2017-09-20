package com.info.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity

public class Address {
    @Id
	private int ano;
	private String city;
	private String state;
	
	public Address() {
		
	}
	public Address(int ano, String city, String state) {
		
		this.ano = ano;
		this.city = city;
		this.state = state;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [ano=" + ano + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
