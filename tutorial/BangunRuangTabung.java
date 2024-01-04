package tutorial;
import java.text.DecimalFormat;

public abstract class BangunRuangTabung {
    abstract double hitungVolume(); //method abstract class
}

class tabung extends BangunRuangTabung{
    private double tinggi;
    private double jariJari;

    //constructor
    public tabung(double tinggi, double jariJari){
        this.tinggi = tinggi;
        this.jariJari = jariJari;
    }

    @Override double hitungVolume(){
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
//        Math.PI adalah nilai konstanta pi (π), yang merupakan rasio keliling lingkaran terhadap diameternya.
//        Math.pow(jariJari, 2) digunakan untuk menghitung kuadrat dari jari-jari tabung.
    }

    public static void main(String[] args) {
        tabung hitungVolumaTabung = new tabung(21, 10 );
        hitungVolumaTabung.hitungVolume();

        DecimalFormat df = new DecimalFormat("#");
        String formattedHasil = df.format(hitungVolumaTabung.hitungVolume());

        System.out.println("Hasil Volume Tabung = "+formattedHasil+" cm^3");
    }
}