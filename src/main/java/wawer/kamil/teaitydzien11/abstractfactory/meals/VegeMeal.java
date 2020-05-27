package wawer.kamil.teaitydzien11.abstractfactory.meals;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("VegeMeal")
public class VegeMeal implements Meal {

    @Override
    public String getName() {
        return "Vege Meal";
    }
}
