import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Method method = new Method();
        System.out.println("What is your name?");

        // blocking input - aka waiting for user input on the command line
        String firstName = "";
        while (!firstName.equals("Alice")||!firstName.equals("Bob")) {
            method.InitialGreetings(firstName);

        }


    }

}
