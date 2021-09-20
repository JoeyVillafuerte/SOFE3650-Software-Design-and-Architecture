public class TestDriverClass {
    public static void main(String[] args) {
        BottleFactory glassBottleFactory = new GlassBottleFactory();
        BottleFactory plasticBottleFactory = new PlasticBottleFactory();

        Bottle glassBottle = glassBottleFactory.createBottle();
        Bottle plasticBottle = plasticBottleFactory.createBottle();

        System.out.println(glassBottle.getBottleType());
        System.out.println(plasticBottle.getBottleType());

        glassBottleFactory.setBottlePrice(BottlePrices.glassPrice);
        plasticBottleFactory.setBottlePrice(BottlePrices.plasticPrice);

        System.out.println(glassBottleFactory.getBottlePrice());
        System.out.println(plasticBottleFactory.getBottlePrice());
    }
}
