package com.example.rimbhi.unguided;

public class Anggota2 extends Ketua {
    
    private int jumlahKelas;

    public Anggota2(String namaModel, int jumlahDataLatih, int jumlahKelas){
        super(namaModel, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }

    public int hitungBiaya(){
        return super.hitungBiaya() * jumlahKelas;
    }
}
