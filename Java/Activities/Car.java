package com.java.fst;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color,String transmission , int make)
	{
		this.color=color;
		this.transmission=transmission;
		this.make=make;
		
	}
	
	public void characteristics()
	{
		System.out.println("color of the car is " + this.color);
		System.out.println("Transmission of car " + this.transmission);
		System.out.println("Make " + this.make);
		System.out.println("Doors  " + this.doors);
		System.out.println("Tyres  " + this.tyres);
		
	}
	
	public void accelerate()
	{
		System.out.println("Car moved forward");
	}
	
	public void brake()
	{
		System.out.println("Car stops");
	}
}
