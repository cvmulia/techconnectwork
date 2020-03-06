package oceansfourcasino.Misc;

import oceansfourcasino.General_Classes.Casino;
import oceansfourcasino.General_Classes.Player;
import oceansfourcasino.NonCard.SlotMachine;
import oceansfourcasino.TableGame.Baccarat;
import oceansfourcasino.TableGame.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class CasinoRunner {
    public static void main(String[] args) {
        Casino casino = new Casino();
        Player player = null;
        ArrayList<Player> players = new ArrayList<Player>();
        Baccarat bacca = new Baccarat(2);
        SlotMachine slots = new SlotMachine(player);
        BlackJack blackJack = new BlackJack(4);
        casino.addGame(slots);
        casino.addGame(bacca);
        casino.addGame(blackJack);


        Scanner game = new Scanner(System.in);
        Scanner playerName = new Scanner(System.in);
        Scanner entryDetails = new Scanner(System.in);
        Scanner playerAge = new Scanner(System.in);
        Scanner playerWallet = new Scanner(System.in);
        Scanner entrant = new Scanner (System.in);


        //welcome player to casino
        System.out.println("Hello!!! Welcome to Enter Ocean's Four Casino!!!\n🌟May the odds forever be in your favour🌟 \n\n\n");


        //ask player for details
        System.out.println("How many people want to enter Ocean's Four Casino?");
        int entries = entryDetails.nextInt();

        for(int i = 0; i < entries; i++) {
            System.out.println("Please enter your name: ");
            String name = playerName.nextLine();
            System.out.println("Please enter your age: ");
            int age = playerAge.nextInt();
            System.out.println("Please tell us how much you are gambling with today: ");
            double wallet = playerWallet.nextDouble();
            player = new Player(name, age, wallet);
            casino.playerOverEighteen(player);
            players = casino.players();

            if (player.age < 18) {
                System.out.println("Sorry you need to be of legal age in order to play at Ocean's Four Casino.");
            }

            slots = new SlotMachine(player);
        }

        //Player chooses game
        for (Player gambler: players){
            System.out.println(String.format("\n\nWhich game would you like to play, %s? (Please pick one option number):" + casino.gameOptions(), gambler.name ));//display all the possible options
            int gameChoice = game.nextInt();//allows user to give input of what they want to play

            //once choice is made, ask user how many players are playing
            System.out.println("How many people would like to play this game? ");
            int gamePlayers = entrant.nextInt();

            switch(gameChoice){
                case 1:
                    if (gamePlayers <= entries) {
                        if (gameChoice == 1 && gamePlayers == slots.getMaximumNoOfPlayers()) {
                            System.out.println("\nWELCOME TO OCEAN'S 4 SLOT MACHINE!! \n");
                            System.out.println(slots.initializeGame());
                        } else {
                            System.out.println("\nSorry only one player can play Slot Machine.\n");
                        }
                        break;
                    } else {
                        System.out.println("\n Number of players cannot be more than number of guests in the casino\n");
                    }
                    continue;

                case 2:
                    if(gamePlayers <=entries) {

                        if (gameChoice == 2 && gamePlayers < bacca.getMaximumNoOfPlayers() && gamePlayers <= entries) {
                            System.out.println("\n\nWELCOME TO BA🚘🐭!!!\n\n");
                            System.out.println("House represents player and Table represents Banker.\n" +
                                    "Each participant should place bet on either Player or Banker by typing House or Table.\n\n");
                            bacca = new Baccarat(gamePlayers);

                            for (int i = 0; i < gamePlayers; i++) {
                                System.out.println("Enter player name");
                                String name = playerName.nextLine();
                                System.out.println("What age are you?");
                                int age = playerAge.nextInt();
                                System.out.println("How much would you like to bet in this game? ");
                                double wallet = playerWallet.nextDouble();
                                gambler = new Player(name, age, wallet);
                                bacca.placeBet(gambler);
                                bacca.gamblers.add(gambler);
                            }

                            bacca.initializeGame();

                        } else {
                            System.out.println("\nSorry only seven players can play oceansfourcasino.TableGame.Baccarat.\n");
                        }
                        break;
                    } else {
                        System.out.println("\n Number of players cannot be more than number of guests in the casino\n");
                    }
                        continue;
                case 3:
                    if(gamePlayers <=entries) {

                        if (gameChoice == 3 && gamePlayers < blackJack.getMaximumNoOfPlayers() && gamePlayers <= entries) {
                            System.out.println("Welcome to Black Jack! \n\n"
                                    + "RULE: Each player will be dealt 2 cards, " +
                                    "and the total point of the dealt card will be displayed right away.\n" +
                                    "Players then will be asked to take action.\n" +
                                    "If player is satisfied with the point, player can choose to pass, \n" +
                                    "but if not, player can choose deal to get an extra card." +
                                    "Player with the highest point wins, but if the point exceeds 21, player will lose." +
                                    "\n\n GOOD LUCK!!!");
                            blackJack = new BlackJack(gamePlayers);
                            for (int i = 0; i < gamePlayers; i++) {
                                System.out.println("Enter player name");
                                String name = playerName.nextLine();
                                System.out.println("What age are you?");
                                int age = playerAge.nextInt();
                                System.out.println("How much would you like to bet in this game? ");
                                double wallet = playerWallet.nextDouble();
                                player = new Player(name, age, wallet);

                                blackJack.gamblers.add(player);
                                blackJack.dealCards(player);
                            }

                            blackJack.move(player);
                            blackJack.initializeGame();


                        } else {
                            System.out.println("\nSorry only seven players can play oceansfourcasino.TableGame.Baccarat.\n");
                        }
                        break;
                    } else {
                        System.out.println("\n Number of players cannot be more than number of guests in the casino\n");
                    }
                    continue;

                default:
                    System.out.println("Please enter a valid option");
            }


            }
        }




    }




