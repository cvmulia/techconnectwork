//import General_Classes.Casino;
//import General_Classes.Player;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class CasinoTest {
//    Casino casino;
//    Player player5;
//    Player player20;
//
//
//    @Before
//    public void before(){
//        player5 = new Player("Child", 5, 3.0);
//        player20 = new Player("Adult", 20, 50.0);
//        casino = new Casino();
//    }
//
//    @Test
//    public void canRefusePlayerUnder18(){
//        casino.playerOverEighteen(player5);
//        assertEquals(0, casino.getSize());
//    }
//
//    @Test
//    public void canAllowPlayerOver18(){
//        casino.playerOverEighteen(player20);
//        assertEquals(1,casino.getSize());
//    }
//}
