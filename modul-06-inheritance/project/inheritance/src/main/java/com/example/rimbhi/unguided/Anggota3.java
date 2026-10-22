package com.example.rimbhi.unguided;

public class Anggota3 extends Anggota2 {

    private int jumlahLayer;

    public Anggota3(String namaModel, int jumlahDataLatih, int jumlahKelas, int jumlahLayer){
        super(namaModel, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Jumlah layer: " + jumlahLayer);
    }

    public int hitungBiaya(){
        return super.hitungBiaya() + (jumlahLayer * 200);
    }

}
