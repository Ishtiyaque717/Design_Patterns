package com.example.creationaldesginpattern;

public class AbstractFactoryDesginPattern {
	public static void main(String[] args) {
		Bike obj1 = BikeFactory.getBike(new R15Factory());
		obj1.color();
		Bike obj2 = BikeFactory.getBike(new HornetFactory());
		obj2.color();
		Bike obj3 = BikeFactory.getBike(new ShaheenFactory());
		obj3.color();
		
	}
}
// abstractFactory
abstract class BikeAbstractFactory {
	public abstract Bike createBike();
}
// child AbstractFactory
class HornetFactory extends BikeAbstractFactory {
	public Bike createBike() {
		return new Hornet();
	}
}
//child AbstractFactory
class ShaheenFactory extends BikeAbstractFactory {
	public Bike createBike() {
		return new Shaheen();
	}
}
//child AbstractFactory
class R15Factory extends BikeAbstractFactory {
	public Bike createBike() {
		return new R15();
	}
}
// Factory Class
class BikeFactory {
	public static Bike getBike(BikeAbstractFactory factory) {
		return factory.createBike();
	}
}

//	superclass
interface Bike {
	void color();
}

//	child class
class Hornet implements Bike {
	public void color() {
		System.out.println("Hornet color: Green");
	}
}

//	child class
class Shaheen implements Bike {
	public void color() {
		System.out.println("Shaheen Color: Black");
	}
}

//	child class
class R15 implements Bike {
	public void color() {
		System.out.println("R15 color: Maroon");
	}
}
