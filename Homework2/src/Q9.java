import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        int Number[] = new int[2];
       Scanner in = new Scanner (System.in);
        System.out.println("Please Enter Tow Numbers...");
        System.out.print("Number One = ");
        Number[0] = in.nextInt();
        System.out.print("Number Tow = ");
        Number[1] = in.nextInt();
        System.out.println("The Sum = " + (Number[0] + Number[1]));
        System.out.println("The Difference = " + (Number[0] - Number[1]));
        System.out.println("The Product = " + (Number[0] * Number[1]));
        System.out.println("The Average = " + (((float)Number[0] - Number[1])/2));
        System.out.println("The Distance = " + (Math.abs(Number[0] - Number[1])));
        if (Number[0] > Number[1])
            System.out.println("The Maxmum = " + Number[0]);
        else
            System.out.println("The Maxmum = " + Number[1]);
        if (Number[0] < Number[1])
            System.out.println("The Minmum = " + Number[0]);
        else
            System.out.println("The Minmum = " + Number[1]);
    }
}
