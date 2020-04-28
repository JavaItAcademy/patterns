package com.company;

public class PresidentOfAmerica {
    private static PresidentOfAmerica instance;
    private String name;

    private PresidentOfAmerica(String name) {
        this.name =  name;
    }

    public static PresidentOfAmerica getInstance() {
        if (instance == null) {
            instance = new PresidentOfAmerica("Trump");
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
