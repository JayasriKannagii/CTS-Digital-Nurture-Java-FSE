import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a decimal number (double): ");
        double num1 = sc.nextDouble();

        
        int num2 = (int) num1;

        System.out.println("Double value = " + num1);
        System.out.println("After converting to int = " + num2);

        
        System.out.print("\nEnter an integer number: ");
        int num3 = sc.nextInt();

        double num4 = num3;

        System.out.println("Int value = " + num3);
        System.out.println("After converting to double = " + num4);

      
    }
}