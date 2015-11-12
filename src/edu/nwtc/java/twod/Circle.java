package edu.nwtc.java.twod;

public class Circle implements TwoDimensionalShape {
	private double radius = 0.0;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
