public class JuniorPlayer implements Player {
    int points;
    String name;

    public JuniorPlayer(int points, String name) {
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
        points += newPoints*1.5;
    }

    @Override
    public String toString() {
        return "\nName:" + this.name + "\nPoint:" + this.points;
    }

}
