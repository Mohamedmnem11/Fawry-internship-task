/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.fawrytesting;

/**
 *
 * @author compu magic
 */
public class Customer {
    
    private String name;
    private double balance;

    
    Customer(String name,double balance){
        this.balance=balance;
        this.name=name;
        
    }

    public double getBalance(){
        return balance;
    }
    
    public void updateBalance(double amount){
        this.balance-=amount;
    }
    
}
