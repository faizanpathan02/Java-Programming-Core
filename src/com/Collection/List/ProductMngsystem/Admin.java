package com.Collection.List.ProductMngsystem;

import java.util.ArrayList;
import java.util.List;

public class Admin {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setPid(1);
        p1.setPname("AC");

        Order o1 = new Order();
        o1.setOid(101);
        o1.setOname("abc");
        o1.setCid(201);
        o1.setCustomername("Sahil");

        Order o2 = new Order();
        o2.setOid(102);
        o2.setOname("pqr");
        o2.setCid(202);
        o2.setCustomername("Faizan");

        Order o3 = new Order();
        o3.setOid(103);
        o3.setOname("xyz");
        o3.setCid(203);
        o3.setCustomername("Rohit");


        List<Order> orders = new ArrayList<Order>();
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        p1.setOlist(orders);

        List<Product> products = new ArrayList<Product>();
        products.add(p1);

        for (Product p : products) {
            System.out.println("Product ID   : " + p.getPid());
            System.out.println("Product Name : " + p.getPname());

            System.out.println("Orders:");
            for (Order o : p.getOlist()) {
                System.out.println(
                        "Order ID : " + o.getOid() +
                                ", Order Name : " + o.getOname() +
                                ", Customer ID : " + o.getCid() +
                                ", Customer Name : " + o.getCustomername()
                );
            }

            System.out.println("------------------------------------------------------------------------------------------------------------");
        }





    }
}
