public class PlasticBottleFactory implements BottleFactory {
    public double price;
    @Override
    public Bottle createBottle() {
        return new Bottle("plastic");
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
