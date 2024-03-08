package com.example.creationaldesginpattern;

public class FactoryDesignPattern {
	public static void main(String[] args) {
		Car obj1 = CarFactory.getCar("mercedIz");
		obj1.speed();
		Car obj2 = CarFactory.getCar("BenTely");
		obj2.speed();
		Car obj3 = CarFactory.getCar("Bmw");
		obj3.speed();
	}

}

class CarFactory {
	static Car getCar(String name) {
		if (name.trim().equalsIgnoreCase("mercediz")) {
			return new Mercediz();
		} else if (name.trim().equalsIgnoreCase("bmw")) {
			return new BMW();
		} else if (name.trim().equalsIgnoreCase("bentely")) {
			return new Bentely();
		} else {
			return null;
		}
	}

}

interface Car {
	void speed();
}

class Mercediz implements Car {
	public void speed() {
		System.out.println("Mercediz Speed: 500");
	}
}

class BMW implements Car {
	public void speed() {
		System.out.println("BMW Speed: 200");
	}
}

class Bentely implements Car {
	public void speed() {
		System.out.println("Bentely Speed: 100");
	}
}


/*
	***		Factory Design pattern		***
	It is a creational Desgin pattern	
	in which object creation responsiblity of Factory Class method based on the input
	we use factory desgin pattern when there is a superclass and multiple subclasses and we want to
to get the object of subclasses based on the input





*/