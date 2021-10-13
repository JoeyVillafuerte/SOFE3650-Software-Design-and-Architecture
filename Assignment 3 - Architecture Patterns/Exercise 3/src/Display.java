public class Display implements ObserverRegister{

    @Override
    public void updateProduct(Product product){
        System.out.print("Scanned Items: ");
        System.out.print(productInfo.productName + " ");
        System.out.print("Item Price: ");
        System.out.print(productInfo.cost);
        System.out.println();
    }

}
