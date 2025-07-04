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
public class Checkout {
     public static void process(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty please add product before checkout");
            return;
        
        }
        double subtotal = 0;
        double shippingFee = 0;
        List<CartItems> shippingItems = new ArrayList<>();

        for (CartItems item : cart.getItems()) {
            if (item.product.isExpired()) {
                System.out.println(item.product.getName() + " is expired. ");
                return;
            }

            subtotal += item.product.getPrice() * item.quantity;

            if (item.product.isNeedShipping() && item.product instanceof Shippable) {
                shippingItems.add(item);
                shippingFee += 15; 
            }
        }

        double total = subtotal + shippingFee;

        if (customer.getBalance() < total) {
            System.out.println("InSufficient balance.");
            return;
        }

        for (CartItems item : cart.getItems()) {
            item.product.updateQuantity(item.quantity);
        }

        customer.updateBalance(total);

        if (!shippingItems.isEmpty()) {
            ShippingService.shipping(shippingItems);
        }

        System.out.println("\n** Checkout Receipt **");
        for (CartItems item : cart.getItems()) {
            System.out.println(item.quantity + "x " + item.product.getName() + "\t\t" + (int)(item.product.getPrice() * item.quantity) );
        }

        System.out.println("------------------");
        System.out.println("Subtotal: \t\t" + (int)subtotal);
        System.out.println("Shipping: \t\t" + (int)shippingFee);
        System.out.println("Amount: \t\t" + (int)total);
    }
}
