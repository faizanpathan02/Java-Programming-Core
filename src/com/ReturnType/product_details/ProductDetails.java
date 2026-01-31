package com.ReturnType.product_details;

public class ProductDetails {

    public void displayProduct(){
        Product p = new Product();
        System.out.println("Product ID       : " + p.pId);
        System.out.println("Product name     : " + p.pName);
        System.out.println("Product Price    : " + p.price);
    }
    public void displayOrder(){
        Order o = new Order();
        System.out.println("Order ID         : " + o.oId);
        System.out.println("Order Name       : " + o.oName);
        System.out.println("Order Address    : " + o.address);

    }
    public void displayCustomer() {
        Customer c = new Customer();
        System.out.println("Customer ID      : " + c.cId);
        System.out.println("Customer Name    : " + c.cName);
        System.out.println("Customer Contact : " + c.contact);

    }

}
