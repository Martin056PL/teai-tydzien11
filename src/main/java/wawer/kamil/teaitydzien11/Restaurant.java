package wawer.kamil.teaitydzien11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import wawer.kamil.teaitydzien11.abstractfactory.meals.FoodTypeAnnotation;
import wawer.kamil.teaitydzien11.abstractfactory.meals.Meal;
import wawer.kamil.teaitydzien11.abstractfactory.meals.MealType;

@Service
@Repository
public class Restaurant {

    private Meal meal;

    @Autowired
    public Restaurant( @FoodTypeAnnotation(mealType = MealType.VEGE) Meal meal) {
      this.meal = meal;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get(){
        System.out.println(meal.getName());
    }

}
