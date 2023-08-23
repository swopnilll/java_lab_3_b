import java.util.Scanner;

public class ThreeThree {

    public static void getSolution() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the radius");

        double radius = sc.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area is " +area);

        double volume = (4/3) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume is " +volume);
    }

}
