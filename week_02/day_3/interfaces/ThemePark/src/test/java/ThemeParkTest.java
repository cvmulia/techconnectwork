import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ThemeParkTest {
    ThemePark themePark;
   Playground playground1;
   Rollercoaster rollercoaster1;
    @Before
    public void before(){

    }

    //TODO: write a test for ThemePark - which we pass in an array list of Attractions and Stalls (as IReviewed)
    @Test
    public void canReturnReviewed () {
        // Given we have a roller coaster, playground (Attraction) and candy floss, ice cream (Stall)
        Rollercoaster rollercoaster = new Rollercoaster("Puke", 5);
        Playground playground = new Playground("KIDDYLAND",4);
        CandyFlossStall candyFloss = new CandyFlossStall("Sweet Dreams", "Abdul",1,5;
        IceCreamStall iceCream = new IceCreamStall("Igloo", "Lala",1,5);

        // And we've added the stalls to an IReviewed array list
        // And the attractions to the same IReviewed  array list
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();

        reviewed.add(rollercoaster);
        reviewed.add(playground);
        reviewed.add(candyFloss);
        reviewed.add(iceCream);

        // and we've got a ThemePark object
        //And we've given the theme park object the attractions list and the stalls list
        ThemePark themePark = new ThemePark(reviewed);


        // When we call themePark.getAllReviewed()


        // Then we should be given a list of all the reviewed back

    }
}

    //TODO: write test for get all reviewed.



