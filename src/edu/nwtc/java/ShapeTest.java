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
		Shape[] shapes = {new Circle(3.0), new Square(3.0), new Triangle(3.0), new Cube(3.0), new Sphere(3.0), new Tetrahedron(3.0)};

		for (Shape shape: shapes) {
			String shapeName = shape.getClass().getName();
			shapeName = shapeName.substring(shapeName.lastIndexOf(".") + 1);
			if (shape instanceof TwoDimensionalShape) {
				System.out.println(shapeName + ": Area: " + ((TwoDimensionalShape)shape).calcArea());
			}
			if (shape instanceof ThreeDimensionalShape) {
				System.out.println(shapeName + ": SurfaceArea: " + ((ThreeDimensionalShape)shape).calcArea());
				System.out.println(shapeName + ": Volume: " + ((ThreeDimensionalShape)shape).calcVolume());
			}
		}
	}
}
