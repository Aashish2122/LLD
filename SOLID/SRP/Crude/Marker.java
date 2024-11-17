package SOLID.SRP.Crude;

import java.math.BigDecimal;

class Marker {
    private BigDecimal price;
    private String name;
    private String color;

    public Marker(BigDecimal price, String name, String color) {
        this.price = price;
        this.name = name;
        this.color = color;
    }

}