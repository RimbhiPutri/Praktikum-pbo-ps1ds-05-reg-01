package com.example.rimbhi.guided.guided02;

public class Manager extends Employe{
    private  String alamat;

    public Manager(String nama, String alamat){
        super(nama);
        this.alamat = alamat;
    }

    public void tampilInformasi(){
        super.tampilNama();
        System.out.println("alamat: "+alamat);
        System.out.println("departemen: "+ super.departemen);

    }

}
