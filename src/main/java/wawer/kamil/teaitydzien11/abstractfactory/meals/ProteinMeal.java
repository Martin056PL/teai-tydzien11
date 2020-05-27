package wawer.kamil.teaitydzien11.abstractfactory.meals;

import org.springframework.stereotype.Component;

@Component
@FoodTypeAnnotation(mealType = MealType.PROTEIN)
public class ProteinMeal implements Meal {

    @Override
    public String getName() {
        return "Protein meal";
    }
}
