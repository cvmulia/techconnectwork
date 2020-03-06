import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpTest {

    Chimp chimp;

    @Before
    public void before(){
        chimp = new Chimp();
    }

    @Test
    public void canEat(){
        assertEquals("can eat", chimp.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("can breathe", chimp.breathe());
    }

    @Test
    public void canWalk(){
        assertEquals("can walk", chimp.walk());
    }

    @Test
    public void canTalk(){
        assertEquals("can talk", chimp.talk());
    }

}
