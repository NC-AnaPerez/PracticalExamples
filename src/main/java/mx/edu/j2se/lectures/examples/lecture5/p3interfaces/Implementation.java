package mx.edu.j2se.lectures.examples.lecture5.p3interfaces;

public class Implementation implements Interface3 {
	
	@Override
	public void method1() {
		System.out.println("Method 1");
		System.out.println(SOME_CONSTANT);
	}
	
	@Override
	public void method2() {
		System.out.println("Method 2");
	}
	
	@Override
	public void method3() {
		System.out.println("Method 3");
	}
}
