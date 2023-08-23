//Please enter a string: type your input here
//        2. First character: display first character of the string
//        3. Last character: display last character of the string
//        4. Lower-case string: convert and display the string in lower-case
//        5. String length: display the length of the string

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThreeFive {


    public static void getSolution(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string");

        String userInputString = sc.nextLine();





        System.out.println("Displaying the first character: " +userInputString.charAt(0));

        System.out.println("Displaying the last character: " +userInputString.charAt(userInputString.length() - 1));

        System.out.println("Lower case: " +userInputString.toLowerCase());

        System.out.println("String Length: " +userInputString.length());



    }

}
