public class Student extends Person{

    public Student(String name, String cohort) {
     super(name, cohort);
    }

    @Override  //just an info
    public String talk(String language){
        return "I LOVE LEARNING " + language;
    }

}
