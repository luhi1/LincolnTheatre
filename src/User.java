import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner in = new Scanner(System.in);
        System.out.println("Give me a width for the theatre: ");
        // String input
        int width = in.nextInt();

        System.out.println("Give me a length for the theatre: ");

        int length = in.nextInt();

        Theatre uTheatre = new Theatre(width, length);

        String uInput = in.nextLine();
        int dead_people = uTheatre.getDeadPeople();
        int max_people = uTheatre.getPeople();

        do {
            dead_people = uTheatre.getDeadPeople();
            max_people = uTheatre.getPeople();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            uTheatre.showTheatre();
            System.out.println("Kill someone or quit: ");
            uInput = in.nextLine();
            if ((uInput.contentEquals("kill")) && (dead_people < max_people)) {
                uTheatre.kill();
                dead_people++;
            } else if (!uInput.contentEquals("q")) {
                for (int i = 0; i < 2000; i++) {
                    System.out.println("They might be dead or you need to type something else: ");
                }
            }
        } while (!uInput.contentEquals("q"));

        in.close();
    }
}
