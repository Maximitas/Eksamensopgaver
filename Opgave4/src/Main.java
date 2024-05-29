import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StandardPlayer spiller1 = new StandardPlayer(10, "Kim");
        StandardPlayer spiller2 = new StandardPlayer(50, "Oliver");
        StandardPlayer spiller3 = new StandardPlayer(20, "Lars");
        StandardPlayer spiller4 = new StandardPlayer(200, "Bo");
        StandardPlayer spiller5 = new StandardPlayer(75, "Ib");
        StandardPlayer spiller6 = new StandardPlayer(55, "Johan");
        StandardPlayer spiller7 = new StandardPlayer(5, "Frederik");
        StandardPlayer spiller8 = new StandardPlayer(60, "Oskar");
        StandardPlayer spiller9 = new StandardPlayer(35, "Morten");


        JuniorPlayer juniorSpiller1 = new JuniorPlayer(0, "Lukas");
        JuniorPlayer juniorSpiller2 = new JuniorPlayer(20, "Laura");
        JuniorPlayer juniorSpiller3 = new JuniorPlayer(30, "Line");

        ArrayList<Player> players = new ArrayList<>();
        players.add(spiller1);
        players.add(spiller2);
        players.add(spiller3);
        players.add(spiller4);
        players.add(spiller5);
        players.add(spiller6);
        players.add(spiller7);
        players.add(spiller8);
        players.add(spiller9);

        players.add(juniorSpiller1);
        players.add(juniorSpiller2);
        players.add(juniorSpiller3);

        Tournament tour = new Tournament(players);

        ArrayList<Player> topTen = tour.getTopTen();

        Team team = new Team(players, "Holmen");
        System.out.println(team);

        System.out.println(spiller1);

        juniorSpiller1.addPoints(30);

        System.out.println(juniorSpiller1);
        team.getPoints();
        System.out.println(team);

        System.out.println(tour.getAverage());

        System.out.println(topTen);


    }
}