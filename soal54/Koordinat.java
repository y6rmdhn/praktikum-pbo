package soal54;

public class Koordinat {
    protected int x;
    protected int y;

    //constructor
    public Koordinat (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    class warnaKoordinat extends Koordinat{
        public String namaWarna;

        //constructor
        public warnaKoordinat (int x, int y, String namaWarna){
            super(x, y);
            this.namaWarna = namaWarna;
        }

        public String getNamaWarna(){
            return namaWarna;
        }

        public void setNamaWarna(String namaWarna){
            this.namaWarna = namaWarna;
        }
    }

    public static void main(String[] args) {
        Koordinat koordinat = new Koordinat(0,0);
        Koordinat.warnaKoordinat warna = koordinat.new warnaKoordinat(0,0,"null");

        warna.setNamaWarna("Jingga");
        System.out.println("Warna Koordinat : "+warna.getNamaWarna());

        koordinat.setX(10);
        koordinat.setY(4);
        System.out.println("koordinat Sumbu x : "+koordinat.getX()+", y : "+koordinat.getY());

    }
}
