package javaassignment;

import java.util.Scanner;

public class question25 {

    // Method to calculate area using Heron's formula
    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Method to calculate perimeter
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Method to check validity of triangle
    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter side a (-1 to exit): ");
            double a = sc.nextDouble();

            if (a == -1) {
                System.out.println("Bye~");
                break;
            }

            System.out.print("Enter side b: ");
            double b = sc.nextDouble();
            System.out.print("Enter side c: ");
            double c = sc.nextDouble();

            if (isValid(a, b, c)) {
                System.out.println("The triangle is valid.");
                System.out.printf("Perimeter: %.2f\n", perimeter(a, b, c));
                System.out.printf("Area: %.2f\n", area(a, b, c));
            } else {
                System.out.println("The input is invalid.");
            }
        }

       
    }
}
