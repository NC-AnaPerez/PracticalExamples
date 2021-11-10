package mx.edu.j2se.lectures.examples.lecture2.p1modifiers.others.abstracts;

public abstract class HalfImplExample extends AbstractClassExample {
    @Override
    void defaultAbstractMethod() {
        System.out.println("Can't override this implementation outside the package \n" +
                "  mx.edu.j2se.lectures.examples.lecture2.p1modifiers.others.abstracts");
    }
}
