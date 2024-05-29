import java.util.ArrayList;
import java.util.Collections;

public class Tournament {
    ArrayList<Player> players;

    public Tournament(ArrayList<Player> players) {
        this.players = players;

    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < players.size(); i++) {
            sum += players.get(i).getPoints();
        }
        return sum / players.size();
    }

    public ArrayList<Player> getTopTen() {
        ArrayList<Player> topTen = new ArrayList<>();
        for (int i = 0; i < players.size(); i++) {
            for (int j = 0; j < players.size(); j++) {

            if (players.get(i).getPoints() > players.get(j).getPoints()) {
                Collections.swap(players, i, j);
            }
        }
        }
        for (int i = 0; i < 10; i++) {
            topTen.add(players.get(i));
        }
       return topTen;
    }

}
