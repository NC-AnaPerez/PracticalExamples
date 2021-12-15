package mx.edu.j2se.lectures.examples.lecture7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {
	private static int z;
	
	public static void main(String[] args) {
		// Pure vs not-pure functions
		z = 5;
		System.out.println(functionalAdd(1, 2)); // 3
		System.out.println(nonFunctionalAdd(1, 2)); // 8
		z = 6;
		System.out.println(functionalAdd(1, 2)); //3
		System.out.println(nonFunctionalAdd(1, 2)); //9
		
		// Declarative (F) vs Imperative (OOP)
		List<Integer> theList = Arrays.asList(1, 2, 3, 4, 5, 6);
		imperativeAdd(theList);
		declarativeAdd(theList);
	}
	
	public static int functionalAdd(int x, int y) {
		return x + y;
	}
	
	public static int nonFunctionalAdd(int x, int y) {
		return x + y + z;
	}
	
	public static List<Integer> imperativeAdd(List<Integer> list) {
		List<Integer> results = new ArrayList<>(); //1
		for (Integer num : list) { //2
			if (num % 2 != 0) //3
				results.add(num); //4
		}
		return results; //5
	}
	
	public static List<Integer> declarativeAdd(List<Integer> list) {
		return list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
	}
}
