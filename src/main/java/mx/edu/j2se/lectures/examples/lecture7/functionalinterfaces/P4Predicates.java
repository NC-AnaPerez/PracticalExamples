package mx.edu.j2se.lectures.examples.lecture7.functionalinterfaces;

import java.util.Objects;
import java.util.function.Predicate;

public class P4Predicates {
	public static void main(String[] args) {
		// different ways to declare
		Predicate<Object> isNull = new NullChecker();
		Predicate<Object> isNullInlineFunction = new Predicate<Object>() {
			@Override
			public boolean test(Object o) {
				return o == null;
			}
		};
		Predicate<Object> isNullLambda = o -> o == null;
		Predicate<Object> isNullReference = Objects::isNull;
		
		System.out.println(isNull.test(null)); //true
		System.out.println(isNull.negate().test(null)); //false
		
		//isEqual
		Predicate<Integer> is50 = Predicate.isEqual(50);
		
		Predicate<Integer> isGreater10 = i -> i > 10;
		Predicate<Integer> isLess100 = i -> i < 100;
		
		System.out.println(is50.test(49)); // false
		//and
		System.out.println(isGreater10.and(isLess100).test(50)); // true
		//or
		System.out.println(is50.or(isLess100).test(80)); //true
	}
}

class NullChecker implements Predicate<Object> {
	@Override
	public boolean test(Object o) {
		return o == null;
	}
}
