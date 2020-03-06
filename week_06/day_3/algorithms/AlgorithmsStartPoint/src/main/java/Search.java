import java.util.ArrayList;

public class Search {

    public boolean linearSearch(ArrayList<Integer> array, int search_number){
        for (int number : array){
            if (number == search_number){
                return true;
            }
        }

        return false;
    }

    public boolean binarySearch(ArrayList<Integer> array, int search_number){
       if (array.size()==0){
           return false;
       }
       int midIndex = 0;
       if (array.size()>=1){
           midIndex = (int) Math.ceil ( (double) array.size()/2 ); // or u can do Math.round(array.size()/2)
       }

       int midPoint = array.get(midIndex);

       if (search_number == midPoint){
           return true;
       }

       ArrayList<Integer> newSearchArea;

       if (search_number<midPoint){
           newSearchArea = new ArrayList<>(array.subList(0,midIndex));
       } else {
           newSearchArea = new ArrayList<>((array.subList(midIndex+1,array.size())));
       }

       return binarySearch(newSearchArea,search_number);

    }


}
