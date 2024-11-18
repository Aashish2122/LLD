package DesignPattern.StrategyDesignPattern.WithStrategyPattern;

import DesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class Sport extends Vehicle {
    Sport() {
        super(new SportsDriveStrategy());
    }
}
