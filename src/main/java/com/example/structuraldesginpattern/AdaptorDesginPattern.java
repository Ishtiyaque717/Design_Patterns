package com.example.structuraldesginpattern;

public class AdaptorDesginPattern {
	public static void main(String[] args) {
		AssignmentWork obj = new AssignmentWork();
		penAdaptor pp = new penAdaptor();
		obj.setP(pp);
		obj.writeAssginement("hi I am Writing Assginment");

	}
}
interface Pen {
	void write(String s);
}
class penAdaptor implements Pen {
	PilotPen pp = new PilotPen();			// Object
	public void write(String s) {		//implement the interface method and now call the actual required method
		pp.markerPen(s);
	}
}
class PilotPen {
	void markerPen(String s) {
		System.out.println(s);
	}
}
class AssignmentWork {
	Pen pen;
	public Pen getPen() {
		return pen;
	}
	public void setP(Pen pen) {
		this.pen = pen;
	}
	void writeAssginement(String s) {
		pen.write(s);						//	object
	}
}