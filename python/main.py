from car import Car

if __name__ == "__main__":
  print("Hola Mundo")

  car = Car()
  car.license = "123456789"
  car.driver = "Eduardo Reyes"
  print(vars(car))

  car2 = Car()
  car2.license = "ABCDEFGHI"
  car2.driver = "Fabiola Reyes"
  print(vars(car2))