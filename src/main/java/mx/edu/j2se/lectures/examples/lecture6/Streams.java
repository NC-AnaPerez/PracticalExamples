package mx.edu.j2se.lectures.examples.lecture6;

import java.util.List;
import java.util.Arrays;
import java.util.Locale;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a3", "a1", "b1", "c2", "c1");
		
		System.out.println("== Filter ==");
		// Por las piedritas
//		for (String element:myList){
//			if (element.startsWith("c"))
//				System.out.println(element);
//		}
		myList.stream().filter(element -> element.startsWith("c")).forEach(System.out::println);
		
		System.out.println("\n== Map ==");
		// Por las piedritas
//		for (String element:myList){
//			if (element.startsWith("c")) {
//				String upperElement = element.toUpperCase();
//				System.out.println(upperElement);
//			}
//		}
		myList.stream().filter(element -> element.startsWith("c")).map(String::toUpperCase)
				.forEach(System.out::println);
		
		System.out.println("\n== Sort ==");
		// Por las piedritas
//		TreeSet<String> result = new TreeSet<>();
//		for (String element:myList){
//			if (element.startsWith("c")) {
//				result.add(element.toUpperCase());
//			}
//		}
//		for (String element:result){
//			System.out.println(element);
//		}

		myList.stream()
			.filter(element -> element.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		
	}
}
