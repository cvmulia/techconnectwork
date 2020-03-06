public class SeniorInstructor extends Instructor {

    private int budget;

    public SeniorInstructor(String name, String cohort, String moduleTeam, int budget){
        super(name, cohort, moduleTeam);
        this.budget = budget;
    }

}
