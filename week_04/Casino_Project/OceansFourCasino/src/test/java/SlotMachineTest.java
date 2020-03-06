import Enums.SuitType;
import General_Classes.Player;
import NonCard.SlotMachine;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SlotMachineTest {

    SlotMachine slot;
    ArrayList<SuitType> suit;
    Player player;


    @Before
    public void before(){
        player = new Player("Lady Gaga", 20, 30.0);
        slot = new SlotMachine(player);
        suit = new ArrayList<SuitType>();
    }

    @Test
    public void canCompareItemsWhenFalse(){
        slot.generateResultsArrayList();
        assertFalse(slot.compareItems());
    }

//    @Test
//    public void canCompareItemsWhenTrue(){
//        slot.generateResultsArrayList();
//        assertTrue(slot.compareItems());
//    }



}
