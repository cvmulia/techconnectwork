import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Colin",646837, 50000.00);
    }

    @Test
    public void canGetRaise() {
        assertEquals(60000.00, databaseAdmin.raiseSalary(10000.00), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(500, databaseAdmin.payBonus(0.01), 0.0 );
    }

    @Test
    public void canGetName() {
        assertEquals("Colin", databaseAdmin.getName());
    }

    @Test
    public  void canGetNI() {
        assertEquals(646837, databaseAdmin.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.00, databaseAdmin.getSalary(), 0.0);
    }


}
