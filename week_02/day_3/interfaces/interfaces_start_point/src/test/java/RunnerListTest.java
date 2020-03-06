import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class RunnerListTest {


    @Test
    public void polyWithoutInterfaces(){

        // We can create an array list for the abstract type
        ArrayList<Athlete> runners = new ArrayList<>();
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        Triathlete triathlete = new Triathlete();

        // We can add any type that inherits that to it
        runners.add(runner1);
        runners.add(runner2);
        runners.add(triathlete);

        /* We can loop over and call the run action
        BUT!!! when calling the run action, there's no guarantee
        that the object even has a run method
         */
        for(Athlete athlete : runners){
            Runner runner = (Runner) athlete; // Casting
            runner.run(10);
        }
    }

    @Test
    public void polyWithInterfaces(){

        // We can create an Array List for the IRun type
        // We can add Runners and Triathletes as they're both the IRun type
        ArrayList<IRun> runners = new ArrayList<>();
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        Triathlete triathlete = new Triathlete();

        // We can add any type that inherits that to it
        runners.add(runner1);
        runners.add(runner2);
        runners.add(triathlete);

        // LOOP OVER and call for action,
        // with the guarantee that the object will have the run method
        for(IRun runner : runners){
            runner.run(10);
        }
    }

}
