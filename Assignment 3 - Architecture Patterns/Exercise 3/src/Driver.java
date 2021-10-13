public class Driver {

    public static void main(String[] args) {

        ProductDB productDB = new ProductDB();
        // productDB.getProductInfo(4);


        CashRegister cashRegister = new CashRegister();
        Scanner scanner = new Scanner(cashRegister);
        Keyboard keyboard = new Keyboard(cashRegister);

        cashRegister.observerInput(new Display());
        cashRegister.observerInput(new TicketPrinter());

        scanner.scannedUPCCode(1);
        scanner.scannedUPCCode(2);

        keyboard.setUPCCode(3);
        keyboard.endSession();
    }
}
