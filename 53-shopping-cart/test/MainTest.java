package com.monocept.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class MainTest {
    
    public static void main(String[] args) {
        // Create some products
        Product p1 = new Product(1, "Product 1", 101.0, 0.11);
        Product p2 = new Product(2, "Product 2", 2022.0, 0.22);
        Product p3 = new Product(3, "Product 3", 3033.0, 0.33);
        
        // Create some line items
        LineItem li1 = new LineItem(1, 2, p1);
        LineItem li2 = new LineItem(2, 3, p2);
        LineItem li3 = new LineItem(3, 4, p3);
        LineItem li4 = new LineItem(4, 1, p1);
        
        
        // Create some sample orders
        List<LineItem> o1items = new ArrayList<>();
        o1items.add(li1);
        o1items.add(li2);
        Order o1 = new Order(1, new Date(122, 2, 15), o1items);
        
        List<LineItem> o2items = new ArrayList<>();
        o2items.add(li3);
        o2items.add(li4);
        Order o2 = new Order(2, new Date(122, 2, 25), o2items);
        
        List<Order> c1orders = new ArrayList<>();
        c1orders.add(o1);
        c1orders.add(o2);
        Customer c1 = new Customer(1, "Customer 1", c1orders);
        
        List<Order> c2orders = new ArrayList<>();
        c2orders.add(o1);
        Customer c2 = new Customer(2, "Customer 2", c2orders);
        
        // Create a list of all customers
        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        
        // Problem 1: Find total order values of all customers
        double totalOrderValue = 0;
        for (Customer customer : customers) {
            for (Order order : customer.getCorders()) {
                totalOrderValue += order.calculateOrderPrice();
            }
        }
        System.out.println("Total order value of all customers: " + totalOrderValue);
        
        // Problem 2: Find Order value of Customer ABC
        String targetCustomerName = "Customer 1";
        double targetCustomerOrderValue = 0;
        for (Customer customer : customers) {
            if (customer.getCname().equals(targetCustomerName)) {
                for (Order order : customer.getCorders()) {
                    targetCustomerOrderValue += order.calculateOrderPrice();
                }
                break;
            }
        }
        System.out.println("Order value of " + targetCustomerName + ": " + targetCustomerOrderValue);
        
    }
}

