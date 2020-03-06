public class Planet {
    private String name;
    private int size;
    private float gravity;
    private long distance;
    private long population;
    public double Volume;
    public Planet(String name, int size, float gravity, long distance, long population, double volume){
        this.name = name;
        this.size = size;
        this.gravity = gravity;
        this.distance = distance;
        this.population = population;
        this.Volume = volume;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSize(){
        return this.size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public float getGravity(){
        return this.gravity;
    }
    public void setGravity(float gravity){
        this.gravity = gravity;
    }
    public long getDistance(){
        return this.distance;
    }
    public void setDistance(long distance){
        this.distance = distance;
    }
    public long getPopulation(){
        return this.population;
    }
    public void setPopulation(long population){
        this.population = population;
    }
    public String planetExploded(){
        this.population = 0;
        return "exploded";
    }
    public void planetAbandoned(){
        this.population = 0;
    }
    public boolean isPlanetFull(){
        if (this.population > 1000000){
            return true;
        }
        else
            return false;
    }

    public double planetVolume(){
        return (4.0/3.0) * Math.PI * Math.pow(this.size,3);


    }
    public void setVolume(){

    }

}
