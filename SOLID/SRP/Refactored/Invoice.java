package SOLID.SRP.Refactored;

public class Invoice {
    private Marker marker;
    private int qantity;

    public Invoice(Marker marker, int qantity) {
        this.marker = marker;
        this.qantity = qantity;
    }

    public void getPrice() {
        // logic
    }
}
