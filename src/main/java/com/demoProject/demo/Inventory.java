package com.demoProject.demo;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@NamedQuery(name="findItemById", query = "SELECT C FROM Inventory AS C WHERE C.id=:id")
public class Inventory {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToMany(mappedBy = "inventoryList")

    private List<OrderItem> orders = new ArrayList<>();


//Constructors//
    //Empty Constructor is must for JPA//
    protected Inventory() {};

    public Inventory(Long id, String name, BigDecimal price, Integer quantity, List<OrderItem> orders) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.orders = orders;
    }


///getters and setters////

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderItem> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

