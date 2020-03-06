import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Mike", 57848, 100000.00, "Markets", 250000.00);
    }

    @Test
    public void canGetRaise() {
        assertEquals(110000.00, director.raiseSalary(10000.00), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1000.00, director.payBonus(0.01), 0.0 );
    }

    @Test
    public void canGetName() {
        assertEquals("Mike", director.getName());
    }

    @Test
    public  void canGetNI() {
        assertEquals(57848, director.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Markets", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(250000.00, director.getBudget(),0.0);
    }
}
