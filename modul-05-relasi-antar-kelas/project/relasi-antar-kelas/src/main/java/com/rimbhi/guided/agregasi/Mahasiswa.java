package com.rimbhi.guided.agregasi;

public class Mahasiswa{
    private String NIM, Nama;

    public Mahasiswa(String NIM, String Nama){
        this.NIM = NIM;
        this.Nama = Nama;
    }

    // getter
    public String getNIM(){
        return NIM;
    }
    public String getNama(){
        return Nama;
    }

    // setter
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
}

