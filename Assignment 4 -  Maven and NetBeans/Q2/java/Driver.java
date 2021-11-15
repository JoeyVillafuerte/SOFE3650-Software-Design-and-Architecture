/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.awt.HeadlessException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author athar
 */
public class Driver extends JFrame{
    public Driver() throws HeadlessException{
        init();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Driver().setVisible(true);
            }
        });
    }
    private void init(){
        CashRegister cashRegister = new CashRegister();
        Scanner scanner = new Scanner(cashRegister);
        setLayout(new FlowLayout());
        add(new JLabel("ENTER UPC CODE:"));
        JTextField v = new JTextField(10);
        add(v);
        JButton b = new JButton("OK");
        add(b);
        JButton c = new JButton("Finish");
        add(c);
        JLabel l = new JLabel("");
        add(l);
        setSize(400,110);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vS = v.getText();
                int IntvS = Integer.parseInt(vS);
                scanner.scannedUPCCode(IntvS);
                if (cashRegister.condition() == false){
                    l.setText("Failed to find Product");
                }else{
                    l.setText("Found Product");
                }
                v.setText("");
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cashRegister.displayItemsPurchased();
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
