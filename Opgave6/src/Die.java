import java.util.Random;

public class Die {
    private int sides;


    public Die (int sides) {
        this.sides = sides;
    }

    public int throwDie() {
        Random rand = new Random();
        return rand.nextInt(sides)+1;
    }

    public int getSides() {
        return sides;
    }

}
