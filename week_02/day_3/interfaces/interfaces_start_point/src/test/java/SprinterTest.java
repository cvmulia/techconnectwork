import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SprinterTest {
    Sprinter sprinter;

    @Before
    public void before(){
        sprinter = new Sprinter();
    }

    @Test
    public void hasDistanceAtBeginning(){
        assertEquals(0,sprinter.getDistanceTravelled());
    }

    @Test
    public void canRun(){
        sprinter.run(10);
        assertEquals(12, sprinter.getDistanceTravelled());
    }

}
