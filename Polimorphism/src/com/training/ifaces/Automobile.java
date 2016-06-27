package com.training.ifaces;

//
//
// Interface representing automobiles
//
//
//
public interface Automobile {
	
	public static final String SHOWROOM_NAME= "XYZ CARS";
	
	/*
	 * Methods in INTERFACE  are implicitly PUBLIC AND ABSTRACT
	 */
	
	public abstract double getPrice();
	public String getXColor();
	String getModel();
	
}
