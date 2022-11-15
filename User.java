import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a width for the theatre: ");
        // String input
        int width = in.nextInt();

        System.out.println("Give me a length for the theatre: ");

        int length = in.nextInt();

        Theatre uTheatre = new Theatre(width, length);
        uTheatre.showTheatre();

        in.close();
    }
}
