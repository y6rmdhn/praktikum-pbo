package tugas2;

public class MainKoordinat {
    public static void main(String[] args) {
        Kordinat kordinat = new Kordinat(0, 0);
        Kordinat.WarnaKoordinat warna = kordinat. new WarnaKoordinat(10,4,"Jingga");

        System.out.println("Warna Koordinat : "+ warna.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+kordinat.getX()+", y : "+kordinat.getY());
    }
}
