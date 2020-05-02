package com.company.open_closed_principle;

public class Payment {
    private String description;

    public Payment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
