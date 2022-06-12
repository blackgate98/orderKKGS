package com.example.order.Meal;

import com.example.order.Product.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long meal_id;
    private String nameOfMeal;
    @ManyToMany
    private List<Product> produducts;

    public Meal(String nameOfMeal, List<Product> produducts) {
        this.nameOfMeal = nameOfMeal;
        this.produducts = produducts;
    }
}
