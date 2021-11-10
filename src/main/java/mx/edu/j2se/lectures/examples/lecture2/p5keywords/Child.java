package mx.edu.j2se.lectures.examples.lecture2.p5keywords;

public class Child extends Parent {
    String name;
    Child(String name) {
        super("Parent " + name);
        this.name = "Child " + name;
    }

    @Override
    public String toString() {
        return super.toString() + " Child{name='" + this.name + "'}";
    }
}
