public class Triathlete extends Athlete implements IRun, ISwim, ICycle{

    public void run(int distance){
         this.distanceTravelled += distance +10;
     }

     public void swim(int distance){
        this.distanceTravelled += distance;
     }

     public void cycle(int distance){
        this.distanceTravelled += distance +50;
     }

}
