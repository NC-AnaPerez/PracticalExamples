package mx.edu.j2se.lectures.examples.lecture4.p3enums;

import java.math.BigInteger;

public enum ExampleEnum {
    FIRST("Primer ejemplo"),//0
    SECOND("Segundo ejemplo", true),//1
    THIRD("Tercer ejemplo"),//2
    FOURTH("Ultimo ejemplo"),
    EXTRA(BigInteger.TEN);//3

    private final String description;
    ExampleEnum(String description) {
        this.description = description;
    }
    ExampleEnum(String description, boolean b) {
        this.description = description + b;
    }
    ExampleEnum(BigInteger bi) {
        description = bi.toString();
    }

    @Override
    public String toString() {
        return String.format("Name:%s Pos:%d Desc:%s", name(), ordinal(), description);
    }
}
