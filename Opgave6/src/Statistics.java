import java.util.ArrayList;

public class Statistics {
    Die die;

    public Statistics(Die die) {
        this.die = die;
    }

    public ArrayList<Integer> results(int dieCasts) {
        ArrayList<Integer> sides = new ArrayList<Integer>();
        ArrayList<Integer> results = new ArrayList<Integer>();

        for (int i = 0; i < die.getSides(); i++) {
            sides.add(i);
            results.add(0);
        }

            for (int i = 0; i < dieCasts; i++) {
                int dieHit = die.throwDie();
                for (int j = 0; j < sides.size(); j++) {
                    if (dieHit == sides.get(j)+1) {
                        int temp = results.get(sides.get(j));
                        temp += 1;
                        results.set(sides.get(j), temp);

                }
            }
        }
            return results;
    }
}
