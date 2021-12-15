package mx.edu.j2se.lectures.examples.lecture7.functionalinterfaces;

import java.util.function.Function;

public class P3FunctionClass {
	public static void main(String[] args) {
		// different ways to declare
		Function<Integer, String> toHex = new HexConverter();
		Function<Integer, String> toHexInlineFunction = new Function<Integer, String>() {
			@Override
			public String apply(Integer integer) {
				return Integer.toHexString(integer);
			}
		};
		Function<Integer, String> toHexLambda = i -> Integer.toHexString(i);
		Function<Integer, String> toHexReference = Integer::toHexString;
		
		// andThen: runs after
		Function<Integer, String> toUpperHex = toHex.andThen(String::toUpperCase);
	
		//compose: runs before
		Function<String, String> toHexFromString = toHex.compose(Integer::valueOf);
		
		System.out.println(toHex.apply(123)); // "7b"
		System.out.println(toUpperHex.apply(123)); // "7B"
		System.out.println(toHexFromString.apply("123")); // "7b"
	}
}

class HexConverter implements Function<Integer, String> {
	@Override
	public String apply(Integer i) {
		return Integer.toHexString(i);
	}
}
