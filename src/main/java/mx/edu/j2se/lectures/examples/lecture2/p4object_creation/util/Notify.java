package mx.edu.j2se.lectures.examples.lecture2.p4object_creation.util;

import java.time.LocalTime;

public class Notify {
    public Notify(String message) {
        System.out.println(LocalTime.now() + "--" + message);
    }
}
