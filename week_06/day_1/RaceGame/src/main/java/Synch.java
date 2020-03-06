import java.util.ArrayList;

public class Synch implements Runnable{

    private int meters;
    private String pairName;
    private ArrayList<String> winnerAtIndex0;

    public Synch(int meters, String pairName, ArrayList<String> winnerAtIndex0) {
        this.meters = meters;
        this.pairName = pairName;
        this.winnerAtIndex0 = winnerAtIndex0;
    }

    public int getMeters() {
        return meters;
    }

    public String getPairName() {
        return pairName;
    }

    public void run() {
        System.out.println("Team " + getPairName() + " has started the race");

        while(meters<100){
            try {
                Thread.sleep((int)Math.random()*((500-450)+1)+450);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            distanceIncrement();
            System.out.println("Team " + getPairName()+" has reached "+getMeters()+" meters");

        }

        winnerAtIndex0.add(getPairName());

    }

    public synchronized void distanceIncrement(){
        this.meters += 10;
    }
}
