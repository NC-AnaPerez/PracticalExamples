package mx.edu.j2se.lectures.examples.lecture4.p3enums;

import java.math.BigInteger;

public enum ExampleEnum {
    FIRST("Primer ejemplo"),//0
    SECOND("Segundo ejemplo", true),//1
    THIRD("Tercer ejemplo"),//2
    FOURTH("Ultimo ejemplo"), //3
    EXTRA(BigInteger.TEN),
    OTHER;//4

    private final String description;
    ExampleEnum() {this.description = "default";}
    ExampleEnum(String description) {
        this.description = description;
    }
    ExampleEnum(String description, boolean b) {
        this.description = description + b;
    }
    ExampleEnum(BigInteger bi) {
        description = bi.toString();
    }
    
    public void someMethod() {
    
    }

    @Override
    public String toString() {
        return String.format("Name:%s\t\tPos:%d\tDesc:%s",
                name(), ordinal(), description);
    }
}
