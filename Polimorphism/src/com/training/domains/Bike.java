package com.training.domains;

import com.training.ifaces.Automobile;

public class Bike implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10000.00;
	}

	@Override
	public String getXColor() {
		// TODO Auto-generated method stub
		return "BLUE";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "YAMAHA";
	}

}
