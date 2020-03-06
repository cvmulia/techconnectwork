import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        visitor1 = new Visitor (15,175,100); //given there is a child
        playground = new Playground("kiddyland",5);
        visitor2 = new Visitor(27, 188, 1500);
    }

    //the one where the visitor is allowed

    @Test
    public void visitorAllowed(){
        assertTrue(playground.isAllowedToVisit(visitor1)); //then it is allowed; true
    }

    @Test
    public void visitorNotAllowed() {
        assertEquals(false, playground.isAllowedToVisit(visitor2));
    }

}
