package mx.edu.j2se.lectures.examples.lecture3;

public class TernaryOperator {
	
	public static void main(String[] args) {
		int x = 1;
		
		if (x == 1) {
			System.out.println("Hurra!");
		} else {
			System.out.println("Buuu!");
		}
		
		String s = x == 1 ? "Hurra!" : "Buuu!";
		
		System.out.println(x == 1 ? "Hurra!" : "Buuu!");
		
		// TODO Change from ternary to if-else: (x < y) ? -1 : ((x == y) ? 0 : 1);
	}
}
