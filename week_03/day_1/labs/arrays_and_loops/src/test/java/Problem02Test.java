import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {

    Problem02 problem02;

    @Before
    public void setUp(){
        problem02 = new Problem02();
    }

    @Test
    public void generateAstrixTriangleTest01(){
        String expected = "";
        String actual = problem02.generateAstrixTriangle(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateAstrixTriangleTest02(){
        String expected = "*\n";
        String actual = problem02.generateAstrixTriangle(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateAstrixTriangleTest03(){
        String expected = "*\n**\n***\n";
        String actual = problem02.generateAstrixTriangle(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateAstrixTriangleTest04(){
        String expected = "*\n**\n***\n****\n*****\n******\n*******\n";
        String actual = problem02.generateAstrixTriangle(7);
        Assert.assertEquals(expected, actual);
    }
}

