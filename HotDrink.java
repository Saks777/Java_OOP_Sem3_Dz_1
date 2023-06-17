package Seminar_3_Dz_1;

public class HotDrink extends Drinks {

  int temperature;
  long price;

  public HotDrink(String drink, double volume, Boolean sugar, int temperature, Long price) {
    super(drink, volume, sugar);
    this.temperature = temperature;
    this.price = price;
  }

  public int getTemperature() {
    return temperature;
  }

  public Long getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "\n\ndrink = " + super.getDrink() + "\nvolume = " + super.getVolume() + "\nsugar = " + super.getSugar()
        + "\ntemperature = " + temperature + "\nprice = " + price;
  }

}
