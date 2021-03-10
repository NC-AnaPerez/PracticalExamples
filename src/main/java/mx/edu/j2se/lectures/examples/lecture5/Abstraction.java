package mx.edu.j2se.lectures.examples.lecture5;

class Abstraction {
	public static void main (String[] args) {
	
		Operation o1 = new Addition ();
		Operation o2 = new Subtraction();
		System.out.println(o1.calculate(2, 3));
		System.out.println(o2.calculate(3, 5));
		
	}
}

abstract class Operation {
	public abstract int calculate (int a, int b);
}

class Addition extends Operation {
	@Override
	public int calculate (int a, int b) {
		return a + b ;
	}
}

class Subtraction extends Operation {
	@Override
	public int calculate (int a, int b) {
		return a - b;
	}
}

// Not correctly abstracted class
class OperationNotAbstract {
	public void suma(int a, int b) {
	
	}
	public void resta(int a, int b) {
	
	}
	// Not correctly abstracted because for each new operation the parent class has to be modified
}
