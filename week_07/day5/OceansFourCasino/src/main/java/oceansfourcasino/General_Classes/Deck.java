package oceansfourcasino.General_Classes;

import oceansfourcasino.Enums.RankType;
import oceansfourcasino.Enums.SuitType;
import oceansfourcasino.General_Classes.Card;

import java.util.ArrayList;

import static java.util.Collections.shuffle;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> populateDeck() {

        SuitType[] suits = SuitType.values();
        RankType[] rankTypes = RankType.values();

        for (SuitType suitType : suits ) {
            for (RankType rankType : rankTypes) {
                Card card = new Card(suitType, rankType);
                cards.add(card);
            }
        }
        return cards;
    }


    public void shuffleCards(){
        shuffle(cards);
    }

    public Card deal(ArrayList<Card> cards){
        Card dealtCard = this.cards.remove(1);
        return dealtCard;
    }

}
