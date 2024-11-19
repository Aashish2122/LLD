package DesignPattern.ObserverDesignPattern.Observer;

import DesignPattern.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    private StockObservable stock;
    private String mobileNum;

    public MobileAlertObserverImpl(StockObservable stock, String mobileNum) {
        this.stock = stock;
        this.mobileNum = mobileNum;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        sendOnMob(mobileNum, "product available hurry up");
    }

    private void sendOnMob(String mobileNum2, String string) {
        System.out.println("Message sent on mobile num " + mobileNum2);
    }

}
