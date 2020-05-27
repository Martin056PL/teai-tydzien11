package wawer.kamil.teaitydzien11.abstractfactory.factorymeal;

import wawer.kamil.teaitydzien11.abstractfactory.meals.*;

public class FactoryMealImpl implements FactoryMeal {

    @Override
    public Meal getMeal(MealType mealType) {
        if (mealType == MealType.FAST_FOOD) {
            return new FastFoodMeal();
        } else if (mealType == MealType.PROTEIN) {
            return new ProteinMeal();
        } else if (mealType == MealType.DESSERT) {
            return new DessertMeal();
        } else {
            return new VegeMeal();
        }
    }
}
