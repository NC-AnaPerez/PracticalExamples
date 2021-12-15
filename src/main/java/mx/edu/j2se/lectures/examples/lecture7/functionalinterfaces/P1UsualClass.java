package mx.edu.j2se.lectures.examples.lecture7.functionalinterfaces;

public class P1UsualClass {
	public static Integer convert(String s) {
		return Integer.valueOf(s);
	}
	
	public static String convert(Integer i) {
		return String.valueOf(i);
	}
	
	public static void main(String[] args) {
		Integer converted = convert("123");
		System.out.println((converted instanceof Integer
				? "It is an integer: "
				: "It is NOT an integer") + converted);
		
		String convertedAgain = convert(1234);
		System.out.println((convertedAgain instanceof String
				? "It is a string: "
				: "It is NOT a string") + convertedAgain);
	}
}
