package com.ReturnType.StationaryManagementSystem;

public class StationaryDetails {

    public Bag addBag(){
        Bag b = new Bag();
        b.bagId = 123;
        b.brand = "Safari";
        b.price = 1000;
        return b;
    }
    public Pouch addPouch(){
        Pouch p = new Pouch();
        p.pouchId = 345;
        p.color = "Blue";
        p.price = 300;
        return p;
    }
    public Book addBook(){
        Book bk = new Book();
        bk.bookId = 456;
        bk.title = "Concepts of Physics";
        bk.author = "H.C.Verma";
        return bk;
    }
}
