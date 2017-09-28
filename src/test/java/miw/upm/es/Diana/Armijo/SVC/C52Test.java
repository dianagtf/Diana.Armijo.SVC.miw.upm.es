package miw.upm.es.Diana.Armijo.SVC;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C52Test {
    private C52 c52;

    @Before
    public void before() {
        c52 = new C52();
    }
    
    @Test
    public void testM1() {
        assertEquals("", c52.mA());
    }
}
