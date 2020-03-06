import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Colin",646837, 50000.00);
    }

    @Test
    public void canGetRaise() {
        assertEquals(60000.00, developer.raiseSalary(10000.00), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(500, developer.payBonus(0.01), 0.0 );
    }

    @Test
    public void canGetName() {
        assertEquals("Colin", developer.getName());
    }

    @Test
    public  void canGetNI() {
        assertEquals(646837, developer.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.00, developer.getSalary(), 0.0);
    }


}
