package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by Rodolfo on 29/09/2016.
 */
public class Camaron extends CondimentsDecorator {
    Taco taco;

    public Camaron (Taco taco) throws Exception {
        if (taco.size == MINI)
            throw new Exception("Los tacos de camaron no pueden ser mini");
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        return taco.cost() + (size == MINI? 3.00 : size == REGULAR? 4.00 : 5.00);
    }
}
