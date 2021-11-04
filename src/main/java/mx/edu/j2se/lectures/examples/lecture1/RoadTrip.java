package mx.edu.j2se.lectures.examples.lecture1;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase consiste de un Road Trip
 */
public class RoadTrip {
	
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<>();
		carList.add(new Car()); // Carro 1
		carList.add(new Car()); // Carro 2
		carList.add(new Car()); // Carro 3
		
		//Mandando llamar un behavior
		carList.forEach(Car::move);
		
		System.out.println("El road trip ha comenzado!");
	}
	
}
