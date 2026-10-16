package com.rimbhi;

import com.rimbhi.guided.agregasi.*;
import com.rimbhi.guided.komposisi.*;

public class Main {
    public static void main(String[] args) {
        //runagregasi();
        runkomposisi();
    }


    public static void rungided01(){}

    public static void runagregasi(){
        Mahasiswa m1 = new Mahasiswa("103112400118", "Rimbhi");
        Mahasiswa m2 = new Mahasiswa("103112400149", "John");

        Jurusan prodi = new Jurusan("SD","Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();

    }
    
    public static void runkomposisi(){
        Komputer pc = new Komputer("Intel Core i5",3200,"LG 24 Inch","Logitech","Wireless");
        pc.displaySpecKomputer();
    }
}