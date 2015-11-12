package edu.nwtc.java.threed;

public class Cube implements ThreeDimensionalShape {
	private double length = 0.0;
	
	public Cube(double length) {
		this.length = length;
	}

	@Override
	public double calcArea() {
		return 6 * Math.pow(length, 2);
	}

	@Override
	public double calcVolume() {
		return Math.pow(length, 3);
	}
}
