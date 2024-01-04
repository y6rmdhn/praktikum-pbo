package tutorial;

public abstract class kucing {
    public String jenis; //atriibutnya
}

class Miko extends kucing{ //kelas turunan dari kelas kucing

    public static void main(String[] args) {
        Miko mikoo = new Miko(); //inisialisasi
        mikoo.jenis = "persian";
        System.out.println("Miko adalah jenis kucing "+mikoo.jenis);
    }
}





