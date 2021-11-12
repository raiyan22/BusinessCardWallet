package it.units.businesscardwallet.activities;

public class MyClassTwo {

    public class MyClassOne {
        private String x = "";
        private String y = "";

        public String getX() {
            return x;
        }

        public String getY() {
            return y;
        }

        public void setX(String x) {
            this.x = x;
        }

        public void setY(String y) {
            this.y = y;
        }

        public MyClassOne() {
            System.out.println("Constructor two called\n");
        }

    }
}

