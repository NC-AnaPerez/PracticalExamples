package mx.edu.j2se.lectures.examples.lecture2.p4object_creation.util;

import java.io.Serializable;

public class NormalClass implements Serializable {
    public static final Notify NOTIFY_STATIC_1 = new Notify("Static attribute");

    static {
        new Notify("Static block code");
    }

    {
        new Notify("Non-static initialize block code");
    }

    transient private Notify notify1 = new Notify("Initialized value");
    transient private Notify notify2;
    private String name;

    public NormalClass(String name) {
        this.notify2 = new Notify("Constructor");
        this.name = name;
    }

    @Override
    public String toString() {
        return "NormalClass{name='" + name + "'}";
    }
}
