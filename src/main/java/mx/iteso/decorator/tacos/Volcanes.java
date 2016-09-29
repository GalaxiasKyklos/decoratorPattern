package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by Rodolfo on 29/09/2016.
 */
public class Volcanes extends Taco{

        public Volcanes(){
            description = "Volcan";
        }

        @Override
        public double cost() {
            return 12.00;
        }

}
