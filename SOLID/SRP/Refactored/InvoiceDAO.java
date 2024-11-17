package SOLID.SRP.Refactored;

public class InvoiceDAO {

    private Invoice invoice;

    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // logic
    }
}