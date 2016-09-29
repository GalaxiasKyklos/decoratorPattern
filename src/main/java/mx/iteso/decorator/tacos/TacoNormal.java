package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(int size){
        description = "Taco normal";
        this.size = size;
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
        return size == MINI? 6.00: size == REGULAR? 8.00 : 12.00;
    }
}
