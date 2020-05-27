package wawer.kamil.teaitydzien11.abstractfactory.factorymeal;

import wawer.kamil.teaitydzien11.abstractfactory.meals.Meal;
import wawer.kamil.teaitydzien11.abstractfactory.meals.MealType;

public interface FactoryMeal {

    Meal getMeal(MealType mealType);

}
