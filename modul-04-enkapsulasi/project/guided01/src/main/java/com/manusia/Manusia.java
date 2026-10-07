package com.manusia;

public class Manusia {
    // Definisi atribut
    private String nama;
    private int umur;

    //4.2 constructor
    public Manusia(){};
    public Manusia(String nama) {
        this.nama = nama;
    }
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // method setter 
    public void setNama(String a) {
        nama = a;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // method getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }


}
