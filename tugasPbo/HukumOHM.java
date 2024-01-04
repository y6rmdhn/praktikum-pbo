package tugasPbo;

public class HukumOHM {
    private float kuatArus;
    private float hambatan;

    public HukumOHM() {
        // Konstruktor tanpa argumen
    }

    public HukumOHM(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;
    }

    public static void main(String[] args) {
        HukumOHM hukumOhm = new HukumOHM(3.0f, 12.0f);

        System.out.println("======Hukum Ohm======");
        System.out.println("Kuat arus yg mengalir pada suatu kawat penghantar\nakan berbanding lurus dengan beda potensial\npada ujung-ujung kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan");
        System.out.println(" ");
        System.out.println("Kuat arus " + hukumOhm.getKuatArus() + " ampere");
        System.out.println("Hambatan: " + hukumOhm.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan: " + hukumOhm.hitungTegangan() + " volt");
    }
}
