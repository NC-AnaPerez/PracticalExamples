package mx.edu.j2se.lectures.examples.lecture7;

import java.util.*;

public class Optionals {
	public static void main(String[] args) {
		String str = null;
//		System.out.print(str.toUpperCase()); //NPE
		
		Optional<String> checkNull = Optional.ofNullable(str);
		System.out.println(checkNull.isPresent() ? str.toUpperCase() : "String is not present"); //String is not present
		
		str = "Hola!";
		checkNull = Optional.ofNullable(str);
		System.out.println(checkNull.isPresent() ? str.toUpperCase() : "String is not present"); //HOLA!
		
		System.out.println(checkNull.get()); // Hola!
		System.out.println(checkNull.orElse("This is the else")); // Hola!
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty.orElse("This is the else"));  //This is the else
	}
}
