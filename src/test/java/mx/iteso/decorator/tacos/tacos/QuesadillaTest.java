package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 30/09/2016.
 */
public class QuesadillaTest {
    @Test
    public void testCostReg() {
        Taco taco = new Quesadilla(Taco.REGULAR);
        assertEquals(10.0, taco.cost(),0);
    }
    @Test
    public void testCostMin() {
        Taco taco = new Quesadilla(Taco.MINI);
        assertEquals(8.0, taco.cost(),0);
    }
    @Test
    public void testCostMeg() {
        Taco taco = new Quesadilla(Taco.MEGA);
        assertEquals(20.0, taco.cost(),0);
    }
}
