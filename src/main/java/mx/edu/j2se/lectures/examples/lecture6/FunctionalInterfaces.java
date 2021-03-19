package mx.edu.j2se.lectures.examples.lecture6;

public class FunctionalInterfaces {
	
	public static void main(String[] args) {
//		Converter<String, Integer> toInteger = from -> Integer.valueOf(from);
		Converter<String, Integer> toInteger = Integer::valueOf;
//		Converter<Integer, String> toString = from -> String.valueOf(from);
		Converter<Integer, String> toString = String::valueOf;
		
		Integer converted = toInteger.convert("123");
//		toInteger.convert(1234); //error
		System.out.println((converted instanceof Integer ? "It is an integer: " : "It is NOT an integer") + converted);

		String convertedAgain = toString.convert(1234);
		System.out.println((convertedAgain instanceof String ? "It is a string: " : "It is NOT a string") + convertedAgain);
	}
}

@FunctionalInterface
interface Converter<F, T> {
	T convert(F from);
}
