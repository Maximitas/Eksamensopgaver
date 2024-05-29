import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        Plant tree1 = new Tree("Oak", LocalDate.of(1908, 1, 1), 10);
        Plant tree2 = new Tree("Birch", LocalDate.of(1944, 3, 10), 14);
        Plant tree3 = new Tree("RedWood", LocalDate.of(1845, 8, 18), 58);

        Plant fruittree1 = new FruitTree("AppleTree", LocalDate.of(2004, 8, 18), 6);
        Plant fruittree2 = new FruitTree("CoconutTree", LocalDate.of(2020, 4, 10), 11);

        Plant flower1 = new Flower("Rose", LocalDate.of(2023, 10, 10), "red");
        Plant flower2 = new Flower("Bose", LocalDate.of(2023, 10, 10), "red");
        Plant flower3 = new Flower("Moes", LocalDate.of(2023, 10, 10), "blue");
        Plant flower4 = new Flower("Lion Flower", LocalDate.of(2023, 10, 10), "red");

        /*fruittree1.registerYield(2.5f);
        fruittree1.registerYield(4.5f);
        fruittree1.registerYield(1.3f);

        fruittree2.registerYield(0.5f);
        fruittree2.registerYield(1.3f);
        fruittree2.registerYield(5.1f);
*/
        garden.addPlant(fruittree1);
        garden.addPlant(fruittree2);
        garden.addPlant(flower1);
        garden.addPlant(flower2);
        garden.addPlant(flower3);
        garden.addPlant(flower4);


        garden.displayFlowersOfColor("red");
        System.out.println(garden);




    }
}