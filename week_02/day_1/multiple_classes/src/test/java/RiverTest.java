import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {
    private River river;
    private Salmon salmon;

    @Before
    public void before(){
        this.river = new River();
        this.salmon = new Salmon();
    }


    // The one where we add a salmon to the river
    @Test
    public void canAddSalmonToTheRiver(){

    river.addSalmon(this.salmon);
    assertEquals(1, this.river.fishCount());
    }


    // The one where we remove a salmon from the river
    // Given I have a river✅
    // And the river has 1 fish in it
    @Test
    public void canRemoveSalmon() {
        river.addSalmon(salmon);
        assertEquals(1, river.fishCount());
        // when I removed a fish
        river.removeSalmon(salmon);
        assertEquals(0, river.fishCount());
        // then I should have 0 fish in the river
    }


}
