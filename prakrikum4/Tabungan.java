package prakrikum4;

public class Tabungan {
    public int saldo;
    public Tabungan(int initSaldo){
        saldo = initSaldo;
    }
    public void ambilUang(int jumlah){
     saldo = saldo - jumlah;
    }
}
