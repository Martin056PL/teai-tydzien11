package wawer.kamil.teaitydzien11;

import wawer.kamil.teaitydzien11.abstractfactory.factorymeal.FactoryMeal;
import wawer.kamil.teaitydzien11.abstractfactory.factorymeal.FactoryMealImpl;
import wawer.kamil.teaitydzien11.abstractfactory.meals.Meal;
import wawer.kamil.teaitydzien11.abstractfactory.meals.MealType;

public class Restaurant {

    public static void main(String[] args) {
        FactoryMeal factoryMeal = new FactoryMealImpl();
        Meal fastFoodMeal = factoryMeal.getMeal(MealType.FAST_FOOD);
        Meal proteinFoodMeal = factoryMeal.getMeal(MealType.PROTEIN);
        System.out.println(fastFoodMeal.getName());
        System.out.println(proteinFoodMeal.getName());
    }
}
