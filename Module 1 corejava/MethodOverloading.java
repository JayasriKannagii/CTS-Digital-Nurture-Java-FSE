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

        MethodOverloading obj = new MethodOverloading();

        // Calling methods
        System.out.println("Sum of 2 integers: " + obj.add(10, 20));
        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 2.3));
        System.out.println("Sum of 3 integers: " + obj.add(1, 2, 3));
    }
}