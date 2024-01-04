package tutorial;
import java.text.DecimalFormat;

public abstract class BangunRuangKerucut {
    abstract double hitungVolume(); //method
}

class Kerucut extends BangunRuangKerucut{
    private double tinggi;
    private double jariJari;

    //constructor
    public Kerucut(double tinggi, double jariJari){
        this.tinggi = tinggi;
        this.jariJari = jariJari;
    }

    @Override double hitungVolume(){
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public static void main(String[] args) {
        Kerucut hitungVolumKerucut = new Kerucut(9, 14);
        hitungVolumKerucut.hitungVolume();

        DecimalFormat df = new DecimalFormat("#");
        String formattedHasil = df.format(hitungVolumKerucut.hitungVolume());

        System.out.println("Hasil Volume Kerucut = "+formattedHasil+" cm^3");
    }
}
