/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.fawrytesting;

/**
 *
 * @author compu magic
 */
public abstract class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    
    public abstract boolean isExpired();
    
    public abstract boolean isNeedShipping();
    
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    
    public void updateQuantity(int amount){
        if(amount<=quantity){
            quantity-=amount;
        }
    }

}
