import java.util.ArrayList;

public class Theatre {
    /* Not Implemented Yet */
    private ArrayList<ArrayList<Integer>> theatreFloor = new ArrayList<ArrayList<Integer>>();

    public Theatre(int width, int height) {
        for (int i = 0; i < width; i++) {
            ArrayList<Integer> column = new ArrayList<Integer>();
            for (int k = 0; k < height; k++) {
                column.add(0);
            }
            this.theatreFloor.add(column);
        }
    }

    public void showTheatre() {
        for (int i = 0; i < this.theatreFloor.size(); i++) {
            for (int k = 0; k < this.theatreFloor.get(i).size(); k++) {
                System.out.print(0);
                System.out.print("        ");
            }
            System.out.println();
        }
    }

    public void kill() {
        Integer[] dead = (Math.random() * (this.theatreFloor.size() - 1));
    }
}
