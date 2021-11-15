/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author athar
 */
public class Product {
    int productUPC;
    double cost;
    String productName;

    public Product(int upc, double price, String name) {
        productUPC = upc;
        cost = price;
        productName = name;
    }
}
