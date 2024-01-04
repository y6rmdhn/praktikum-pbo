package tugas2;

/*

@author
NAMA                : Ade Saepul
KELAS               : Reguler C
NIM                 : 221106042993
Deskripsi Program   : Membuat Program Dengan Tema Anime Naruto Dengan mengimplementasikan konsep inheritance dan
                      konsep polimorphism

* */

public class Character {
    private String nama;

    public Character(String nama){
        this.nama = nama;
    }

    public void displayInfo(){
        System.out.print("Nama : "+ nama);
    }

    class NarutoChar extends Character{
        private String jutsu;
        private String clan;

        public NarutoChar (String nama, String jutsu, String clan){
            super(nama);
            this.jutsu = jutsu;
            this.clan = clan;
        }

        @Override public void displayInfo(){
            super.displayInfo();
            System.out.print("\nJutsu : "+jutsu);
            System.out.print("\nKarakteristik Khusus : Penyuka Ramen");
            System.out.print("\nClan : "+clan);
        }
    }

    class SasukeChar extends Character{
        private String jutsu;
        private String clan;
        public SasukeChar (String nama, String jutsu, String clan){
            super(nama);
            this.jutsu = jutsu;
            this.clan = clan;
        }

        @Override public void displayInfo(){
            super.displayInfo();
            System.out.print("\nJutsu : "+ jutsu);
            System.out.print("\nKarakteristik Khusus : Mempunyai Sharingan");
            System.out.print("\nClan: "+clan);
        }
    }

    public static void main(String[] args) {
        Character character = new Character("Generic Character");

        Character.NarutoChar naruto = character. new NarutoChar("Naruto Uzumaki", "Rasengan", "Uzumaki");
        naruto.displayInfo();
        System.out.print("\n");

        Character.SasukeChar sasuke = character. new SasukeChar("Uchiha Sasuke", "Chidori","Uchiha");
        System.out.print("\n");
        sasuke.displayInfo();
    }
}
