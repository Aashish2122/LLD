package DesignPattern.StrategyDesignPattern.WithStrategyPattern;

import DesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class Passenger extends Vehicle {

    Passenger() {
        super(new NormalDriveStrategy());
    }

}
