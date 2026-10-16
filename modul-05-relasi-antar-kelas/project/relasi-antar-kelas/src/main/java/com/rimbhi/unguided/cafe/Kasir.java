package com.rimbhi.unguided.cafe;

public class Kasir {
    private String namaKasir;

    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public void prosesPembayaran(Pesanan pesanan){
        double totalSubtotal = 0;
        double totalPajak = 0;

        ItemPesanan[] daftar = pesanan.getDaftarItem();
        for (int i = 0; i < pesanan.getJumlahItem(); i++){
            RincianHarga r = daftar[i].getRincian();
            totalSubtotal += r.getHargaDasar();
            totalPajak += r.getPajak();
        }

        double totalBayar = totalSubtotal + totalPajak;

        System.out.println("\n=== STRUK PEMBAYARAN KASIR === ");
        System.out.println("Kasir Bertugas : " + namaKasir);
        System.out.println("Pesanan        : Meja " + pesanan.getNomorMeja());
        System.out.println("Jumlah Item    : " + pesanan.getJumlahItem());
        System.out.println("Total Subtotal : Rp " + totalSubtotal);
        System.out.println("Total Pajak    : Rp " + totalPajak);
        System.out.println("Total Bayar    : Rp " + totalBayar);
        System.out.println("===========================");

    }
}
