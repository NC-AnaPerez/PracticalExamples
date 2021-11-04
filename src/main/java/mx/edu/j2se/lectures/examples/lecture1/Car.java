package mx.edu.j2se.lectures.examples.lecture1;

import java.util.ArrayList;
import java.util.List;

public class Car {
//	Esto es una constante (mayusculas con guion bajo)
	public static final String GASOLINE_TYPE = "Diesel";
	
	public Car() {
		this.engine = new Engine();
		this.passengerList = new ArrayList<>();
		this.fuelTank = new Tank();
		this.wheels = new ArrayList<>();
	}
	
	//	STATE (lo que tiene)
	Engine engine;
	List<Passenger> passengerList;
	Tank fuelTank;
	List<Wheel> wheels;
	
//	BEHAVIORS (lo que puede hacer)
	/**
	 * Esto es un JavaDoc!
	 * <br>Este metodo hace que tu coche se mueva.
	 * <br>No requiere parametros.
	 * @author Ana
	 */
	public void move() {
		/*
		Esto es un comentario multi linea!
		Primero se empieza el coche y despues se le inyecta gasolina
		 */
		engine.start();
		engine.giveGas();
	}
	
}
