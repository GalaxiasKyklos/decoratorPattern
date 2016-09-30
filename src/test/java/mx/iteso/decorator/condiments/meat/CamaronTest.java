package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Saúl on 29/09/2016.
 */
public class CamaronTest {
    private Taco taco;

    @Before
    public void setUp() {
        taco = mock(Taco.class);
    }

    @Test (expected = Exception.class)
    public void miniTest() throws Exception {
        Taco taco = new TacoNormal(Taco.MINI);
        taco = new Camaron(taco);
    }

    @Test
    public void testDescriptionReg() throws Exception {
        Taco taco = new TacoNormal(Taco.REGULAR);
        taco = new Camaron(taco);
        assertEquals("Taco normal regular de camaron", taco.getDescription());
    }

    @Test
    public void testDescriptionMeg() throws Exception {
        Taco taco = new TacoNormal(Taco.MEGA);
        taco = new Camaron(taco);
        assertEquals("Taco normal mega de camaron", taco.getDescription());
    }

    @Test
    public void testCostReg() throws Exception {
        Taco taco = new TacoNormal(Taco.REGULAR);
        taco = new Camaron(taco);
        assertEquals(11, taco.cost(), 0);
    }

    @Test
    public void testCostMeg() throws Exception {
        Taco taco = new TacoNormal(Taco.MEGA);
        taco = new Camaron(taco);
        assertEquals(15, taco.cost(), 0);
    }
}
