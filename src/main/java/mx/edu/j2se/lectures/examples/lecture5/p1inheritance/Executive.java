package mx.edu.j2se.lectures.examples.lecture5.p1inheritance;

public final class Executive extends Manager {
	private double salary = 10000;
	
	Executive(String name) {
		super(name);
	}
	
	@Override
	public double getSalary() {
		return salary;
	}
	
	//	final methods
	private void signContract() {
	
	}

}

// Final class can not be extended
//class ExecutivePlus extends Executive {
//
//	ExecutivePlus(String name) {
//		super(name);
//	}
//}
