/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.fawrytesting;

import java.time.LocalDate;

/**
 *
 * @author compu magic
 */
public class Biscuits extends Product implements Shippable{
    
    private LocalDate expiryDate;
    private double weight;

    public Biscuits(String name,double Price, int Quantity,LocalDate expiryDate ,double weight){
        super(name,Price,Quantity);
        this.expiryDate=expiryDate;
        this.weight=weight;
    }

    @Override
    public boolean isExpired() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
         return expiryDate.isBefore(LocalDate.now());
    }

    @Override
    public boolean isNeedShipping() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  
       return true;
    }

    @Override
    public double getWeight() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
         return weight;
    }
    
}
