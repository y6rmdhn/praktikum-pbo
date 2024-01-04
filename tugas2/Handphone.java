package tugas2;

/*
@author
NAMA                : Muhamad Yopan Ramadhan
KELAS               : Reguler C
NIM                 : 221106042905
Deskripsi Program   : Program untuk Menampilkan jenis jenis hp dengan menggunakan inheritor

*/

public class Handphone {
    private String manufacture;
    private String operatingSystem;
    private String model;
    private int harga;

    public Handphone(String manufacture, String operatingSystem, String model, int harga){
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct(){
        System.out.println("Manufaktur : "+manufacture);
        System.out.println("Operating System : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }


    // KELAS ANDROID
    class Android extends Handphone{
        private String keyStore;

        //constructor
        public Android (String manufacture, String operatingSystem, String model, int harga, String keyStore){
            super(manufacture, operatingSystem, model, harga);
            this.keyStore = keyStore;
        }
        public String getKeyStore(){
            return keyStore;
        }

        public void setKeyStore(String keyStore){
            this.keyStore = keyStore;
        }

        @Override public void displayProduct(){
            super.displayProduct();
            System.out.println("key store: "+keyStore);
        }

    }


    // KELAS BLACKBERRY
    class BlackBerry extends Handphone{
        private String pinBB;

        //constructor
        public BlackBerry (String manufacture, String operatingSystem, String model, int harga, String pinBB){
            super(manufacture, operatingSystem, model, harga);
            this.pinBB = pinBB;
        }

        public String getPinBB() {
            return pinBB;
        }

        public void setPinBB(String pinBB){
            this.pinBB = pinBB;
        }

        @Override public void displayProduct(){
            super.displayProduct();
            System.out.println("Pin BB: "+pinBB);
        }
    }

    class WindowsPhone extends Handphone{
        private String wpKeyStore;

        public WindowsPhone (String manufacture, String operatingSystem, String model, int harga, String wpKeyStore){
            super(manufacture, operatingSystem, model, harga);
            this.wpKeyStore = wpKeyStore;
        }

        public String getWpKeyStore(){
            return wpKeyStore;
        }

        public void setWpKeyStore(String wpKeyStore){
            this.wpKeyStore = wpKeyStore;
        }

        @Override public void displayProduct(){
            super.displayProduct();
            System.out.println("Wp Key Store: "+wpKeyStore);
        }
    }
}
