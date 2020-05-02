package com.company;

import com.company.singleton.EagerSingleton;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String a1 = new String("hello");
        String b1 = new String("hello");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(b1.hashCode());
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
