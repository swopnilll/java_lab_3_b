//1. Please enter the x1 coordinate of point A: 1.0
//        2. Please enter the y1 coordinate of point A: 2.0
//        3. Please enter the x2 coordinate of point B: 3.0
//        4. Please enter the y2 coordinate of point B: 4.0
//        5. The distance between A(x1,y1) and B(x2,y2) is distance

import java.util.Scanner;

public class ThreeFour {
        public static void getSolution() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter y1");
            double y1 = sc.nextDouble();

            System.out.println("Please enter x1");
            double x1 = sc.nextDouble();

            System.out.println("Please enter x2");
            double x2 = sc.nextDouble();

            System.out.println("Please enter y2");
            double y2 = sc.nextDouble();

            double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            System.out.println("result = " + String.format("%.3f", result));
        }
}
