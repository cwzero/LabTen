package edu.nwtc.java.twod;

public class Square implements TwoDimensionalShape {
	private double length = 0.0;
	
	public Square(double length) {
		this.length = length;
	}
	
	@Override
	public double calcArea() {
		return Math.pow(length, 2);
	}
}
