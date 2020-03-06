import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AccountTest {

    Account<Integer> account1;
    Account<String> account2;


    @Before
    public void before(){
        account1 = new Account<Integer>(1234,"Claudia");
        account2 = new Account<String>("S1501812","Mulia");
    }



    @Test
    public void canGetIntegerId(){
        Integer id = 1234; // getId will return a box integer
        assertEquals(id,account1.getId());
    }


    @Test
    public void canGetStringId(){
        String id ="S1501812";
        assertEquals("S1501812",account2.getId());
    }

}
