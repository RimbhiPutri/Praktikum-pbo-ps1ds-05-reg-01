package com.rimbhi.guided.agregasi;

public class Jurusan {
    private static int jumlahMahasiswa;
    private String kodeJurusan, namaJurusan;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[32];

    // constractor
    public Jurusan(String kodeJurusan, String namaJurusan){
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }
    // behavior
    public void addMahasiswa(Mahasiswa m){
        this.daftarMahasiswa[jumlahMahasiswa] = m;
        jumlahMahasiswa++;
    }
    public void displayMahasiswa(){
        System.out.println("Kode jurusan: " +  this.kodeJurusan);
        System.out.println("Nama jurusan: " + this.namaJurusan);
        
        System.out.println("Daftar mahasiswa: ");

        for(int i = 0; i<jumlahMahasiswa; i++){
            System.out.println(i+1 + ". " + daftarMahasiswa[i].getNIM() + " " + daftarMahasiswa[i].getNama());
        }
        
    }
    // getter
    public String getkodeJurusan(){
        return kodeJurusan;
    }
    public String getnamaJurusan(){
        return namaJurusan;
    }

    // setter
    public void setkodeJurusan(String kodejurusan){
        this.kodeJurusan = kodejurusan;
    }
    public void setnamaJurusan(String namaJurusan){
        this.namaJurusan = namaJurusan;
    }
}
    