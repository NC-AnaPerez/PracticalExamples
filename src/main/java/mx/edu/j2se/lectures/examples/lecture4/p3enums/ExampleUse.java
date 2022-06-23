package mx.edu.j2se.lectures.examples.lecture4.p3enums;

public class ExampleUse {
    public static void main(String[] args) {
        ExampleEnum ex = ExampleEnum.THIRD;
        //ExampleEnum.OTHER;
        System.out.println(ex.name() + " " + ex.ordinal());
        
        System.out.println("\n=====================================");
        for(ExampleEnum e: ExampleEnum.values()) {
            System.out.println(e.toString());
        }
    
        System.out.println("\n=====================================");
        System.out.println(ex == ExampleEnum.THIRD);
        System.out.println(ex == ExampleEnum.FOURTH);
    }
}
