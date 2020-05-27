package wawer.kamil.teaitydzien11.abstractfactory.meals;

import org.springframework.stereotype.Component;

@Component
@FoodTypeAnnotation(mealType = MealType.DESSERT)
public class DessertMeal implements Meal {

    @Override
    public String getName() {
        return "Dessert meal";
    }
}
