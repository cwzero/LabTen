package edu.nwtc.java.twod;

public class Triangle implements TwoDimensionalShape {
	private double length = 0.0;
	
	public Triangle(double length) {
		this.length = length;
	}

	@Override
	public double calcArea() {
		return Math.pow(length, 2) * Math.sqrt(3) / 4;
	}
}
