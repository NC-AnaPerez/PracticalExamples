package mx.edu.j2se.lectures.examples.lecture2.p1modifiers.access.default_access.child_package;

import mx.edu.j2se.lectures.examples.lecture2.p1modifiers.access.default_access.*;

public class ChildPackageAccessExample {
    public static void main(String[] args) {
        ClassWithDefaultAccessAttrs classWithDefaultAccessAttrs = new ClassWithDefaultAccessAttrs();
        classWithDefaultAccessAttrs.publicAccessString = "Accessible from anywhere in the code";
        //defaultAccess.defaultAccessString = "Not accessible in child packages";
        //AuxClass auxClass = new AuxClass(); //can't be accessed in child packages
    }
}
