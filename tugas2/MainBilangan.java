package tugas2;

public class MainBilangan {
    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan(3,4);

        Bilangan.JumlahBilangan jumlah = bilangan.new JumlahBilangan(3, 4);
        Bilangan.SelisihBilangan selisih = bilangan. new SelisihBilangan(3, 4);

        jumlah.tampilHasilJumlah();
        selisih.tampilSelisih();
    }
}
