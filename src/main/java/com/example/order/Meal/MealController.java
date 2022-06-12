package com.example.order.Meal;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/meal")
public class MealController {
    private final MealService mealService;

    @GetMapping("/get/all")
    public List<Meal> getAllMeals(){
        return mealService.getAllMeals();
    }

    @GetMapping("/get/{id}")
    public Optional<Meal> getSingleMeal(@PathVariable long id){
        return mealService.findOneMeal(id);
    }

    @PostMapping("/add")
    public Meal addMeal(@RequestBody Meal meal){
        return mealService.addOneMeal(meal);
    }


}
