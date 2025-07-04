/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.fawrytesting;

/**
 *
 * @author compu magic
 */
public class Mobile extends Product implements Shippable{
    
    
    private double weight;

    public Mobile(String name,double Price, int Quantity,double weight){
        super(name,Price,Quantity);
        
        this.weight=weight;
    }

    @Override
    public boolean isExpired() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
         return false;
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
