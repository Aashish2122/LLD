package DesignPattern.AbstractFactoryPattern.Factories;

import DesignPattern.AbstractFactoryPattern.Car;

public interface AbstractFactory {

    public Car getInstance(Integer price);
}
