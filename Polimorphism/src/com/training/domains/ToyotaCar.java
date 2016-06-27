package com.training.domains;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 120000.00D;
	}

	@Override
	public String getXColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "TOYO 1";
	}

}
