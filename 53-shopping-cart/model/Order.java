package com.monocept.model;

import java.util.Date;
import java.util.List;

public class Order {
    private int oid;
    private Date odate;
    private List<LineItem> oitems;
    
    public Order(int oid, Date odate, List<LineItem> oitems) {
        this.oid = oid;
        this.odate = odate;
        this.oitems = oitems;
    }
    
    public int getOid() {
        return oid;
    }
    
    public void setOid(int oid) {
        this.oid = oid;
    }
    
    public Date getOdate() {
        return odate;
    }
    
    public void setOdate(Date odate) {
        this.odate = odate;
    }
    
    public List<LineItem> getOitems() {
        return oitems;
    }
    
    public void setOitems(List<LineItem> oitems) {
        this.oitems = oitems;
    }
    
    public double calculateOrderPrice() {
        double total = 0;
        for (LineItem item : oitems) {
            total += item.calculateLineItemCost();
        }
        return total;
    }
    
    public String toString() {
        return "Order [oid=" + oid + ", odate=" + odate + ", oitems=" + oitems + "]";
    }
}

