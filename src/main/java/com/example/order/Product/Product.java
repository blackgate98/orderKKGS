package com.example.order.Product;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long product_id;
    private String nameOfProduct;

    private BigDecimal price;

    public Product(String nameOfProduct,  BigDecimal price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }
}
