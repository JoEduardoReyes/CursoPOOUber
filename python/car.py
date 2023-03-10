from account import Account
class Car:
  id = int
  license = str
  driver = Account("","","","", "")
  passanger = int

  def __init__(self, id, license, driver, passanger):
    self.id = id
    self.license = license
    self.driver = driver
    self.passanger = passanger