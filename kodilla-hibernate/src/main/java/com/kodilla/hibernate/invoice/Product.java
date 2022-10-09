package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "PRODUCT")
public class Product {

    private int id;
    private String productName;
    private List<Item> itemsList = new ArrayList<>();

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "PRODUCT_NAME")
    public String getProductName() {
        return productName;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItemsList() {
        return itemsList;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setProductName(String productName) {
        this.productName = productName;
    }

    public void setItemsList(List<Item> items) {
        this.itemsList = items;
    }
}

