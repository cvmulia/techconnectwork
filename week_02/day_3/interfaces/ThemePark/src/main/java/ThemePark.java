import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allReviewed;

    public ThemePark (ArrayList<IReviewed> allReviewed) {
        this.allReviewed = allReviewed;
    }

    //TODO: Write getAllReviewed

    public ArrayList<IReviewed> getAllReviewed(){

        for (IReviewed activity:allReviewed){
            if (activity.getRating()>0){

            }
        }
        return this.allReviewed;
    }


}
