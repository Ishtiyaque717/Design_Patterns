package com.example.creationaldesginpattern;

public class SingletoneDesginPattern {
	public static void main(String[] args) {
		Animal obj = Animal.getAnimal();
		System.out.println(obj.hashCode());
		Animal obj2 = Animal.getAnimal();
		System.out.println(obj2.hashCode());

		Jalebi obj3 = Jalebi.getJalebi();
		Jalebi obj4 = Jalebi.getJalebi();
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());

	}
}

//---------------------------------------------------------------------------------------  //

// Lazy SingleTon
class Animal {
	int eye;
	int nose;
	String name;
	// ---1 create Static instance variable of the class
	private static Animal animal;

	// ---2 create private constructor
	private Animal(int eye, int nose, String name) {
		this.eye = eye;
		this.nose = nose;
		this.name = name;
	}

	// ---3 create static getinstanceMethod
	// ---4 write a logic to check if object is already existing return the same
	// object
	public static Animal getAnimal() {
		if (animal == null) {
			animal = new Animal(2, 1, "Dog");
			return animal;
		}
		return animal;
	}
}
// ---------------------------------------------------------------------------------------  //
// Eager SingleTone
class Jalebi {
	private static Jalebi obj = new Jalebi();

	private Jalebi() {

	}

	public static Jalebi getJalebi() {
		return obj;
	}
}