package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcanes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 30/09/2016.
 */
public class VolcanesTest {
    @Test
    public void testCost() {
        Taco taco = new Volcanes();
        assertEquals(12.0, taco.cost(),0);
    }
}
