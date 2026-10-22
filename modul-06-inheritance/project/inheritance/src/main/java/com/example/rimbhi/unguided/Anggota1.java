package com.example.rimbhi.unguided;

public class Anggota1 extends Ketua {
    
    private int jumlahFitur;

    public Anggota1(String namaModel, int jumlahDataLatih, int jumlahFitur){
        super(namaModel, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    public int hitungBiaya(){
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    public int hitungBiaya(int epoch, int ukuranBatch) {
        return (getjumlahDataLatih() * epoch) / ukuranBatch;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jumlah fitur: " + jumlahFitur); 
    }
}
