package com.example.creationaldesginpattern;

public class BuilderDesginPattern {
	public static void main(String[] args) {
		Mobile o=new MobileBuilder().setBatteryCapacity("4500").getMobile();
		System.out.println(o);
		Mobile o2= new MobileBuilder().setOS("IOS").setBrand("Apple").getMobile();
		System.out.println(o2);

	}
}

class Mobile {
	private String OS;
	private String brand;
	private double screenSize;
	private String batteryCapacity;

	public Mobile(String oS, String brand, double screenSize, String batteryCapacity) {
		super();
		OS = oS;
		this.brand = brand;
		this.screenSize = screenSize;
		this.batteryCapacity = batteryCapacity;
	}

	public String getOS() {
		return OS;
	}

	public String getBrand() {
		return brand;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	@Override
	public String toString() {
		return "Mobile [OS=" + OS + ", brand=" + brand + ", screenSize=" + screenSize + ", batteryCapacity="
				+ batteryCapacity + "]";
	}

	
}

class MobileBuilder {
	String OS;
	String brand;
	double screenSize;
	String batteryCapacity;

	public MobileBuilder setOS(String oS) {
		OS = oS;
		return this;
	}

	public MobileBuilder setBrand(String brand) {
		return this;
	}

	public MobileBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public MobileBuilder setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
		return this;
	}

	public Mobile getMobile() {
		return new Mobile(OS, brand, screenSize, batteryCapacity);
	}

}




/*
Builder Design Pattern is a creational design pattern
it is used to construct complex objects step by step
if you need to specify a complex constructor then order of parameter we should remember




*/