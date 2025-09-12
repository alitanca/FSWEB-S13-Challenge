package org.example;

public enum Plan {
    BASIC("Basic", 0.0),
    STANDARD("Standard", 99.9),
    PREMIUM("Premium", 199.9);

    private final String name;
    private final double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getPlanName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
