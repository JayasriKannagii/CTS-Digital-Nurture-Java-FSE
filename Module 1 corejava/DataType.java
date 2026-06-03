import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        
        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        
        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);

        
        System.out.print("Enter pass (true/false): ");
        boolean pass = sc.nextBoolean();

        
        System.out.println("\n--- OUTPUT ---");
        System.out.println("Age = " + age);
        System.out.println("Height = " + height);
        System.out.println("Salary = " + salary);
        System.out.println("Grade = " + grade);
        System.out.println("Pass = " + pass);

        sc.close();
    }
}