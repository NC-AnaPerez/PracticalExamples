package mx.edu.j2se.lectures.examples.lecture5.p1inheritance;

public class Inheritance {
	public static void main(String[] args) {
		
		Employee empleado = new Employee("chalan");
		Manager jefe = new Manager("jefazo");
		Executive ceo = new Executive("ceo");
//
		System.out.println(empleado instanceof Employee);
		System.out.println(jefe instanceof Employee);
		System.out.println(jefe instanceof Manager);
		
		System.out.println(empleado.getSalary()); // 5000
		System.out.println(jefe.getSalary()); // 6000
		System.out.println(ceo.getSalary());
	
	}
}

