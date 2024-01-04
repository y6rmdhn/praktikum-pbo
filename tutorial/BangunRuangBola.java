package tutorial;
import java.text.DecimalFormat;

public abstract class BangunRuangBola {
    abstract double hitungVolume();
}

class BolaBasket extends BangunRuangBola{
    private double jariJari; //atribut

    //constructor
    public BolaBasket(double jariJari){
        this.jariJari = jariJari;
    }

    @Override double hitungVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    public static void main(String[] args) { //untuk running
        BolaBasket volumeBolaBasket = new BolaBasket(7);

        volumeBolaBasket.hitungVolume();
        DecimalFormat df = new DecimalFormat("#");
        String formattedHasil = df.format(volumeBolaBasket.hitungVolume());

        System.out.println("Hasil Volume = "+formattedHasil+" cm^3");
    }
}
