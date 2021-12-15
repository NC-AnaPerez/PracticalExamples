package mx.edu.j2se.lectures.examples.lecture5.p2abstraction;

class Abstraction {
	public static void main (String[] args) {
	
//		 Abstract classes can not be instantiated
//		Operation o0 = new Operation()
		
		Operation o1 = new Addition ();
		Operation o2 = new Subtraction();
		
		System.out.println(o1.calculate(2, 3));
		System.out.println(o2.calculate(3, 5));
		
	}
}
