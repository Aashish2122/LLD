package DesignPattern.AbstractFactoryPattern.Factories;

public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String value) {
        if (value.equals("LUXURY"))
            return new LuxuryFactory();
        return new EconomicFactory();
    }
}
