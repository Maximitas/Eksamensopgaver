import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileIO file = new FileIO();

        ArrayList<Item> items = file.loadFile("Data/todo.csv");

        TodoList todo = new TodoList(items);

        todo.displayList();

    }
}