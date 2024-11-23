package DesignPattern.AbstractFactoryPattern.Factories;

import DesignPattern.AbstractFactoryPattern.Car;
import DesignPattern.AbstractFactoryPattern.Hyundai;
import DesignPattern.AbstractFactoryPattern.Maruti;

public class EconomicFactory implements AbstractFactory {

    @Override
    public Car getInstance(Integer price) {
        if (price < 10000)
            return new Maruti();
        return new Hyundai();
    }

}
