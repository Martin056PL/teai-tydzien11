package wawer.kamil.teaitydzien11.abstractfactory.meals;

import org.springframework.stereotype.Component;

@Component
@FoodTypeAnnotation(mealType = MealType.VEGE)
public class VegeMeal implements Meal {

    @Override
    public String getName() {
        return "Vege Meal";
    }
}
