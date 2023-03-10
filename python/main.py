from car import Car
from account import Account

if __name__ == "__main__":
  print("Hola Mundo")

  car = Car("1", "20230310", Account("1", "Eduado Reyes", "123456789", "eldeprueba@joedu.com", "DPOADSj@"), 1)
  print(vars(car))
  print(vars(car.driver))