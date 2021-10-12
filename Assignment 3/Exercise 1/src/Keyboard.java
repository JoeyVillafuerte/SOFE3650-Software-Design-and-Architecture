public class Keyboard {
    CashRegister attachedCashRegister;

    public Keyboard(CashRegister cashRegister) {
        attachedCashRegister = cashRegister;
    }

    public void setUPCCode(int UPCCode) {
        attachedCashRegister.setCurrentProductUPC(UPCCode);
    }

    public void endSession() {
        attachedCashRegister.displayItemsPurchased();
    }
}
