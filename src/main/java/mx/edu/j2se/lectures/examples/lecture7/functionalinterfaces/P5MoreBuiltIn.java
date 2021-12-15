package mx.edu.j2se.lectures.examples.lecture7.functionalinterfaces;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class P5MoreBuiltIn {
	public static void main(String[] args) {
		//Supplier
		Supplier<Person> personSupplier = Person::new;
		System.out.println(personSupplier.get()); // fistName, lastName
		
		//Consumer
		Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
		greeter.accept(new Person("Luke", "Skywalker"));
		
		//Comparator
		Comparator<Person> comparator = Comparator.comparing(p -> p.firstName);
		Person p1 = new Person("John", "Doe");
		Person p2 = new Person("Alice", "Wonderland");
//		Returns a:
//		- negative integer p1 < p2
//		- zero p1 = p2
//	    - positive integer p1 > p2
		System.out.println(comparator.compare(p1, p2));            // > 0
		System.out.println(comparator.reversed().compare(p1, p2)); // < 0
		p1.firstName = p2.firstName;
		System.out.println(comparator.compare(p1, p2)); // 0
	}
}
