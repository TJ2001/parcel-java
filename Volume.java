import java.io.Console;

public class Volume{
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("Please enter parcel height.");
    Integer height = Integer.parseInt(myConsole.readLine());

    System.out.println("please enter parcel width.");
    Integer width = Integer.parseInt(myConsole.readLine());

    System.out.println("Please enter parcel length.");
    Integer length = Integer.parseInt(myConsole.readLine());

    System.out.println("Please enter parcel weight");
    Integer weight = Integer.parseInt(myConsole.readLine());

    Parcel inputParcel = new Parcel(height, width, length, weight);

    inputParcel.getVolume();
  }
}
