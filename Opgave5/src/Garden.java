import java.util.ArrayList;

public class Garden {
    private ArrayList<Plant> plants = new ArrayList<>();


    public void addPlant(Plant p){
        plants.add(p);
    }

    public float getTotalYield() {
        float total = 0;

        for (Plant p : plants) {
            if (p instanceof FruitTree) {

                FruitTree fruit = (FruitTree) p;
                total += fruit.getAverageYield();
            }
        }
        System.out.println("The total yield is " + total);
        return total;
    }
    public void displayFlowersOfColor(String colour) {
        System.out.println("The flowers of the colour " + colour + " are:");
        for (Plant p : plants) {
            if (p instanceof Flower) {
                Flower flower = (Flower) p;
                if (flower.getColour().equals(colour)) {
                    System.out.println("Flower:" + flower.getSpecies() + " planted on " + flower.getDatePlanted());
                }
            }
        }
    }

    public int getTreesHigherThan(float meter) {
        int height = 0;
        return height;
    }

    public Plant getOldestPlant() {
        return plants.get(0);
    }

}
