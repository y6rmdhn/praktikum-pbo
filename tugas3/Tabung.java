package tugas3;
import java.text.DecimalFormat;
public abstract class Tabung {
    abstract double hitungVolumeTabung();
}

class  VolumeTabung extends Tabung{
    private double jariJari;
    private double tinggi;

    public VolumeTabung(double jariJari, double tinggi){
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolumeTabung() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public static void main(String[] args) {
        VolumeTabung tabung = new VolumeTabung(10, 21);
        double hasil = tabung.hitungVolumeTabung();

        DecimalFormat df = new DecimalFormat("#");
        String formattedHasil = df.format(hasil);
        System.out.println("Hasil V = "+formattedHasil+" cm^3");
    }
}

