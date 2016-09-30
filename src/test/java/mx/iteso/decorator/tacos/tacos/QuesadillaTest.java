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
    public void testCost() {
        Taco taco = new Quesadilla(Taco.REGULAR);
        assertEquals(10.0, taco.cost(),0);
    }
}
