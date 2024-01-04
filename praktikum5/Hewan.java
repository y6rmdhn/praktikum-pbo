package praktikum5;

public abstract class Hewan {
    protected static String name;
    protected abstract void eat();

    String warna;
    int berat;
}



class Dinosaurus extends Hewan{
    public void identitas(String namaDino, String warnaDino, int beratDino){
     Dinosaurus.name = namaDino;
     warna = warnaDino;
     berat = beratDino;
    }
    public void eat(){
        System.out.println(Dinosaurus.name+" makan batu");
    }
    String ambilNama(){
        return Dinosaurus.name;
    }
    String ambilWarna(){
        return warna;
    }
    int ambilBerat(){
        return berat;
    }
}