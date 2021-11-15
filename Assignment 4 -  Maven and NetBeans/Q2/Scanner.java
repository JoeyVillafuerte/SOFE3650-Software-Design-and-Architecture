/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author athar
 */
public class Scanner {
    CashRegister attachedCashRegister;

    public Scanner(CashRegister cashRegister) {
        attachedCashRegister = cashRegister;
    }

    public void scannedUPCCode(int UPCCode) {
        attachedCashRegister.setCurrentProductUPC(UPCCode);
    }
}