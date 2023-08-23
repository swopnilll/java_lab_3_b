import java.util.Scanner;

public class ThreeOne {

    public static  void getSolution(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a variable for x");
        double x = sc.nextDouble();

        System.out.println("Enter a variable for y");
        double y = sc.nextDouble();

        System.out.println("You have entered x = " +x);
        System.out.println("You have entered y = " +y);

        System.out.println("x + y = " +(x + y));
        System.out.println("x - y = " +(x - y));
        System.out.println("x / y = " +((x / y)));
        System.out.println("x * y = " +((x * y)));

        System.out.println("x % y + x/y = " +(x % y + x/y ));

        double result = (Math.pow(y, 7) + 7 / (Math.sqrt(5) + x)) *  (Math.pow(x, 4) % 5 + 2);

        System.out.println("Result of (y7 + 7/(√5 +x)) * (x4 % 5 + 2) = " + result);
    }

}
