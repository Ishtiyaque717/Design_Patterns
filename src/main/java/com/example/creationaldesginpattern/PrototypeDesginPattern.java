package com.example.creationaldesginpattern;

public class PrototypeDesginPattern {

	public static void main(String[] args) throws InterruptedException {
		HeavyObject obj = new HeavyObject();
		obj.setHeavyProperty1(71);
		obj.setHeavyProperty2("Heavy");
		System.out.println(obj);
		try {
			System.out.println(obj.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

class HeavyObject implements Cloneable {
	int heavyProperty1;
	String heavyProperty2;

	void setHeavyProperty1(int heavyProperty1) throws InterruptedException {
		this.heavyProperty1 = heavyProperty1;
		Thread.sleep(3000);
	}

	int getHeavyProperty1() {
		return this.heavyProperty1;
	}

	void setHeavyProperty2(String heavyProperty2) {
		this.heavyProperty2 = heavyProperty2;
	}

	String getHeavyProperty2() {
		return this.heavyProperty2;
	}

	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public String toString() {
		return "HeavyObject [heavyProperty1=" + heavyProperty1 + ", heavyProperty2=" + heavyProperty2 + "]";
	}

}

/*
 * The Prototype Design Pattern is a creational design pattern It is used for
 * creating new objects by copying an existing object, if the object creation is
 * a heavy process then instead of doing the same heavy operation we can clone
 * the existing Object.
 */
