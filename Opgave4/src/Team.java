import java.util.ArrayList;

public class Team {
    ArrayList<Player> players;
    String teamName;


    public Team(ArrayList<Player> players, String teamName) {
        this.players = players;
        this.teamName = teamName;
    }

    public String getName() {
        return teamName;
    }

    public void addTeamPoints(int newPoints) {
        newPoints = newPoints / players.size();
        for (int i = 0; i < players.size(); i++) {
            players.get(i).addPoints(newPoints);
        }
    }

    public int getPoints() {
        int points = 0;
        for (int i = 0; i < players.size(); i++) {
            points += players.get(i).getPoints();
        }
        return points;
    }

    @Override
    public String toString() {
        return "\nName: " + teamName + "\nPoints: " + getPoints();
    }

}
