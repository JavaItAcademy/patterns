package com.company;

import com.company.singleton.EagerSingleton;

public class Main {

    public static void main(String[] args) {
        PresidentOfAmerica president = PresidentOfAmerica.getInstance();
        System.out.println(president);
        System.out.println(president.getName());
        method1();
        method2();
    }

    private static void method1() {
        PresidentOfAmerica president = PresidentOfAmerica.getInstance();
        System.out.println(president);
        System.out.println(president.getName());
    }

    private static void method2() {
        PresidentOfAmerica president = PresidentOfAmerica.getInstance();
        System.out.println(president);
        System.out.println(president.getName());
    }
}
