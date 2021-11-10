package mx.edu.j2se.lectures.examples.lecture2.p1modifiers.access;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;



public class ModifiersExample {
    //Fields
    public String publicAttribute;
    private String privateAttribute;

    //Methods
    public void publicMethod() {
        System.out.println("This is a public method, accessible anywhere in the code");
        System.out.println("The value of the public attribute is " + publicAttribute);
    }

    private void privateMethod(String message) {
        System.out.println(message);
        System.out.println("The value of the private attribute is " + privateAttribute);
    }

    public void doSomethingWithPrivates() {
        privateAttribute = "This is a private attribute, only accessible from the same class";
        privateMethod("Accessible only from the same class");
    }

    class AuxClass {
        void doSomethingWithPrivates() {
            privateAttribute = "Modified from sub-class";
            privateMethod("Accessible from the sub-class");
        }
    }

    static class StaticAuxClass {
        static void doSomethingWithPrivates(ModifiersExample toCheck) {
            toCheck.privateAttribute = "Modified from static sub-class";
            toCheck.privateMethod("Accessible from static sub-class");
        }
    }

    static class DBConnection {
        DBConnection(String host, String port, String user, String pass) {}
        private Connection connect() {
            //connect to external DB
            return null;
        }
        private void closeConnection(Connection dbConnection) {

        }
        public List queryDB(String query) {
            Connection connection = connect();
            List results = Collections.EMPTY_LIST;
            closeConnection(connection);
            return results;
        }
    }
}

