package DesignPattern.ObserverDesignPattern.Observer;

import DesignPattern.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    private StockObservable stock;
    private String emailID;

    public EmailAlertObserverImpl(StockObservable stock, String emailID) {
        this.stock = stock;
        this.emailID = emailID;
    }

    @Override
    public void update() {
        sendMail(emailID, "Product is in stock hurry up!");
    }

    private void sendMail(String emailID2, String string) {

        System.out.println("Mail sent on email ID: " + emailID2);
    }

}
