package DesignPattern.DecoratorPattern;

import DesignPattern.DecoratorPattern.Decorators.ExtraCheese;
import DesignPattern.DecoratorPattern.Decorators.Mushroom;

public class Main {
    public static void main(String[] args) {
        // margherita with cheese

        System.out.println(new ExtraCheese(new Magherita()).cost());

        // margherita with cheese and Mushroom
        System.out.println(new Mushroom(new ExtraCheese(new Magherita())).cost());
    }
}
