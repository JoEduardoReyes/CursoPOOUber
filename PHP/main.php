<?php

require_once('Account.php');
require_once('Car.php');

$car = new Car(1, "QW456", new Account(1,"John Doe", "QW456", "john@example.com", "1234"), 2);

var_dump($car);