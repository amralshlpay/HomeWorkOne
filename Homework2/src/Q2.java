import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double 	Radius, Area, pi = 3.14159;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter The Radius: ");
        Radius = in.nextDouble();

        Area = pi * (Radius * Radius);
        System.out.println("The Area is = " + Area);

        System.out.println("Circumference Of A Circle = " + (2 *  pi * Radius));
    }
}
