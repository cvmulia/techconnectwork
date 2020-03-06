package General_Classes;

import java.util.ArrayList;

public class Player {
    public double wallet;
    public String name;
    public int age;
    public ArrayList<Card> hand;
    public String type;
    public double winnings;
    public double losses;
    public int points;


    public Player(String name, int age, Double wallet) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.hand = new ArrayList<Card>();
        this.wallet = wallet;
        this.winnings = 0.0; // TODO figure out how to constantly change this value
        this.losses = 0.0; //TODO figure out how to constantly change this value depending on game
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void cardCount(){
        this.hand.size();
    }

    public String showCard(int index){
        return this.hand.get(index).cardName();
    }

    public void takeCard(Card card){

        this.hand.add(card);
    }

    public int handTotal() {
        int total = 0;
        for (Card card : this.hand) {
            total += card.getValueFromEnum();
        }
        return total;
    }

    public void setWallet(double wallet) {

        this.wallet = wallet;
    }

    public double getWallet() {
        return this.wallet;
    }

    //add a method to add money to the wallet
    public void addMoneyToWallet(double winnings ){
        setWallet(this.wallet += winnings);

    }

    //add a method to remove money to the wallet
    public void removeMoneyFromWallet(double losses){
        setWallet(this.wallet -= losses);
    }

    public String getType() {

        return this.type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
