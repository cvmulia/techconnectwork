import General_Classes.Player;

import java.util.Scanner;

public class BlackJackRunner {
    public static void main(String[] args) {
        BlackJack blackJack;
        Deck deck;
        Player player;

        deck = new Deck();

        Scanner numberScanner = new Scanner(System.in);
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("Welcome to Black Jack!");
        System.out.println("");
        System.out.println("RULE: Each player will be dealt 2 cards, " +
                "and the total point of the dealt card will be displayed right away.\n" +
                "Players then will be asked to take action.\n" +
                "If player is satisfied with the point, player can choose to pass, \n" +
                "but if not, player can choose deal to get an extra card." +
                "Player with the highest point wins, but if the point exceeds 21, player will lose." +
                "GOOD LUCK!!!");
        System.out.println("");
        System.out.println("How many players would you like?");
        String noOfPlayers = numberScanner.nextLine();
        int numberOfPlayers = Integer.parseInt(noOfPlayers);
        blackJack = new BlackJack(numberOfPlayers);


        Player blackjack_player = null;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter player name");
            String playerName = nameScanner.nextLine();
            System.out.println("What age are you?");
            String age = nameScanner.nextLine();
            int age_int = Integer.parseInt(age);
            player = new Player(playerName, age_int, 100.0);
            blackjack_player = player;

            blackJack.gamblers.add(blackjack_player);
            blackJack.dealCards(blackjack_player);


        }



        blackJack.move(blackjack_player);
        blackJack.checkWinner();
        blackJack.winnersDisplay();




    }
}
