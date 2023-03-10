<?php

require_once('car.php');

class UberVan extends Car {
  private $typeAccepted;
  private $seatMaterial;

  public function __construct($license, $driver, $typeAccepted, $seatMaterial) {
    parent::__construct($license, $driver);
    $this->typeAccepted = $typeAccepted;
    $this->seatMaterial = $seatMaterial;
  }
}