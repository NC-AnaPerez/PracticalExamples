package mx.edu.j2se.lectures.examples.lecture7;

import java.util.List;
import java.util.Arrays;
import java.util.Locale;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a3", "a1", "b1", "c2", "c1");
		
		System.out.println("== Filter (starting with c)  ==");
		// Por las piedritas
		for (String s : myList) {
			if (s.charAt(0) == 'c') {
				System.out.println(s);
			}
		}
		// stream
		myList.stream()
				.filter(s -> s.startsWith("c"))
				.forEach(System.out::println);
		
		System.out.println("\n== Map (to Upper Case) ==");
		// Por las piedritas
		for (String s : myList) {
			if (s.charAt(0) == 'c') {
				System.out.println(s.toUpperCase());
			}
		}
		myList.stream()
				.filter(s -> s.startsWith("c"))
				.map(String::toUpperCase)
				.forEach(System.out::println);
		
		System.out.println("\n== Sort (alphabetically) ==");
		// Por las piedritas
		TreeSet<String> result = new TreeSet<>();
		for (String element:myList){
			if (element.startsWith("c")) {
				result.add(element.toUpperCase());
			}
		}
		for (String element:result){
			System.out.println(element);
		}

		myList.stream()
				.filter(s -> s.startsWith("c"))
				.map(String::toUpperCase)
				.sorted()
//				.collect(Collectors.toList()) // On Java 8
//				.toList() // On Java 16
				.forEach(System.out::println);
		
	}
}
