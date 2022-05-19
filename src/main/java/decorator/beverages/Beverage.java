package decorator.beverages;

import lombok.Data;

@Data
public abstract class Beverage {
    public enum Size {
        TALL,
        GRANDE,
        VENTI
    };

    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public abstract Double cost();

}
