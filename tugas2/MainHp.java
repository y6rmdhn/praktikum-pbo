package tugas2;

public class MainHp {
    public static void main(String[] args) {

        Handphone handphone = new Handphone("", "", "", 0);

        Handphone.Android android = handphone. new Android("Samsung", "Android", "Grand", 3000000, "234ibfd3840fo");
        Handphone.BlackBerry blackBerry = handphone.new BlackBerry("BlackB", "Rim", "Curve", 2000000, "BHS245");
        Handphone.WindowsPhone windowsPhone = handphone.new WindowsPhone("Nokia", "Win*", "Lumia", 1000000, "UUUQIJWORJ");


        android.displayProduct();
        System.out.println("\n");
        blackBerry.displayProduct();
        System.out.println("\n");
        windowsPhone.displayProduct();
    }
}
