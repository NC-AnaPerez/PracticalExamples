package mx.edu.j2se.lectures.examples.lecture2.p1modifiers.access;

import mx.edu.j2se.lectures.examples.lecture2.p1modifiers.access.default_access.*;

public class ExampleOfAccess {
    public static String ATTRIBUTE = "";

    public static void main(String[] args) {
        ModifiersExample example = new ModifiersExample();
        example.publicAttribute = "Accessible from anywhere in the code";
        //example.privateAttribute = "Not accessible outside the class";
        example.publicMethod();
        //example.privateMethod(); //Not accessible outside the class
        example.doSomethingWithPrivates();
        example.new AuxClass().doSomethingWithPrivates();
        ModifiersExample.StaticAuxClass.doSomethingWithPrivates(example);
        ClassWithDefaultAccessAttrs classWithDefaultAccessAttrs = new ClassWithDefaultAccessAttrs();
        classWithDefaultAccessAttrs.publicAccessString = "Accessible from anywhere in the code";
        //defaultAccess.defaultAccessString = "Not accessible outside of package";
        //AuxClass auxClass = new AuxClass(); //can't be accessed outside of package
    }
}
