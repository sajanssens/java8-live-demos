package com.infosupport;

public class OuterClassTest {

    public static void main(String[] args) {
        new OuterClassTest().run();
    }

    private void run() {
        Runnable anonymous = new Runnable() {
            public void run() {
                System.out.println(this.getClass().getName());
                System.out.println(OuterClassTest.this.getClass().getName());
            }
        };
        anonymous.run();

        Runnable lambda = () -> {
            System.out.println(this.getClass().getName());
            System.out.println(OuterClassTest.this.getClass().getName());
        };
        lambda.run();
    }
}
