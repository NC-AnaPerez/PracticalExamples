package mx.edu.j2se.lectures.examples.lecture2.p1modifiers.access.default_access;

import static mx.edu.j2se.lectures.examples.lecture2.p1modifiers.access.ExampleOfAccess.*;

public class AccessExample {
    public static void main(String[] args) {
        System.out.println(ATTRIBUTE);

        ClassWithDefaultAccessAttrs classWithDefaultAccessAttrs = new ClassWithDefaultAccessAttrs();
        classWithDefaultAccessAttrs.publicAccessString = "Accessible from anywhere in the code";
        classWithDefaultAccessAttrs.defaultAccessString = "Accessible in the package";
        DefaultAccessClass auxClass = new DefaultAccessClass(); //can be accessed in the same package only
        auxClass.defaultAccessString = "Accessible in the package";
    }
}
