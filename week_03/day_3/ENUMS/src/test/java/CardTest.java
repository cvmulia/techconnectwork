import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card (SuitType.HEARTS, RankType.QUEEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank (){
        assertEquals(RankType.QUEEN,card.getRank());
    }

    @Test
    public void cardHasValue9(){
        card = new Card (SuitType.HEARTS, RankType.NINE);
        assertEquals(9,card.getValueFromEnum());
    }

//    @Test
//    public void canMisspellSuit(){
//        card = new Card("Heeeeeeeeeeaaaarrtttts");
//        assertEquals("Heeeeeeeeeeaaaarrtttts", card.getSuit());
//    }




}
