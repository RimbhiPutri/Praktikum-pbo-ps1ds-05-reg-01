package Unguided;

import java.util.Arrays;
import java.util.Locale;

class PengolahSuhu {
    // 1. Menyimpan data suhu 7 hari (private untuk menjamin enkapsulasi)
    private double[] suhuHarian;

    // 2. Class Field: Penanda data kosong (-1.0) yang bernilai tetap
    public static final double NILAI_KOSONG = -1.0;

    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

     //Method untuk menampilkan seluruh data suhu harian.
    
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) { // Menggunakan class field NILAI_KOSONG
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "°C");
            }
        }
    }

     // Method untuk mencari index hari yang datanya kosong (-1.0).
    
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            // Menggunakan class field NILAI_KOSONG, bukan mengetik angka -1.0
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

     // Method untuk mengisi data yang kosong (imputasi time-series) berdasarkan rata-rata
    public void isiDataKosong() {
        int indexKosong = cariIndexKosong(); 
        if (indexKosong != -1) {
            // Rumus imputasi: (suhuHarian[i-1] + suhuHarian[i+1]) / 2
            suhuHarian[indexKosong] = (suhuHarian[indexKosong - 1] + suhuHarian[indexKosong + 1]) / 2;
        }
    }
    
     //Method untuk menghitung rata-rata suhu
    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Menyiapkan data suhu mentah 7 hari
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        // 2. Instansiasi object PengolahSuhu
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        // Menampilkan data suhu awal
        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        System.out.println();
        // Mencari dan menampilkan index hari kosong
        int indexKosong = pengolah.cariIndexKosong();
        System.out.println("Index hari kosong (dimulai dari 0): " + indexKosong);

        // 3. Menjalankan proses imputasi
        pengolah.isiDataKosong();

        System.out.println();
        // 4. Menampilkan data suhu setelah pengisian beserta rata-ratanya
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        System.out.println();
        // Menggunakan Locale.US agar pemisah desimal menggunakan tanda titik (.)
        System.out.printf(Locale.US, "Rata-rata : %.2f°C\n", pengolah.hitungRataRata());

        System.out.println();
        // 5. Menampilkan isi array variabel suhuHarian di main
        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");
    }
}