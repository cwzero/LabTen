package edu.nwtc.java.threed;

public class Tetrahedron implements ThreeDimensionalShape {
	private double length = 0.0;
	
	public Tetrahedron(double length) {
		this.length = length;
	}
	
	@Override
	public double calcArea() {
		return Math.sqrt(3.0) * Math.pow(length, 2);
	}

	@Override
	public double calcVolume() {
		return Math.pow(length, 3) / (6.0 * Math.sqrt(2));
	}
}
