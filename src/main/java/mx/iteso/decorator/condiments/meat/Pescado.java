package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by Rodolfo on 29/09/2016.
 */
public class Pescado extends CondimentsDecorator {
    Taco taco;

    public Pescado (Taco taco) throws Exception {
        if (taco.size == MINI)
            throw new Exception("Los tacos de pescado no pueden ser mini");
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pecado";
    }

    @Override
    public double cost() {
        return taco.cost() + size == MINI? 2.00 : size == REGULAR? 3.00 : 4.00;
    }
}
