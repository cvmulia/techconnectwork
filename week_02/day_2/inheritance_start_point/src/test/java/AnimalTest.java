import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;
    @Before
    public void before(){
        animal = new Animal();
    }

    @Test
    public void canEat(){
        assertEquals("can eat", animal.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("can breathe", animal.breathe());
    }
}
