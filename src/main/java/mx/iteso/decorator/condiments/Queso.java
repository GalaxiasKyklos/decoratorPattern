package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        return taco.cost() + size == MINI? 2.00 : size == REGULAR? 3.00 : 4.00;
    }
}
