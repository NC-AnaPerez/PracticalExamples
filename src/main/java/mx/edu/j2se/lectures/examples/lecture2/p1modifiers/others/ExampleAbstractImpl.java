package mx.edu.j2se.lectures.examples.lecture2.p1modifiers.others;

import mx.edu.j2se.lectures.examples.lecture2.p1modifiers.others.abstracts.*;

public final class ExampleAbstractImpl extends HalfImplExample /*AbstractClassExample*/ {

    public static final String CONSTANT;
    public final String message;

    static  { CONSTANT = "Some constant value"; }
    { message = "Some new message"; }

    ExampleAbstractImpl() {
        //message = "Invalid assignment";
    }

    /* Final method cannot be override
    public void publicMethod() {
        System.out.println("Can't override this implementation");
    }

    @Override
    void defaultAbstractMethod() {
        System.out.println("Can't override this implementation in this package");
    };
     */

    @Override
    protected void protectedAbstractMethod() {
        System.out.println("ExampleAbstractImpl Override protected");
    }

    @Override
    public void publicAbstractMethod() {
        System.out.println("ExampleAbstractImpl Override public");
    }
}
//class ChildImpl extends ExampleAbstractImpl {}
