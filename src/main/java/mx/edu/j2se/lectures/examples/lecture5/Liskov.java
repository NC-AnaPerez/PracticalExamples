package mx.edu.j2se.lectures.examples.lecture5;

public class Liskov {
	public static void main(String[] args) {
		Rectangle rectangulo = new Rectangle();
		rectangulo.setWidth(5);
		rectangulo.setHeight(10);
		System.out.println("Original Rectangle: " + rectangulo.getArea());
		rectangulo.setHeight(15);
		System.out.println("Modified Rectangle: " + rectangulo.getArea());
		
		Rectangle square = (Rectangle) new SquareLiskov();
		square.setWidth(5);
		square.setHeight(10);
		System.out.println("Original Square: " + square.getArea());
		square.setHeight(15);
		System.out.println("Modified Square: " + square.getArea());
		
	}
}

class Rectangle {
	protected int width;
	protected int height;
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea(){
		return width*height;
	}
}

class SquareLiskov extends Rectangle {
	
	public void setWidth(int width) {
		this.width = width;
		this.height = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}

}
