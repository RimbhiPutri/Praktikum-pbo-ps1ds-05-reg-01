package Guided;

public class Enkapsulasi {
    private int saldo = 0;

    public void tambahSaldo(int jumlah){
        saldo = saldo + jumlah;
        System.out.println("Saldo berhasil ditambahkan");
    }

    public void tampilkanSaldo() {
        System.out.println("Saldo Anda: " + saldo);
    }

    public static void main(String[] args) {
        Enkapsulasi rek = new Enkapsulasi();
        rek.tambahSaldo(20000000);
        rek.tampilkanSaldo();
    }
}