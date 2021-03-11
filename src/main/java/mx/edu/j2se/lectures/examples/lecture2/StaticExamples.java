package mx.edu.j2se.lectures.examples.lecture2;

public class StaticExamples {
	public static void main(String[] args) {
		System.out.println("-> Non Static");
//		System.out.println("No objects created. Value of variable: " + NonStaticCounter.count); // Does not compile
//		System.out.println("No objects created. Value after set method: " + NonStaticCounter.set(10)); // Does not compile
		NonStaticCounter nonStaticCounter1 = new NonStaticCounter(); //+32 bits
		System.out.println("Object1 increment1: " + nonStaticCounter1.increment());
		NonStaticCounter nonStaticCounter2 = new NonStaticCounter(); //+32 bits
		System.out.println("Object2 increment1: " + nonStaticCounter2.increment());
		NonStaticCounter nonStaticCounter3 = new NonStaticCounter(); //+32 bits
		System.out.println("Object3 increment1: " + nonStaticCounter3.increment());
		// Total memory = 96 bits
		
		System.out.println("-> Static");
		System.out.println("No StaticCounter objects created. Value of variable: " + StaticCounter.count); // +32 bits
		System.out.println("No StaticCounter objects created. Value after set method: " + StaticCounter.set(100)); // +0 bits
		StaticCounter staticCounter1 = new StaticCounter(); // +0 bits
		System.out.println("Object1 increment1: " + staticCounter1.increment());
		StaticCounter staticCounter2 = new StaticCounter(); // +0 bits
		System.out.println("Object2 increment1: " + staticCounter2.increment());
		StaticCounter staticCounter3 = new StaticCounter(); // +0 bits
		System.out.println("Object3 increment1: " + staticCounter3.increment());
		// Total memory = 32 bits
	}
}

class NonStaticCounter {
	int count = 0;
	
	int increment(){
		return ++count;
	}
	
	int set(int x){
		return count = x;
	}
	
	/*
	final int count1; // Not initialized
	final int count2 = 0;
	int increment2(){
		return ++count2; // Final can not be modified after creation
	}
	 */
	
}

class StaticCounter {
	static int count = 0;
	
	int increment(){
		return ++count;
	}
	
	static int set(int x){
		return count = x;
	}
	
	/*
	final static int count1; // Not initialized
	final static int count2 = 0;
	int increment2(){
		return ++count2; // Final can not be modified after creation
	}
	 */
}

