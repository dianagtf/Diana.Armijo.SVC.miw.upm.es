package miw.upm.es.Diana.Armijo.SVC;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C22Test {

    private C22 c22;

    @Before
    public void before() {
        c22 = new C22();
    }
    
    @Test
    public void testM1() {
        assertEquals("", c22.mA());
    }
}
