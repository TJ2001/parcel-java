import java.io.Console;

public class Volume{
  public static void main(String[] args){

    Integer height = askForInputs("height");
    Integer width = askForInputs("width");
    Integer length = askForInputs("length");

    Parcel inputParcel = new Parcel(height, width, length);
    Integer dimensions = inputParcel.getVolume();

    Integer weight =  askForInputs("weight");
    Integer days = askForInputs("days till delivery: 1 day, 3 days, 5 days.");
    Integer distance = askForInputs("distance");

    ShippingDetails packageDetails = new ShippingDetails(weight, days, distance, dimensions);

    packageDetails.getCostToShip();
  }

  public static Integer askForInputs(String details) {
    Console myConsole = System.console();

    System.out.println("Please enter parcel " + details + ".");
    return Integer.parseInt(myConsole.readLine());
  }
}
