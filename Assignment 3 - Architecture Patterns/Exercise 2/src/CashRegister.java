import java.util.ArrayList;

public class CashRegister {
    ProductDB productDB = new ProductDB();
    Display display = new Display() {
        @Override
        public void displayProduct() {

        }
    };
    TicketPrinter ticketPrinter = new TicketPrinter() {
        @Override
        public void displayProduct() {

        }
    };
    private int currentUPCCode;
    private ArrayList<Product> scannedItems = new ArrayList<>();

    public void setCurrentProductUPC(int UPCCode) {
        currentUPCCode = UPCCode;
        Product recentlyScannedProduct = getProductInfo();
        scannedItems.add(recentlyScannedProduct);
        display.displayProduct(recentlyScannedProduct);
    }

    public void displayItemsPurchased() {
        ticketPrinter.displayProduct(scannedItems);
    }

    public Product getProductInfo() {
        return productDB.getProductInfo(currentUPCCode);
    }
}
