package oceansfourcasino.TableGame;

import oceansfourcasino.General_Classes.Card;
import oceansfourcasino.General_Classes.Player;
import oceansfourcasino.General_Classes.Deck;

import java.util.ArrayList;
import java.util.Scanner;

public class Baccarat extends TableGame {

    ArrayList<Integer> houseHand;
    ArrayList<Integer> tableHand;
    int HousePoints;
    int TablePoints;
    String winner;
    Player table;
    Player house;
    double minEntryAmount;
    public ArrayList<Player> gamblers;
    Deck deck=new Deck();

    public Baccarat( int numberOfPlayers) {
        super( numberOfPlayers, "oceansfourcasino.TableGame.Baccarat", 7);
        this.houseHand = new ArrayList<Integer>();
        this.tableHand = new ArrayList<Integer>();
        this.HousePoints = 0;
        this.TablePoints = 0;
        this.table = new Player("table", 20, 100.00);
        this.house = new Player("house", 20, 100.00);
        this.gamblers = new ArrayList<Player>();
        this.minEntryAmount = 10.0;



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

    int maximumNoOfPlayers = 7;

    //if numberOfPlayers>maximumNoOfPlayers, cannot play -  put in game ✅

    //TODO: print out the rule
    // house represents banker and table represents player.
    // each participant place bet on either banker or player by typing house or table.



    // TODO: setup the arraylist of banker and player ✅
    // TODO: arraylist of players
    /* TODO: scanner input place bet on banker or player
    if the participant chose banker, the point of banker will be theirs, vice versa
    */


    Scanner inputScanner = new Scanner(System.in);

    public void placeBet(Player player) {
        System.out.println("Place your bet type: Table or House");

        String betType = inputScanner.nextLine();

        if (betType.equalsIgnoreCase("Table")) {
            System.out.println("You chose to place a bet on Table!");
            player.type = "Table";
        } else {
            System.out.println("You chose to place a bet on House!");
            player.type = "House";
        }
//    public boolean checkPlayerChoice(String betType) {
//        if (betType.equalsIgnoreCase("Table") || betType.equalsIgnoreCase("House")) {
//            return true;
//        }
//        return false; // what is the next action?
    }

    public String initializeGame(){
        dealCards();
        getHousePoints();
        getTablePoints();
        checkIfItDraws();
        checkWinner();
        printResults();
        winnersDisplay();
        return "\n\n";

    }


    // TODO: deal 2 cards to each banker and player
    public void dealCards() {
        deck.populateDeck();
        deck.shuffleCards();

        for (int i = 0; i < 2; i++) {
            Card dealtCard = deck.deal(cards);
            int value = dealtCard.getValueFromEnum();
            if (value == 10){
                value = 0;
            }
            houseHand.add(value);
            Card dealtCard1 = deck.deal(cards);
            int value1 = dealtCard1.getValueFromEnum();
            if (value == 10){
                value = 0;
            }
            tableHand.add(value1);
        }

    }
    public void setHousePoints(int housePoints) {
        HousePoints = housePoints;
    }

    public void setTablePoints(int tablePoints) {
        TablePoints = tablePoints;
    }

    // TODO: Calculate points, value >9, must be subtracted by 10
    public int getHousePoints(){
        int totalHousePoints = houseHand.get(0) + houseHand.get(1);
        if (totalHousePoints>9){
            totalHousePoints-=10;}
        setHousePoints(totalHousePoints);
        return HousePoints;
    }

    public int getTablePoints(){
        int totalTablePoints = tableHand.get(0) + tableHand.get(1);
        if (totalTablePoints>9){
            totalTablePoints-=10;}
        setTablePoints(totalTablePoints);
        return TablePoints;
    }

    public void checkIfItDraws() {
        getHousePoints();
        getTablePoints();
        if (HousePoints == TablePoints) {
            dealCards();
        }

    }
    //TODO: compare the points of each player

    public String checkWinner(){
        if (HousePoints>TablePoints){
            winner = "House";
            return winner;
        }
        else {winner = "Table";
        return winner;}
    }

    // TODO: show the points of the banker and player
    public void printResults(){
        System.out.println("House: "+HousePoints+" Table: "+TablePoints+"!");

    }



    //TODO: announce winner

    public void winnersDisplay() {
        for (Player gambler : gamblers) {
            checkWinner();
            if (gambler.type.equalsIgnoreCase(winner)) {
                System.out.println("Congratulation "+gambler.name+"!!! You just won £100.00! Winner Winner Chicken Dinner!\n\n");
                gambler.addMoneyToWallet(100.0);
            } else {
                System.out.println( "Sorry " + gambler.name + ". Better luck next time! 💸💸\n");
                gambler.removeMoneyFromWallet(10.0);

            }
        }

    }

//    public void printArrayList(){
//        System.out.println(gamblers);
//    }

    public boolean playerHasEnoughMoneyToPlayGame(Player player){
        //look for a better name for token - money paid to play game
        if(player.getWallet() > minEntryAmount){
            return true;
        }
        return false;
    }

    // write method that gives winnings to player
    // each time win 25


    //write a method that gives losses to player



    public void exitTheGame(Scanner action) {

    }


}

