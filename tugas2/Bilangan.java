package tugas2;

/*
@author
NAMA                : Ade Saepul
KELAS               : Reguler C
NIM                 : 221106042993
Deskripsi Program   : Membuat Program Pertamambah dan Pengurangan

*/

public class Bilangan {
    private int x;
    private int y;

    public Bilangan(int x, int y){
        this.x = 3;
        this.y = 4;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    class JumlahBilangan extends Bilangan{


        public JumlahBilangan(int x, int y){
            super(x, y);
        }
        public void tampilHasilJumlah(){
            int hasilJumlah = getX() + getY();
            System.out.println("Hasil Perjumlahan = "+hasilJumlah);
        }
    }

    class SelisihBilangan extends Bilangan{

        public SelisihBilangan(int x, int y){
            super(x, y);
        }

        public void tampilSelisih(){
            int hasilSelisih = getX() - getY();

            System.out.println("Hasil Selisih 3 - 4 = "+hasilSelisih);
        }
    };
}
