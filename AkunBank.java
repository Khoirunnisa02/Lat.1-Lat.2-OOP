/*
 * Nama		:Khoirunnisa
 * NIM          	:321110273
 * Nama Program	:Mendeklarasikan class AkunBank dengan instance method simpanUang, ambilUang dan cekSaldo
 */

class AkunBank {
private static String pembukaan;
private int jumlah;
private int saldo;

public AkunBank(String selamatDatang, int jumlah){
   	pembukaan = selamatDatang;
    saldo = 100000;

}

public void nabung(int sal){
    saldo = saldo + sal;
}

public void ambilUang(int jumlahTarikan){
    saldo = saldo - jumlahTarikan;
}

public int ambilSaldo(){
    return saldo;
}

public void setSaldo(int sal){
    saldo = sal;
}



public static void main(String[] args) {
    
    int jumlahSimpanan = 500000;
    int jumlahTarikan = 150000;
    
    AkunBank bls = new AkunBank("Selamat Datang di BANK ABC",12345);

    System.out.println("Selamat Datang di BANK ABC " );
    System.out.println("Saldo saat ini			: " + "Rp." + bls.ambilSaldo());
    System.out.println("\nSimpan Uang			: " + "Rp." + jumlahSimpanan);
    bls.nabung(jumlahSimpanan);
    System.out.println("Saldo saat ini			: " + "Rp." + bls.ambilSaldo());
    System.out.println("\nAmbil Uang			: " + "Rp." + jumlahTarikan);
    bls.ambilUang(jumlahTarikan);
    System.out.println("Saldo saat ini			: " + "Rp." + bls.ambilSaldo());

    }

}
