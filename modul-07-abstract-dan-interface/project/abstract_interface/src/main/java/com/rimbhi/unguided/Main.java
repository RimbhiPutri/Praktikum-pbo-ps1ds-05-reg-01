package com.rimbhi.unguided;

public class Main {
     public static void main(String[] args) {
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan.");

        TiketReguler tiketReguler = new TiketReguler("Interstellar", 40000, 2, 3);

        TiketVIP tiketVIP = new TiketVIP("Dune: Part Two", 60000, 2, 25000);

        PaketSnack paketSnack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        ItemTransaksi[] daftarTransaksi = {
            tiketReguler,
            tiketVIP,
            paketSnack
        };

        double grandTotal = 0;

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");

        for (ItemTransaksi item : daftarTransaksi) {
            item.cetakRincianItem();
            grandTotal += item.getNominalBayar();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");

        ItemTransaksi.catatLogKasir("Transaksi selesai diproses.");
    }
}
