package tugas2;

public class MainVehicle {
    public static void main(String[] args) {
        System.out.println("Bicycle");
        Vehicle.Bicycle bicycle = new Vehicle().new Bicycle("Trek Bike", "7.4FX", 23);
        System.out.println("\nSkateboard");
        Vehicle.Skateboard skateboard = new Vehicle().new Skateboard("Ally Skate", "Rocket", 54.5);
    }
}
