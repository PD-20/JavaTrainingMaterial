package com.training.domains;

import com.training.ifaces.Automobile;

public class newShowroom extends ShowRoom{  // inheriting ShowRoom (the superclass)

	@Override
	public Automobile getModel(int key)
	{
		if(key==3)
			return new Bike();
			
		else return super.getModel(key);
		}
	}


