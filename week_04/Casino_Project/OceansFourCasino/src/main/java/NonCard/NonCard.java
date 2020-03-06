package NonCard;

import Games.Game;
import General_Classes.Player;
import Interfaces.ICompare;

import java.util.ArrayList;
import java.util.HashMap;


public abstract class NonCard<Z> extends Game implements ICompare {

    ArrayList<Z> options;



    public NonCard(String gameName, int maximumNoOfPlayers) {
        super(gameName, maximumNoOfPlayers);
        options = new ArrayList<Z>();


    }


    public boolean compareItems(Object compare) { //Override in slotMachine to compare the result and the expected outcome
        //TODO match this method to what we have in SlotMachine as SlotMachine is supposed to override this method
       for(Z option: options){
            if(compare.equals(option)){
                return true;
            }

       }return false;
    }




    }

