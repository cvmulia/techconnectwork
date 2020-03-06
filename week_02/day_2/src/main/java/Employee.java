public abstract class Employee {

    private String name;
    private int NI;
    private double salary;

    public Employee(String name, int NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;

    }

    public double raiseSalary(double raise){
        return this.salary + raise;
    }

    public double payBonus(double bonus){
        return this.salary * bonus;
    }


    public String getName() {
        return name;
    }

    public int getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }
}
