public class GlassBottleFactory implements BottleFactory {
    public double price;
    @Override
    public Bottle createBottle() {
        return new Bottle("glass");
    }

    @Override
    public void setBottlePrice(double bottlePrice) {
        price = bottlePrice;
    }

    @Override
    public double getBottlePrice() {
        return price;
    }
}
