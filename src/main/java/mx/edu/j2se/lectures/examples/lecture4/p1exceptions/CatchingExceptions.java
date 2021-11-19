package mx.edu.j2se.lectures.examples.lecture4.p1exceptions;

import java.io.IOException;

public class CatchingExceptions {
    public static void main(String[] args) {

        String externalInfo = null;
        try ( AutoClosableExample example = new AutoClosableExample() ) {
            example.connect();
            externalInfo = example.getInfo();
        }
        catch (IOException io) {
            io.printStackTrace(System.err);
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
            Throwable[] suppressed = e.getSuppressed();
            for(Throwable s : suppressed) {
                s.printStackTrace(System.err);
            }
        }
        System.out.println(externalInfo);


        try {
            withError();
        } catch (Throwable t) {
            printDetails(t);
        }
        try {
            withUncheckedException();
        } catch (Throwable t) {
            printDetails(t);
        }
        try {
            withCheckedException();
        } catch (Exception e) {
            printDetails(e);
            e.printStackTrace(System.err);
        } catch (Throwable t) {
            System.out.println("Catching throwable");
            printDetails(t);
        }
        try {
            Object n = null;
            System.out.println(n.toString());
        } catch (Throwable t) {
            printDetails(t);
        }
        try {
            System.out.println((new String[0])[0]);
        } catch (Throwable t) {
            printDetails(t);
        }
        try {
            throw new CustomException(404);
        } catch(CustomException ce) {
            System.out.println(ce.getMessage());
            ce.printStackTrace(System.err);
        } catch (Throwable t) {
            printDetails(t);
            t.printStackTrace(System.err);
        }
    }

    static void withError() throws Error {
        throw new Error("Simple error");
    }
    static void withUncheckedException() {
        throw new RuntimeException("Simple exception");
    }
    static void withCheckedException() throws Exception {
        addToStackTrace();
    }
    static void addToStackTrace() throws Exception {
        throw  new Exception("Simple checked exception", new IllegalArgumentException("Random cause"));
    }
    static void printDetails(Throwable t) {
        System.out.printf("%s - %s\n", t.getClass().getName(), t.getMessage());
    }
}
