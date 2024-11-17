package SOLID.OCP.Refactored;

import java.math.BigDecimal;

public class Marker {
    private BigDecimal price;
    private String name;
    private String color;

    public Marker(BigDecimal price, String name, String color) {
        this.price = price;
        this.name = name;
        this.color = color;
    }
}
