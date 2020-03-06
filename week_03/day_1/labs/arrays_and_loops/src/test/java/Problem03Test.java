import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem03Test {

    Problem03 problem03;

    @Before
    public void setUp(){
        problem03 = new Problem03();
    }

    @Test
    public void mergeArraysTest01(){
        Object[] expected = {1,2,3,4,5,6,7,8,9};
        Object[] array1 = {1,2,3,4};
        Object[] array2 = {5,6,7,8,9};
        Object[] actual = problem03.mergeArrays(array1, array2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeArraysTest02(){
        Object[] expected = {3,4,5,6,7,8,9};
        Object[] array1 = {3,4};
        Object[] array2 = {5,6,7,8,9};
        Object[] actual = problem03.mergeArrays(array1, array2);
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void mergeArraysTest03(){
        Object[] expected = {1,2,5,6,7,8,9};
        Object[] array1 = {1,2};
        Object[] array2 = {5,6,7,8,9};
        Object[] actual = problem03.mergeArrays(array1, array2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeArraysTest04(){
        Object[] expected = {1,2,3,4,5,6,7};
        Object[] array1 = {1,2,3,4};
        Object[] array2 = {5,6,7};
        Object[] actual = problem03.mergeArrays(array1, array2);
        Assert.assertArrayEquals(expected, actual);
    }
}
