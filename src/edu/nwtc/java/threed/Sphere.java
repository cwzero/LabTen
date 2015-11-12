package edu.nwtc.java.threed;

public class Sphere implements ThreeDimensionalShape {
	private double radius = 0.0;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double calcVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}
}
