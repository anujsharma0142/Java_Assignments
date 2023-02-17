package com.monocept.model;

import java.util.List;

public class Customer {
    private int cid;
    private String cname;
    private List<Order> corders;
    
    public Customer(int cid, String cname, List<Order> corders) {
        this.cid = cid;
        this.cname = cname;
        this.corders = corders;
    }
    
    public int getCid() {
        return cid;
    }
    
    public void setCid(int cid) {
        this.cid = cid;
    }
    
    public String getCname() {
        return cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }
    
    public List<Order> getCorders() {
        return corders;
    }
    
    public void setCorders(List<Order> corders) {
        this.corders = corders;
    }
    
    public String toString() {
        return "Customer [cid=" + cid + ", cname=" + cname + ", corders=" + corders + "]";
    }
}
