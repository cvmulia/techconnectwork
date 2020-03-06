import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalsTest {

    Mammals mammals;

    @Before
    public void before() {
        mammals = new Mammals();
    }

    @Test
    public void canEat(){
        assertEquals("can eat", mammals.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("can breathe", mammals.breathe());
    }

    @Test
    public void canWalk(){
        assertEquals("can walk", mammals.walk());
    }
}
