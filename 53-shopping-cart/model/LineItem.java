package com.monocept.model;

public class LineItem {
    private int lid;
    private int lquantity;
    private Product lproduct;
    
    public LineItem(int lid, int lquantity, Product lproduct) {
        this.lid = lid;
        this.lquantity = lquantity;
        this.lproduct = lproduct;
    }
    
    public int getLid() {
        return lid;
    }
    
    public void setLid(int lid) {
        this.lid = lid;
    }
    
    public int getLquantity() {
        return lquantity;
    }
    
    public void setLquantity(int lquantity) {
        this.lquantity = lquantity;
    }
    
    public Product getLproduct() {
        return lproduct;
    }
    
    public void setLproduct(Product lproduct) {
        this.lproduct = lproduct;
    }
    
    public double calculateLineItemCost() {
        return lquantity * lproduct.calculateDiscountedPrice();
    }
    
    public String toString() {
        return "LineItem [lid=" + lid + ", lquantity=" + lquantity + ", lproduct=" + lproduct + "]";
    }
}