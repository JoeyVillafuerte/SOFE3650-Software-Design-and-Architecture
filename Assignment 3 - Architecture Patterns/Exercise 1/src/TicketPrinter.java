import java.util.ArrayList;

public class TicketPrinter {
    public void displayText(ArrayList<Product> products) {
        System.out.println("Items purchased:");
        for (int i = 0; i < products.size(); i++) {
            Product productInfo = products.get(i);
            System.out.print(productInfo.productName + " ");
            System.out.print("Price: ");
            System.out.print(productInfo.cost);
            System.out.println();
        }
    }
}
