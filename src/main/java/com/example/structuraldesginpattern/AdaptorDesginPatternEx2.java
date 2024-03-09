package com.example.structuraldesginpattern;

public class AdaptorDesginPatternEx2 {
	public static void main(String[] args) {
		IphoneCharging obj = new IphoneCharging();
		IphoneChargerAdaptor adaptor = new IphoneChargerAdaptor();
		obj.setCharger(adaptor);
		obj.Charging("IphoneChargin is Completed 100%");
	}
}

interface Charger {
	void charge(String s);
}

class IphoneChargerAdaptor implements Charger {

	public void charge(String s) {
		System.out.println(s);
	}

}

class IphoneCharger {
	IphoneChargerAdaptor adaptor;

	void Charging(String s) {
		adaptor.charge(s);
	}
}

class IphoneCharging {
	Charger charger;

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	void Charging(String s) {
		charger.charge(s);
	}

}