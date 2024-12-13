public class Dish {
    String name;
    int price;
    String category;

    public Dish(String category, int price, String name) {
        this.category = category;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + "'" +
                "}\r\n";
    }
}
