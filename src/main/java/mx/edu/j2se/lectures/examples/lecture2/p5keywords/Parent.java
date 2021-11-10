package mx.edu.j2se.lectures.examples.lecture2.p5keywords;

public class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parent{name='" + name + "'}";
    }
}
