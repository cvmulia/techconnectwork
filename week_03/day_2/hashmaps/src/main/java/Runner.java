import java.util.HashMap;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {

        HashMap<String, String> meals = new HashMap<String, String>();
        meals.put("Breakfast", "cereal"); // adding sth to hash map
        meals.put("lunch","sandwich");
        meals.put("dinner","lasagna");
        meals.put("Snack","Fruit");



        Set<String> keys = meals.keySet();

        for(String key:keys){
            System.out.println(meals.get(key));
        }



    }

}
