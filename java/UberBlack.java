import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
  Map<String, ArrayList<Integer>> typeAccepted;
  ArrayList<String> SeatMaterial;

  public UberBlack(String License, Account driver, Map<String, ArrayList<Integer>> typeAccepted, ArrayList<String> SeatMaterial) {
    super(License, driver);
    this.typeAccepted = typeAccepted;
    this.SeatMaterial = SeatMaterial;
  }
}
