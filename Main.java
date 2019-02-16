package com.fullstackdeveloper;

public class Main {

    public static void main(String[] args)
    {
          Hamburger hamburger=new Hamburger("Basic ","Sausage", 40, "whole wheat grain ");
          double price = hamburger.itemizeHamburger();


        hamburger.addhamburgerAddition1("Tomato",5);
        hamburger.addHamburgerAddition2("Onion", 6);
        hamburger.addHamburgerAddition3("Capsicum",4);
        hamburger.addHamburgerAddition4("Jalapeno",9);
        System.out.println(hamburger.itemizeHamburger() +"is the total price");

        HealthyHamburger healthyHamburger=new HealthyHamburger("Chicken",55);
        healthyHamburger.addHealthAddition1("Egg white",4);
        healthyHamburger.addHealthAddition1("Olives",8);
        System.out.println("Total price is "+ healthyHamburger.itemizeHamburger());

        DeluxeBurger deluxeBurger=new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Addition prohibited", 50);
        System.out.println("Net cost is " + deluxeBurger.itemizeHamburger());
        System.out.println("Thank you for shopping at our company \n Have a nice day");

    }
}
