package com.Collection.List.ProductMngsystem;

import java.util.List;

public class Product {

    private int pid;
    private String pname;
    List<Order> olist;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Order> getOlist() {
        return olist;
    }

    public void setOlist(List<Order> olist) {
        this.olist = olist;
    }

}
