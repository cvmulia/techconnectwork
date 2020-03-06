import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear1; // declaring the variable before we use it. it's within bearTest, and can be used for Before and any other tests
    Bear smallbear;

    @Before
    public void before() {
        bear1 = new Bear("Blue", 29, 95.62);  //create that bear once then use it anywhere
    }

    @Test
    public void canGetName(){
        assertEquals("Blue", bear1.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(29, bear1.getAge());
    }

    @Test
    public void canGetWeight(){
        assertEquals(95.62, bear1.getWeight(),0.0);
    }

    @Test
    public void canHibernate(){
        assertEquals(true, bear1.readyToHibernate());
    }

    @Test
    public void cannotHibernate(){
        smallbear = new Bear ("Pooh", 99,50);
        assertEquals(false, smallbear.readyToHibernate());
    }


}

