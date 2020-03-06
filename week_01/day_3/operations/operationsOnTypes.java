import java.math.*;

public class operationsOnTypes {

  public static void main(String[] args) {

    // The operator is promoted to double here

    double age =18 + 1;

    // int days = 135 / 45;
    // int myNumber = 6 + 7 + 8 + 9 - 10;

     // int modResult = 67 % 10;
     // System.out.println(modResult);
    // double y = Math.sqrt(4);
    // System.out.println(y);
//
// int n = 123456;
// double f = n;
//  System.out.println(f);

// double x = 9.997;
// int nx = x;
// unable to transform

// Cast operation
// double x = 9.997;
// int nx = (int) x;
//  System.out.println(nx);

 // careful u may lose data or precision.
 // u can rather do this

 // double x = 9.49; // round to 10 for 9.5
 // int nx = (int) Math.round(x);
 //  System.out.println(nx);

// increment operator
// int n = 12;
//  System.out.println(n);
// n = n + 1; // or
//  System.out.println(n);
// n++;
//  System.out.println(n);

 // decrement operator n--
 // personalised increment n+=
 // Boolean Operator

 // if (8==8){
 //    System.out.println("yaayy 8 is 8 !! 🍕");

// int num = (4 + 5) * 8;
//  System.out.println(num);
//
// String greetingString = "Hellooooooooo";
// greetingString = greetingString + ", beautiful";
//
//  System.out.println(greetingString);

// String name = "Colin";
// String otherName = "colin";
//
// //if (name == otherName) {} // incorrect
// if (name.equalsIgnoreCase(otherName)){
//    System.out.println("the names match!!!!");
// }
// else {
//    System.out.println("they dont match 😢");
// }

      String foodType = "taco";
      System.out.println(foodType);
      // how do I know if the food type is empty?

      if (foodType.length() == 0){
        System.out.println("Food type has no value");
      }

      else if  (foodType.length() == 5){
        System.out.println("it's 🍕");
      }
      else {
        System.out.println("🌮");
      }
  }



}
