import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {
        int [] firstArray;
        firstArray = new int[5];
//
//        // Use Array accessor operator to:
//        // add data to an element
        firstArray[0] = 42;
//
//        // TODO: Assign number to every element in the array
//
        firstArray[1] = 89;
        firstArray[2] = 50;
        firstArray[3] = 43;
        firstArray[4] = 75;

        for(int i=0; i<firstArray.length ;i++){
            System.out.println(firstArray[i]);

//
//        String [] names = new String[20];
//        names[0] = "Claudia";
//        names[1] = "Colin";
//        names[2] = "Colin";
//        names[3] = "Elle";
//        names[4] = "May";
//
//        // the "for each" loop is a lot simpler
//        for(String nameElement : names){
//            System.out.println(nameElement);

//        };


        int [] smallPrimes = {2,3,5,7,11,13};
        String [] colours = {"blue", "purple","pink"};

        Arrays.sort(firstArray);
        for(int number : firstArray){
            System.out.println(number);
        }





    }


}
