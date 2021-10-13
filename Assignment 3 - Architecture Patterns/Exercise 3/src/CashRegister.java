import java.util.ArrayList;

public class CashRegister {

    private final ProductDB productDB = new ProductDB();
    private final TicketPrinter ticketPrinter = new TicketPrinter();
    private int currentUPCCode;
    private ArrayList<Product> scannedItems = new ArrayList<>();
    private final ArrayList<ObserverRegister> observers;

    public CashRegister() {
        observers = new ArrayList<>();
    }

    public void observerInput(ObserverRegister observer){
        observers.add(observer);
    }


    public void setCurrentProductUPC(int UPCCode) {
        currentUPCCode = UPCCode;
        Product recentlyScannedProduct = getProductInfo();
        scannedItems.add(recentlyScannedProduct);

        for (ObserverRegister observer : observers){
            observer.updateProduct(recentlyScannedProduct);
        }
    }

    public void displayItemsPurchased() {
        ticketPrinter.updateProduct(scannedItems);
    }

    public Product getProductInfo() { return productDB.getProductInfo(currentUPCCode); }

}
