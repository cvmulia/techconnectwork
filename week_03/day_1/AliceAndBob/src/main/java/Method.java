import java.util.Scanner;

public class Method {

    Scanner inputScanner = new Scanner(System.in);
    public void InitialGreetings(String firstName){
        firstName = inputScanner.nextLine();

        if (firstName.equalsIgnoreCase("Alice") || firstName.equalsIgnoreCase("Bob")) {
            System.out.println("Hello " + firstName);
            System.out.println("How are you feeling today?");
            String feelings = inputScanner.nextLine();
            System.out.println("Good to hear that you are feeling "+ feelings + "!");

        } else {
            System.out.println("Sorry, wrong name. Try again!");

        }

    }

}
