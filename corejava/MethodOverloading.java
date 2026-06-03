import java.util.Scanner;

public class MethodOverloading {

   
    int add(int a, int b) {
        return a + b;
    }

    
    double add(double a, double b) {
        return a + b;
    }

    
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MethodOverloading obj = new MethodOverloading();

        
        System.out.println("Enter 2 integers:");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Sum (int): " + obj.add(a1, b1));

       
        System.out.println("Enter 2 doubles:");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        System.out.println("Sum (double): " + obj.add(a2, b2));

    
        System.out.println("Enter 3 integers:");
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int c3 = sc.nextInt();
        System.out.println("Sum (3 int): " + obj.add(a3, b3, c3));

        sc.close();
    }
}