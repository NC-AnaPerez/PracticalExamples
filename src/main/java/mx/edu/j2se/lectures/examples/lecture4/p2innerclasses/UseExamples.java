package mx.edu.j2se.lectures.examples.lecture4.p2innerclasses;

public class UseExamples {
    public static void main(String[] args) {
        NonStaticInnerClass outer = new NonStaticInnerClass();
        outer.message = "outer message";

        NonStaticInnerClass.InnerClass inner = outer.new InnerClass();
        inner.message = "inner message";
        System.out.println(inner.getComposedMessage());

        WithLocalClass withLocalClass = new WithLocalClass();
        withLocalClass.useLocalClass();

        StaticInnerClass.Builder builder = new StaticInnerClass.Builder();

        StaticInnerClass staticInnerClass = new StaticInnerClass.Builder()
                .setMessage("Message on builder")
                ///... ....
                .build();
        System.out.println(staticInnerClass.describe());

        //Anonymous classes to override toString method
        System.out.println(new Object(){@Override public String toString() {return "Mensaje Personalizado 1";}});
        System.out.println(new Object(){@Override public String toString() {return "Mensaje Personalizado 2";}});
        System.out.println(new Object(){@Override public String toString() {return "Mensaje Personalizado N";}});

        Object alwaysEquals = new Object(){
            @Override
            public String toString() {
                return "Anything will always be equal to this object";
            }

            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };

        System.out.println(alwaysEquals);
        System.out.println(alwaysEquals.equals(null));
        System.out.println(alwaysEquals.equals("Something"));
        System.out.println(alwaysEquals.equals(false));
        System.out.println(new Object().equals(alwaysEquals));
    }
}
