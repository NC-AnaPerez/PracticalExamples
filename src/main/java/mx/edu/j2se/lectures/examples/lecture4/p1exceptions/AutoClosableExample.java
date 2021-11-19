package mx.edu.j2se.lectures.examples.lecture4.p1exceptions;

import java.io.IOException;

public class AutoClosableExample implements AutoCloseable {

    void connect() throws IOException {
        System.out.println("Connecting to external service, DB,or some file");
    }

    String getInfo() {
        System.out.println("Obtaining information from external service");
        return "Something";
    }

    @Override
    public void close() {
        System.out.println("Closing connection");
    }
}
