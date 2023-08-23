//1. Read in the integer values of x and y from STDIN
//        2. declare a variable z assign the result of x power y to it
//        3. declare a variable called ‘result’ and assign the square-root of z to it
//        4. print out each of the above results on a new line (formatted at 2 decimal points

import java.util.Scanner;

public class ThreeTwo {

    public static void getSolution(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter x");

        int x = sc.nextInt();

        System.out.println("Please enter y");

        int y = sc.nextInt();

        double z = Math.pow(x, y);

        System.out.println("z =" +z);

        double result = Math.sqrt(z);

        System.out.println("result =" +result);
    }

}
