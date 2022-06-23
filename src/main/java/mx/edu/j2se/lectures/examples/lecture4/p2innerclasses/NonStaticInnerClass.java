package mx.edu.j2se.lectures.examples.lecture4.p2innerclasses;

public class NonStaticInnerClass {
    public String message;

    class InnerClass {
        public String message;

        String getComposedMessage() {
            return String.format("OuterMessage: %s -- Inner Message: %s",
                    NonStaticInnerClass.this.message,
                    message);
        }
    }
}
