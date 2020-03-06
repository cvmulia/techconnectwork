import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before() {
        employee = new Manager("Elle",646837, 30000.00, "Technology" );
    }

    @Test
    public void canGetRaise() {
        assertEquals(40000.00, employee.raiseSalary(10000.00), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(300, employee.payBonus(0.01), 0.0 );
    }

    @Test
    public void canGetName() {
        assertEquals("Elle", employee.getName());
    }

    @Test
    public  void canGetNI() {
        assertEquals(646837, employee.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.00, employee.getSalary(), 0.0);
    }

//    @Test
//    public void EmployeeAsManager(){
//        employee = new Manager ("James", 007,750000.00, "MI6");
//        Manager manager = (manager) employee.
//    }

}
