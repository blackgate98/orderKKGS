package com.example.order.Client;

import com.example.order.Meal.Meal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long client_id;
    private String first_name;
    private String last_name;

    @ManyToMany
    private List<Meal> meals;


    public Client(String first_name, String last_name, List<Meal> meals) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.meals = meals;

    }


}
