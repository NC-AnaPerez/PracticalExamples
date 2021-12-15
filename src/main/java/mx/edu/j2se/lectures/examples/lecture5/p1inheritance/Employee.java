package mx.edu.j2se.lectures.examples.lecture5.p1inheritance;

public class Employee {
	public String name;
	protected double salary = 5000;
	private String birthday;
	
	Employee(String name) {
		this.name = name;
	}
	
	public final String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void publicMethod(){}
	public void publicMethod2(){}
	
	protected void protectedMethod(){}
	protected void protectedMethod2(){}
	
	private void privateMethod(){}
}
