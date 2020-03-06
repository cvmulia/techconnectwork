import java.util.ArrayList;

public class Beruang {
    private String name;
    private ArrayList <Salmon> belly;

    // Constructor
    public Beruang(String name){
        this.name = name;
        this.belly = new ArrayList<Salmon>();
    }

     public int BellySize(){
            return this.belly.size();
     }


    // TODO: method that takes Salmon object and adds to the belly array
    public void eat(Salmon salmon){
            this.belly.add(salmon);
    }

    // TODO: write sleep method which:
    // clear the bears belly array
    public void sleep(){
            this.belly.clear();
    }

    //TODO: method to eat fish
    // get river object and then get fish from river
    public void eatFishFromRiver(River river){

            // get the fish from the river
        Salmon caughtSalmon = river.removeSalmon();
            // we should now have a fish
            // add the fish to the bear belly
        this.eat(caughtSalmon);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
