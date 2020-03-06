package NonCard;

import General_Classes.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SlotMachine extends NonCard {
    String[] options;
    ArrayList<String> results;
    List<String> icons;
    double minEntryAmount;
    private Player player;

    public SlotMachine( Player player) {
        super("Slots", 1);
        options = new String[]{"♦️", "️♥️", "♠️", "♣️"};
        results = new ArrayList<String>();
        icons = Arrays.asList(options);
        minEntryAmount = 1.0; //TODO figure out how to deduct money for minimum entry
        this.player = player; //TODO see how this is affected when we use a scanner


    }

    public String initializeGame(){
        generateResultsArrayList().clear();
        generateResultsArrayList();
        if (compareItems()){
            return results + "\nCONGRATULATIONS!!! WINNER!!!\n" + playerWonGame();
        }
        return  results + "\nSORRY PLEASE TRY AGAIN\n" + playerLoseGame();
    }

    public void setGameName(String gameName) {
        this.gameName = "Slot Machine";
    }

    public String getGameName() {
        return gameName;
    }


    public int getMaximumNoOfPlayers() {
        return maximumNoOfPlayers;
    }

    public void setMaximumNoOfPlayers(int maximumNoOfPlayers) {
        this.maximumNoOfPlayers = 1;
    }


    public ArrayList<String> generateResultsArrayList(){
        for(int i =0; i <4 ; i++){
        Collections.shuffle(icons);
            results.add(icons.get(0));}
        return results;
    }

    public boolean compareItems() {
        //compare the results arraylist and see if all 4 are the same
        String result = results.get(0);
        //if yes, return you win/true
        if (result.equals(results.get(1)) && result.equals(results.get(2)) && result.equals(results.get(3))){
            return true; }
        //if no, return false
         return false;
    }

    public boolean playerHasEnoughMoneyToPlayGame(Player player){
        //look for a better name for token - money paid to play game
        if(player.getWallet() > minEntryAmount){
            return true;
        }
         return false;
    }

    // write method that gives winnings to player
    // each time win 25
    public String playerWonGame(){
        if(compareItems()) {
            player.addMoneyToWallet(25.0);
        }
        return "YOU WIN £25.";
    }


    //write a method that gives losses to player

    public String playerLoseGame(){
        if(!compareItems()) {
            player.removeMoneyFromWallet(1.0);
        }
        return "YOU LOSE £1.";
    }


}

