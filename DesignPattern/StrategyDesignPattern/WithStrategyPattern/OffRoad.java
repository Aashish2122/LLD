package DesignPattern.StrategyDesignPattern.WithStrategyPattern;

import DesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoad extends Vehicle {

    OffRoad() {
        super(new SportsDriveStrategy());
    }

}
