package mx.edu.j2se.lectures.examples.lecture3;

public class Literals {
	public static void main(String[] args) {
		/* 16-bit Unicode character */
		char character = 'A';
		char specialCharacter = '\\'; // \t, \n, \', \", \\
		char octalCode = '\101';// ???
		char hexadecimalСode = '\u0041';
		
		// chars can be operated as integers
		char theA = 'A';
		System.out.println(theA + 1);
		for (int i = 0; i < 26; i++)
			System.out.print((char) (theA + i) + ", ");

		/* boolean */
		boolean isTrue = true;
		boolean isFalse = false;

		/* 8-bit signed integer */
		byte minimum = -128;
		byte maximum = 0x7F; // +127

		/* 16-bit signed integer */
		short number = 300;
		short hexadecimal = 0X7FFF;
		short maxValue = Short.MAX_VALUE;
		
		/* 32-bit signed integer */
		int normalInt = 123;
		int octal = 013;    // = 12;
		int binary = 0b1100; // = 12;

		/* 64-bit signed integer */
		long smallLong = 8L;
		long bigLong = 9223372036854775807L;

		/* 32-bit floating-point integer */
		float integer1 = 12F;
		float integer2 = 12f;
		float fraction = 3.14F;
		float one = 1.f;
		float oneTenth = .1f;
		float exponent = 1e3f; // 1*10^3 = 1000
		float exponent2 = 2E-3f; // 0.002

		/* 64-bit floating-point integer */
		double simple = 2.9999999999999999;
		double doubleWithType = 0.00d;
		double doubleWithType2 = 0.00D;
	}
	
	
}
