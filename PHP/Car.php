<?php

require_once('Account.php');

class Car {
  private $id;
  private $license;
  private $driver;
  private $passenger;

  public function __construct($id, $license, Account $driver, $passenger) {
    $this->id = $id;
    $this->license = $license;
    $this->driver = $driver;
    $this->passenger = $passenger;
  }
}