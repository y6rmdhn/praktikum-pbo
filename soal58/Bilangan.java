package soal58;

public class Bilangan {
  private int x;
  private int y;

  //cons
    public Bilangan(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    class jumlahBilangan extends Bilangan{
        //constructor
        public jumlahBilangan (int x, int y){
            super(x, y);
        }

        public void tampilHasilJumlah(){
            int jumlah = getX() + getY();
            System.out.println("Hasil Perjumlahan = "+jumlah);
        }
    }

    class SelisihBilangan extends Bilangan{
        //constructor
        public SelisihBilangan (int x, int y){
            super(x, y);
        }

        public void tampilselisih(){
            int selisih = getX() - getY();
            System.out.println("Hasil selisih 3 - 1 = "+selisih);
        }
    }

    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan(3,4);
        Bilangan.jumlahBilangan jumlah = bilangan.new jumlahBilangan(3, 4);
        Bilangan.SelisihBilangan selisih = bilangan.new SelisihBilangan(3,4);

        jumlah.tampilHasilJumlah();
        selisih.tampilselisih();
    }
}
