class Main {
  public static void main(String[] args) {
    Car car = new Car("123456789", new Account("Eduardo Reyes", "123456789"));
    car.passenger = 4;
    car.printDataCar();

    Car car2 = new Car("987654321", new Account("Eduardo Reyes", "987654321"));
    car2.passenger = 4;
    car2.printDataCar();
  }
}