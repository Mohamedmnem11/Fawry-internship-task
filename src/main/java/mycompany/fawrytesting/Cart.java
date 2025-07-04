/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.fawrytesting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author compu magic
 */
public class Cart {
   private List<CartItems> items=new ArrayList<>(); 
   public void add(Product product,int quantity){
       if(quantity>product.getQuantity()){
           throw new  IllegalArgumentException("Not Enough quantity");
       }
       items.add(new CartItems(product,quantity));
   }
  
    public List<CartItems> getItems(){
        return items;
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
    
}
