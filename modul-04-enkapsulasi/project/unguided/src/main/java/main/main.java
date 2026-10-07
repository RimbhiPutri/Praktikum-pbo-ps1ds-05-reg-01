package main;

import model.Dataset;
import laporan.laporanDataset;

public class main {

    public static void main(String[] args) {

        // Objek 1: constructor tanpa parameter
        Dataset dataset1 = new Dataset();

        dataset1.setNama("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        // Objek 2: constructor dengan 1 parameter
        Dataset dataset2 = new Dataset("Wine Quality");

        // Objek 3: constructor lengkap
        Dataset dataset3 = new Dataset("Iris", 150, 5, 0);

        // Menyimpan objek ke dalam array
        Dataset[] daftarDataset = {
            dataset1,
            dataset2,
            dataset3
        };

        // Membuat objek laporan
        laporanDataset laporan = new laporanDataset();

        // Mencetak laporan menggunakan perulangan
        for (Dataset dataset : daftarDataset) {
            laporan.cetak(dataset);
        }

        // Menampilkan total dataset
        System.out.println(
            "Total dataset dibuat : " + Dataset.getTotalDataset()
        );
    }
}