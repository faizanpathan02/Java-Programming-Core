package com.ReturnType.StationaryManagementSystem;

public class StationaryAdmin {

    public static void main(String[] args) {

        StationaryDetails sd = new StationaryDetails();

        Bag bag = sd.addBag();
        System.out.println(bag.bagId);
        System.out.println(bag.brand);
        System.out.println(bag.price);
        System.out.println(" ");

        Pouch pouch = sd.addPouch();
        System.out.println(pouch.pouchId);
        System.out.println(pouch.color);
        System.out.println(pouch.price);
        System.out.println(" ");

        Book book = sd.addBook();
        System.out.println(book.bookId);
        System.out.println(book.title);
        System.out.println(book.author);

    }
}
