package edu.nwtc.java;

import edu.nwtc.java.threed.Cube;
import edu.nwtc.java.threed.Sphere;
import edu.nwtc.java.threed.Tetrahedron;
import edu.nwtc.java.threed.ThreeDimensionalShape;
import edu.nwtc.java.twod.Circle;
import edu.nwtc.java.twod.Square;
import edu.nwtc.java.twod.Triangle;
import edu.nwtc.java.twod.TwoDimensionalShape;

public class ShapeTest {
	public static void main(String[] args) {
		TwoDimensionalShape[] twoD = {new Circle(3.0), new Square(3.0), new Triangle(3.0)};
		ThreeDimensionalShape[] threeD = {new Cube(3.0), new Sphere(3.0), new Tetrahedron(3.0)};

		for (TwoDimensionalShape shape: twoD) {
			String shapeName = shape.getClass().getName();
			shapeName = shapeName.substring(shapeName.lastIndexOf(".") + 1);
			System.out.println(shapeName + ": Area: " + shape.calcArea());
		}

		for (ThreeDimensionalShape shape: threeD) {
			String shapeName = shape.getClass().getName();
			shapeName = shapeName.substring(shapeName.lastIndexOf(".") + 1);
			System.out.println(shapeName + ": SurfaceArea: " + shape.calcArea());
			System.out.println(shapeName + ": Volume: " + shape.calcVolume());
		}
	}
}
