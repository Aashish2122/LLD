package DesignPattern.ObserverDesignPattern.Store;

import DesignPattern.ObserverDesignPattern.Observable.IphoneObservableImpl;
import DesignPattern.ObserverDesignPattern.Observable.StockObservable;
import DesignPattern.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import DesignPattern.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import DesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StockObservable iphonStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver obs1 = new EmailAlertObserverImpl(iphonStockObservable, "jk@gmai.com");
        NotificationAlertObserver obs2 = new EmailAlertObserverImpl(iphonStockObservable, "jkq@gmai.com");
        NotificationAlertObserver obs3 = new MobileAlertObserverImpl(iphonStockObservable, "jkq@gmai.com");

        iphonStockObservable.add(obs3);
        iphonStockObservable.add(obs2);
        iphonStockObservable.add(obs1);

        iphonStockObservable.setStockCount(100);

    }

}
