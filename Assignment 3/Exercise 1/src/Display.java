public class Display {
    public void displayText(Product productInfo) {
        System.out.print("Scanned Items: ");
        System.out.print(productInfo.productName + " ");
        System.out.print("Item Price: ");
        System.out.print(productInfo.cost);
        System.out.println();
    }
}
