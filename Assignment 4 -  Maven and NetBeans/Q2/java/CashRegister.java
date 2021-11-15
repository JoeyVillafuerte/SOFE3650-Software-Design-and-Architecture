/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author athar
 */
import java.util.ArrayList;

public class CashRegister{
    ProductDB productDB = new ProductDB();
    Display display = new Display() {
        @Override
        public void displayProduct() {

        }
    };
    private int currentUPCCode;
    private ArrayList<Product> scannedItems = new ArrayList<>();
    private boolean Pass = true;
    public void setCurrentProductUPC(int UPCCode) {
        currentUPCCode = UPCCode;
        Product recentlyScannedProduct = getProductInfo();
        if (recentlyScannedProduct == null){
            Pass = false;
        }
        else{
            Pass = true;
            scannedItems.add(recentlyScannedProduct);
        }
    }

    public Product getProductInfo() {
        return productDB.getProductInfo(currentUPCCode);
    }
    
    public void displayItemsPurchased(){
        display.displayProduct(scannedItems);
    }
    
    public boolean condition(){
        boolean pass = Pass;
        return pass;
    }
    
}

