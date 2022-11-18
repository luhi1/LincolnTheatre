import java.util.ArrayList;

public class Theatre {
    /* Not Implemented Yet */
    private ArrayList<ArrayList<Integer>> theatreFloor = new ArrayList<ArrayList<Integer>>();
    private int dead_people = 0;
    private int lincoln_w;
    private int lincoln_l;

    public int getPeople() {
        return (this.theatreFloor.size() * (this.theatreFloor.get(theatreFloor.size() - 1).size()));
    }

    public int getDeadPeople() {
        return this.dead_people;
    }

    public Theatre(int width, int height) {
        for (int i = 0; i < width; i++) {
            ArrayList<Integer> column = new ArrayList<Integer>();
            for (int k = 0; k < height; k++) {
                column.add(0);
            }
            this.theatreFloor.add(column);
        }
        this.lincoln_w += (int) (Math.random() * (this.theatreFloor.size()));
        this.lincoln_l += (int) (Math.random() * (this.theatreFloor.get(lincoln_w).size()));
    }

    public void showTheatre() {
        for (int i = 0; i < this.theatreFloor.size(); i++) {
            for (int k = 0; k < this.theatreFloor.get(i).size(); k++) {
                System.out.print(theatreFloor.get(i).get(k));
                System.out.print("        ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    public void kill() {
        Boolean j = false;
        Boolean multiKill = false;
        int dead_w;
        int dead_l;
        while (j != true) {

            if (Math.random() > 0.25) {
                j = true;
            } else {
                multiKill = true;
            }

            dead_w = (int) (Math.random() * (this.theatreFloor.size()));
            dead_l = (int) (Math.random() * (this.theatreFloor.get(dead_w).size()));

            if (this.theatreFloor.get(dead_w).get(dead_l) == 0) {

                if (multiKill) {
                    this.theatreFloor.get(dead_w).set(dead_l, 12121212);
                } else {
                    this.theatreFloor.get(dead_w).set(dead_l, 11111111);
                }
                this.dead_people++;

                if (this.lincoln_l == dead_l && this.lincoln_w == dead_w) {
                    while (true) {
                        System.out.println("You killed lincoln! Ctrl + C to quit out");
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                }
            } else {

                j = false;
            }

        }

    }
}