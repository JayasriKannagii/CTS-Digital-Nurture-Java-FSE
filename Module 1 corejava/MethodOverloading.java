import java.util.Scanner;

public class MethodOverloading {

    // 1. Two integers
    int add(int a, int b) {
        return a + b;
    }

    // 2. Two doubles
    double add(double a, double b) {
        return a + b;
    }

    // 3. Three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MethodOverloading obj = new MethodOverloading();

        // Input for 2 integers
        System.out.println("Enter 2 integers:");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Sum of 2 integers: " + obj.add(a1, b1));

        // Input for 2 doubles
        System.out.println("Enter 2 doubles:");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        System.out.println("Sum of 2 doubles: " + obj.add(a2, b2));

        // Input for 3 integers
        System.out.println("Enter 3 integers:");
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int c3 = sc.nextInt();
        System.out.println("Sum of 3 integers: " + obj.add(a3, b3, c3));

        sc.close();
    }
}