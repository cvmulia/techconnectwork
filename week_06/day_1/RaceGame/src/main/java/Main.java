import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> winnerAtIndex0 = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many pairs want to race?");
        int numPairs = sc.nextInt();
        sc.nextLine();

        ExecutorService executor = Executors.newFixedThreadPool(numPairs);
        String[] pairNames = new String[numPairs];

        System.out.println("Enter the names of the pairs: ");
        for(int i=0; i<numPairs; i++){
            System.out.print("Pair "+(i+1)+": ");
            pairNames[i] = sc.nextLine();
            System.out.println();
        }

        System.out.println("Who do you think is going to win? ");
        String winner = sc.nextLine();
        System.out.println("How much do you want to bet on Team "+winner);
        int betAmount = sc.nextInt();
        sc.nextLine();


        for(int i=0; i<numPairs; i++){
            executor.submit(new Synch(0, pairNames[i], winnerAtIndex0));
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.print("The winner is ");
        System.out.print("DRUM");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("ROLLS ");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print(winnerAtIndex0.get(0));
        System.out.println();
        System.out.println();

        if(winner.equals(winnerAtIndex0.get(0))){
            System.out.println("You've won "+ betAmount*2);
        }
        else{
            System.out.println("You lost the bet money!!!");
        }


    }
}
