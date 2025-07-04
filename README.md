Fawry Internship OOP Task – Java

This project is a solution for the Fawry Summer Internship 2025 challenge.


************************
   ==> Description
The task was to build a simple e-commerce system using Object-Oriented Programming (OOP) principles in Java.  
The system supports:

- Adding products to a cart
- Handling shippable and perishable products
- Expiry checks and shipping cost
- Customer balance validation
- Receipt generation and product shipping logic





***********************
   ==> Technologies
- Java
- OOP (Abstraction, Inheritance, Polymorphism, Encapsulation)
- NetBeans IDE



************************
    ==> Test Cases

All required use cases (valid and error scenarios) are implemented and tested in:
> `FawryTesting.java` file (instead of Main.java)

You can run this file to check:
- Normal checkout
- Expired product
- Insufficient quantity
- Insufficient balance
- Empty cart

    
************************
   ==> Structure

src/
├── model/
│ ├── Product.java
│ ├── Cheese.java
│ ├── TV.java
│ ├── Biscuits.java
│ └── ScratchCard.java
├── logic/
│ ├── Cart.java
│ ├── CartItem.java
│ ├── Customer.java
│ ├── Checkout.java
│ └── ShippingService.java
├── test/
│ └── FawryTesting.java






