public class MarathonRunner extends Athlete implements IRun {

    public void run(int distance){
        this.distanceTravelled += distance + 10;
    }

}
