package mx.edu.j2se.lectures.examples.lecture5.p2abstraction.areas;

public class Areas {
	public static void main(String[] args) {
		double totalArea;
		
		// === Not OOP way ===
		Triangle[] triangles = { new Triangle(3,4), new Triangle(2,5), new Triangle(5,4)};
		Square[] squares = { new Square(5), new Square(4), new Square(8)};
		Circle[] circles = { new Circle(3), new Circle(5), new Circle(1)};
		// Plus X number of arrays depending on the different figures
		totalArea = 0.0;
		for (Triangle t : triangles)
			totalArea += t.getArea();
		for (Square s : squares)
			totalArea += s.getArea();
		for (Circle c : circles)
			totalArea += c.getArea();
		// Plus X number of loops depending on the different figures
		System.out.println("Not cool approach: " + totalArea);
		
		
		
		// === Powerful OOP way ===
		Figure[] figures = {
				new Triangle(3,4), new Triangle(2,5), new Triangle(5,4),
				new Square(5), new Square(4), new Square(8),
				new Circle(3), new Circle(5), new Circle(1)
		};
		// Single array that includes all figures
		totalArea = 0.0;
		for (Figure f : figures)
			totalArea += f.getArea();
		// Single loop
		System.out.println("Super awesome approach: " + totalArea);
	}
}

abstract class Figure {
	abstract double getArea();
	
	public void theMethodInClass(){
		System.out.println("SI!");
	}
}

class Square extends Figure {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	double getArea() { return side*side;}
}

class Triangle extends Figure {
	private double width;
	private double height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() { return (width*height)/2;}
}

class Circle extends Figure {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	double getArea() { return Math.PI*radius*radius;}
}
