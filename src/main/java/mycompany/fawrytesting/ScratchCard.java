/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.fawrytesting;

/**
 *
 * @author compu magic
 */
public class ScratchCard extends Product{

    public ScratchCard(String name,double price,int quantity){
        super(name,price,quantity);
    }
    @Override
    public boolean isExpired() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
         return false;
    }

    @Override
    public boolean isNeedShipping() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          return false;
    }
    
    
    
    
}
