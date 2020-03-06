public class Bear {

    private String name;
    private int age;
    private double weight;


    public Bear (String nameArg, int ageArg, double weightArg){
        this.name = nameArg;
        this.age = ageArg;
        this.weight = weightArg;


    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean readyToHibernate(){
        if (this.weight>80){
            return true;
        }
        else
            return false;

    }

}
