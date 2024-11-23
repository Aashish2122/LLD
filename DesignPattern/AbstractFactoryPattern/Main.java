package DesignPattern.AbstractFactoryPattern;

import DesignPattern.AbstractFactoryPattern.Factories.AbstractFactory;
import DesignPattern.AbstractFactoryPattern.Factories.AbstractFactoryProducer;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProducer producer = new AbstractFactoryProducer();
        AbstractFactory factory = producer.getFactoryInstance("LUXURY");
        factory.getInstance(200000).model();
    }
}
