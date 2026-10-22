package com.example.rimbhi.unguided;

public class Main {
    public static void main(String[] args){
        Anggota1 regresi = new Anggota1("Regresi Linier", 500, 4);
        Anggota2 klasifikasi = new Anggota2("Decision Tree", 800, 3);
        Anggota3 deepLearning = new Anggota3("Neural Network", 1000, 5, 3);

        Ketua[] daftarModel = {regresi, klasifikasi, deepLearning};
    
        int totalBiaya = 0;

        for (Ketua model : daftarModel){
        model.tampilInfo();
        int biaya = model.hitungBiaya();
        System.out.println("Biaya komputasi: " + biaya);
        System.out.println("---");
        totalBiaya += biaya;
    }

        System.out.println("Total biaya: " + totalBiaya);
        System.out.println("Biaya 10 epoch (Neural Network): " + deepLearning.hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + regresi.hitungBiaya(10));
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + regresi.hitungBiaya(10, 50));
    
    }
}
