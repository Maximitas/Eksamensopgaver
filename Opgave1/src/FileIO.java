import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public ArrayList<Item> loadFile(String filePath) {
        ArrayList<Item> items = new ArrayList<>();
        try (Scanner scan = new Scanner(new File(filePath))) {
            scan.nextLine();

            while (scan.hasNextLine()) {
            String[] line = scan.nextLine().split(",");

            String description = line[0];
            boolean isDone = line[1].trim().equals("done");

            items.add(new Item(description, isDone));

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return items;
    }

}
