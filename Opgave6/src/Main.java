import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Die die = new Die(20);

        Statistics stats = new Statistics(die);

        ArrayList<Integer> result = stats.results(50);
        ArrayList<Integer> sides = new ArrayList<Integer>();


        for (int i = 0; i < die.getSides(); i++) {
            sides.add(0);
        }

        for (int i = 0; i < sides.size(); i++) {
            System.out.println("Antal " + (i+1) + "'ere: " + result.get(i));
        }


    }
}