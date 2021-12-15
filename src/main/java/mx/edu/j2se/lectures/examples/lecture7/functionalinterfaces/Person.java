package mx.edu.j2se.lectures.examples.lecture7.functionalinterfaces;

public class Person {
	public String firstName = "firstName";
	public String lastName = "lastName";
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person() {
	
	}
	
	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
