package mx.edu.j2se.lectures.examples.lecture5;

public class Inheritance {
	public static void main(String[] args) {
		
		Employee empleado = new Employee();
		System.out.println(empleado.getSalary());
		
		Manager jefe = new Manager();
		System.out.println(jefe.getSalary());
	
	}
}

class Employee {
	public String name;
	protected double salary = 5000;
	private String birthday;
	
	private void privateMethod(){}
	protected void protectedMethod(){}
	protected void protectedMethod2(){}
	public void publicMethod(){}
	public void publicMethod2(){}
	
	public double getSalary() {
		return salary;
	}
	
}

class Manager extends Employee {
	private double bonus = 1000;
	
	@Override
	public double getSalary() {
		return super.salary + bonus;
	}

}

class CorrectEmployeeInheritance extends Employee {
	// protected -> public
	@Override
	public void protectedMethod(){}
	
	// protected -> protected
	@Override
	protected void protectedMethod2(){}
	
	// public -> public
	@Override
	public void publicMethod(){}
}

//class WrongEmployeeInheritance extends Employee {
//	// private override
//	@Override
//	private void privateMethod(){}
//
//	// protected -> private
//	@Override
//	private void protectedMethod(){}
//
//	// public -> private
//	@Override
//	private void publicMethod(){}
//
//	// public -> protected
//	@Override
//	protected void publicMethod2(){}
//}

// Final class
final class Executive extends Manager{
	
//	final methods

}

// Final class can not be extended
//class ExecutivePlus extends Executive {
//
//}
