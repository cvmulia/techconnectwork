import java.util.HashMap;

public class Countries {

    public static void main(String[] args) {


        /*
        uk: 66.44 million
france: 66.99 million
germany: 82.79 million
china: 1.386 billion
iceland: 362,860
Create a hashmap with the above details✅
add the population of another country of your choice✅
remove france✅
total the populations of the remaining countries
         */
        HashMap<String, Integer> population = new HashMap<String, Integer>();
        population.put("UK",66440000);
        population.put("France",82790000);
        population.put("China",1386000000);
        population.put("Iceland",362860);
        population.put("Indonesia",260626000);

        System.out.println(population);

        population.remove("France");
        System.out.println("After the removal: ");
        System.out.println(population);

        double sum = 0;

        for (double value : population.values()){
            sum += value;
        }
        System.out.println("Total population: " + sum);
        System.out.println(population.containsKey("France"));
        System.out.println(population.values());




    }

}
