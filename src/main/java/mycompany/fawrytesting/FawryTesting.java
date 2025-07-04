/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mycompany.fawrytesting;

import java.time.LocalDate;

/**
 *
 * @author compu magic
 */
public class FawryTesting {

    public static void main(String[] args) {
        Customer customer = new Customer("Mohamed", 1000);
        Cheese cheese = new Cheese("Cheese", 100, 10, LocalDate.of(2025, 8, 0x1), 0.2);
        Biscuits biscuits = new Biscuits("Biscuits", 150, 5, LocalDate.of(2025, 7, 20), 0.7);
        TV tv = new TV("TV", 300, 3, 5.0);
        ScratchCard scratchCard = new ScratchCard("Scratch Card", 50, 20);

        Cart cart = new Cart();
              
//        cart.add(tv, 3);
//        cart.add(scratchCard, 1);

        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        Checkout.process(customer, cart);
        
        System.out.println("********** other test cases *********");
       
         System.out.println("-------------");
        
        System.out.println("\n=== CASE 2: Expired Product ===");
        testExpiredProduct();

        System.out.println("-------------");
        
        System.out.println("\n=== CASE 3: Not Enough Quantity ===");
        testNotEnoughStock();

        System.out.println("-------------");
        System.out.println("\n=== CASE 4: Insufficient Balance ===");
        testInsufficientBalance();

        System.out.println("-------------");
        System.out.println("\n=== CASE 5: Empty Cart ===");
        testEmptyCart();
        
        
    }
    
    
    
    
    static void testExpiredProduct() {
        Customer customer = new Customer("Mohamed", 1000);
        Cheese cheese = new Cheese("Old Cheese", 90, 5, LocalDate.of(2022, 1, 1), 0.2);
        Cart cart = new Cart();
        cart.add(cheese, 1);
        Checkout.process(customer, cart); 
    }

    static void testNotEnoughStock() {
        
        try{
        
        Customer customer = new Customer("Mohamed", 1000);
        TV tv = new TV("TV", 300, 1, 5.0);
        Cart cart = new Cart();
        cart.add(tv, 3); 
        Checkout.process(customer, cart); 
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            
        }

 }

    static void testInsufficientBalance() {
        Customer customer = new Customer("Mohamed", 100);
        Cheese cheese = new Cheese("Cheese", 100, 5, LocalDate.of(2025, 8, 1), 0.2);
        Cart cart = new Cart();
        cart.add(cheese, 2); // subtotal = 200 > balance = 100

        Checkout.process(customer, cart); 
    }

     
    static void testEmptyCart() {
        Customer customer = new Customer("Mohamed", 500);
        Cart cart = new Cart();
        Checkout.process(customer, cart); 
    }
    
    
}
