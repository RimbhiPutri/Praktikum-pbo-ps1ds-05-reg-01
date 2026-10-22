package com.example.rimbhi.unguided;

public class Ketua {
    private String namaModel;
    private int jumlahDataLatih;

    public Ketua(String namaModel, int jumlahDataLatih){
        this.namaModel = namaModel;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    public int getjumlahDataLatih(){
        return jumlahDataLatih;
    }

    public String getNamaModel(){
        return namaModel;
    }

    public void tampilInfo(){
        System.out.println("Model: " + namaModel + " | Data latih: " + jumlahDataLatih);
    }

    public int hitungBiaya(){
        return jumlahDataLatih * 2;
    }

    public int hitungBiaya(int epoch){
        return jumlahDataLatih * epoch;
    }
}
