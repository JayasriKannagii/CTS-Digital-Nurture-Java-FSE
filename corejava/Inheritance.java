import java.util.Scanner;

class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println("Enter 1 for Animal or 2 for Dog:");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal.makeSound();
        } else if (choice == 2) {
            dog.makeSound();
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}