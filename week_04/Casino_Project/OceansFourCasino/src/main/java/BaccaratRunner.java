import General_Classes.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class BaccaratRunner {
    public static void main(String[] args) {


        Baccarat baccarat;
        Deck deck;
        Player gambler;


//        player = new Player("Teal", 16, 50.0);



        Scanner numberScanner = new Scanner(System.in);
        Scanner nameScanner = new Scanner(System.in);
        // ask age
        System.out.println("WELCOME TO BA🚘🐭!!!");
        System.out.println("");
        System.out.println("House represents player and Table represents Banker.\n" +
                "Each participant should place bet on either Player or Banker by typing House or Table.");
        System.out.println("");
        System.out.println("How many players would you like?");
        String noOfPlayers = numberScanner.nextLine();
        int noOfPlayers_int = Integer.parseInt(noOfPlayers);
        baccarat = new Baccarat(noOfPlayers_int);


        for (int i = 0; i < noOfPlayers_int; i++) {
            System.out.println("Enter player name");
            String playerName = nameScanner.nextLine();
            System.out.println("What age are you?");
            String age = nameScanner.nextLine();
            int age_int = Integer.parseInt(age);
            gambler = new Player(playerName, age_int, 100.0);
            baccarat.placeBet(gambler);
            baccarat.gamblers.add(gambler);
        }


//            baccarat.checkPlayerChoice(betType);
//            if (baccarat.checkPlayerChoice(betType) == true) {
//                baccarat.assignPlayerToPointer(betType);
//            } else baccarat.placeBet();

//            gambler.getType();


        baccarat.dealCards();
        baccarat.getHousePoints();
        baccarat.getTablePoints();
        baccarat.checkIfItDraws();
        baccarat.checkWinner();
        baccarat.printResults();
        baccarat.winnersDisplay();

        // if the player in the arraylist of players has a betType that corresponds with winner,
        // that particular player wins

        //Loop through array list of players
        //add them to stack if bet type = winner
        //peek into stack, if empty no winner
        //Look into the stack of winner players and assign them as winner?

    }


}

