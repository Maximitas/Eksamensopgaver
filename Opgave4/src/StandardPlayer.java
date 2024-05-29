public class StandardPlayer implements Player {
    int points;
    String name;

    public StandardPlayer(int points, String name) {
        this.points = points;
        this.name = name;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addPoints(int newPoints) {
        points += newPoints;

    }


    @Override
    public String toString() {
        return "\nName:" + this.name + "\nPoint:" + this.points;
    }
}
