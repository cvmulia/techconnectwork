import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Colin",646837, 50000.00, "Technology" );
    }

    @Test
    public void canGetRaise() {
        assertEquals(60000.00, manager.raiseSalary(10000.00), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(500, manager.payBonus(0.01), 0.0 );
    }

    @Test
    public void canGetName() {
        assertEquals("Colin", manager.getName());
    }

    @Test
    public  void canGetNI() {
        assertEquals(646837, manager.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Technology", manager.getDeptName());
    }
}
