import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {


    Person person;
    @Before
    public void before(){
        person = new Person("Colin", "JP2");
    }
    @Test
    public void hasName(){
        assertEquals("Colin", person.getName());
    }
    @Test
    public void hasCohort(){
        assertEquals("JP2", person.getCohort());
    }
    @Test
    public void canChangeName(){
        person.setName("Sandy");
        assertEquals("Sandy", person.getName());
    }
    @Test
    public void canChangeCohort(){
        person.setCohort("JP5");
        assertEquals("JP5", person.getCohort());
    }
    @Test
    public void canTalk(){
        assertEquals("I love Java", person.talk("Java"));
    }
}
