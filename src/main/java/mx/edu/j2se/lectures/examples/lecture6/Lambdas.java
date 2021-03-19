package mx.edu.j2se.lectures.examples.lecture6;

import java.util.ArrayList;
import java.util.HashMap;

public class Lambdas {
	public enum GENERO {MASCULINO, FEMENINO};
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		System.out.println("Printing numbers...");
//		for(int i = 0; i<numeros.size(); i++)
//			System.out.println(numeros.get(i));
//		for (int numero:numeros)
//			System.out.println(numero);
		numeros.forEach( numero -> System.out.println(numero) );
		numeros.forEach(System.out::println);
		
		System.out.println("\nPrinting numbers with multiplier...");
		int multiplicador = 3;
		numeros.forEach( numero -> {
			int x = multiplicador*numero;
			System.out.println(x);
		});

		HashMap<String, GENERO> personas = new HashMap<>();
		personas.put("Juan", GENERO.MASCULINO);
		personas.put("Aranza", GENERO.FEMENINO);
		personas.put("Daniel", GENERO.MASCULINO);
		personas.put("Karla", GENERO.FEMENINO);

		System.out.println("\nPrinting names...");
		personas.forEach( (nombre, genero) -> System.out.println(nombre) );

		System.out.println("\nPrinting women...");
		personas.forEach( (nombre, genero) -> {
			if (genero.equals(GENERO.FEMENINO))
				System.out.println(nombre);
		});
	}
	
}
