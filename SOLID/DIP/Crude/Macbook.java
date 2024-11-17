package SOLID.DIP.Crude;

public class Macbook {

    private WiredKeyboard wiredKeyboard;
    private WiredMouse wiredMouse;

    public Macbook() {

        wiredKeyboard = new WiredKeyboard();
        wiredMouse = new WiredMouse();
    }

}
