package mx.edu.j2se.lectures.examples.lecture5.p2abstraction;

public class NotAnAbstraction {
	public int suma(int a, int b) {
		return a + b ;
	}
	
	public int resta(int a, int b) {
		return a - b ;
	}
	// Not correctly abstracted because for each new operation the parent class has to be modified
}
