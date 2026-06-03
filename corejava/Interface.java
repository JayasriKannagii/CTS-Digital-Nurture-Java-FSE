import java.util.Scanner;

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano");
    }
}

public class Interface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Guitar or Piano: ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Guitar")) {
            Guitar g = new Guitar();
            g.play();
        } else if (choice.equalsIgnoreCase("Piano")) {
            Piano p = new Piano();
            p.play();
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}