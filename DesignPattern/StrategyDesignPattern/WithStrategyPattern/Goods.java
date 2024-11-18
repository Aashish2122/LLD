package DesignPattern.StrategyDesignPattern.WithStrategyPattern;

import DesignPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class Goods extends Vehicle {
    Goods() {
        super(new NormalDriveStrategy());
    }
}
