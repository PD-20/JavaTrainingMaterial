package com.training.domains;

import java.util.Scanner;
import com.training.domains.ShowRoom;
import com.training.ifaces.Automobile;



public class Application_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ch="Y";
		
		do{
			
		System.out.println("Enter your choice:\n1-Maruti Car\n2-Toyota Car\n3-Bike");
		Scanner sca=new Scanner(System.in);
		
		
		int a=sca.nextInt();
		
		ShowRoom auto=new newShowroom(); // when superclass is expected subclass can be passed
		Automobile polyAuto=auto.getModel(a);
		
		if(polyAuto==null)
			System.out.println("Invalid Choice");
		auto.printQuote(polyAuto);
		
		System.out.println("want to continue Y/N");
		Scanner b= new Scanner(System.in);
		ch=b.next();

		}
		while(ch.equalsIgnoreCase("Y"));
		
		
	}
	
}
