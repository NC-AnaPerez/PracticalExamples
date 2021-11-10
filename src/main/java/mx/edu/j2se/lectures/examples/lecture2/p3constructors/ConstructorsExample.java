package mx.edu.j2se.lectures.examples.lecture2.p3constructors;

public class ConstructorsExample {
    static void m(A a, String s) {
        a.message = s;
    }
    public static void main(String[] args) {
        A a11,a12,a13;
        a11 = new A("Hola"); //1
        a12 = a11;//1
        a13 = a11;//1

        m(a13,"Hello World");
        m(a12, "Hola Mundo");
        System.out.println(a11); //1 - Hola 2 - Hello Word 3 - Hola Mundo
        /*

        A a1, a2, a3, a4;
        a1 = new A();
        a2 = new A("My message");
        a3 = new A(100);
        a4 = new A("My message", null);

        System.out.println(a11);
        System.out.println(a12);
        System.out.println(a13);
        System.out.println(a4);

        a1 = null;
        a2 = null;
        a3 = null;
        a4 = null;

        System.gc();
        Class<A> a = A.class;*/

    }

    static class A {
        Integer i;
        String message;
        public A() {
            //super("");
            i = null;
            message = null;
        }
        A(String message) {
            //this();
            this.message = message;
        }
        A(int i) {
            this(String.format("The message is the number %d", i));
            this.i = i;
        }
        A(String message, Integer i) {
            this(message);
            this.i = i;
        }
        public String toString() {
            return String.format("A{message '%s', i %s}", message, i);
        }
        public void finalize(){
            System.out.println("Finalizing " + message);
        }


    }
}
