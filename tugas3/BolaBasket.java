package tugas3;
import java.text.DecimalFormat;
abstract class BolaBasket {
    abstract double hitungVolume();
}

//implementasi
class VolumeBasket extends BolaBasket{
    private double jariJari;

    public VolumeBasket(double jariJari){
        this.jariJari = jariJari;
    }

    @Override double hitungVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    public static void main(String[] args) {
        VolumeBasket volumeBasket = new VolumeBasket(7);
        double Volume = volumeBasket.hitungVolume();

        DecimalFormat df = new DecimalFormat("#");
        String formattedHasil = df.format(Volume);
        System.out.println("Hasil : V = "+formattedHasil+" cm^3");
    }
}
