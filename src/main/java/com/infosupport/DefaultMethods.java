package com.infosupport;

public class DefaultMethods {
    public static void main(String[] args) {
        new SomeAction().doAction_v1();
        new SomeAction().doAction_v2();
    }
}

interface Action {

    void doAction_v1();

    default void doAction_v2() {
        System.out.println("What is this default keyword?");
    }

    static void doSomeStuff() {
        System.out.println("This can't be true");
    }
}


class SomeAction implements Action {

    @Override
    public void doAction_v1() {

    }

    // public void doAction_v2() {
    //     System.out.println("What is this default keyword?");
    // }
}