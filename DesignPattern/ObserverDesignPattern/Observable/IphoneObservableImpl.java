package DesignPattern.ObserverDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import DesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlertObserver> observers = new ArrayList<>();

    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifySubscriber();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

}
