import Games.Game;
import General_Classes.Card;
import General_Classes.Player;
import Interfaces.ICalculate;
import Interfaces.IDeal;


import java.util.ArrayList;


public abstract class TableGame extends Game implements IDeal, ICalculate {

    Deck deck;
    int numberOfPlayers;
    Player player;
    ArrayList<Card>cards;


    public TableGame( int numberOfPlayers, String gameName, int maximumNoOfPlayers) {
        super(gameName, maximumNoOfPlayers); // override in individual games
        this.numberOfPlayers = numberOfPlayers;
    }

    public void shuffleItems(){
        deck.shuffleCards();
    }

    public void dealCards(){
        deck.populateDeck();

        for (int i = 0; i < numberOfPlayers; i++) {
            Card dealtCard = deck.deal(cards);
            player.takeCard(dealtCard);

        }

    }


    public int getHandTotal(){
        return player.handTotal();

    }


}
