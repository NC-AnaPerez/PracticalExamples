package mx.edu.j2se.lectures.examples.lecture3;

public class BitShifting {
	public static void main(String[] args) {
		
		// << Shifts left, replacing missing spaces with 0
		System.out.println(Integer.toBinaryString(0b10010 << 2)); // 1001000
		
		// >> Shifts right, replacing missing spaces with the value of the MSB Most Significant Bit (most left one)
		System.out.println(Integer.toBinaryString(0b10010 >> 2)); // 11100
		
		// >>> Shifts right, replacing missing spaces with 0
		System.out.println(Integer.toBinaryString(0b10010 >>> 2)); // 100
		
		// SPOILERS! Answers
		
		/*
		// Because the MSB is the one at the integer limit!
		
		System.out.println(Integer.toBinaryString(0b10000000000000000000000000010010 >> 2));
		System.out.println(Integer.toBinaryString(0b00000000000000000000000000010010 >> 2));
		System.out.println(Integer.toBinaryString(0b10000000000000000000000000010010 >>> 2));
		System.out.println(Integer.toBinaryString(0b00000000000000000000000000010010 >>> 2));
		
		 */
	}
}
