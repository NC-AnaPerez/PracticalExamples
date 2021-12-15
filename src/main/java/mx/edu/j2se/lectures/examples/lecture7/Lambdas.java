package mx.edu.j2se.lectures.examples.lecture7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Lambdas {
	public enum GENERO {MASCULINO, FEMENINO};
	
	public static void main(String[] args) {
		List<Integer> theList = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		System.out.println("Printing numbers...");
		// Option 1: classic FOR
		for(int i = 0; i < theList.size(); i++)
			System.out.println(theList.get(i));
		
		// Option 2: enhanced FOR
		for (int theNumber : theList)
			System.out.println(theNumber);
		
		// Option 3: forEach lambda
		theList.forEach(theNumber -> System.out.println(theNumber));
		theList.forEach((Integer theNumber) -> {
			int newNumber = theNumber + 5;
			System.out.println(newNumber);
		});
		
		// Option 4: forEach reference
		theList.forEach(System.out::println);
		
//		Stream.of(theList).forEach(System.out::println); //Not really necessary
		
		
		System.out.println("\nPrinting numbers with multiplier...");
		int multiplicador = 3;
		// forEach
		theList.forEach(theNumber -> System.out.println(multiplicador * theNumber));
		theList.forEach(theNumber -> {
			int x = multiplicador * theNumber;
			System.out.println(x);
		});
		
		// stream map
		theList.stream().map(theNumber -> multiplicador*3).forEach(System.out::println);

		Map<String, GENERO> personas = new HashMap<>();
		personas.put("Juan", GENERO.MASCULINO);
		personas.put("Aranza", GENERO.FEMENINO);
		personas.put("Daniel", GENERO.MASCULINO);
		personas.put("Karla", GENERO.FEMENINO);

		System.out.println("\nPrinting names...");
		for (Map.Entry<String, GENERO> persona : personas.entrySet()) {
			System.out.println(persona.getKey());
		}
		for (String nombre : personas.keySet()) {
			System.out.println(nombre);
		}
		personas.forEach( (nombre, genero) -> System.out.println(nombre) );

		System.out.println("\nPrinting women...");
		for (Map.Entry<String, GENERO> persona : personas.entrySet()){
			if(persona.getValue().equals(GENERO.FEMENINO))
				System.out.println(persona.getKey());
		}
		personas.forEach((nombre, genero) -> {
			if(genero.equals(GENERO.FEMENINO))
				System.out.println(nombre);
		});
		
		// stream filter
		personas.entrySet().stream()
				.filter(entry -> GENERO.FEMENINO.equals(entry.getValue()))
				.forEach(entry -> System.out.println(entry.getKey()));
	}
	
}
