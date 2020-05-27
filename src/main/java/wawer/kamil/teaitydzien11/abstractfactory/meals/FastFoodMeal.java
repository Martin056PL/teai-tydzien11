package wawer.kamil.teaitydzien11.abstractfactory.meals;

import org.springframework.stereotype.Component;

@Component
@FoodTypeAnnotation(mealType = MealType.FAST_FOOD)
public class FastFoodMeal implements Meal {

    @Override
    public String getName() {
        return "fast-food meal";
    }
}
