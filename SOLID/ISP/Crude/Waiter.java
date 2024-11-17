package SOLID.ISP.Crude;

public class Waiter implements RestaurantEmployee {

    @Override
    public void washDishes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not My JOB");
    }

    @Override
    public void serveCustomer() {
        // TODO Auto-generated method stub
        System.out.println("Serving");
    }

    @Override
    public void cookFood() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not My JOB");
    }

}
