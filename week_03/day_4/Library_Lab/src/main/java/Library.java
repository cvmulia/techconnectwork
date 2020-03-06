import java.util.ArrayList;

public class Library<Z> {

    private ArrayList<Z> items;


    public Library (){
        this.items = new ArrayList<Z>();
    }

    public void addToLibrary(Z item){ // addItem method - built in
        this.items.add(item);
    }

    public int librarySize(){ // countItem method - built in
        return this.items.size();
    }

    public int trackItemGenre(Genre genreToCheck){
        int y = 0;
        for(Z item : items ){
            for (Genre genre: Genre.values()) {
                if (genreToCheck.equals(genre)) {
                    y++;
                }
            }
        }
        return y;
    }
    //HashMap<Book>


}
