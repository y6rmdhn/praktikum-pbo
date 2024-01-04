package tgs;

public class Kubus {
    // Atribut
    private int sisi;
    private int massa;

    // Konstruktor
    public Kubus(int sisi, int massa) {
        this.sisi = sisi;
        this.massa = massa;
    }

    // Method untuk mendapatkan nilai sisi
    public int getSisi() {
        return sisi;
    }

    // Method untuk mengatur nilai sisi
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    // Method untuk mendapatkan nilai massa
    public int getMassa() {
        return massa;
    }

    // Method untuk mengatur nilai massa
    public void setMassa(int massa) {
        this.massa = massa;
    }

    // Method untuk menghitung volume kubus
    public int hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Method untuk menghitung massa jenis
    public double hitungMassaJenis() {
        int volume = hitungVolume();
        if (volume != 0) {
            return (double) massa / volume;
        } else {
            return 0.0;
        }
    }

    public void tampilkanInfoKubus() {
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : " + sisi);
        System.out.println("Massa : " + massa);
        System.out.println("");
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + hitungVolume());
        System.out.println("Massa Jenis : " + hitungMassaJenis());
    }

    public static void main(String[] args) {
        // Membuat objek Kubus dengan sisi=5 dan massa=250
        Kubus kubus = new Kubus(5, 250);

        // Menampilkan informasi kubus
        kubus.tampilkanInfoKubus();
    }
}
