package tugas2;

public class MainBarangAntik {
    public static void main(String[] args) {
        BarangAntik barangAntik = new BarangAntik(0);

        BarangAntik.Radio radio = barangAntik.new Radio(10, "Radio");
        radio.tampilUmur();
    }
}
