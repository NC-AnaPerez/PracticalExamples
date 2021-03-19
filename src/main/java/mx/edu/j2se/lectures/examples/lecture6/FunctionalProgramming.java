package mx.edu.j2se.lectures.examples.lecture6;

import java.util.ArrayList;

public class FunctionalProgramming {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		addInteger(1, myList);
		addInteger(2, myList);
	}
	
	public static void addInteger(int x, ArrayList<Integer> theList){
		theList.add(x);
	}
}

class ObjectOrientedProgramming{
	static ArrayList<Integer> myList = new ArrayList<>(); //What happens when I comment it?
	
	public static void main(String[] args) {
		addInteger(1);
		addInteger(2);
	}
	
	public static void addInteger(int x){
		myList.add(x);
	}
}
