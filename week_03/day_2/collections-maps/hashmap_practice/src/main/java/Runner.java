import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {

//        HashMap<String, String> meals = new HashMap<String, String>();
//
//        meals.put("breakfast", "cereal");
//        meals.put("lunch", "sandwich");
//        meals.put("dinner", "lasagna");
//        meals.put("snack", "fruit");

//        Set<String> keys = meals.keySet();
//
//        for ( String key : keys) {
//            System.out.println(meals.get(key));
//        }

//        meals.clear();

//        System.out.println(meals.isEmpty());

        HashMap<String, Double> populations = new HashMap<String, Double>();

        populations.put("uk", 66.44);
        populations.put("france", 66.99);
        populations.put("germany", 82.79);
        populations.put("china", 1386.0);
        populations.put("iceland", 0.362860);

        populations.put("barbados", 0.288513);

        populations.remove("france");

        double total = 0.0;

        Collection<Double> values =  populations.values();

        for ( double population : values) {
            total += population;
        }

        System.out.println("total population: " + total);


    }

}
