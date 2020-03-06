package Games;

import General_Classes.Player;
import Interfaces.IExit;
import Interfaces.IPlay;
import Interfaces.IShuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public abstract class Game<Z> implements IExit, IShuffle, IPlay {
    public String gameName;
    public int maximumNoOfPlayers;
    ArrayList<Z> shuffleItems;
    ArrayList<Player> players;
    double minEntryAmount;



    //TODO: Choose the game - is it in casino or here?

//    String welcomeMessage = "Welcome to " + chosenGame + "!";
//

    public Game(String gameName, int maximumNoOfPlayers) {
        this.gameName = gameName;
        this.maximumNoOfPlayers = maximumNoOfPlayers;
        this.shuffleItems = new ArrayList<Z>();
        players = new ArrayList<Player>();
        minEntryAmount = 0.0; //TODO overide this in slotMachine

    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getMaximumNoOfPlayers() {
        return maximumNoOfPlayers;
    }

    public void setMaximumNoOfPlayers(int maximumNoOfPlayers) {
        this.maximumNoOfPlayers = maximumNoOfPlayers;
    }

    public void checkIfGameIsNotFull(Player player){
        if (noOfPlayers() < maximumNoOfPlayers) {
            players.add(player);
        }
//            System.out.println("Sorry, maximum number of players reached. Please choose another game!");
         //can play the game

    }


    public int noOfPlayers(){
        return players.size();
    }



    public void exitTheGame(Scanner action) {
//        TODO: write a method with exitTheGame.
    }

    public void shuffleItems() {
        Collections.shuffle(shuffleItems);
    }

    public boolean playerHasEnoughMoneyToPlayGame(Player player){
        if (player.getWallet()> minEntryAmount){
            return true;
        }
        return false;
    }


}
