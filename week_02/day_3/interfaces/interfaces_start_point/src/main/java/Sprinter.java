public class Sprinter extends  Athlete implements IRun {

    public void run(int distance){
        this.distanceTravelled += distance + 2;
    }

}
