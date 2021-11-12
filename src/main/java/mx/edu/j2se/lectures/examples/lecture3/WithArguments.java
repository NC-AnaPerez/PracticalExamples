package mx.edu.j2se.lectures.examples.lecture3;

public class WithArguments {
	static int x = 5;
	static String[] args = {"A"};
	
	public static void main(String[] args) {
		int x = 1;
		System.out.println("x = " + x + ", " + args[0]); // 1B
	}
}
