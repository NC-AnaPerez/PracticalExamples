package mx.edu.j2se.lectures.examples.lecture2.p1modifiers.others;

import mx.edu.j2se.lectures.examples.lecture2.p1modifiers.others.abstracts.AbstractClassExample;

import java.io.Serializable;

public class OthersExample {
    public static void main(String[] args) {
        //AbstractClassExample abstractClassExample = new AbstractClassExample();
        AbstractClassExample example = new ExampleAbstractImpl();
        //example.defaultAbstractMethod(); //can't access because isn't in the same package
        //example.protectedAbstractMethod(); //can't access because isn't in the same package or main class extends Abstract
        example.publicMethod();
        example.publicAbstractMethod();
        ExampleAbstractImpl example2 = new ExampleAbstractImpl();
        //example2.defaultAbstractMethod();
        example2.protectedAbstractMethod();
        Person otherExample = new Person();
        otherExample.someMethod();
        printTransientResult(otherExample);
        printTransientResult(Person.create("Orwell", "Farms", 1984));
    }

    static void printTransientResult(Person p) {
        String mumboJumbo = MumboJumboSerialize.convertToString(p);
        Person fromStringExample = MumboJumboSerialize.convertFromString(mumboJumbo);
        if(fromStringExample != null) {
            fromStringExample.someMethod();
        }
    }

    static class Person implements Serializable {
        String name = "Dave";
        transient String hobby = "Space";
        volatile int moreData = 2001;

        synchronized void someMethod() {
            System.out.println("Person name " + name + " moreDta " + moreData + " hobby " + hobby);
        }

        static Person create(String name, String hobby, int moreData) {
            Person p = new Person();
            p.name = name;
            p.hobby = hobby;
            p.moreData = moreData;
            return p;
        }

        native String sayHello();
        //hello_wold.c hello_world.h
    }
}
