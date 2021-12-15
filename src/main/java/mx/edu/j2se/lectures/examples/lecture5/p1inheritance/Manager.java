package mx.edu.j2se.lectures.examples.lecture5.p1inheritance;

public class Manager extends Employee
//		extends Entrepreneur
//	, Entrepreneur
	{
	private double bonus;
	
	Manager(String name) {
		super(name);
		bonus = 1000;
	}
	
	public void someMethod(){
		super.getName();
	}
		
	public String getTitle() {
		return "Manager " + super.name;
	}
	
	@Override
	public double getSalary() {
		return super.salary + bonus;
	}
	
}
