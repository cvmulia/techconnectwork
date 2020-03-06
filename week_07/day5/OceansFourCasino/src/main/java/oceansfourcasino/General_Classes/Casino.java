package oceansfourcasino.General_Classes;

import oceansfourcasino.Games.Game;
import oceansfourcasino.Interfaces.IExit;
import oceansfourcasino.NonCard.SlotMachine;

import java.util.ArrayList;
import java.util.Scanner;

public class Casino implements IExit{
    ArrayList<Player> players;
    ArrayList<Game> games;
    ArrayList<String> gameNames;
    SlotMachine slots;
    //   oceansfourcasino.TableGame.Baccarat baccarat;
//   oceansfourcasino.TableGame.BlackJack blackJack;
    Scanner action;
    String output;
    ArrayList<String> optionList;

    // ArrayList<>

    public Casino() {
        this.players = new ArrayList<Player>();
        action = new Scanner(System.in);
        this.games = new ArrayList<Game>();
        gameNames = new ArrayList<String>();
        this.slots = null;
        optionList = new ArrayList<String>();
    }

    public boolean playerOverEighteen(Player player) {
        if (player.getAge() >= 18) {
            players.add(player);
        }
        return false;

    }

    public String welcomeMessage(){
        return "Hello!!! Welcome to Ocean's Four Casino!!!\n🌟May the odds forever be in your favour🌟 \n\n\n"
                +
                "How many people want to enter Ocean's Four Casino?";
    }

    public void addGame(Game game){
        this.games.add(game);
    }
    public int getSize(){
        return players.size();
    }

    public ArrayList<Player> players(){
        return players;
    }

    public void exitTheGame(Scanner action) {
        String playOptions = "What you like to do next? (Please pick one option number):" +
                " 1. Replay the game." +
                " 2. Play a different game." +
                " 3. Exit the casino";
        if(action.equals("1")){ //TODO figure out how we will refer people to different games and implement that here

        }
        else if(action.equals("2")){ //TODO figure out how to take them back to list of casino games

        }
        //else { players.remove();} //TODO figure out how to obtain the player index and remove them from the list
    }

    public void chooseGame(String game){

        //TODO: make sure order is similar to the list below

        if (game.equals("1")){ //TODO call on the method that will initialize slot machine game
            slots.initializeGame();
        }
        else if (game.equals("2")){
            //TODO call on the method that will initialize the baccarat game
        }
        else {
            //TODO call on the method that will initialize the Black-Jack game
        }
    }

    //get names of the games in the casino
    public void listOfCasinoGames(){
        for(Game game: games){
            gameNames.add(game.getGameName());
        }
    }

    public int noOfGames(){
        return gameNames.size();
    }

    public String gameOptions(){
        optionList.clear();
        gameNames.clear();
        listOfCasinoGames();
        for(int i =0; i <noOfGames(); i++) {
            output = String.format("%d : %s \n", (i + 1), gameNames.get(i));
            optionList.add(output);
        }
        return "\n\n" + optionList;
    }



}
