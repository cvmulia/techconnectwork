import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem01Test {


    Problem01 problem01;

    @Before
    public void setUp(){
        problem01 = new Problem01();
    }

    @Test
    public void rowOfAstrixTest01(){
        String expected = "";
        String actual = problem01.rowOfAstrix(-1);
        assertEquals(expected, actual);
    }

    @Test
    public void rowOfAstrixTest02(){
        String expected = "";
        String actual = problem01.rowOfAstrix(0);
        assertEquals(expected, actual);
    }

    @Test
    public void rowOfAstrixTest03(){
        String expected = "*";
        String actual = problem01.rowOfAstrix(1);
        assertEquals(expected, actual);
    }

    @Test
    public void rowOfAstrixTest04(){
        String expected = "**";
        String actual = problem01.rowOfAstrix(2);
        assertEquals(expected, actual);
    }

    @Test
    public void rowOfAstrixTest05(){
        String expected = "*****";
        String actual = problem01.rowOfAstrix(5);
        assertEquals(expected, actual);
    }

    @Test
    public void rowOfAstrixTest06(){
        String expected = "*******";
        String actual = problem01.rowOfAstrix(7);
        assertEquals(expected, actual);
    }
}

