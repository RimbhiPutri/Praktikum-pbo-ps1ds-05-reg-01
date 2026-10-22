package com.example.rimbhi.guided.guided02;

public class Employe {
    private String nama;
    String departemen;

    public Employe(String nama){
        this.nama = nama;
    }

    public void tampilNama(){
        System.out.println("nama: "+ nama);
    }
}
