import java.util.Scanner;

public class Lab2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        double f = sc.nextInt();   // in lab will use integer
        double c = (5/9) * (f - 32);
        System.out.println("Fahrenheit to Celsius: "+c);
        sc.close();
    }
}