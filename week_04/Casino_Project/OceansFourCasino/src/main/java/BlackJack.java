import General_Classes.Card;
import General_Classes.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BlackJack extends TableGame {

    ArrayList<Card> hand;
    ArrayList<Player> gamblers;
    Player player;
    Deck deck = new Deck();
    int Winner;


    public BlackJack(int numberOfPlayers) {
        super(numberOfPlayers, "Black Jack", 4);
        this.hand = new ArrayList<Card>();
        this.gamblers = new ArrayList<Player>();

    }

    public Player getPlayer() {

        return player;
    }

    public void setPlayer(Player player) {

        this.player = player;
    }

    public int getMaximumNoOfPlayers() {

        return maximumNoOfPlayers;
    }
    int maximumNoOfPlayers = 4;

    public String initializeGame(){
        checkWinner();
        winnersDisplay();
        return "\n\n";


    }

    public void dealCards (Player player) {
        deck.populateDeck();
        deck.shuffleCards();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                Card dealtCard = deck.deal(cards);

                player.takeCard(dealtCard);

            }
            System.out.println("Your total points so far: ");
            System.out.println(player.handTotal());;
            player.points = player.handTotal();
        }
    }

    public void move(Player player) {
        for (Player gambler: gamblers) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println(gambler.name + " Would you like to Pass or Deal?");
            String action = inputScanner.nextLine();
            if (action.equalsIgnoreCase("Pass")) {
                System.out.println("You chose to Pass!");
                System.out.println("Your final points: " + gambler.points);


            } else {
                System.out.println("You chose to Deal!");
                Card dealtCard = deck.deal(cards);
                player.takeCard(dealtCard);
                gambler.points += dealtCard.getValueFromEnum();
                System.out.println("Your final points: " + gambler.points);
            }
        }

    }

    public void printPlayerArray(){
        System.out.println(gamblers);
    }

    public int checkWinner() {
        ArrayList<Integer> values = new ArrayList<Integer>();

        for (Player gambler : gamblers) {

            values.add(gambler.points);

        }
        int winner = Collections.max(values);
        return winner;

    }

    public void winnersDisplay() {
        for (Player coolKid : gamblers) {
            int winner = checkWinner();

            if  (coolKid.points >= 22 || coolKid.points!=winner) {
                System.out.println("\nSorry,  " + coolKid.name + " :( YOU LOSE 💸💸\n");
                coolKid.removeMoneyFromWallet(20.0);
            }else if
                (coolKid.points==winner) {
                    System.out.println("\nCongratulations "+ coolKid.name+"!!! You just won £200.00! Winner Winner Chicken Dinner!\n");
                    coolKid.addMoneyToWallet(200.0);
            }


        }

    }

}







