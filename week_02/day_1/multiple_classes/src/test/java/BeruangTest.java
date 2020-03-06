import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BeruangTest {
    Beruang bear;
    Salmon salmon1;
    River river;
    river.addSa

    @Before
    public void before(){
        bear = new Beruang("Balu");
        salmon1 = new Salmon();
        river = new River();
    }

    // The one where we can create a bear object successfully
    @Test
    public void canCreateBearObject(){

        assertNotNull(bear);
    }

    // The one where the bear's belly is empty
    @Test
    public void bellyStartsEmpty(){
        assertEquals(0,bear.BellySize());

    }

    // The one where we give the bear a Salmon
    @Test
    public void canGiveBearASalmon(){
        bear.eatFishFromRiver(river);
        assertEquals(1, bear.BellySize());
    }

    // The one where we clear the bear belly✅
    //Given we have a bear & has eaten a salmon✅ ie the array is 1.
    //When the bear sleeps✅
    //Then the bear stomach should be empty again✅

    @Test
    public void canClearBearBelly(){
        bear.eat(salmon1);
        assertEquals(1,bear.BellySize());
        bear.sleep();
        assertEquals(0,bear.BellySize());
    }

    @Test
    public void canEatFishFromRiver(){

        bear.eatFishFromRiver(river);

    }


}
