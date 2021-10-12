import java.util.ArrayList;

public class CashRegister {
    ProductDB productDB = new ProductDB();
    Display display = new Display();
    TicketPrinter ticketPrinter = new TicketPrinter();
    private int currentUPCCode;
    private ArrayList<Product> scannedItems = new ArrayList<>();

    public void setCurrentProductUPC(int UPCCode) {
        currentUPCCode = UPCCode;
        Product recentlyScannedProduct = getProductInfo();
        scannedItems.add(recentlyScannedProduct);
        display.displayText(recentlyScannedProduct);
    }

    public void displayItemsPurchased() {
        ticketPrinter.displayText(scannedItems);
    }

    public Product getProductInfo() {
        return productDB.getProductInfo(currentUPCCode);
    }
}
