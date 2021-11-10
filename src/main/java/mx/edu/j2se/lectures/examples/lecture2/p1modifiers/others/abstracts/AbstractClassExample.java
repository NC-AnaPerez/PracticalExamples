package mx.edu.j2se.lectures.examples.lecture2.p1modifiers.others.abstracts;

public abstract class AbstractClassExample {
    public final void publicMethod() {
        System.out.println("Can't override this implementation");
        defaultAbstractMethod();
    }
    //private abstract void privateAbstractMethod();
    protected abstract void protectedAbstractMethod();
    abstract void defaultAbstractMethod();
    public abstract void publicAbstractMethod();

    public int suma(int a) {return 0;}
    public double suma(Integer a) {return 0;}

}
