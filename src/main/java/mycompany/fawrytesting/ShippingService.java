/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.fawrytesting;

import java.util.List;

/**
 *
 * @author compu magic
 */
public class ShippingService {
    
    public static void shipping(List<CartItems> items){
        System.out.println("** Shipment notice ** ");
        double totalWeight=0;
        for(CartItems item:items){
            if(item.product instanceof Shippable){
                Shippable ship=(Shippable) item.product;
                double itemWeight=ship.getWeight()*item.quantity;
                totalWeight+=itemWeight;
                System.out.println(item.quantity + "x " +ship.getName()+ "\t\t"+ (int)(itemWeight*1000) +"g");
            } 
        }
        
        System.out.println("Total Package Weight   " + totalWeight + " Kg ");
    }
    
}
