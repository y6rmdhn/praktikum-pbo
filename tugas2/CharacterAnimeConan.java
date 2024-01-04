package tugas2;

/*
@author
NAMA                : Ade Saepul
KELAS               : Reguler C
NIM                 : 221106042993
Deskripsi Program   : Membuat Program Dengan Tema Anime Detektif Conan Dengan mengimplementasikan konsep inheritance dan
                      konsep polimorphism

*/

public class CharacterAnimeConan {
    protected String name;

    public CharacterAnimeConan(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Halo nama saya " + name + ".");
    }

    public static class Detective extends CharacterAnimeConan {
        public Detective(String name) {
            super(name);
        }

        public void solveCase() {
            System.out.println(name + " adalah seorang detektif brilian yang dikenal mampu memecahkan kasus-kasus rumit.");
        }

        @Override
        public void introduce() {
            System.out.println("Salam, saya Detektif " + name + ".");
        }
    }

    public static class Ran extends CharacterAnimeConan {
        public Ran(String name) {
            super(name);
        }

        public void kick() {
            System.out.println(name + " terampil dalam seni bela diri dan memiliki tendangan yang kuat.");
        }

        @Override
        public void introduce() {
            System.out.println("Halo saya " + name + ". Saya adalah individu yang kuat dan tekun.");
        }
    }

    public static class Conan extends CharacterAnimeConan {
        public Conan(String name) {
            super(name);
        }

        public void smart() {
            System.out.println(name + " (Conan) adalah seorang detektif brilian yang dikenal mampu memecahkan kasus-kasus rumit.");
        }

        @Override
        public void introduce() {
            System.out.println("Hai, saya Conan Edogawa, detektif hebat yang terperangkap dalam tubuh anak-anak.");
        }
    }

    public static void main(String[] args) {
        CharacterAnimeConan character1 = new Detective("Shinichi Kudo");
        CharacterAnimeConan character2 = new Ran("Ran Mouri");
        CharacterAnimeConan character3 = new Conan("Conan Edogawa");

        character1.introduce();
        if (character1 instanceof Detective) {
            ((Detective) character1).solveCase();
        }
        System.out.println();

        character2.introduce();
        if (character2 instanceof Ran) {
            ((Ran) character2).kick();
        }
        System.out.println();

        character3.introduce();
        if (character3 instanceof Conan){
            ((Conan) character3).smart();
        }
        System.out.println();
    }
}
