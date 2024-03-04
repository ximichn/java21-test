package com.su;

/**
 * Record模式
 */
public class JEP440Test {

    public static void main(String[] args) {
        Transport transport = new Car("BYD");
        switch (transport) {
            case Car(String name):
                System.out.println("car is " + name);
                break;
            case Bike(String name):
                System.out.println("bike is " + name);
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }

    interface Transport {}

    record Car(String name) implements Transport {}

    record Bike(String name) implements Transport {}

}
