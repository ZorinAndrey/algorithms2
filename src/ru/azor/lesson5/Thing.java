package ru.azor.lesson5;

public class Thing {
    private final String name;
    private final int weight;
    private final int price;

    public Thing(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": " +
                "вес: " + weight +
                ", цена = " + price + ".";
    }
}

