import java.util.ArrayList;

public class River {
    private ArrayList<Salmon> fish;
    public River(){
        this.fish = new ArrayList<Salmon>();
    }

    //TODO:: Method to get number of fish in river
    public int fishCount(){
        this.fish.size();
            return this.fish.size();

    } // to check if salmon has been added

    //TODO:: Method which adds Salmon to River

    public void addSalmon(Salmon salmon){
        this.fish.add(salmon);

    }

    //TODO:: Method which removes Salmon from River
    public Salmon removeSalmon(){
        return this.fish.remove(0);
    }
}
