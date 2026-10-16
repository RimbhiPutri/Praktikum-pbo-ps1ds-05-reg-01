package com.rimbhi.unguided.cafe;

public class Pesanan {
    private int nomorMeja;
    private ItemPesanan[] daftarItem;
    private int jumlahItem;

    public Pesanan(int nomorMeja, int kapasitas){
        this.nomorMeja = nomorMeja;
        this.daftarItem = new ItemPesanan[kapasitas];
        this.jumlahItem = 0;
    }

    public void tambahItem(ItemPesanan item) {
        if (jumlahItem < daftarItem.length){
            daftarItem[jumlahItem] = item;
            jumlahItem++;
        } else {
            System.out.println("Pesanan penuh, tidak bisa menambah item lagi.");
        }
    }

    public void tampilkanPesanan() {
    System.out.println("=== DAFTAR PESANAN CAFE ===");
    System.out.println("Nomor Meja: " + nomorMeja);
    for (int i = 0; i < jumlahItem; i++) {
        ItemPesanan item = daftarItem[i];
        RincianHarga r = item.getRincian();
        System.out.println((i + 1) + ". " + item.getNamaItem()
                + " - Rp " + r.getHargaTotal()
                + " (Harga: " + r.getHargaDasar()
                + ", Pajak: " + r.getPajak() + ")");
    }
}

    public int getNomorMeja(){
        return nomorMeja;
    }

    public ItemPesanan[] getDaftarItem(){
        return daftarItem;
    }

    public int getJumlahItem(){
        return jumlahItem;
    }
}
