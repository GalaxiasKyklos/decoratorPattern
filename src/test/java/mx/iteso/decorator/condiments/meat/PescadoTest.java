package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Saúl on 29/09/2016.
 */
public class PescadoTest {
    private Taco taco;

    @Before
    public void setUp() {
        taco = mock(Taco.class);
    }

    @Test(expected = Exception.class)
    public void miniTest() throws Exception {
        Taco taco = new TacoNormal(Taco.MINI);
        taco = new Pescado(taco);
    }

    @Test
    public void testDescriptionReg() throws Exception {
        Taco taco = new TacoNormal(Taco.REGULAR);
        taco = new Pescado(taco);
        assertEquals("Taco normal regular de pescado", taco.getDescription());
    }

    @Test
    public void testDescriptionMeg() throws Exception {
        Taco taco = new TacoNormal(Taco.MEGA);
        taco = new Pescado(taco);
        assertEquals("Taco normal mega de pescado", taco.getDescription());
    }

    @Test
    public void testCostReg() throws Exception {
        Taco taco = new TacoNormal(Taco.REGULAR);
        taco = new Pescado(taco);
        assertEquals(10, taco.cost(), 0);
    }

    @Test
    public void testCostMeg() throws Exception {
        Taco taco = new TacoNormal(Taco.MEGA);
        taco = new Pescado(taco);
        assertEquals(14, taco.cost(), 0);
    }
}
