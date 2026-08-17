package bookshelf;

import java.util.List;
import java.util.ArrayList;

public class Shelf {
    protected List<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>();
    }

    public List<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
