package DesignPattern.AbstractFactoryPattern.Factories;

import DesignPattern.AbstractFactoryPattern.BMW;
import DesignPattern.AbstractFactoryPattern.Car;
import DesignPattern.AbstractFactoryPattern.Mercedes;

public class LuxuryFactory implements AbstractFactory {

    @Override
    public Car getInstance(Integer price) {
        if (price < 100000)
            return new Mercedes();
        return new BMW();
    }

}
