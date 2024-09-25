import java.util.Scanner;

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of a Circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("Area of Circle of radius "+radius+" : " + area);
        sc.close();
    }
}