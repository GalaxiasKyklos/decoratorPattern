package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by Rodolfo on 29/09/2016.
 */
public class Camaron extends CondimentsDecorator {
    Taco taco;

    public Camaron (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camarón";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }
}
