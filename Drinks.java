package Seminar_3_Dz_1;

public class Drinks {
  private String drink;
  private double volume;
  private Boolean sugar;

  public Drinks() {
  }

  public Drinks(String drink, double volume, Boolean sugar) {
    this.drink = drink;
    this.volume = volume;
    this.sugar = sugar;

  }

  public String getDrink() {
    return drink;
  }

  public double getVolume() {
    return volume;
  }

  public Boolean getSugar() {
    return sugar;
  }

}
