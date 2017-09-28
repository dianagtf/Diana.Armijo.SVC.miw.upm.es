package miw.upm.es.Diana.Armijo.SVC;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

    private C51 c51;

    @Before
    public void before() {
        c51 = new C51();
    }
    
    @Test
    public void testM1() {
        assertEquals("", c51.m1());
    }
    
    @Test
    public void testM2() {
        assertEquals("", c51.m2());
    }
}
