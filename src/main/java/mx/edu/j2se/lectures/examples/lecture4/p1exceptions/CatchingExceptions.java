package mx.edu.j2se.lectures.examples.lecture4.p1exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class CatchingExceptions {
	public static void main(String[] args) {
		
//		String externalInfo = null;
//		try (AutoClosableExample example = new AutoClosableExample()) { // try with resources
//			example.connect(); //Connecting to external service, DB,or some file
//			// Not executed anymore
//			externalInfo = example.getInfo(); //"Obtaining information from external service"
//			System.out.println("Finishing try block!");
//			// 1000
//		} catch (IOException io) {
//			System.out.println("IO Exception!");
//			io.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("\nException!");
//			e.printStackTrace();
//			Throwable[] suppressed = e.getSuppressed();
//			for (Throwable s : suppressed) {
//				s.printStackTrace();
//			}
//		}
//		//"Closing connection"
//		System.out.println("externalInfo:" + externalInfo); //"Something"
		
//		try {
//			System.out.println("\nWith error!");
//			withError();
//		} catch (Exception e) {
//			System.out.println("Exception!");
//			printDetails(e);
//		} catch (Error t) {
//			printDetails(t);
//		}
//
//		try {
//            System.out.println("\nWith Unchecked Exception!");
//			withUncheckedException();
//		} catch (IllegalArgumentException t) {
//			System.out.println("Illegal Argument");
//			printDetails(t);
//		} catch (RuntimeException t) {
//			printDetails(t);
//		}
//
//		try {
//			System.out.println("\nWith Checked Exception!");
//			withCheckedException();
//		} catch (Exception e) {
//            System.out.println("Catching exception!");
//			printDetails(e);
//			e.printStackTrace();
//		} catch (Throwable t) {
//			System.out.println("Catching throwable");
//			printDetails(t);
//		}
//
		//Not recommended
//		try {
//			System.out.println("\nNPE!");
//			Object n = null; //someMethod()
//			System.out.println(n.toString());
//		} catch (NullPointerException t) {
//			printDetails(t);
//		}
//		//Better
//		Object n = null;
//		if (n == null)
//			System.out.println("n is null");
//		else
//			System.out.println(n.toString());
//
//
//		try {
//			System.out.println("\nIndexOutOfBoundsException!");
//			System.out.println((new String[0])[0]);
//		} catch (IndexOutOfBoundsException t) {
//			printDetails(t);
//		}
//
		try {
			System.out.println("\nCustom Exception!");
			throw new CustomException(404);
		} catch (CustomException ce) {
			System.out.println(ce.getMessage());
			ce.printStackTrace();
		} catch (Throwable t) {
			printDetails(t);
			t.printStackTrace();
		}
		
	}
	
	static int someMethod(int x) throws FileNotFoundException {
		if (x == 0)
			throw new FileNotFoundException("x can not be 0");
		if (x == 1)
			throw new IllegalArgumentException("x can not be 1"); // extends from RuntimeException
		return x+1;
	}
	
	static void withError() throws Error {
		throw new Error("Simple error"); //Bad practice, throw exception
	}
	
	static void withUncheckedException() {
		throw new RuntimeException("Simple exception");
	}
	
	/**
	 *
	 * @throws Exception When something happens
	 */
	static void withCheckedException() throws Exception {
		try {
			addToStackTrace(); //
			addToStackTraceImportant();
		} catch (RuntimeException e) {
			//check some stuff
			if (e.getMessage().equals("Simple checked exception")) {
				System.out.println("Simple checked exception");
				try {
					addToStackTraceImportant();
				} catch (RuntimeException ex) {
					if (ex.getMessage().equals("Important exception")) {
						throw new Exception("Important exception happened!", e);
					}
				}
			}
		}
	}
	
	static void addToStackTrace() throws RuntimeException {
		throw new RuntimeException("Simple checked exception",
                new IllegalArgumentException("Random cause", new IOException("Some IO Exception"))); //Caused By
	}
	
	static void addToStackTraceImportant() throws RuntimeException {
		throw new RuntimeException("Important exception",
				new IllegalArgumentException("Random cause", new IOException("Some IO Exception"))); //Caused By
	}
	
	static void printDetails(Throwable t) {
		System.out.printf("%s - %s\n", t.getClass().getName(), t.getMessage());
	}
}
