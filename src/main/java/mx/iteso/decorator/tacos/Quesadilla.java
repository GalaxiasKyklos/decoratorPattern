package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(int size){
        this.size = size;
        description = "Quesadilla";
        switch (size) {
            case MINI:
                description += " mini";
                break;
            case REGULAR:
                description += " regular";
                break;
            case MEGA:
                description += " mega";
                break;
        }
    }

    @Override
    public double cost() {
        return size == MINI? 8.00 : size == REGULAR? 10.00 : 20.00;
    }
}
