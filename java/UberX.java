public class UberX extends Car {
  String brand;
  String model;

  public UberX(String License, Account driver, String brand, String model) {
    super(License, driver);
    this.brand = brand;
    this.model = model;
  }
}
