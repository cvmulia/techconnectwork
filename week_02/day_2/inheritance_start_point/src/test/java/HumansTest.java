import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumansTest {

    Humans humans;

    @Before
    public void before(){
        humans = new Humans();
    }

    @Test
    public void canEat(){
        assertEquals("can eat", humans.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("can breathe", humans.breathe());
    }

    @Test
    public void canWalk(){
        assertEquals("can walk", humans.walk());
    }

    @Test
    public void canTalk(){
        assertEquals("can talk", humans.talk());
    }


}
