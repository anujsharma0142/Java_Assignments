package com.monocept.model;

public class Product {
    private int pid;
    private String pname;
    private double pprice;
    private double pdiscountPercent;
    
    public Product(int pid, String pname, double pprice, double pdiscountPercent) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.pdiscountPercent = pdiscountPercent;
    }
    
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
    
    public double getPprice() {
        return pprice;
    }
    
    public void setPprice(double pprice) {
        this.pprice = pprice;
    }
    
    public double getPdiscountPercent() {
        return pdiscountPercent;
    }
    
    public void setPdiscountPercent(double pdiscountPercent) {
        this.pdiscountPercent = pdiscountPercent;
    }
    
    public double calculateDiscountedPrice() {
        return pprice - (pprice * (pdiscountPercent / 100));
    }
    
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pdiscountPercent="
                + pdiscountPercent + "]";
    }
}
