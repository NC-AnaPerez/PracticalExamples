package mx.edu.j2se.lectures.examples.lecture7.functionalinterfaces;

public class P2FunctionalInterfaces {
	
	public static void main(String[] args) {
		
//		Converter toIntegerSimple = from -> Integer.valueOf(from);
//		Integer converted = toIntegerSimple.convert("123");
//		System.out.println((converted instanceof Integer
//				? "It is an integer: "
//				: "It is NOT an integer") + converted);


//		ConverterPro<String, Integer> toInteger = from -> Integer.valueOf(from);
		ConverterPro<String, Integer> toInteger = Integer::valueOf;
//		ConverterPro<Integer, String> toString = from -> String.valueOf(from);
		ConverterPro<Integer, String> toString = String::valueOf;
		
		
		Integer converted = toInteger.convert("123");
//		toInteger.convert(1234); //error
		System.out.println((converted instanceof Integer
				? "It is an integer: " : "It is NOT an integer") + converted);

		String convertedAgain = toString.convert(1234);
		System.out.println((convertedAgain instanceof String
				? "It is a string: " : "It is NOT a string") + convertedAgain);
	
	}
}

@FunctionalInterface
interface Converter<String, Integer> {
	Integer convert(String from);
}

@FunctionalInterface
interface ConverterPro<F, T> {
	T convert(F from);
}
