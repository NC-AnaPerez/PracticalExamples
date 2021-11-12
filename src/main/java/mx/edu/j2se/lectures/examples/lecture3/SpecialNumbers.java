package mx.edu.j2se.lectures.examples.lecture3;

public class SpecialNumbers {
	public static void main(String[] args) {
		/* Case 1 */
		int maxInt = 2147483647; //1111111111111111
		int maxIntPlus1 = maxInt+1;
		System.out.println(maxIntPlus1); // -2147483648

		/* Case 2 */
		int x1 = 300000;
		System.out.println(x1 * x1); // 0, 1, Error, ???
		
		/* Case 3 */
		float x2 = 1/2; //Or double
		System.out.println(x2);
		x2 = 1/ (float) 2; // 1/2.0
		System.out.println(x2);

		/* Case 4 */
		int minInt = -2147483648;
		int negMinInt = -minInt;
		System.out.println(negMinInt); // TODO: Why?

		double oneBy0 = 1.0 / 0.0;
		System.out.println(oneBy0); // Inf

		double negOneBy0 = -1.0 / 0.0;
		System.out.println(negOneBy0); // -Inf

		double zeroBy0 = 0.0/0.0;
		System.out.println(zeroBy0); // Ind NaN (Not a Number)

		double negZero = -0.0;
		System.out.println(negZero); // -0.0
	}
}
