package mx.edu.j2se.lectures.examples.lecture4.p2innerclasses;

public class StaticInnerClass {
    private final String message;
    private final int number;
    private final boolean bool;
    //... ... ...
    private String state;

    private StaticInnerClass(String message, int number, boolean bool) {
        this.message = message;
        this.number = number;
        this.bool = bool;
    }

    String describe() {
        return String.format("M: %s; N: %d; B:%b",
                message,
                number,
                bool
        );
    }

    static class Builder {
        private boolean alreadyBuild = false;
        private String message;
        private int number = 2021;
        private boolean bool = true;

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setBool(boolean bool) {
            this.bool = bool;
            return this;
        }

        public StaticInnerClass build() {
            if(alreadyBuild) throw new IllegalStateException("InstanceAlready build");
            alreadyBuild = true;
            return new StaticInnerClass(message, number, bool);
        }

        public void help(StaticInnerClass obj) {
            obj.state = "Construido";
        }
    }
}
