public class Scanner {
    CashRegister attachedCashRegister;

    public Scanner(CashRegister cashRegister) {
        attachedCashRegister = cashRegister;
    }

    public void scannedUPCCode(int UPCCode) {
        attachedCashRegister.setCurrentProductUPC(UPCCode);
    }
}
