public class Driver {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        Scanner scanner = new Scanner(cashRegister);
        Keyboard keyboard = new Keyboard(cashRegister);

        scanner.scannedUPCCode(1);
        scanner.scannedUPCCode(2);
        keyboard.setUPCCode(3);

        keyboard.endSession();
    }
}
