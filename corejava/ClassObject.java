import java.util.Scanner;

public class ClassObject {

    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ClassObject car1 = new ClassObject();

        System.out.print("Enter Car Make: ");
        car1.make = sc.nextLine();

        System.out.print("Enter Car Model: ");
        car1.model = sc.nextLine();

        System.out.print("Enter Car Year: ");
        car1.year = sc.nextInt();

        System.out.println("\nCar Details:");
        car1.displayDetails();

        sc.close();
    }
}