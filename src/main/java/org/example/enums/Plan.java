package org.example.enums;

public enum Plan {
    BASIC("Basic", 0),
    STANDARD("Standard", 100),
    PREMIUM("Premium", 200);

    private final String name;
    private final Integer price;

    Plan(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public Integer getPrice() { return price; }
}
