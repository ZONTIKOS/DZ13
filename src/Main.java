//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Restaurant rest1 = new Restaurant();
        Dish soup = new Dish("Суп", 50, "Закуска");
        Dish pizza = new Dish("Піца", 120, "Основна страва");
        Dish iceCream = new Dish("Морозиво", 40, "Десерт");
        rest1.addDish(soup);
        rest1.addDish(pizza);
        rest1.addDish(iceCream);
        System.out.println("Меню ресторану:");
        System.out.println(rest1.getStravy());

        Car car1 = new Car("Tesla Model S", 2020, "Tesla");
        Car car2 = new Car("Ford Mustang", 2021, "Ford");
        Car car3 = new Car("Toyota Corolla", 2022, "Toyota");

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();

        System.out.println("Загальна кількість випущених автомобілів: " + Car.getTotalCarsProduced());
    }
}