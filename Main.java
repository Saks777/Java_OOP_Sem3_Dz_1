package Seminar_3_Dz_1;

public class Main {

  public static void main(String[] args) {

    HotDrink coffe = new HotDrink("coffee", 0.2, true, 60, (long) 100);
    HotDrink tea = new HotDrink("tea", 0.4, true, 80, (long) 40);
    HotDrink capuchino = new HotDrink("capuchino", 0.5, false, 50, (long) 150);
    HotDrinksVendingMachine hotDrVenMach = new HotDrinksVendingMachine();
    hotDrVenMach.addHotDrinks(coffe);
    hotDrVenMach.addHotDrinks(capuchino);
    hotDrVenMach.addHotDrinks(tea);

    System.out.println(hotDrVenMach.getHotDrinks());

    hotDrVenMach.shopHotDrinks();
  }

}
