package mx.edu.j2se.lectures.examples.lecture2.p2overloading;

public class OverloadExample {
    public static void main(String[] args) {
        Integer z = 10;
        A a1 = new A(), a2 = new B();
        something(z);
        something(7);
        something("Hello");
        something(3.0);
        something(3f);
        something(1,2);
        something(a1);
        something(a2);
        something((B)a2);
    }

    static class A {}
    static class B extends A {}

    static void something(int a) {
        System.out.println("int a " + a);
    }
    static void something(Integer a) {
        System.out.println("Integer a " + a);
    }
    static void something(String a) {
        System.out.println("String a " + a);
    }
    static void something(float a) {
        System.out.println("float a " + a);
    }
    static void something(double a) {
        System.out.println("double a " + a);
    }
    static void something(Integer a, int b) {
        System.out.println("Integer a " + a + " int b " + b);
    }
    static void something(A a) {
        System.out.println("class type A");
    }
    static void something(B a) {
        System.out.println("class type B");
    }
}
