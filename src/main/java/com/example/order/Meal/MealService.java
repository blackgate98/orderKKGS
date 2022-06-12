package com.example.order.Meal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MealService {
    private final MealRepository mealRepository;


    public List<Meal> getAllMeals(){
        return mealRepository.findAll();
    }

    public Optional<Meal> findOneMeal(long id){
        return mealRepository.findById(id);
    }

    public Meal addOneMeal(Meal meal){
        return mealRepository.save(meal);
    }

}
