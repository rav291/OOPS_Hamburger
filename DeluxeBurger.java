package com.fullstackdeveloper;

public class DeluxeBurger extends Hamburger
{
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 48, "Garlic Bread ");
        super.addhamburgerAddition1("Chips ",7);
        super.addHamburgerAddition2("Drinks", 5);
    }

    @Override
    public void addhamburgerAddition1(String name, double price) {
        super.addhamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
