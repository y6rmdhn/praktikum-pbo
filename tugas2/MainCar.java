package tugas2;

public class MainCar {
    public static void main(String[] args) {
        SUV suv = new SUV("Fortuner", "Hybrid", "Item", 2678349013L, 4);
        suv.displayInfo();
        suv.start();
        suv.stop();
    }
}
