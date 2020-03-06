import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner inputScanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//
//        // blocking input - aka waiting for user input on the command line
//        String firstName = inputScanner.nextLine();
//
//        System.out.println("Hello "+firstName);
//
//        System.out.println("How are you feeling today?");
//
//        String feelings = inputScanner.nextLine();
//
//        System.out.println("Wanna talk about it?");


    }

    public void writeStringToFile(String input){
        PrintWriter out = null;
        try {
            out = new PrintWriter("myfile.txt","UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        out.write("I am being written to the file - I hope");
        out.close();

    }
    public String readStringFromFile(){
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner (Paths.get("myfile.txt"),"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }


        String foundDataInFile = fileScanner.nextLine();
        return foundDataInFile;
    }


}
