package com.demoProject.demo;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "date_Ordered")
    private java.sql.Date dateOrdered;

    @Column(name = "time_Ordered")
    private java.sql.Time timeOrdered;

    @Column
    private String status;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    @JoinTable(name = "Ordered_Items", joinColumns = @JoinColumn(name = "Order_Num"),
            inverseJoinColumns =@JoinColumn(name= "Item_Num"))
    private List<Inventory> inventoryList = new ArrayList<>();


    //Constructors//
    //Empty Constructor is must for JPA//
    protected OrderItem() {
    }

    ;

    public OrderItem(Long id, Date dateOrdered, Time timeOrdered, String status, Customer customer, List<Inventory> inventoryList) {
        this.id = id;
        this.dateOrdered = dateOrdered;
        this.timeOrdered = timeOrdered;
        this.status = status;
        this.customer = customer;
        this.inventoryList = inventoryList;
    }


//getters and setters///

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Time getTimeOrdered() {
        return timeOrdered;
    }

    public void setTimeOrdered(Time timeOrdered) {
        this.timeOrdered = timeOrdered;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
}