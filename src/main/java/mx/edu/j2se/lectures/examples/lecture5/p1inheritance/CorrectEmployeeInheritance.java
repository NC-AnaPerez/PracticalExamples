package mx.edu.j2se.lectures.examples.lecture5.p1inheritance;

public class CorrectEmployeeInheritance extends Employee {
	private String extraParam;
	
	CorrectEmployeeInheritance (String name) {
		super(name);
		extraParam = "extra";
	}
	
	public String whoAmI() {
		return super.name;
	}
	
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


