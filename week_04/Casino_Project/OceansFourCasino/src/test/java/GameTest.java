import Games.Game;
import General_Classes.Player;
import NonCard.SlotMachine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Player player1;
    Player player2;
    Player playerBroke;
    Player playerRich;
    Game game;


    @Before
    public void before(){
        player1 = new Player("Bob",20,50.0);
        player2 = new Player("Sponge", 21, 25.0);
        playerBroke = new Player("Dreamer", 22, 0.5);
        playerRich = new Player("Richard", 30, 500.0);
        game = new SlotMachine(player1);

    }


//TODO: write the test
    //Max Number Player
    @Test
    public void canTestMaximumNoOfPlayers(){
        game.checkIfGameIsNotFull(player1);
        game.checkIfGameIsNotFull(player2);

        assertEquals(1, game.noOfPlayers());
    }

    @Test
    public void canRefusePlayerWithNoMoney(){
        assertFalse(game.playerHasEnoughMoneyToPlayGame(playerBroke));
    }

    @Test
    public void canAlllowPlayerWithMoney(){
        assertTrue(game.playerHasEnoughMoneyToPlayGame(playerRich));
    }

}
