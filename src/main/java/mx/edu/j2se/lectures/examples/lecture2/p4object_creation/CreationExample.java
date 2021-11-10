package mx.edu.j2se.lectures.examples.lecture2.p4object_creation;

import mx.edu.j2se.lectures.examples.lecture2.p1modifiers.others.MumboJumboSerialize;
import mx.edu.j2se.lectures.examples.lecture2.p4object_creation.util.NormalClass;

public class CreationExample {
    public static void main(String[] args) {
        //createWithNew(args);
        createFromSerializedString(args);
    }
    public static void createWithNew(String[] args) {
        System.out.println("----Start of main");
        System.out.println("Load class " + NormalClass.class.getSimpleName());
        NormalClass example1 = new NormalClass("example1");
        System.out.println("----First object created");
        new NormalClass("example2");
        System.out.println("----Second object created");
    }

    public static void createFromSerializedString(String[] args) {
        String source = "rO0ABXNyAElteC5lZHUuajJzZS5sZWN0dXJlcy5leGFtcGxlcy5sZWN0dXJlMi5wNG9iamVjdF9jcmVhdGlvbi51dGlsLk5vcm1hbENsYXNzZ7Q1L84+xHYCAAFMAARuYW1ldAASTGphdmEvbGFuZy9TdHJpbmc7eHB0AAhleGFtcGxlMQ==";
        NormalClass example = MumboJumboSerialize.convertFromString(source);
        System.out.println(example);
    }
}
