package miw.upm.es.Diana.Armijo.SVC;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C31Test {

    private C31 c31;

    @Before
    public void before() {
        c31 = new C31();
    }
    
    @Test
    public void testM1() {
        assertEquals("", c31.m1());
    }
    
    @Test
    public void testM2() {
        assertEquals("", c31.m2());
    }
    @Test
    public void testMB() {
        assertEquals("", c31.mB());
    }
}
