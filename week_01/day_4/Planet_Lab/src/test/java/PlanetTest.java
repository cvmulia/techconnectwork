import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    Planet dcplanet;
    @Before
    public void before(){
        dcplanet = new Planet("Java Jungle",50000,1.412f,110000000000L,5000000, );
    }
    @Test
    public void canGetName(){
        assertEquals("Java Jungle", dcplanet.getName());
    }
    @Test
    public void canSetName(){
        dcplanet.setName("Daniel");
        assertEquals("Daniel", dcplanet.getName());
    }
    @Test
    public void canGetSize(){
        assertEquals(50000, dcplanet.getSize());
    }
    @Test
    public void canSetSize(){
        dcplanet.setSize(40000);
        assertEquals(40000, dcplanet.getSize());
    }
    @Test
    public void canGetGravity(){
        assertEquals(1.412f, dcplanet.getGravity(),0.0);
    }
    @Test
    public void canSetGravity(){
        dcplanet.setGravity(12.9743f);
        assertEquals(12.9743f, dcplanet.getGravity(), 0.0);
    }
    @Test
    public void canGetDistance(){
        assertEquals(110000000000L, dcplanet.getDistance());
    }
    @Test
    public void canSetDistance(){
        dcplanet.setDistance(3L);
        assertEquals(3L, dcplanet.getDistance());
    }
    @Test
    public void canGetPopulation(){
        assertEquals(5000000, dcplanet.getPopulation());
    }
    @Test
    public void canSetPopulation(){
        dcplanet.setPopulation(5L);
        assertEquals(5L, dcplanet.getPopulation());
    }
    @Test
    public void planetExplodedSuccess(){
        assertEquals("exploded", dcplanet.planetExploded());
    }
    @Test
    public void planetHasBeenAbandoned(){
        dcplanet.planetAbandoned();
        assertEquals(0, dcplanet.getPopulation());
    }
    @Test
    public void thePlanetIsFull(){
        assertEquals(true, dcplanet.isPlanetFull());
    }

    @Test
    public void thePlanetIsNotFull(){
        Planet emptydcplanet = new Planet("Tamagotchi", 50000,1.412f,110000000000L,100);
        assertEquals(false, emptydcplanet.isPlanetFull());
    }



    public void getPlanetVolume(){
        dcplanet.planetVolume();
    }


}
