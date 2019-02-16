package com.fullstackdeveloper;

public class HealthyHamburger extends Hamburger {
    private String healthyextra1Name;
    private double healthyextra1Price;

    private String healthyextra2Name;
    private double healthyextra2Price;

    public HealthyHamburger(String meat, double price) {
        super("Healthy burger ", meat, price, "brown rye ");

    }

    public void addHealthAddition1(String name, double price) {
        this.healthyextra1Name = name;
        this.healthyextra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyextra2Name = name;
        this.healthyextra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double HamburgerPrice = super.itemizeHamburger();
        if (healthyextra1Name != null) {
            HamburgerPrice += this.healthyextra1Price;
            System.out.println("Healthy item 1 added");
        }
        if (healthyextra2Name != null) {
            HamburgerPrice += this.healthyextra2Price;
            System.out.println("Healthy item 2 added");
        }
        return HamburgerPrice;
    }
}
