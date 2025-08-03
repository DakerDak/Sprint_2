package model;

public class Apple extends Food implements Discountable {

    private  String colour;
    public Apple(int amount, double price, String colour) {
        super(amount, price,true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(model.constants.Colour.RED) ? model.constants.Discount.RED_APPLE_DISCOUNT : 0;
    }

    public String getColour() {
        return colour;
    }
}
