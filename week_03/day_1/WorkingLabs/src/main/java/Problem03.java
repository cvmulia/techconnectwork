import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem03 {
    public Object[] mergeArrays(Object[] input1, Object[] input2){

        Object[] joinedArray = new Object[input1.length+input2.length];
        int index = input1.length;

        for (int i = 0; i < input1.length; i++){
            joinedArray[i] = input1[i];
        }

        for (int i = 0; i<input2.length; i++){
            joinedArray[i+index] = input2 [i];
        }

        return joinedArray;


    }



}
