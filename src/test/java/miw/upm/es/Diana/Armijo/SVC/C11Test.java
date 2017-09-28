package miw.upm.es.Diana.Armijo.SVC;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C11Test {

    private C11 c11;

    @Before
    public void before() {
        c11 = new C11();
    }
    
    @Test
    public void testM1() {
        assertEquals("a", c11.m1());
    }
    
    @Test
    public void testM2() {
        assertEquals("", c11.m2());
    }
}
