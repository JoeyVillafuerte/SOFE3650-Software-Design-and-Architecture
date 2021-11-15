/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JFrame;
/**
 *
 * @author athar
 */
public abstract class Display extends JFrame implements View {
    public void displayProduct(ArrayList<Product> products) {
            setVisible(true);
            setLayout(new FlowLayout());
            add(new JLabel("Scanned Items:"));
            for (int i = 0; i < products.size(); i++) {
              Product productInfo = products.get(i);
              add(new JLabel(productInfo.productName + "  Item Price:" + productInfo.cost));
            }
            setSize(220,480);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
    }
}
