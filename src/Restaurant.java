import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List <Dish> stravy = new ArrayList<Dish>();
    int k;
    public void addDish(Dish dish) {
        stravy.add(dish);
    };

    public int getK() {
        return k;
    }

    public List<Dish> getStravy() {
        return stravy;
    }
    public int getkilk() {
        return stravy.size();
    }
}
