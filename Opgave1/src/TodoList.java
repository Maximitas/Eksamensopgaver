import java.util.ArrayList;

public class TodoList {
    ArrayList<Item> items;

    public TodoList(ArrayList<Item> items) {
        this.items = items;
    }

    public void displayList() {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);

            System.out.println(item.getDescription() + ", " + item.getIsDone());
        }
    }
}
