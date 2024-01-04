package tugas3;
import java.text.DecimalFormat;

public abstract class Kerucut {
    abstract double hitungVolumeKerucut();
}

    class VolumeKerucut extends Kerucut{
        private double jariJari;
        private double tinggi;

        public VolumeKerucut(double jariJari, double tinggi){
            this.jariJari = jariJari;
            this.tinggi = tinggi;
        }

        @Override
        double hitungVolumeKerucut() {
            return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
        }

        public static void main(String[] args) {
            VolumeKerucut kerucut = new VolumeKerucut(14, 9);
            double hasil = kerucut.hitungVolumeKerucut();

            DecimalFormat df = new DecimalFormat("#");
            String formattedHasil = df.format(hasil);

            System.out.println("Hasil V = "+formattedHasil+" cm^3");
        }
    }
